package org.zerock.domain;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class SampleDTOList {

	private List<SampleDTO> list;
	
	public SampleDTOList() {
		list = new ArrayList<>();
	}
	
}
