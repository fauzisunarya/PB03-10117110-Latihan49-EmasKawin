


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Total Biaya Pembelian Emas Dengan Menggunakan Konsep OOP
 */
package pb03.pkg10117110.latihan49.emaskawin;


public class PB0310117110Latihan49EmasKawin {


    public static void main(String[] args) {
        
        Emas objE = new Emas();
        objE.setHarga(570000);
        objE.setTotalBerat(15.7);
        System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat 15,7 gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp.570.000. Berapa total");
        System.out.println("harus dikeluarkan oleh hendi ?");
        System.out.println("");
        System.out.println("Jadi Biaya Yang Harus Dikeluarkan Oleh Hendi Adalah "
                + "Rp."+objE.perhitungan());

    }
    
}
