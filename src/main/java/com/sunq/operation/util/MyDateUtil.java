package com.sunq.operation.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtil {
	
	public static final String NOR_FMT = "yyyy-MM-dd HH:mm:ss";
	
	public static String date2String(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		return sdf.format(date);
	}
	
	
	public static String date2String(Object obj, String pattern) {
		
		if (obj instanceof Timestamp) {
			return date2String((Date) obj, pattern);
		}
		
		if (obj instanceof Date) {
			return date2String((Date) obj, pattern);
		}
		
		return "";
	}

}
