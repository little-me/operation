package com.sunq.operation.model;

import java.sql.Timestamp;

public class Menu {
	
	private long id;
	private String code;
	private String name;
	private String icon;
	private String tips;
	private int menugroup_id;
	private long parent_id;
	private int is_online;
	private Timestamp start_date;
	private Timestamp end_date;
	private int disp_order;
	private String direct_shortcut_letter;
	private int direct_shortcut_letter1;
	private int direct_shortcut_letter2;
	private String remark;
	private long module_id;
	private String parameter;
	private Timestamp create_date;
	private int is_deleted;
	private int initialload;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	public int getMenugroup_id() {
		return menugroup_id;
	}
	public void setMenugroup_id(int menugroup_id) {
		this.menugroup_id = menugroup_id;
	}
	public long getParent_id() {
		return parent_id;
	}
	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}
	public int getIs_online() {
		return is_online;
	}
	public void setIs_online(int is_online) {
		this.is_online = is_online;
	}
	public Timestamp getStart_date() {
		return start_date;
	}
	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}
	public Timestamp getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
	}
	public int getDisp_order() {
		return disp_order;
	}
	public void setDisp_order(int disp_order) {
		this.disp_order = disp_order;
	}
	public String getDirect_shortcut_letter() {
		return direct_shortcut_letter;
	}
	public void setDirect_shortcut_letter(String direct_shortcut_letter) {
		this.direct_shortcut_letter = direct_shortcut_letter;
	}
	public int getDirect_shortcut_letter1() {
		return direct_shortcut_letter1;
	}
	public void setDirect_shortcut_letter1(int direct_shortcut_letter1) {
		this.direct_shortcut_letter1 = direct_shortcut_letter1;
	}
	public int getDirect_shortcut_letter2() {
		return direct_shortcut_letter2;
	}
	public void setDirect_shortcut_letter2(int direct_shortcut_letter2) {
		this.direct_shortcut_letter2 = direct_shortcut_letter2;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public long getModule_id() {
		return module_id;
	}
	public void setModule_id(long module_id) {
		this.module_id = module_id;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public int getInitialload() {
		return initialload;
	}
	public void setInitialload(int initialload) {
		this.initialload = initialload;
	}
	
	
}
