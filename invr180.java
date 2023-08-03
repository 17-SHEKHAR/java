import javax.sound.sampled.SourceDataLine;

public class invr180 {
    public static void pttr() {
        int n=4;
        // outer loop for row
        for(int i=1; i<=n; i++){

            // inner loop -> spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pttr();
    }
    
}
