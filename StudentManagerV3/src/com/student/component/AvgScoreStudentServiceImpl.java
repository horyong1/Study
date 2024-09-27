package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.dto.StudentDto;
import com.student.repository.Repository;

public class AvgScoreStudentServiceImpl implements Service {
	
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public void process() {
		IoUtil.print("=====[학생 통계]=====");
		double avg = repository.statistic();
		avgPrint(avg);
		
	}
	
	private void avgPrint(double avg) {
		IoUtil.print("==============================");
		IoUtil.print("총 인원	: " + repository.getCount());
		IoUtil.print("평균	: " + Math.round(avg*100)/(double)100);
		IoUtil.print("==============================");
	}
	

}
