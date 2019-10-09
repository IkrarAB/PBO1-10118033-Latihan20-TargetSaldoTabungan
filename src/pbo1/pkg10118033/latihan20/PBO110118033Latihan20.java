
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk meghitung lama tabung
 * sampai mencapai saldo target
 *  
 */

package pbo1.pkg10118033.latihan20;

public class PBO110118033Latihan20 {
    public static void main(String[] args) {
        double saldo = 3500000;
        double bunga;
        int i = 1;
        for(double target = 6000000; saldo<=target;){
            bunga = saldo*0.08;
            saldo = saldo+bunga;
            System.out.print("Saldo di bulan ke-"+i);
            System.out.printf(" Rp.%,1.0f \n",saldo);
            i++;
        }
        System.out.println("(Developed By : Ikrar AB)");
    }
}