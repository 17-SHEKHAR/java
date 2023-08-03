public class function_overloading {
    // func calculate the sum of two numbers
public static int sum(int a, int b){
    return a+b;
}
public static float sum(float a, float b){
    return a+b;
}

public static void main(String[] args) {
    System.out.println(sum(3 , 5));
    System.out.println(sum(4.8f , 3.2f));
}
}
