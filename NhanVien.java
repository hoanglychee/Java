/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang
 */
public class NhanVien {
    private String Ma;
    private String PhanXuong;
    private int SoSP;
    public String getMa()
    {
        return this.Ma;
    }
    public String getPX()
    {
        return this.PhanXuong;
    }
    public int getSoSP()
    {
        return this.SoSP;
    }
    public void NhanVien(){}
    public void setMa(String Ma)
    {
        this.Ma = Ma;
    }
    public void setPX(String PhanXuong)
    {
        this.PhanXuong = PhanXuong;
    }
    public void setSoSP(int SoSP)
    {
        this.SoSP = SoSP;
    }
    private int getChuan()
    {
        if(PhanXuong == "A")
            return 300;
        else
            return 500;
    }
    boolean VuotChuan()
    {
        if(getChuan() == 300 && SoSP > 300 || getChuan() == 500 && SoSP > 500)
            return true;
        else
            return false;
    }
    private int TinhLuong()
    {
        if(VuotChuan() == true && getChuan() == 300)
            return (SoSP -300)*30000 + 300*20000;
        else
            if(VuotChuan() == true && getChuan() == 500)
                return (SoSP -500)*30000 + 500*20000;
            else
                return SoSP*20000;
    }
    public String toString()
    {
        return Ma;
    }
}
