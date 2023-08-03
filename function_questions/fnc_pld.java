import java.util.Scanner;
public class fnc_pld {
    public static void palindrome(int a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int r, s=0, c=n;
            while(n>0){
                r = n%10;
                s = (s*10)+r;
                n = n/10;
            }
        
        if(c==s){
            System.out.println("palimdrome");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    public static void main(String[] args) {
        palindrome(121);
    }
    
}
