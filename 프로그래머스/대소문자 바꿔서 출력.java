import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input ="";
        String output ="";
        char a ;
        //문자열 입력 받음
        input = sc.nextLine();
        for(int i = 0;  i < input.length(); i++){
            a = input.charAt(i);
            //아스키 코드 65~90 대문자
            if( 65 <= a  && a <= 90 ){
                //소문자로 변경
                output += input.valueOf(a).toLowerCase();
            }
            //아스키 코드 97~122 소문자
            if ( 97 <= a && a <= 122){
                //대문자로 변경
                output += input.valueOf(a).toUpperCase();
            }
        }
    System.out.println(output);
    }
}