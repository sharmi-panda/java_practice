import java.util.Scanner;
class arith{
    public static void main (String [] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = scr.nextInt();
        System.out.println("enter the Second number:");
        int b = scr.nextInt();

        System.out.println("Sum:"+ (a+b));
        System.out.println("Sub:"+(a-b));
        System.out.println("mul:"+(a*b));
        System.out.println("div:"+(a/b));
        System.out.println("remainder:"+(a%b));
        scr.close();
    }
}