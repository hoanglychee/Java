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
public class MH_DAL {
    public static ArrayList<MH> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from MATHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<MH> mh = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String MaMH = rs.getString("MAHANG");
                    String TenMH = rs.getString("TENHANG");
                    String MaCT = rs.getString("MACONGTY");
                    String MaLoai = rs.getString("MALOAIHANG");                  
                    String SL = rs.getString("SOLUONG");
                    String Dv = rs.getString("DONVITINH");
                    String Gia = rs.getString("GIAHANG");  
                    MH mh1 = new MH(MaMH,TenMH,MaCT,MaLoai,SL,Dv,Gia);
                    mh.add(mh1);
                }
                con.close();
                return mh;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static void Insert(String MaMH,String TenMH,String MaCT,String MaLoai,String SL,String Dv,String Gia){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into MATHANG(MAHANG,TENHANG,MACONGTY,MALOAIHANG,SOLUONG,DONVITINH,GIAHANG) values ('"+ MaMH +"',N'"+ TenMH +"','"+ MaCT +"','"+ MaLoai +"','"+SL+"','"+Dv+"','"+Gia+ "')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String MaMH,String TenMH,String MaCT,String MaLoai,String SL,String Dv,String Gia){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update MATHANG set TENHANG=N'"+ TenMH +"',MACONGTY='"+MaCT+"',MALOAIHANG= '"+MaLoai+"',SOLUONG= '"+SL+"',DONVITINH='"+Dv+"',GIAHANG= '"+Gia+"' where MAHANG = '"+ MaCT +"'";
            stmt.executeUpdate(sql);
            con.close();       
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Delete(String MaMH){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "delete from MATHANG where MAHANG = '"+ MaMH +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    } 
}
