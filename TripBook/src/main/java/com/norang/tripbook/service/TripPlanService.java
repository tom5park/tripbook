package com.norang.tripbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.norang.tripbook.entity.TripPlan;
import com.norang.tripbook.mapper.TripPlanMapper;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/TripPlan")
public class TripPlanService {
	@Autowired
	TripPlanMapper tripPlanMapper;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> res = null;
		res = this.tripPlanMapper.list();
		return res;
	}
}
