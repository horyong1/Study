import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int X = sc.nextInt();

        if((S <= X && T > X && S < T) || (S > T && (X >=S || T > X))) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}