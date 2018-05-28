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
public class HD {
    private String SoHD,MaKH,MaNV,NgayDat,NgayGiao,NgayChuyen,NoiGiao;
    public HD(String SoHD,String MaKH,String MaNV,String NgayDat,String NgayGiao,String NgayChuyen, String NoiGiao)
    {
        this.SoHD= SoHD;
        this.MaKH= MaKH;
        this.MaNV = MaNV;
        this.NgayDat = NgayDat;
        this.NgayGiao = NgayGiao;
        this.NgayChuyen = NgayChuyen;
        this.NoiGiao = NoiGiao;
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
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
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
     * @return the NgayDat
     */
    public String getNgayDat() {
        return NgayDat;
    }

    /**
     * @param NgayDat the NgayDat to set
     */
    public void setNgayDat(String NgayDat) {
        this.NgayDat = NgayDat;
    }

    /**
     * @return the NgayGiao
     */
    public String getNgayGiao() {
        return NgayGiao;
    }

    /**
     * @param NgayGiao the NgayGiao to set
     */
    public void setNgayGiao(String NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    /**
     * @return the NgayChuyen
     */
    public String getNgayChuyen() {
        return NgayChuyen;
    }

    /**
     * @param NgayChuyen the NgayChuyen to set
     */
    public void setNgayChuyen(String NgayChuyen) {
        this.NgayChuyen = NgayChuyen;
    }

    /**
     * @return the NoiGiao
     */
    public String getNoiGiao() {
        return NoiGiao;
    }

    /**
     * @param NoiGiao the NoiGiao to set
     */
    public void setNoiGiao(String NoiGiao) {
        this.NoiGiao = NoiGiao;
    }
    
}
