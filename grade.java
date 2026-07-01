import java.util.Scanner;
public class grade{
    public static void main (String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the 1st subject mark:");
        int a=scr.nextInt();

        System.out.println("Enter the 2nd subject mark:");
        int b=scr.nextInt();

        System.out.println("Enter the 3rd subject mark:");
        int c=scr.nextInt();

        int d=(a+b+c)/3;
        System.out.println("Average of 3 subject:" + d);

        if (a <35 || b<35 || c <35)
            System.out.println("Fail");
        else if (d>35 && d<80)
            System.out.println("Pass");
        else
            System.out.println("pass with a grade");

    }
}