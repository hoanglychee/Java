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
public class NCC_DAL {
    public static ArrayList<NCC> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NHACUNGCAP";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<NCC> ncc = new ArrayList<>();
                while(true)
                {
                    if(!rs.next()) break;
                    String MaCT = rs.getString("MACONGTY");
                    String TenCT = rs.getString("TENCONGTY");
                    String TenGD = rs.getString("TENGIAODICH");
                    String DC = rs.getString("DIACHI");                  
                    String Dt = rs.getString("DIENTHOAI");
                    String Fax = rs.getString("FAX");
                    String eM = rs.getString("EMAIL");  
                    NCC ncc1 = new NCC(MaCT,TenCT,TenGD,DC,Dt,Fax,eM);
                    ncc.add(ncc1);
                }
                con.close();
                return ncc;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static void Insert(String MaCT,String TenCT,String TenGD,String DC,String Dt,String Fax,String eM){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "insert into NHACUNGCAP(MACONGTY,TENCONGTY,TENGIAODICH,DIACHI,DIENTHOAI,FAX,EMAIL) values ('"+ MaCT +"',N'"+ TenCT +"',N'"+ TenGD +"','"+ DC +"','"+Dt+"','"+Fax+"','"+eM+ "')";
            stmt.executeUpdate(sql);
            con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Update(String MaCT,String TenCT,String TenGD,String DC,String Dt,String Fax,String eM){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "update NHACUNGCAP set TENCONGTY=N'"+ TenCT +"',TENGIAODICH=N'"+TenGD+"',DIACHI= '"+DC+"',DIACHI= '"+ DC+"',DIENTHOAI= '"+Dt+"',FAX='"+Fax+"',EMAIL= '"+eM+"' where MACONGTY = '"+ MaCT +"'";
            stmt.executeUpdate(sql);
            con.close();       
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    public static void Delete(String MaCT){
        Connection con = DBConnect.MoKetNoi();
        try{
            Statement stmt = con.createStatement();
            String sql = "delete from NHACUNGCAP where MACONGTY = '"+ MaCT +"'";
            stmt.executeUpdate(sql);
                    con.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            } 
    } 
}
