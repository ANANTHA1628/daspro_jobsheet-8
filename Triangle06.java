
import java.util.Scanner;

public class Triangle06 {

    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);
        System.out.print("masukkan nilai N = ");
        int N = input06.nextInt();
        int i = 0;
        while (i <= N){
            int j = 0;
            while (j < i ) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
            
        
    }
}