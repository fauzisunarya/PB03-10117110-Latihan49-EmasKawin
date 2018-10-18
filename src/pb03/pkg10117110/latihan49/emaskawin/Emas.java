
package pb03.pkg10117110.latihan49.emaskawin;


public class Emas {
    private double totalBerat;
    private int harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double perhitungan(){
        return harga*totalBerat;
    }
    
}
