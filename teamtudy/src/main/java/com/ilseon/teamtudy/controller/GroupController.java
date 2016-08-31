package com.ilseon.teamtudy.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilseon.teamtudy.service.GroupService;

@Controller
public class GroupController {
	@Inject
	private GroupService service;
	
	@RequestMapping(value="/group")
	public String getAllList(Model model){
		model.addAttribute("groupList", service.getList());
		return "group/group_list";
	}
}
