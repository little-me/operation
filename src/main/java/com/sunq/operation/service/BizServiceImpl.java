package com.sunq.operation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunq.operation.dao.BizDao;
import com.sunq.operation.model.Admdiv;
import com.sunq.operation.model.BillType;
import com.sunq.operation.model.BizType;
import com.sunq.operation.model.BormAttr;
import com.sunq.operation.model.BormObject;
import com.sunq.operation.model.Menu;
import com.sunq.operation.model.NoRule;
import com.sunq.operation.model.ReflectField;
import com.sunq.operation.model.ReflectObject;
import com.sunq.operation.sqlwalker.NormalSQLWalker;

@Service
public class BizServiceImpl implements BizService {

	@Autowired
	private BizDao bizdao;
	
	@Override
	public List<Admdiv> getAllValidAdmdiv() {
		return bizdao.getAllAdmdiv();
	}

	@Override
	public List<ReflectObject> getVtcodes(String admdivCode) {
		return bizdao.getAllBizCode(admdivCode);
	}

	@Override
	public List<Menu> getMenus() {
		return bizdao.getAllMenu();
	}
	
	@Override
	public List<String> getXMLSqls(String admdivCode, String vtCode) {
		ReflectObject ref = bizdao.getReflectObject(admdivCode, vtCode);
		
		List<String> resList = new ArrayList<String>();
		resList.add(NormalSQLWalker.getSql(ref, "pb_reflect_obejct"));
		
		List<ReflectField> fieldList = bizdao.getReflectFields(ref.getReflect_id());
		for (ReflectField field : fieldList) {
			resList.add(NormalSQLWalker.getSql(field, "pb_reflect_field"));
		}
		
		return resList;
	}

	@Override
	public List<String> getBizSqls(String admdivCode, String bizCode) {
		BizType biz = bizdao.getBizType(admdivCode, bizCode);
		
		NoRule noRule = bizdao.getNoRule(biz.getBiz_type_id());
		
		
		
		// 第一种情况 主单的id是23  明细的id是24
		BizType detailBiz = bizdao.getBizTypeById(admdivCode, biz.getBiz_type_id() + 1);
		
		if (detailBiz == null) {
			// 第二种情况 主单的id是23  明细的id是231
			detailBiz = bizdao.getBizTypeById(admdivCode, biz.getBiz_type_id() * 10 + 1);
		}
		
		if (detailBiz == null) {
			// 第二种情况 主单的id是23  明细的id是2301
			detailBiz = bizdao.getBizTypeById(admdivCode, biz.getBiz_type_id() * 100 + 1);
		}
		
		if (detailBiz == null) {
			// 第三种情况 主单的id是23  明细的id是？
			// TODO: 依据单据明细去找
		}
		
		List<String> resList = new ArrayList<String>();
		resList.add(NormalSQLWalker.getSql(biz, "gap_biz_type"));
		
		return resList;
	}

	@Override
	public List<String> getBormSqls(String admdivCode, String vtCode) {
		
		BizType biz = bizdao.getBizType(admdivCode, vtCode);
		BillType bill = bizdao.getBillType(biz.getBill_type_id());
		
		BormObject borm = bizdao.getBormObject(bill.getObj_id());
		List<BormAttr> attrList = bizdao.getBormAttr(bill.getObj_id());
		
		List<String> resList = new ArrayList<String>();
		resList.add(NormalSQLWalker.getSql(bill, "gap_bill_type"));
		resList.add(NormalSQLWalker.getSql(borm, "gap_borm_object"));
		for (BormAttr ba : attrList) {
			resList.add(NormalSQLWalker.getSql(ba, "gap_borm_objattr"));
		}
		
		return resList;
	}


	@Override
	public List<String> getMenuSqls(long menuId) {
		// TODO Auto-generated method stub
		return null;
	}

}
