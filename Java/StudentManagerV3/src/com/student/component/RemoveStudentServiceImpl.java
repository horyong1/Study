package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.repository.Repository;

public class RemoveStudentServiceImpl implements Service{
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public void process() {
		IoUtil.print("=====[학생 삭제]=====");
		int result = removeCount();
		removeStudentCountPrint(result);
	}
	
	/**
	 * 학생 정보 삭제 개수
	 * */
	private int removeCount() {
		return repository.removeByName(IoUtil.input("삭제할 학생 이름 >>>> "));
	}
	/**
	 * 학생 정보 삭제 출력
	 * */
	private void removeStudentCountPrint(int result) {
		IoUtil.print("학생 " + result + "명이 삭제 되었습니다.");
	}
}
