public class fnc_overloading {
 // fnc to calculate sum of 2 numbers using diff data type
 public static int sum(int a, int b){
    return a+b;
 }
  // fnc to calculate sum of 2 numbers using diff data type
  public static float sum(float a, float b){
    return a+b;
  }
      
    public static void main(String[] args) {
        System.out.println(sum(3 , 5));
        System.out.println(sum(3.2f , 4.8f));
    }
    
}
