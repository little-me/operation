package com.sunq.operation.sqlwalker;

import java.lang.reflect.Field;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sunq.operation.util.MyDateUtil;

public class NormalSQLWalker {
	
	private static Logger log = LoggerFactory.getLogger(NormalSQLWalker.class);
	
	
	public static String getSql(Object obj, String tableName) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into ");
		sql.append(tableName);
		
		
		StringBuffer fieldsb = new StringBuffer("(");
		StringBuffer valuesb = new StringBuffer(") values (");
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			fieldsb.append(field.getName());
			fieldsb.append(",");
			
			try {
				if ("long".equals(field.getType().getName())
						|| "int".equals(field.getType().getName())) {
					valuesb.append(PropertyUtils.getProperty(obj, field.getName()));
				} else if (PropertyUtils.getProperty(obj, field.getName()) == null) {
					valuesb.append("null");
				} else if (field.getType().getName().endsWith("String")) {
					valuesb.append("'");
					valuesb.append(PropertyUtils.getProperty(obj, field.getName()));
					valuesb.append("'");
				} else if (field.getType().getName().endsWith("Timestamp")) {
					valuesb.append("to_date(");
					valuesb.append(MyDateUtil.date2String(PropertyUtils.getProperty(obj, field.getName()), MyDateUtil.NOR_FMT));
					valuesb.append(",");
					valuesb.append("'yyyy-mm-dd hh24:mi:ss'");
				}
			} catch (Exception e) {
				log.warn("warning get field " + field.getName() + "failed");
			}
			valuesb.append(",");
		}
		
		sql.append(fieldsb.deleteCharAt(fieldsb.length() - 1));
		sql.append(valuesb.deleteCharAt(valuesb.length() - 1));
		sql.append(");");

		return sql.toString();
	}
	

}
