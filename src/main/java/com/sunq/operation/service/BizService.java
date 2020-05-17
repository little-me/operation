package com.sunq.operation.service;

import java.util.List;

import com.sunq.operation.model.Admdiv;
import com.sunq.operation.model.BizType;
import com.sunq.operation.model.Menu;
import com.sunq.operation.model.ReflectObject;

public interface BizService {
	
	public List<Admdiv> getAllValidAdmdiv();
	
	public List<ReflectObject> getVtcodes(String admdivCode);
	
	public List<Menu> getMenus();
	
	
	
	public List<String> getXMLSqls(String admdivCode, String vtCode);
	
	
	public List<String> getBizSqls(String admdivCode, String bizCode);
	
	public List<String> getBormSqls(String admdivCode, String vtCode);
	
	public List<String> getMenuSqls(long menuId);

}
