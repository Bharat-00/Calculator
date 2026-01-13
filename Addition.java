
import java.util.Scanner;
public class Addition {
    public static double sub(double a,double b){
        double c=a-b;
        return c;
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1=sc.nextDouble();
        System.out.println("enter the second number: ");
        double num2=sc.nextDouble();
        System.out.println("subtraction is: "+sub(num1,num2));
        sc.close();
    }
}

import java.util.*;
public class Addition {
    public static double add(double a,double b){
        double c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2=sc.nextDouble();
        System.out.println("the addition of two numbers is: "+ add(num1,num2));
    }
    
}

