package com.ilseon.teamtudy.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ilseon.teamtudy.domain.GroupVO;
@Repository
public class GroupDAOImpl implements GroupDAO{
	@Inject
	private SqlSession sqlsession;
	private static final String NAMESPACE = "com.ilseon.teamtudy.groupmapper";	
	
	@Override
	public List<GroupVO> getList() {
		return sqlsession.selectList(NAMESPACE + ".getList");
	}

	@Override
	public GroupVO getOne(int groupNumber) {
		return sqlsession.selectOne(NAMESPACE + ".getOne", groupNumber);
	}

	@Override
	public void write(GroupVO vo) {
		sqlsession.insert(NAMESPACE + ".write", vo);
	}

	@Override
	public void edit(GroupVO vo) {
		sqlsession.update(NAMESPACE + ".edit", vo);
	}

	@Override
	public void delete(int groupNumber) {
		sqlsession.delete(NAMESPACE + ".delete", groupNumber);
	}

}
