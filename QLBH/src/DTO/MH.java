/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Hoang
 */
public class MH {
    private String MaMH,TenMH,MaCT,MaLoai,SL,Dv,Gia;
    public MH(String MaMH,String TenMH,String MaCT,String MaLoai,String SL,String Dv,String Gia)
    {
        this.MaMH= MaMH;
        this.TenMH = TenMH;
        this.MaCT = MaCT;
        this.MaLoai = MaLoai;
        this.SL = SL;
        this.Dv = Dv;
        this.Gia = Gia;
    }

    /**
     * @return the MaMH
     */
    public String getMaMH() {
        return MaMH;
    }

    /**
     * @param MaMH the MaMH to set
     */
    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    /**
     * @return the TenMH
     */
    public String getTenMH() {
        return TenMH;
    }

    /**
     * @param TenMH the TenMH to set
     */
    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    /**
     * @return the MaCT
     */
    public String getMaCT() {
        return MaCT;
    }

    /**
     * @param MaCT the MaCT to set
     */
    public void setMaCT(String MaCT) {
        this.MaCT = MaCT;
    }

    /**
     * @return the MaLoai
     */
    public String getMaLoai() {
        return MaLoai;
    }

    /**
     * @param MaLoai the MaLoai to set
     */
    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    /**
     * @return the SL
     */
    public String getSL() {
        return SL;
    }

    /**
     * @param SL the SL to set
     */
    public void setSL(String SL) {
        this.SL = SL;
    }

    /**
     * @return the Dv
     */
    public String getDv() {
        return Dv;
    }

    /**
     * @param Dv the Dv to set
     */
    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    /**
     * @return the Gia
     */
    public String getGia() {
        return Gia;
    }

    /**
     * @param Gia the Gia to set
     */
    public void setGia(String Gia) {
        this.Gia = Gia;
    }
    
}
