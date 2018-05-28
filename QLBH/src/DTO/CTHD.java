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
public class CTHD {
    private String SoHD,MaMH,Gia,SL,GiamGia;
    public CTHD(String SoHD,String MaMH,String Gia,String SL,String GiamGia)
    {
        this.SoHD= SoHD;
        this.MaMH = MaMH;
        this.Gia = Gia;
        this.SL = SL;
        this.GiamGia = GiamGia;
    }

    /**
     * @return the SoHD
     */
    public String getSoHD() {
        return SoHD;
    }

    /**
     * @param SoHD the SoHD to set
     */
    public void setSoHD(String SoHD) {
        this.SoHD = SoHD;
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
     * @return the GiamGia
     */
    public String getGiamGia() {
        return GiamGia;
    }

    /**
     * @param GiamGia the GiamGia to set
     */
    public void setGiamGia(String GiamGia) {
        this.GiamGia = GiamGia;
    }
    
}
