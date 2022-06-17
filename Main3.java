package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main3 extends WindowAdapter implements ActionListener{
	private Frame f;
	private Panel p;
	private TextField tf;
	private Button[] btn;
//	private String num;
	private int num1, num2;
	private char op;
	
	
	public Main3() {
		num1 =0;
		num2 = 0;
		op='N'; 		//초기값 셋팅
		f = new Frame("계산기");
//		num = "0";
		p = new Panel();
		tf = new TextField("0");
		tf.setEditable(false);
		p.setBackground(Color.PINK);
		p.setLayout(new GridLayout(4,4));
		
		Font fon = new Font("맑은 고딕", Font.BOLD, 40);
		tf.setFont(fon);
		
		
		btn = new Button[16];
		String strArr[]= {"7","8","9","/",
							"4","5","6","*",
							"1","2","3","-",
							"C","0","=","+",};
		for(int i =0; i<btn.length; i++) {
			btn[i] = new Button(strArr[i]);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		
		f.addWindowListener(this);
		f.add(tf, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char c = e.getActionCommand().charAt(0);
		
		
		if(Character.isDigit(c)) {
			System.out.println("숫자");
			if(tf.getText().equals("0")) {
				tf.setText(e.getActionCommand());
			}else {
				String cur = tf.getText();
				tf.setText(cur+e.getActionCommand());
				
			}
		}else {
			System.out.println("문자");
			if(c == '=') {
				int res =0;
				num2 = Integer.parseInt(tf.getText());
				switch(op) {
				case '+' :
					res = num1 + num2;
					break;
				case '-' :
					res = num1 - num2;
					break;
				case '*' :
					res = num1 * num2;
					break;
				case '/' :
					res = num1 / num2;
					break;
				}
				tf.setText(String.valueOf(res));
				
			}else {
				op = c;
				num1 = Integer.parseInt(tf.getText());
				tf.setText("0");
				
			}
		}
		
		
		System.out.println(e.getActionCommand());
	}
	
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main3();
	}





}
