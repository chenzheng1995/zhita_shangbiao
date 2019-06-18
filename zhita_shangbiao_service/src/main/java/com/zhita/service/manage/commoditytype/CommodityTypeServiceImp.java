package com.zhita.service.manage.commoditytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.CommodityMapper;

@Service
public class CommodityTypeServiceImp implements IntCommodityTypeService{
	@Autowired
	private CommodityMapper commodityMapper;
}
