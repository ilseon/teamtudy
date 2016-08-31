package com.ilseon.teamtudy.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ilseon.teamtudy.domain.GroupVO;
import com.ilseon.teamtudy.persistence.GroupDAO;

@Service
public class GroupServiceImpl implements GroupService{
	@Inject
	private GroupDAO dao;
	
	@Override
	public List<GroupVO> getList() {
		return dao.getList();
	}

	@Override
	public GroupVO getOne(int groupNumber) {
		return dao.getOne(groupNumber);
	}

	@Override
	public void write(GroupVO vo) {
		dao.write(vo);
	}

	@Override
	public void edit(GroupVO vo) {
		dao.edit(vo);
	}

	@Override
	public void delete(int groupNumber) {
		dao.delete(groupNumber);
	}

}
