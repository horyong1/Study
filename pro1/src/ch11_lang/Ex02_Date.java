package ch11_lang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date클래스(p536)
 * -날짜를 표현하는 클래스
 * -객체 간에 날짜 정보를 주고 받을때 매개변수와 리턴타입으로 주로사용 
 * -Deprecated 된 메서드가 많기 때문에 주의
 * 
 * Calendar 
 * 달력을 표현한 클래스
 * 
 * */
public class Ex02_Date {
	public static void main(String[] args) {
		// Date클래스의 객체 생성
		// 문법 > 클래스명 참조변수명 = new 클래스명()
		Date date = new Date();
		
		String str = date.toString();
		System.out.println(str);
		System.out.println(date.getYear()+1900);
		
		//캘린더 객체를 가져오기 (get은 이미 만들어져 있는거 가져옴)
		Calendar now = Calendar.getInstance();
		int year2 = now.get(Calendar.YEAR);
		int month2 = now.get(Calendar.MONTH)+1;
		System.out.println("Calendar ::: " + year2);
		System.out.println("Calendar ::: " + month2);
		
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		String str2 = s.format(date);
		System.out.println(str2);
		
	}
}
