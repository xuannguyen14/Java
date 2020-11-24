/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author pc
 */
public class KhuyenmaiDTO {
    private String makm;
    private String masp;
    private String tenkm;
    private int tile;
    private String ngaybd;
    private String ngaykt;
    public khuyenmaiDTO(){
        this.makm="";
        this.masp="";
        this.tile=0;
        this.tenkm="";
        this.ngaybd="";
        this.ngaykt="";
    }
    public void khuyenmaiDTO(String makm,String masp,String tenkm,int tile,String ngaybd,String ngaykt){
        this.makm=makm;
        this.masp=masp;
        this.tile=tile;
        this.tenkm=tenkm;
        this.ngaybd=ngaybd;
        this.ngaykt=ngaykt;
    }
    public String getmakm(){
        return makm;
    }
    public String getmasp(){
        return masp;
    }
    public String gettenkm(){
        return tenkm;
    }
    public int gettile(){
        return tile;
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
    public void setmasp(String masp){
        this.masp=masp;
    }
    public void settenkm(String tenkm){
        this.tenkm=tenkm;
    }
    public void settile(int tile){
        this.tile=tile;
    }
    public void setngaybd(String ngaybd){
        this.ngaybd=ngaybd;
    }
    public void setngaykt(String ngaykt){
        this.ngaykt=ngaykt;
    }
}
