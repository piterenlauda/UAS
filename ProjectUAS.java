/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. :'v :")
 */
package Project_UAS;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class ProjectUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        String n = "";
        String ulang="ya";
        double a = 0, b = 0, c = 0;
        
        HitungAlas HA = new HitungAlas();
        HitungTinggi HT = new HitungTinggi();
        HitungSisiMiring HSM = new HitungSisiMiring();
        
        while("ya".equals(ulang)){
        System.out.println("========================================");
        System.out.println("               Pitagoras");
        System.out.println("========================================");
        System.out.println("1. Hitung Alas Segitiga");
        System.out.println("2. Hitung Tinggi Segitiga");
        System.out.println("3. Hitung Sisi Miring Segitiga");
        System.out.println("4. Keluar dari program");
        System.out.println("");
        System.out.println("Apa yang anda ingin pilih?");
        System.out.print("Pilihan(1/2/3/4): ");
        
        try{
            n = dtIN.readLine();
        }catch(IOException e){
            System.out.print("Error 777");
        }
        
        switch(n){
            case "1":
                System.out.println("        Menghitung Alas Segitiga");
                System.out.println("========================================");
                System.out.print("Diketahui tinggi segitiga: ");
                try{
                    b = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                System.out.print("Diketahui sisi miring segitiga: ");
                try{
                    c = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                HA.SetTinggi1(b);
                HA.SetSisiMiring1(c);
                System.out.println("Jadi panjang alasnya: "+HA.HitungAlas());
                break;
            case "2":
                System.out.println("       Menghitung Tinggi Segitiga");
                System.out.println("========================================");
                System.out.print("Diketahui alas segitiga: ");
                try{
                    a = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                System.out.print("Diketahui sisi miring segitiga: ");
                try{
                    c = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                HT.SetAlas2(a);
                HT.SetSisiMiring2(c);
                System.out.println("Jadi panjang alasnya: "+HT.HitungTinggi());
                break;
            case "3":
                System.out.println("     Menghitung Sisi Miring Segitiga");
                System.out.println("========================================");
                System.out.print("Diketahui alas segitiga: ");
                try{
                    a = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                System.out.print("Diketahui tinggi segitiga: ");
                try{
                    b = Double.parseDouble(dtIN.readLine());
                }catch(IOException e){
                    System.out.println("Error 777");
                }
                HSM.SetAlas3(a);
                HSM.SetTinggi3(b);
                System.out.println("Jadi panjang alasnya: "+HSM.HitungSisiMiring());
                break;
            case "4":
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("UwU ^o^ ^w^ Terima kasih sudah menggunakan program kami! ^u^ ^q^ >_<");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                ulang="tidak";
                break;
            default:
                System.out.print("Maaf, pilihan anda tidak ada di menu");
                break;
        }
        }
    }   
}
