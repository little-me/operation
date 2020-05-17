package com.sunq.operation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunq.operation.model.Admdiv;
import com.sunq.operation.model.Menu;
import com.sunq.operation.model.ReflectObject;
import com.sunq.operation.service.BizService;

@RestController
@RequestMapping("/operation/ajax")
public class BizController {
	
	@Autowired
	private BizService bizService;
	
	@GetMapping("/admdivs")
	public List<Admdiv> getAdmdivs() {
		return bizService.getAllValidAdmdiv();
	}
	
	@GetMapping("/vtcodes/{admdivCode}")
	public List<String> getVtcodes(@PathVariable String admdivCode) {
		List<ReflectObject> refList = bizService.getVtcodes(admdivCode);
		List<String> codeList = new ArrayList<String>(refList.size());
		for (ReflectObject ref : refList) {
			codeList.add(ref.getReflect_code());
		}
		
		return codeList;
	}
	
	@GetMapping("/menus")
	public List<Menu> getMenus() {
		return bizService.getMenus();
	}
}
