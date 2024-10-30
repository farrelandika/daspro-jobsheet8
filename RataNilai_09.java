import java.util.Scanner;
public class RataNilai_09 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int i, j;
    float nilai,totalnilai,rataNilai;
    int nilaiMahsiswa;
    i=1;
    while (i <= 5) {
        totalnilai = 0;

    for (j = 1; j <= 5; j++){
        System.out.print("nilai ke - " + j + " = ");
        nilaiMahsiswa = sc.nextInt();
        totalnilai += nilaiMahsiswa;
    }
    rataNilai = totalnilai / 5 ;
    i++;
    System.out.println("rata-rata nilai mahasiswa ke- = " + i + " adalah " + rataNilai);
    System.out.println("input nilai mahasiswa " + i);
   
     }

   } 
}
