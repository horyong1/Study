package ch11_lang;

import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * 수학계산에 사용할 수 있는 필드, 메소드를 제공
 * - Math 클래스의 모든 필드(Field)는 static(정적) field이다
 * - Math 클래스의 모든 메서드(method)는 static(정적) method이다
 * - Math.필드명
 * - Math.메서드명() 으로 사용 가능함
 * */
public class Ex01_Math {
	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println("=" + pi);
		// public static final double PI 선언됨
		// final 값은 상수 값으로 값이 수정되면 안되는 값에 final을 선언해주고 사용함

		System.out.println(" = " + Math.ceil(pi));//4.0
		System.out.println(" = " + Math.floor(pi));//3.0
		System.out.println(" = " + Math.round(pi));//3
		System.out.println(" = " + Math.round(3.91));//4
		System.out.println(" = " + Math.max(50, 100));//100
		System.out.println(" = " + Math.min(20, 150));//20
		System.out.println();
	}
	
}
