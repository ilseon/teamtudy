package com.ilseon.teamtudy.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ilseon.teamtudy.domain.BoardVO;
import com.ilseon.teamtudy.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> getList() {
		return dao.getList();
	}

	@Override
	public BoardVO getOne(int boardNumber) {
		return dao.getOne(boardNumber);
	}

	@Override
	public void write(BoardVO vo) {
		dao.write(vo);
	}

	@Override
	public void edit(BoardVO vo) {
		dao.edit(vo);
	}

	@Override
	public void delete(int boardNumber) {
		dao.delete(boardNumber);
	}

}
