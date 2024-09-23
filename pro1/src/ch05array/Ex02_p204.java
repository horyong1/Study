package ch05array;

import java.util.Date;
import java.util.Scanner;

/**
 * 배열(Array)-p200
 * -같은 타입의 데이터를 연속된 공간에 나열하고,
 *  각 데이터에 index를 부여해놓은 자료구조
 *
 * 배열특징
 * -같은 타입 => 배열의 단점
 * -연속된 공간 => index.0부터 1씩 증가
 * 
 * */
public class Ex02_p204 {
	public static void main(String[] args) {
		//new 연산자로 배열 생성(p204)
		//타입에 따라 자동 초기화
		//new 연산자로 배열 생성 시 기본 초기화값 0
		//정수(byte,short,int,long) => 0
		//실수(float,double) => 0.0
		//논리형(boolean) => fasle
		//문자(char) => ""
		//문자열(String, Date 등) => null
		//타입[] 변수명 = new타입[크기];
		byte[]byteArr = new byte[3];
		//.length는 속성(Field) 
		int a = byteArr.length;
		
		for(int arr : byteArr) {
			System.out.print(arr+"\t");
		}
		System.out.println("\nbyteArr 배열 길이  ::::  " + a);
//==================== 실수 ============================= 
		double[]floatArr = new double[3];
		for(double arr : floatArr) {
			System.out.print(arr+"\t");
		}
		System.out.println();
		
//===================== 논리 ============================ 
		boolean[]booleanArr = new boolean[3];
		for(boolean arr : booleanArr) {
			System.out.print(arr+"\t");
		}
		System.out.println();
//===================== 문자 ============================ 
		char[]charArr = new char[3];
		for(char arr : charArr) {
			System.out.print(arr+"\t");
		}
		System.out.println();
//===================== 문자열 ============================ 
		String[]stringArr = new String[3];
		for(String arr : stringArr) {
			System.out.print(arr+"\t");
		}
		System.out.println();
//===================== Date ============================ 
		Date[]dateArr = new Date[3];
		for(Date arr : dateArr) {
			System.out.print(arr+"\t");
		}
		System.out.println();
		
	}
}
