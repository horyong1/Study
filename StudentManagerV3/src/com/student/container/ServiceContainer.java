package com.student.container;

import java.util.HashMap;
import java.util.Map;

import com.student.component.AddStudentServiceImpl;
import com.student.component.RemoveStudentServiceImpl;
import com.student.component.AvgScoreStudentServiceImpl;
import com.student.component.SearchStudentServiceImpl;
import com.student.component.Service;
import com.student.component.ShowStudentServiceImpl;
import com.student.repository.Repository;

public class ServiceContainer {
	private Map<String, Service> services = new HashMap<>();
	private Repository repository = new Repository();
	
	public ServiceContainer() {
		// 생성자 생성
		AddStudentServiceImpl addStudentServiceImpl = new AddStudentServiceImpl();
		ShowStudentServiceImpl showStudentServiceImpl = new ShowStudentServiceImpl();
		SearchStudentServiceImpl searchStudentServiceImpl = new SearchStudentServiceImpl();
		RemoveStudentServiceImpl removeStudentServiceImpl = new RemoveStudentServiceImpl();
		AvgScoreStudentServiceImpl scoreAvgStudentServiceImpl = new AvgScoreStudentServiceImpl();
		
		// 리포지토리 셋팅
		addStudentServiceImpl.setRepository(repository);
		showStudentServiceImpl.setRepository(repository);
		searchStudentServiceImpl.setRepository(repository);
		removeStudentServiceImpl.setRepository(repository);
		scoreAvgStudentServiceImpl.setRepository(repository);
		
		// HashMap에 Key, value 값 넣기 
		services.put("1", addStudentServiceImpl);
		services.put("2", showStudentServiceImpl);
		services.put("3", searchStudentServiceImpl);
		services.put("4", removeStudentServiceImpl);
		services.put("5", scoreAvgStudentServiceImpl);
	}
	
	// HashMap에 있는 키값 찾기 없으면 null 반환
	public Service get(String serviceName) {
		return services.get(serviceName);
		
	}
}
