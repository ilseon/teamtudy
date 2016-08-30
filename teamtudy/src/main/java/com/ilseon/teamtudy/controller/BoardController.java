package com.ilseon.teamtudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilseon.teamtudy.domain.BoardVO;
import com.ilseon.teamtudy.domain.PagingVO;

import org.springframework.web.bind.annotation.RequestParam;

import com.ilseon.teamtudy.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/board")
	public String getBoardList(Model model, @RequestParam String bno){
		System.out.println("여기는 안와?");
		System.out.println("test : " + bno);
		PagingVO paging = new PagingVO();
		paging.setPageNo(Integer.parseInt(bno));
		paging.setPageSize(10);
		paging.setStart((Integer.parseInt(bno) - 1) * paging.getPageSize() + 1);
		paging.setEnd(Integer.parseInt(bno) * paging.getPageSize());
		
		System.out.println("start : " + paging.getStart());
		System.out.println("end : " + paging.getEnd());
		
		model.addAttribute("BoardList", service.getList(paging));
		paging.setTotalCount(service.searchCount(paging));
		model.addAttribute("paging", paging);
		return "board/board_list";
	}
	
	@RequestMapping(value="/board/view")
	public String getBoardOne(Model model, @RequestParam int boardNumber){
		service.hit(boardNumber);
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
		return "redirect:/board?bno=1";
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
		return "redirect:/board?bno=1";
	}
}
