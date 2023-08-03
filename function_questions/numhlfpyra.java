public class numhlfpyra {
    public static void half_num_pyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop ---- numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_num_pyramid(5);
    }

    
}
