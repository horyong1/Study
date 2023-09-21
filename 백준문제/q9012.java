import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Input ip = new Input();
        int num = sc.nextInt();

        while(num != 0) {
            System.out.println(ip.solve(sc.next()));
            num--;
        }

    }

}

class Input{
    public String solve(String st) {
        Stack<String> stack = new Stack<String>();
        String [] str = new String[50];
        str = st.split("");

        for(int i = 0; i<str.length; i++) {
            if(str[i].equals("(")) {
                stack.push(str[i]);
            }else if(str[i].equals(")")) {
                if(stack.isEmpty())
                    return "NO";
                else
                    stack.pop();
            }
        }

        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
}