package com.ja.stm;

import com.ja.stm.controller.Controller;
/**
 * 반복 복기 필요.
 * 머리로 외우지 말고 이해해서 복기 해야함
 * 3 Layered : Controller -> Service -> Repository
 * 컴포넌트 결합 및 메서드 호출 흐름에 집중 필요
 * */
public class App {

	public static void main(String[] args) {
		new Controller().run();
		
	}

}
