package com.sunq.operation.model.vo;

public class ExportSql {
	
	private String admdivCode;
	private String vtCode;
	private boolean expBiz;
	private boolean expBill;
	private boolean expMenu;
	private long menuId;
	
	
	public String getAdmdivCode() {
		return admdivCode;
	}
	public void setAdmdivCode(String admdivCode) {
		this.admdivCode = admdivCode;
	}
	public String getVtCode() {
		return vtCode;
	}
	public void setVtCode(String vtCode) {
		this.vtCode = vtCode;
	}
	public boolean isExpBiz() {
		return expBiz;
	}
	public void setExpBiz(boolean expBiz) {
		this.expBiz = expBiz;
	}
	public boolean isExpBill() {
		return expBill;
	}
	public void setExpBill(boolean expBill) {
		this.expBill = expBill;
	}
	public boolean isExpMenu() {
		return expMenu;
	}
	public void setExpMenu(boolean expMenu) {
		this.expMenu = expMenu;
	}
	public long getMenuId() {
		return menuId;
	}
	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

}
