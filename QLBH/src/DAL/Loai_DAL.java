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
public class Loai_DAL {
    public static ArrayList<Loai> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from LOAIHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Loai> l = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String MaLoai = rs.getString("MALOAIHANG");
                    String TenLoai = rs.getString("TENLOAIHANG");
                    Loai l1 = new Loai(MaLoai,TenLoai);
                    l.add(l1);
                }
                con.close();
                return l;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static void Insert(String MaLoai,String TenLoai){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into LOAIHANG(MALOAIHANG,TENLOAIHANG) values ('"+ MaLoai +"',N'"+ TenLoai +"')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String MaLoai,String TenLoai){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update LOAIHANG set TENLOAIHANG=N'"+ TenLoai +"' where MALOAIHANG = '"+ MaLoai +"'";
            stmt.executeUpdate(sql);
            con.close();       
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Delete(String MaLoai){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "delete from LOAIHANG where MALOAIHANG = '"+ MaLoai +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    }
}
