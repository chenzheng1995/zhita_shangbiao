package com.zhita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhita.service.manage.commoditytype.IntCommodityTypeService;

@Controller
@RequestMapping("/commodityType")
public class CommodityTypeController {
	
	@Autowired
	private IntCommodityTypeService intCommodityTypeService;
}
