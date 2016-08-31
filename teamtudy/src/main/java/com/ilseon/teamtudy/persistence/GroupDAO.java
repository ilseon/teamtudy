package com.ilseon.teamtudy.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ilseon.teamtudy.domain.GroupVO;


public interface GroupDAO {
	public List<GroupVO> getList();
	public GroupVO getOne(int groupNumber);
	public void write(GroupVO vo);
	public void edit(GroupVO vo);
	public void delete(int groupNumber);
}
