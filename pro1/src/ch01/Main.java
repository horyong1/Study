package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int num = br.read();
		int cnt = 0;
		int n = num;
		String[] str = new String[st.length()];
		
		for(int i = 0; i < st.length(); i++) {
			str[i] = String.valueOf(st.charAt(i));
		}
		
		while(num>cnt) {
			
			String st2 = br.readLine();
			switch(st2) {
			case "L" :
				break;
			case "D" :
				break;
			case "B" :
				break;
			case "P" :
				
				break;
			}
			
		}
		
		for(String s : str) {
			System.out.print(s);
		}
	}
}
