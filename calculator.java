import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        double result;

        switch(op){
            case'+': result=a+b ;break;
            case'-': result=a-b; break;
            case'/': result=a/b; break;
            case'*': result=a*b; break;
            default:
                System.out.println("ivalid operator");
                return;
        }
        System.out.println(result);
    }

}
