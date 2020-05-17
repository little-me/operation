package com.sunq.operation;

import com.sunq.operation.model.ReflectObject;
import com.sunq.operation.sqlwalker.NormalSQLWalker;

public class TestA {

	public static void main(String[] args) {
		ReflectObject ref = new ReflectObject();
		String sql = NormalSQLWalker.getSql(ref, "pb_reflect_object");
		System.out.println(sql);
	}

}
