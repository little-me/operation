package com.sunq.operation.model;

import java.sql.Timestamp;

public class NoRule {
	
	private long no_rule_id;
	private String no_rule_name;
	private String no_generate_class;
	private int top_org_id;
	private int year;
	private int create_user_id;
	private String create_user_name;
	private Timestamp create_date;
	private long last_ver;
	private String no_script;
	
	
	public long getNo_rule_id() {
		return no_rule_id;
	}
	public void setNo_rule_id(long no_rule_id) {
		this.no_rule_id = no_rule_id;
	}
	public String getNo_rule_name() {
		return no_rule_name;
	}
	public void setNo_rule_name(String no_rule_name) {
		this.no_rule_name = no_rule_name;
	}
	public String getNo_generate_class() {
		return no_generate_class;
	}
	public void setNo_generate_class(String no_generate_class) {
		this.no_generate_class = no_generate_class;
	}
	public int getTop_org_id() {
		return top_org_id;
	}
	public void setTop_org_id(int top_org_id) {
		this.top_org_id = top_org_id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCreate_user_id() {
		return create_user_id;
	}
	public void setCreate_user_id(int create_user_id) {
		this.create_user_id = create_user_id;
	}
	public String getCreate_user_name() {
		return create_user_name;
	}
	public void setCreate_user_name(String create_user_name) {
		this.create_user_name = create_user_name;
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
	public String getNo_script() {
		return no_script;
	}
	public void setNo_script(String no_script) {
		this.no_script = no_script;
	}
	
	
}
