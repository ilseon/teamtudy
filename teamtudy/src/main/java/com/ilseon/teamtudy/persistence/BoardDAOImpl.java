package com.ilseon.teamtudy.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ilseon.teamtudy.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Inject
	private SqlSession sqlSession;
    private static final String NAMESPACE = "com.ilseon.teamtudy.boardmapper";	
	
	@Override
	public List<BoardVO> getList() {
		return sqlSession.selectList(NAMESPACE + ".getList");
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

}
