package com.sunq.operation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sunq.operation.model.Admdiv;
import com.sunq.operation.model.BillType;
import com.sunq.operation.model.BizType;
import com.sunq.operation.model.BormAttr;
import com.sunq.operation.model.BormObject;
import com.sunq.operation.model.Menu;
import com.sunq.operation.model.NoRule;
import com.sunq.operation.model.ReflectField;
import com.sunq.operation.model.ReflectObject;

@Repository
public interface BizDao {
	
	public List<Admdiv> getAllAdmdiv();
	
	public List<ReflectObject> getAllBizCode(String admdivCode);
	
	public List<Menu> getAllMenu();
	
	public ReflectObject getReflectObject(@Param("admdivCode") String admdivCode, @Param("reflectCode") String reflectCode);
	
	public List<ReflectField> getReflectFields(String reflectId);
	
	public BizType getBizType(@Param("admdivCode") String admdivCode, @Param("bizCode") String bizCode);
	
	public BizType getBizTypeById(@Param("admdivCode") String admdivCode, @Param("bizId") long bizId);
	
	public NoRule getNoRule(long id);
	
	public BillType getBillType(long id);
	
	public BormObject getBormObject(long objId);
	
	public List<BormAttr> getBormAttr(long objId);
}
