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
public class Loai {
    private String MaLoai,TenLoai;
    public Loai(String MaLoai,String TenLoai)
    {
        this.MaLoai= MaLoai;
        this.TenLoai = TenLoai;
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
     * @return the TenLoai
     */
    public String getTenLoai() {
        return TenLoai;
    }

    /**
     * @param TenLoai the TenLoai to set
     */
    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
}
