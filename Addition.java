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
