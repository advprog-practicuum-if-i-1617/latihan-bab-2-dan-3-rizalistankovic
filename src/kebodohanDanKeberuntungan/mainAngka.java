package kebodohanDanKeberuntungan;
import java.util.Scanner;
public class mainAngka {
     static String[] huruf={"","satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka\t: ");
        System.out.println("Huruf\t: "+mainAngka.konvers(sc.nextLong()));
    }    
    public static String konvers(Long angka){ 
        if (angka < 12)
            return huruf[angka.intValue()];
        if (angka >= 12 && angka <= 19)
            return huruf[angka.intValue() % 10]+" belas ";
        if (angka >= 20 && angka <= 99)
            return konvers(angka / 10)+" puluh "+huruf[angka.intValue()% 10];
        if (angka >= 100 && angka <=199)
            return "seratus "+konvers(angka % 100);
        if (angka >= 200 && angka <= 999)
            return konvers(angka / 100)+" ratus "+konvers(angka % 100);
        if (angka == 1000)
            return "seribu " + konvers(angka % 1000);
    return "";
    }
}

