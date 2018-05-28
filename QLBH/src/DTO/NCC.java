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
public class NCC {
    private String MaCT,TenCT,TenGD,DC,Dt,Fax,eM;
    public NCC(String MaCT,String TenCT,String TenGD,String DC,String Dt,String Fax,String eM)
    {
        this.MaCT= MaCT;
        this.TenCT = TenCT;
        this.TenGD = TenGD;
        this.DC = DC;
        this.Dt = Dt;
        this.Fax = Fax;
        this.eM = eM;
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
     * @return the TenCT
     */
    public String getTenCT() {
        return TenCT;
    }

    /**
     * @param TenCT the TenCT to set
     */
    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    /**
     * @return the TenGD
     */
    public String getTenGD() {
        return TenGD;
    }

    /**
     * @param TenGD the TenGD to set
     */
    public void setTenGD(String TenGD) {
        this.TenGD = TenGD;
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
     * @return the Fax
     */
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax the Fax to set
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * @return the eM
     */
    public String geteM() {
        return eM;
    }

    /**
     * @param eM the eM to set
     */
    public void seteM(String eM) {
        this.eM = eM;
    }
    
}
