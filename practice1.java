import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mobile = sc.nextFloat();
        float laptop = sc.nextFloat();
        float bill = mobile+laptop;
        System.out.println("bill is " + bill);
        float newTotal = bill+(0.18f*bill);
        System.out.println("bill with 18% gst is " + newTotal);

    }
    
}
