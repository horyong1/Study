package ch06;

import java.util.Date;  //java.util패키지안에 선언된 Date클래스를 import

//field(필드) : p246~
//method : p269~
public class Car01_p249 {

	//field(필드) : 전역변수
	//타입 필드명 [= 초기값];
	String company1 = "외국회사";			//제조사명
	int maxSpeed1 = 450;					//최고속도
	double fuelEfficiency1 = 16.6;	//연비
	
	/*전역변수는 데이터타입에 따라 자동초기화가 된다
	-정수  byte,short,int,long은 0
	-실수 float,double은 0.0
	-문자char은 공백
	-논리형은 false
	-클래스형은 null  예)Date,String 클래스
	*/
	int price;
	long rpm;
	double engin;
	char grade;
	boolean madeInKorea;
	String color;
	Date pDay;
	
	//method
	void test() {
		System.out.println("--test()안----------------------------------------------------"); 
		System.out.println("price="+price);
		System.out.println("rpm="+rpm);
		System.out.println("engin="+engin);
		System.out.println("grade="+grade);
		System.out.println("madeInKorea="+madeInKorea);
		System.out.println("String타입 color="+color);
		System.out.println("Date타입   pDay="+pDay);
		System.out.println(); //빈줄
		
		System.out.println("company1="+company1);
		System.out.println("maxSpeed1="+maxSpeed1);
		System.out.println("fuelEfficiency1="+fuelEfficiency1);
		System.out.println(); //빈줄
	}
		
	public static void main(String[] args) {
		System.out.println("--main()안----------------------------------------------------");
		//클래스 Car01_p249의 객체를 생성하여   참조변수obj에 할당
		//클래스명   변수명 = new 클래스명()
		Car01_p249 obj = new Car01_p249(); 
		System.out.println("obj="+obj);//ch06.Car01_p249@515f550a
		obj.test();
		
		System.out.println("-----------------------------------------------");
		String company = "현대";			//제조사명
		int maxSpeed = 350;					//최고속도
		double fuelEfficiency = 15.6;	//연비
		
		System.out.println("company="+company);
		System.out.println("maxSpeed="+maxSpeed);
		System.out.println("fuelEfficiency="+fuelEfficiency);
	}

}
