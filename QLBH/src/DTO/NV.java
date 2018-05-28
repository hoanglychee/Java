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
public class NV {
    private String MaNV,Ho,Ten,NgaySinh,NgayLam,DC,Dt,LuongCB,PhuCap;
    public NV(String MaNV,String Ho,String Ten,String NgaySinh,String NgayLam,String DC,String Dt,String LuongCB,String PhuCap)
    {
        this.MaNV= MaNV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.NgayLam = NgayLam;
        this.DC = DC;
        this.Dt = Dt;
        this.LuongCB = LuongCB;
        this.PhuCap = PhuCap;
    }

    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the Ho
     */
    public String getHo() {
        return Ho;
    }

    /**
     * @param Ho the Ho to set
     */
    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    /**
     * @return the Ten
     */
    public String getTen() {
        return Ten;
    }

    /**
     * @param Ten the Ten to set
     */
    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    /**
     * @return the NgayLam
     */
    public String getNgayLam() {
        return NgayLam;
    }

    /**
     * @param NgayLam the NgayLam to set
     */
    public void setNgayLam(String NgayLam) {
        this.NgayLam = NgayLam;
    }

    /**
     * @return the DC
     */
    public String getDC() {
        return DC;
    }

    /**
     * @param DC the DC to set
     */
    public void setDC(String DC) {
        this.DC = DC;
    }

    /**
     * @return the Dt
     */
    public String getDt() {
        return Dt;
    }

    /**
     * @param Dt the Dt to set
     */
    public void setDt(String Dt) {
        this.Dt = Dt;
    }

    /**
     * @return the LuongCB
     */
    public String getLuongCB() {
        return LuongCB;
    }

    /**
     * @param Luong the LuongCB to set
     */
    public void setLuongCB(String Luong) {
        this.LuongCB = Luong;
    }

    /**
     * @return the PhuCap
     */
    public String getPhuCap() {
        return PhuCap;
    }

    /**
     * @param PhuCap the PhuCap to set
     */
    public void setPhuCap(String PhuCap) {
        this.PhuCap = PhuCap;
    }
    
}
