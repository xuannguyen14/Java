/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;

/**
 *
 * @author Tat Gia Vi
 */
public class khuyenmaiDTO {
    private String makm;
    private String tenkm;
    private String ngaybd;
    private String ngaykt;
    public String getmakm(){
        return makm;
    }
    public String gettenkm(){
        return tenkm;
    }
    public String getngaybd(){
        return ngaybd;
    }
    public String getngaykt(){
        return ngaykt;
    }
    public void setmakm(String makm){
        this.makm=makm;
    }
    public void settenkm(String tenkm){
        this.tenkm=tenkm;
    }
    public void setngaybd(String ngaybd){
        this.ngaybd=ngaybd;
    }
    public void setngaykt(String ngaykt){
        this.ngaykt=ngaykt;
    }
}
