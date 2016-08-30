package com.ilseon.teamtudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilseon.teamtudy.domain.BoardVO;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilseon.teamtudy.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/board")
	public String getBoardList(Model model){
		model.addAttribute("BoardList", service.getList());
		return "board/board_list";
	}
	
	@RequestMapping(value="/board/view")
	public String getBoardOne(Model model, @RequestParam int boardNumber){
		model.addAttribute("BoardVO", service.getOne(boardNumber));
		return "board/board_view";
	}
	
	@RequestMapping(value="/board/writeview")
	public String writeViewBoard(){
		return "board/board_write";
	}
	
	@RequestMapping(value="/board/write")
	public String writeBoard(Model model, @ModelAttribute BoardVO vo){
		service.write(vo);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/board/editview")
	public String editViewBoard(Model model, @RequestParam int boardNumber){
		model.addAttribute("BoardVO", service.getOne(boardNumber));
		return "board/board_edit";
	}
	
	@RequestMapping(value="/board/edit")
	public String editBoard(Model model, @ModelAttribute BoardVO vo){
		service.edit(vo);
		model.addAttribute("BoardVO", service.getOne(vo.getBoardNumber()));
		return "board/board_view";
	}
	
	@RequestMapping(value="/board/delete")
	public String deleteBoard(Model model, @RequestParam int boardNumber){
		service.delete(boardNumber);
		return "redirect:/board";
	}
}
