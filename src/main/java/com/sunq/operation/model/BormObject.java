package com.sunq.operation.model;

import java.sql.Timestamp;

public class BormObject {
	
	private long obj_id;
	private int grp_id;
	private int sys_id;
	private String obj_code;
	private String obj_name;
	private int is_table;
	private String obj_source;
	private int obj_type;
	private String class_name;
	private int create_user;
	private Timestamp create_date;
	private long last_ver;
	
	
	public long getObj_id() {
		return obj_id;
	}
	public void setObj_id(long obj_id) {
		this.obj_id = obj_id;
	}
	public int getGrp_id() {
		return grp_id;
	}
	public void setGrp_id(int grp_id) {
		this.grp_id = grp_id;
	}
	public int getSys_id() {
		return sys_id;
	}
	public void setSys_id(int sys_id) {
		this.sys_id = sys_id;
	}
	public String getObj_code() {
		return obj_code;
	}
	public void setObj_code(String obj_code) {
		this.obj_code = obj_code;
	}
	public String getObj_name() {
		return obj_name;
	}
	public void setObj_name(String obj_name) {
		this.obj_name = obj_name;
	}
	public int getIs_table() {
		return is_table;
	}
	public void setIs_table(int is_table) {
		this.is_table = is_table;
	}
	public String getObj_source() {
		return obj_source;
	}
	public void setObj_source(String obj_source) {
		this.obj_source = obj_source;
	}
	public int getObj_type() {
		return obj_type;
	}
	public void setObj_type(int obj_type) {
		this.obj_type = obj_type;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getCreate_user() {
		return create_user;
	}
	public void setCreate_user(int create_user) {
		this.create_user = create_user;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public long getLast_ver() {
		return last_ver;
	}
	public void setLast_ver(long last_ver) {
		this.last_ver = last_ver;
	}
	
	
}
