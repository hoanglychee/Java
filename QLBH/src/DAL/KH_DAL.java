/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hoang
 */
public class KH_DAL {
    public static ArrayList<KH> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from KHACHHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<KH> kh = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String MaKH = rs.getString("MAKHACHHANG");
                    String TenCT = rs.getString("TENCONGTY");
                    String TenGD = rs.getString("TENGIAODICH");
                    String DC = rs.getString("DIACHI");
                    String Em = rs.getString("EMAIL");                    
                    String Dt = rs.getString("DIENTHOAI");
                    String Fax = rs.getString("FAX");
                    KH kh1 = new KH(MaKH,TenCT,TenGD,DC,Em,Dt,Fax);
                    kh.add(kh1);
                }
                con.close();
                return kh;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
        public static String TenKH(String MaKH){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TENGIAODICH from KHACHHANG where MAKHACHHANG='"+ MaKH +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("TENGIAODICH");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    public static void Insert(String MaKH,String TenCT,String TenGD,String DC,String Em,String Dt,String Fax){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into KHACHHANG(MAKHACHHANG,TENCONGTY,TENGIAODICH,DIACHI,EMAIL,DIENTHOAI,FAX) values ('"+ MaKH +"',N'"+ TenCT +"',N'"+ TenGD +"','"+ DC +"','"+Em+"','"+ Dt +"','"+Fax+"')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String MaKH,String TenCT,String TenGD,String DC,String Em,String Dt,String Fax){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update KHACHHANG set TENCONGTY=N'"+ TenCT +"',TENGIAODICH=N'"+TenGD+"',DIACHI= '"+DC+"',EMAIL= '"+Em+"',DIACHI= '"+ DC+"',DIENTHOAI= '"+Dt+"',FAX='"+Fax+"' where MAKHACHHANG = '"+ MaKH +"'";
            stmt.executeUpdate(sql);
            con.close();       
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Delete(String MaNV){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "delete from NHANVIEN where MANHANVIEN = '"+ MaNV +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    } 
}
