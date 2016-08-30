package com.ilseon.teamtudy.service;

import java.util.List;

import com.ilseon.teamtudy.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public BoardVO getOne(int boardNumber);
	public void write(BoardVO vo);
	public void edit(BoardVO vo);
	public void delete(int boardNumber);
}
