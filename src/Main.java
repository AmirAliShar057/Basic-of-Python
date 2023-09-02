// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // star pattern
        for(int i=1;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}