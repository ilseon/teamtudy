package com.ilseon.teamtudy.persistence;

import java.util.List;

import com.ilseon.teamtudy.domain.BoardVO;
import com.ilseon.teamtudy.domain.PagingVO;

public interface BoardDAO {
	public List<BoardVO> getList(PagingVO paging);
	public BoardVO getOne(int boardNumber);
	public void write(BoardVO vo);
	public void edit(BoardVO vo);
	public void delete(int boardNumber);
	public void hit(int boardNumber);
	public int searchCount(PagingVO paging);
}
