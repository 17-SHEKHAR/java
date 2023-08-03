import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int i;
        int ans = 1;
        for(i=1; i<=b; i++){
            ans = ans*a;
        }
        System.out.println(ans);
  }
    
}
