
import java.util.Scanner;

public class Ratanilai06 {
    public static void main(String[] args) {
        Scanner input06 =new Scanner(System.in);

        int i , j ,  nilaiMhs;
        float  ratanilai, totalnilai = 0;
        i = 1;
        while (i <= 5) {
            totalnilai = 0;
            System.out.println("input nilai mahasiswa ke- " + i);
            for ( j = 1; j <= 5; j++) {
                System.out.print("masukkan nilai mahasiswa ke- " + j + " = ");
                nilaiMhs=input06.nextInt();
                totalnilai += nilaiMhs;
            }
                
            
            ratanilai=totalnilai / 5;
            i++;
        System.out.println("Rata rata nilai mahasiswa ke- "+ i + " adalah " + ratanilai );
        }
        
    }
}
