
package Phase1;

public abstract class Garis {
    String warna;
    
    String getwarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    abstract float getLuas();
}
