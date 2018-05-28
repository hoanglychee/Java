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
public class NV_DAL {
    public static ArrayList<NV> getAll()
    {
        Connection con = DBConnect.MoKetNoi();
        if(con != null)
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NHANVIEN";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<NV> nv = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String MaNV = rs.getString("MANHANVIEN");
                    String Ho = rs.getString("HO");
                    String Ten = rs.getString("TEN");
                    String NgaySinh = rs.getString("NGAYSINH");
                    String NgayLam = rs.getString("NGAYLAMVIEC");
                    String DC = rs.getString("DIACHI");
                    String Dt = rs.getString("DIENTHOAI");
                    String LuongCB = rs.getString("LUONGCOBAN");
                    String PhuCap = rs.getString("PHUCAP");
                    NV nv1 = new NV(MaNV,Ho,Ten,NgaySinh,NgayLam,DC,Dt,LuongCB,PhuCap);
                    nv.add(nv1);
                }
                con.close();
                return nv;
            }catch(SQLException ex){
                System.out.println(ex);
                return null;}
        return null;
    }
    public static String TenNV(String MaNV){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TEN from NHANVIEN where MANHANVIEN='"+ MaNV +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("TEN");
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
    public static void Insert(String MaNV,String Ho,String Ten,String NgaySinh,String NgayLam,String DC,String Dt,String LuongCB,String PhuCap){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into NHANVIEN(MANHANVIEN,HO,TEN,NGAYSINH,NGAYLAMVIEC,DIACHI,DIENTHOAI,LUONGCOBAN,PHUCAP) values ('"+ MaNV +"',N'"+ Ho +"',N'"+ Ten +"','"+ NgaySinh +"','"+ NgayLam +"',N'"+ DC +"','"+ Dt +"','"+ LuongCB +"','"+ PhuCap+"')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String MaNV,String Ho,String Ten,String NgaySinh,String NgayLam,String DC,String Dt,String LuongCB,String PhuCap){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update NHANVIEN set HO=N'"+ Ho +"',TEN=N'"+Ten+"',NGAYSINH= '"+NgaySinh+"',NGAYLAMVIEC= '"+NgayLam+"',DIACHI= '"+ DC+"',DIENTHOAI= '"+Dt+"',LUONGCOBAN='"+LuongCB+"',PHUCAP='"+PhuCap+"' where MANHANVIEN = '"+ MaNV +"'";
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
