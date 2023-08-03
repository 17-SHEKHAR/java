import java.util.*;
public class add{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        while(x>0){
            int z=x%10;
    
            y=y*10+z;
            x=x/10;
        }
      

        System.out.println(y);
    }
}