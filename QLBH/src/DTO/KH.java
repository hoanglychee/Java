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
public class KH {
    private String MaKH,TenCT,TenGD,DC,Em,Dt,Fax;
    public KH(String MaKH,String TenCT,String TenGD,String DC,String Em,String Dt,String Fax)
    {
        this.MaKH = MaKH;
        this.TenCT = TenCT;
        this.TenGD = TenGD;
        this.DC = DC;
        this.Em = Em;
        this.Dt = Dt;
        this.Fax = Fax;
    }
    public String getMa()
    {
        return this.MaKH;
    }
    public void setMa(String MaKH)
    {
        this.MaKH = MaKH;
    }
    public String getTenCT()
    {
        return this.TenCT;
    }
    public void setTenCT(String TenCT)
    {
        this.TenCT= TenCT;
    }
    public String getTenGD()
    {
        return this.TenGD;
    }
    public void setTenGD(String TenGD)
    {
        this.TenGD = TenGD;
    }
    public String getDC()
    {
        return this.DC;
    }
    public void setDC(String DC)
    {
        this.DC = DC;
    }
    public String getEm()
    {
        return this.Em;
    }
    public void setEm(String Em)
    {
        this.Em = Em;
    }
    public String getDT()
    {
        return this.Dt;
    }
    public void setDT(String Dt)
    {
        this.Dt= Dt;
    }
    public String getF()
    {
        return this.Fax;
    }
    public void setF(String Fax)
    {
        this.Fax = Fax;
    }
}
