package com.sunq.operation.model;

import java.sql.Timestamp;

public class BizType {
	
	private long biz_type_id;
	private String biz_type_code;
	private String biz_type_name;
	private long bill_type_id;
	private long no_rule_id;
	private Timestamp create_date;
	private long last_ver;
	private String scope_script;
	private int collect_table_id;
	private int biz_collect;
	private int group_id;
	private int balance_ctrl_id;
	private String admdiv_code;
	
	
	public long getBiz_type_id() {
		return biz_type_id;
	}
	public void setBiz_type_id(long biz_type_id) {
		this.biz_type_id = biz_type_id;
	}
	public String getBiz_type_code() {
		return biz_type_code;
	}
	public void setBiz_type_code(String biz_type_code) {
		this.biz_type_code = biz_type_code;
	}
	public String getBiz_type_name() {
		return biz_type_name;
	}
	public void setBiz_type_name(String biz_type_name) {
		this.biz_type_name = biz_type_name;
	}
	public long getBill_type_id() {
		return bill_type_id;
	}
	public void setBill_type_id(long bill_type_id) {
		this.bill_type_id = bill_type_id;
	}
	public long getNo_rule_id() {
		return no_rule_id;
	}
	public void setNo_rule_id(long no_rule_id) {
		this.no_rule_id = no_rule_id;
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
	public String getScope_script() {
		return scope_script;
	}
	public void setScope_script(String scope_script) {
		this.scope_script = scope_script;
	}
	public int getCollect_table_id() {
		return collect_table_id;
	}
	public void setCollect_table_id(int collect_table_id) {
		this.collect_table_id = collect_table_id;
	}
	public int getBiz_collect() {
		return biz_collect;
	}
	public void setBiz_collect(int biz_collect) {
		this.biz_collect = biz_collect;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getBalance_ctrl_id() {
		return balance_ctrl_id;
	}
	public void setBalance_ctrl_id(int balance_ctrl_id) {
		this.balance_ctrl_id = balance_ctrl_id;
	}
	public String getAdmdiv_code() {
		return admdiv_code;
	}
	public void setAdmdiv_code(String admdiv_code) {
		this.admdiv_code = admdiv_code;
	}
	
	
}
