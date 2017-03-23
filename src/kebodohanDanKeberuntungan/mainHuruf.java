package kebodohanDanKeberuntungan;
import java.util.Scanner;
public class mainHuruf {
   private int angka; 
    private int awal; 
    private int tengah;
    private int akhir;  
    private String sebut;
    private int cek = 0; 

    String satuan[] = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"}; 
    public void setKata(String a) { 
       String cool = a.toLowerCase();
        for (int i = 0; i < satuan.length; i++) { 
            if ((satuan[i].equals(a))) { 
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                int satuan = i + 1; 
                System.out.println(satuan); 
                this.cek=1; 
                break; 
            } else if (a.contains(satuan[i]) && a.contains("belas")) { 
                int puluhan = i + 1 + 10; 
                System.out.println(puluhan); 
                this.cek=1; 
                break; 
            } else if (a.equals("sebelas")) { 
                System.out.println("11"); 
                this.cek=1; 
                break; 
            } else if (a.equals("seratus")) { 
                System.out.println("100"); 
                this.cek=1; 
                break; 
            } else if (a.equals("seribu")) {
                System.out.println("1000");
                this.cek=1;
                break;
            } 
        }        
        String ss[] = a.split("\\s");
        if (cek == 0){
            for (int i = 0; i < satuan.length; i++ ){
                if (ss[0].contains(satuan[i])){
                    this.awal = (i + 1) * 100;
                    break;
                }
            }
            if (ss.length == 3){
                for (int j = 0; j < satuan.length; j++){
                    if (ss[2].contains(satuan[j])){
                       this.tengah = (j + 1) * 10;
                       break;
                    }
                } 
                if (ss.length == 5){
                    for (int k = 0; k < satuan.length; k++){
                        if (ss[4].contains(satuan[k])){
                            this.akhir = k + 1;
                            break;
                        }
                    }
                }
            }
        System.out.println(this.akhir+this.tengah+this.awal);
        } 
    } 
    public static void main(String[] args) {
         Scanner on = new Scanner (System.in); 
        mainHuruf y = new mainHuruf (); 
        System.out.print("Huruf\t: "); 
        String x = on.nextLine(); 
        System.out.print("Angka\t: ");
        y.setKata(x); 
    }
}
