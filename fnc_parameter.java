import java.util.*;
public class fnc_parameter {

public static void calculateSum(int a, int b){ //parametr or formal parameter
   
    int sum = a+b;
    System.out.println("sum is : " + sum);
    
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // argument or actual parameter
    }
    
}
