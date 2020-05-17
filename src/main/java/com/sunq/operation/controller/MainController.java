package com.sunq.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunq.operation.model.vo.ExportSql;
import com.sunq.operation.service.BizService;

@RestController
@RequestMapping("/operation/main")
public class MainController {
	
	@Autowired
	private BizService bizService;
	
	@PostMapping("/expsql")
	public List<String> expsql(@RequestBody ExportSql exp) {
		List<String> xmlSqls = bizService.getXMLSqls(exp.getAdmdivCode(), exp.getVtCode());
		
		if (exp.isExpBiz()) {
			xmlSqls.addAll(bizService.getBizSqls(exp.getAdmdivCode(), exp.getVtCode()));
		}
		
		if (exp.isExpBill()) {
			xmlSqls.addAll(bizService.getBormSqls(exp.getAdmdivCode(), exp.getVtCode()));
		}
		
		if (exp.isExpMenu()) {
			
		}
		
		return xmlSqls;
	}
	
}
