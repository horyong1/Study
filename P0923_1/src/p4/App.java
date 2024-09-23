package p4;

public class App {
	public static void main(String[] args) {
		Component1 cp1 = new Component1();
		Component2 cp2 = new Component2();
		
		cp1.setCp2(cp2);
		cp1.method();
		
	}
}




class Component1{
	private Component2 component2;
	
	public void setCp2(Component2 component2) {
		this.component2 = component2;
	}
	
	public void method() {
		component2.method();
	}
}

class Component2{
	public void method() {
		System.out.println("!!!");
	}
}

class Component3{
	public void method() {
		
	}
}