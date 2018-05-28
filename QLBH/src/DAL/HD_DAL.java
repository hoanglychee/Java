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
public class HD_DAL {
    public static ArrayList<HD> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from MATHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<HD> hd = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String SoHD = rs.getString("SOHOADON");
                    String MaKH = rs.getString("MAKHACHHANG");
                    String MaNV = rs.getString("MANHANVIEN");
                    String NgayDat = rs.getString("NGAYDATHANG");                  
                    String NgayGiao = rs.getString("NGAYGIAOHANG");
                    String NgayChuyen = rs.getString("NGAYCHUYENHANG");
                    String NoiGiao = rs.getString("NOIGIAOHANG");  
                    HD hd1 = new HD(SoHD,MaKH,MaNV,NgayDat,NgayGiao,NgayChuyen,NoiGiao);
                    hd.add(hd1);
                }
                con.close();
                return hd;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static void Insert(String SoHD,String MaKH,String MaNV,String NgayDat,String NgayGiao,String NgayChuyen, String NoiGiao){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into DONDATHANG(SOHOADON,MAKHACHHANG,MANHANVIEN,NGAYDATHANG,NGAYGIAOHANG,NGAYCHUYENHANG,NOIGIAOHANG) values ('"+ SoHD +"',N'"+ MaKH +"','"+ MaNV +"','"+ NgayDat +"','"+NgayGiao+"','"+NgayChuyen+"','"+NoiGiao+ "')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String SoHD,String MaKH,String MaNV,String NgayDat,String NgayGiao,String NgayChuyen, String NoiGiao){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update DONDATHANG set MAKHACHHANG='"+ MaKH +"',MANHANVIEN='"+MaNV+"',NGAYDATHANG= '"+NgayDat+"',NGAYGIAOHANG= '"+NgayGiao+"',NGAYCHUYENHANG='"+NgayChuyen+"',NOIGIAOHANG= N'"+NoiGiao+"' where SOHOADON = '"+ SoHD +"'";
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
            String sql = "delete from DONDATHANG where SOHOADON = '"+ SoHD +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    }
}
