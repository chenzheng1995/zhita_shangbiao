package com.zhita.service.manage.commodity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.CommodityMapper;

@Service
public class CommodityServiceImp implements IntCommodityService{
	@Autowired
	private CommodityMapper commodityMapper;
}
