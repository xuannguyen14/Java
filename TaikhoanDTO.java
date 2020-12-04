
package DTO;

/**
 *
 * @author xuannguyen
 */
public class TaikhoanDTO {
    private String maTK, password;

    public TaikhoanDTO(){
        this.maTK = "";
        this.password = "";
    }
    public TaikhoanDTO(String maTK, String password) {
        this.maTK = maTK;
        this.password = password;
    }

    public String getMaTK() {
        return maTK;
    }

    public String getPassword() {
        return password;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
