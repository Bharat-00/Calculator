import java.util.*;
public class Addition {
    public static double add(double n,double m){
        double c=n*m;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a=sc.nextDouble();
        System.out.println("Enter the second number:");
        double b=sc.nextDouble();
        System.out.println("the addition of two numbers is: "+ add(a,b));
    }
    
}

