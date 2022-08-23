package test618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		People[] p = new People[5];

		for (int i = 0; i < p.length; i++) {
			String name = scanner.next();
			int cm = scanner.nextInt();
			double kg = scanner.nextDouble();
			p[i] = new People(name, cm, kg);
		}
		scanner.close();
		
		List<People> pToSort = Arrays.asList(p);
		pToSort.sort(Comparator.comparing(People::getName));
		System.out.println("name");

		for (People i : p) {
			i.info();
			System.out.println();
		}
		System.out.println();

		pToSort.sort(Comparator.comparing(People::getKg).reversed());
		System.out.println("weight");
		for (People j : p) {
			j.info();
			System.out.println();
		}
		
		
//		List<People> pToSort1 = Arrays.asList(p);
//		pToSort1.sort(Comparator.comparing(People::getKg).reversed());
//		System.out.println("weight");
//		
//		for (People j : p) {
//			j.info();
//			System.out.println();
//		}

	}

}

class People {
	private String name;
	private int cm;
	private double kg;

	People(String name, int cm, double kg) {
		this.name = name;
		this.cm = cm;
		this.kg = kg;
	}

	public String getName() {
		return name;
	}

	public double getKg() {
		return kg;
	}

	void info() {
		System.out.printf("%s %d %.1f", name, cm, kg);
	}

}