package com.zhita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhita.service.manage.commodity.IntCommodityService;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
	@Autowired
	private IntCommodityService intCommodityService;
}
