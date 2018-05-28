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
public class CTHD_DAL {
    public static ArrayList<CTHD> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from CTDATHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<CTHD> cthd = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String SoHD = rs.getString("SOHOADON");
                    String MaMH = rs.getString("MAHANG");
                    String Gia = rs.getString("GIABAN");
                    String SL = rs.getString("SOLUONG");                  
                    String GiamGia = rs.getString("MUCGIAMGIA");
                    CTHD cthd1 = new CTHD(SoHD,MaMH,Gia,SL,GiamGia);
                    cthd.add(cthd1);
                }
                con.close();
                return cthd;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static void Insert(String SoHD,String MaMH,String Gia,String SL,String GiamGia){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into CTDATHANG(SOHOADON,MAHANG,GIABAN,SOLUONG,MUCGIAMGIA) values ('"+ SoHD +"',N'"+ MaMH +"','"+ Gia +"','"+ SL +"','"+GiamGia+ "')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String SoHD,String MaMH,String Gia,String SL,String GiamGia){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update CTDATHANG set MAHANG='"+ MaMH +"',GIABAN='"+Gia+"',SOLUONG= '"+SL+"',MUCGIAMGIA= '"+GiamGia+"',NGAYCHUYENHANG='"+SoHD+"'";
            stmt.executeUpdate(sql);
            con.close();       
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Delete(String SoHD){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "delete from CTDATHANG where SOHOADON = '"+ SoHD +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    }
}
