package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.dto.StudentDto;
import com.student.repository.Repository;

public class ScoreAvgStudentServiceImpl implements Service {
	
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public void process() {
		IoUtil.print("=====[학생 통계]=====");
		
		double avg = repository.statistic();
		
		IoUtil.print("==============================");
		IoUtil.print("총 인원	: " + repository.getCount());
		IoUtil.print("평균	: " + Math.round(avg*100)/100.0);
		IoUtil.print("==============================");
	}
	

}
