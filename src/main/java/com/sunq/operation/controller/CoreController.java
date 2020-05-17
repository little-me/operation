package com.sunq.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sunq.operation.model.Admdiv;
import com.sunq.operation.service.BizService;

@RestController
@RequestMapping("/operation")
public class CoreController {
	
	@Autowired
	private BizService bizService;
	
	@GetMapping("/index")
	public ModelAndView getReportByCityId(Model model) throws Exception {
		List<Admdiv> admList = bizService.getAllValidAdmdiv();
		
		return new ModelAndView("operation/index", "adms", admList);
	}
}
