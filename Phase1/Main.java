
package Phase1;

public class Main {
    public static void main(String[] args) {
        
        Garis segitiga = new Segitiga(8,16);
        Garis lingkaran = new Lingkaran(10);

        System.out.println("Luas  segitiga : " + segitiga.getLuas());
        System.out.println("Luas  lingkaran : " + lingkaran.getLuas());
    }
}
