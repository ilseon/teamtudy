package com.ilseon.teamtudy.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ilseon.teamtudy.domain.BoardVO;
import com.ilseon.teamtudy.domain.PagingVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
    private static final String NAMESPACE = "com.ilseon.teamtudy.boardmapper";	
	
	@Override
	public List<BoardVO> getList(PagingVO paging) {
		return sqlSession.selectList(NAMESPACE + ".getList", paging);
	}

	@Override
	public BoardVO getOne(int boardNumber) {
		return sqlSession.selectOne(NAMESPACE + ".getOne", boardNumber);
	}

	@Override
	public void write(BoardVO vo) {
		sqlSession.insert(NAMESPACE + ".write", vo);
	}

	@Override
	public void edit(BoardVO vo) {
		sqlSession.update(NAMESPACE + ".edit", vo);
	}

	@Override
	public void delete(int boardNumber) {
		sqlSession.delete(NAMESPACE + ".delete", boardNumber);
	}

	@Override
	public void hit(int boardNumber) {
		sqlSession.update(NAMESPACE + ".hit", boardNumber);
	}

	@Override
	public int searchCount(PagingVO paging) {
		return sqlSession.selectOne(NAMESPACE + ".searchCount", paging);
	}

}
