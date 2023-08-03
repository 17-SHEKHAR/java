import java.util.*;
public class plndrome {
public static void main(String[] args) {
    System.out.println("Enter any number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r, s=0, d=n;
    while(n>0){
        r = n%10;
        s = (s*10)+r;
        n = n/10;
    }
    if(d==s){
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("not palindrome");
    }


}
    
}
