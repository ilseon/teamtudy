package com.ilseon.teamtudy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ilseon.teamtudy.domain.GroupVO;


public interface GroupService {
	public List<GroupVO> getList();
	public GroupVO getOne(int groupNumber);
	public void write(GroupVO vo);
	public void edit(GroupVO vo);
	public void delete(int groupNumber);
}
