package com.sunq.operation.model;

import java.sql.Timestamp;

public class BillType {
	
	private long bill_type_id;
	private String bill_type_code;
	private String bill_type_name;
	private int is_primary;
	private int table_id;
	private long detail_type_id;
	private int adjust_field_id;
	private Timestamp create_date;
	private long last_ver;
	private int collect_table_id;
	private int obj_id;
	private String remark;
	private int alow_edit;
	private int ref_bill_type_id;
	private int is_sample;
	
	
	public long getBill_type_id() {
		return bill_type_id;
	}
	public void setBill_type_id(long bill_type_id) {
		this.bill_type_id = bill_type_id;
	}
	public String getBill_type_code() {
		return bill_type_code;
	}
	public void setBill_type_code(String bill_type_code) {
		this.bill_type_code = bill_type_code;
	}
	public String getBill_type_name() {
		return bill_type_name;
	}
	public void setBill_type_name(String bill_type_name) {
		this.bill_type_name = bill_type_name;
	}
	public int getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(int is_primary) {
		this.is_primary = is_primary;
	}
	public int getTable_id() {
		return table_id;
	}
	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}
	public long getDetail_type_id() {
		return detail_type_id;
	}
	public void setDetail_type_id(long detail_type_id) {
		this.detail_type_id = detail_type_id;
	}
	public int getAdjust_field_id() {
		return adjust_field_id;
	}
	public void setAdjust_field_id(int adjust_field_id) {
		this.adjust_field_id = adjust_field_id;
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
	public int getCollect_table_id() {
		return collect_table_id;
	}
	public void setCollect_table_id(int collect_table_id) {
		this.collect_table_id = collect_table_id;
	}
	public int getObj_id() {
		return obj_id;
	}
	public void setObj_id(int obj_id) {
		this.obj_id = obj_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getAlow_edit() {
		return alow_edit;
	}
	public void setAlow_edit(int alow_edit) {
		this.alow_edit = alow_edit;
	}
	public int getRef_bill_type_id() {
		return ref_bill_type_id;
	}
	public void setRef_bill_type_id(int ref_bill_type_id) {
		this.ref_bill_type_id = ref_bill_type_id;
	}
	public int getIs_sample() {
		return is_sample;
	}
	public void setIs_sample(int is_sample) {
		this.is_sample = is_sample;
	}
	

}
