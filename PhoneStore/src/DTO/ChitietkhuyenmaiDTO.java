
package DTO;

/**
 *
 * @author pc
 */
public class ChitietkhuyenmaiDTO {
    private String maKM, maSP;
    private int tileKM;

    public ChitietkhuyenmaiDTO(String maKM, String maSP, int tileKM) {
        this.maKM = maKM;
        this.maSP = maSP;
        this.tileKM = tileKM;
    }

    public ChitietkhuyenmaiDTO() {
        this.maKM = "";
        this.maSP = "";
        this.tileKM = 0;
    }

    public String getMaKM() {
        return maKM;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getTileKM() {
        return tileKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTileKM(int tileKM) {
        this.tileKM = tileKM;
    }
    
    
}
