package p2;

public class App {
	public static void main(String[] args) {
		// 유닛생성
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		Tank t1 = new Tank();
		
		Unit[] arr = new Unit[6];
		arr[0] = t1;
		arr[1] = m1;
		arr[2] = s1;
		arr[3] = m2;
		arr[4] = s2;
		arr[5] = m3;
		
		// 이동 - 일반적인 이동과 유닛들만의 로직을 가지고 있다.
		for(Unit e : arr) {
			e.move();
		}
		
		// 공격 - 모든 유닛은 자신만의 로직을 가지고 있어야 한다. abstract - override
		for(Unit e : arr) {
			e.attack();
		}
		
		// 멈춘다 - 모든 유닛 일반적 멈춤(오버라이딩 안함 final)
		for(Unit e : arr) {
			e.stop();
		}
		
		// 스팀팩을 사용
		for(Unit e : arr) {
//			Marine m = (Marine)e;	// 부모의 타입을 자식의 타입으로 형변환 가능하나 문제가 발생할 수 있음
			if(e instanceof Marine) {
				Marine m = (Marine)e; // if 문으로 타입을 확인하고 형변환 해줘야함
				m.useSteamPack();
			}
		}
		
	}
}
// abstract로 클래스를 생성하면 new 가 안됨 오로지 상속을 위한 클래스
// 변수는 언제든지 만들수 있음
// abstract method를 만들수 있다.
abstract class Unit{
	int hp;
	int ap;
	int speed;
	
	void move() {
		System.out.println(speed +"의 속도로 일반적인 로직으로 이동합니다.");
	};
	
	abstract void attack();
	// final 붙이면 오버라이딩 불가능
	final void stop() {
		System.out.println("일반적인 로직으로 모든 행동을 멈춥니다.");
		
	}
	
}


//final 붙히면 상속 불가 
final class SCV extends Unit{
	
	SCV() {
		hp = 50;
		ap = 3;
		speed = 1;
	}
	
	@Override
	void attack() {
		System.out.println(ap + "의 공경력으로 일꾼으로 매우 약하게 공격합니다.");
		
	}

}

final class Marine extends Unit{
	
	Marine() {
		hp = 100;
		ap = 10;
		speed = 3;
	}
	
	@Override
	void move() {
		System.out.println(speed + "의 속도로 마린만의 로직으로 이동합니다.");
	}
	
	@Override
	void attack() {
		System.out.println(ap + "의 공경력으로 총을 쏘며 공격합니다.");
		
	}
	
	void useSteamPack() {
		System.out.println("마린이 일시적으로 공격력, 공속을 올립니다.");
	}
}

final class Tank extends Unit{

	Tank() {
		hp = 200;
		ap = 30;
		speed = 5;
	}
	
	@Override
	void move() {
		System.out.println(speed + "의 속도로 탱크만의 로직으로 이동합니다.");
	}
	
	@Override
	void attack() {
		System.out.println(ap + "의 공경력으로 포를 쏘며 공격합니다.");
		
	}

}
// 클래스가 abstract 클래스를 상속 받을땐 abstract 클래스에 선언된 메소드를 무조건 재정의 해야함(오버라이딩해야함) 
final class Battle extends Unit{
	Battle() {
		hp = 500;
		ap = 50;
		speed = 30;
	}
	
	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}
	
}