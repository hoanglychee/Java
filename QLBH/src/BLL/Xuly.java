/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.*;
import DAL.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Hoang
 */
public class Xuly {
    //NhanVien
    public static ArrayList<NV> NVArray(){
        return NV_DAL.getAll();
    }
    public static DefaultTableModel NVModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã nhân viên");
        model.addColumn("Họ");
        model.addColumn("Tên");
        model.addColumn("Ngày Sinh");
        model.addColumn("Ngày làm");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Lương cơ bản");
        model.addColumn("Phụ cấp");
        try{
            for(int i=0;i< NVArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(NVArray().get(i).getMaNV());
                h.add(NVArray().get(i).getHo());
                h.add(NVArray().get(i).getTen());
                h.add(NVArray().get(i).getNgaySinh());
                h.add(NVArray().get(i).getNgayLam());
                h.add(NVArray().get(i).getDC());
                h.add(NVArray().get(i).getDt());
                h.add(NVArray().get(i).getLuongCB());
                h.add(NVArray().get(i).getPhuCap());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertNV(String MaNV,String Ho,String Ten,String NgaySinh,String NgayLam,String DC,String Dt,String LuongCB,String PhuCap){
        NV_DAL.Insert(MaNV,Ho,Ten,NgaySinh,NgayLam,DC,Dt,LuongCB,PhuCap);
    }
    public static void UpdateNV(String MaNV,String Ho,String Ten,String NgaySinh,String NgayLam,String DC,String Dt,String LuongCB,String PhuCap){
        NV_DAL.Update(MaNV,Ho,Ten,NgaySinh,NgayLam,DC,Dt,LuongCB,PhuCap);
    }
    public static void DeleteNV(String MaNV){
        NV_DAL.Delete(MaNV);
    }
    //KhachHang
    public static ArrayList<KH> KHArray(){
        return KH_DAL.getAll();
    }
    public static DefaultTableModel KHModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên công ty");
        model.addColumn("Tên giao dịch");
        model.addColumn("Địa chỉ");
        model.addColumn("Email");
        model.addColumn("Điện thoại");
        model.addColumn("Fax");
        try{
            for(int i=0;i< KHArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(KHArray().get(i).getMa());
                h.add(KHArray().get(i).getTenCT());
                h.add(KHArray().get(i).getTenGD());
                h.add(KHArray().get(i).getDC());
                h.add(KHArray().get(i).getEm());
                h.add(KHArray().get(i).getDT());
                h.add(KHArray().get(i).getF());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertKH(String MaKH,String TenCT,String TenGD,String DC,String Em,String Dt,String Fax){
        KH_DAL.Insert(MaKH,TenCT,TenGD,DC,Em,Dt,Fax);
    }
    public static void UpdateKH(String MaKH,String TenCT,String TenGD,String DC,String Em,String Dt,String Fax){
        KH_DAL.Update(MaKH,TenCT,TenGD,DC,Em,Dt,Fax);
    }
    public static void DeleteKH(String MaKH){
        KH_DAL.Delete(MaKH);
    }
    //NhaCungCap
    public static ArrayList<NCC> NCCArray(){
        return NCC_DAL.getAll();
    }
    public static DefaultTableModel NCCModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã công ty");
        model.addColumn("Tên công ty");
        model.addColumn("Tên giao dịch");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Fax");
        model.addColumn("Email");
        try{
            for(int i=0;i< NCCArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(NCCArray().get(i).getMaCT());
                h.add(NCCArray().get(i).getTenCT());
                h.add(NCCArray().get(i).getTenGD());
                h.add(NCCArray().get(i).getDC());
                h.add(NCCArray().get(i).getDt());
                h.add(NCCArray().get(i).getFax());
                h.add(NCCArray().get(i).geteM());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertNCC(String MaCT,String TenCT,String TenGD,String DC,String Dt,String Fax,String eM){
        NCC_DAL.Insert(MaCT,TenCT,TenGD,DC,Dt,Fax,eM);
    }
    public static void UpdateNCC(String MaCT,String TenCT,String TenGD,String DC,String Dt,String Fax,String eM){
        NCC_DAL.Update(MaCT,TenCT,TenGD,DC,Dt,Fax,eM);
    }
    public static void DeleteNCC(String MaKH){
        NCC_DAL.Delete(MaKH);
    }
    //LoaiHang
    public static ArrayList<Loai> LoaiArray(){
        return Loai_DAL.getAll();
    }
    public static DefaultTableModel LoaiModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã loại hàng");
        model.addColumn("Tên loại hàng");
        try{
            for(int i=0;i< LoaiArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(LoaiArray().get(i).getMaLoai());
                h.add(LoaiArray().get(i).getTenLoai());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertLoai(String MaLoai,String TenLoai){
        Loai_DAL.Insert(MaLoai,TenLoai);
    }
    public static void UpdateLoai(String MaLoai,String TenLoai){
        Loai_DAL.Update(MaLoai,TenLoai);
    }
    public static void DeleteLoai(String MaLoai){
        Loai_DAL.Delete(MaLoai);
    }
    //MatHang
    public static ArrayList<MH> MHArray(){
        return MH_DAL.getAll();
    }
    public static DefaultTableModel MHModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã mặt hàng");
        model.addColumn("Tên mặt hàng");
        model.addColumn("Mã công ty");
        model.addColumn("Mã loại");
        model.addColumn("Số lượng");
        model.addColumn("Đơn vị");
        model.addColumn("Giá");
        try{
            for(int i=0;i< MHArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(MHArray().get(i).getMaMH());
                h.add(MHArray().get(i).getTenMH());
                h.add(MHArray().get(i).getMaCT());
                h.add(MHArray().get(i).getMaLoai());
                h.add(MHArray().get(i).getSL());
                h.add(MHArray().get(i).getDv());
                h.add(MHArray().get(i).getGia());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertMH(String MaMH,String TenMH,String MaCT,String MaLoai,String SL,String Dv,String Gia){
        MH_DAL.Insert(MaMH,TenMH,MaCT,MaLoai,SL,Dv,Gia);
    }
    public static void UpdateMH(String MaMH,String TenMH,String MaCT,String MaLoai,String SL,String Dv,String Gia){
        MH_DAL.Update(MaMH,TenMH,MaCT,MaLoai,SL,Dv,Gia);
    }
    public static void DeleteMH(String MaMH){
        MH_DAL.Delete(MaMH);
    }
    //HoaDon
    public static ArrayList<HD> HDArray(){
        return HD_DAL.getAll();
    }
    public static DefaultTableModel HDModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Số hóa đơn");
        model.addColumn("Mã khách hàng");
        model.addColumn("Mã nhân viên");
        model.addColumn("Ngày đặt hàng");
        model.addColumn("Ngày giao hàng");
        model.addColumn("Ngày chuyển hàng");
        model.addColumn("Nơi giao hàng");
        try{
            for(int i=0;i< HDArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(HDArray().get(i).getSoHD());
                h.add(HDArray().get(i).getMaKH());
                h.add(HDArray().get(i).getMaNV());
                h.add(HDArray().get(i).getNgayDat());
                h.add(HDArray().get(i).getNgayGiao());
                h.add(HDArray().get(i).getNgayChuyen());
                h.add(HDArray().get(i).getNoiGiao());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertHD(String SoHD,String MaKH,String MaNV,String NgayDat,String NgayGiao,String NgayChuyen, String NoiGiao){
        HD_DAL.Insert(SoHD,MaKH,MaNV,NgayDat,NgayGiao,NgayChuyen,NoiGiao);
    }
    public static void UpdateHD(String SoHD,String MaKH,String MaNV,String NgayDat,String NgayGiao,String NgayChuyen, String NoiGiao){
        HD_DAL.Update(SoHD,MaKH,MaNV,NgayDat,NgayGiao,NgayChuyen,NoiGiao);
    }
    public static void DeleteHD(String SoHD){
        HD_DAL.Delete(SoHD);
    }
    //ChiTietHoaDon
    public static ArrayList<CTHD> CTHDArray(){
        return CTHD_DAL.getAll();
    }
    public static DefaultTableModel CTHDModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Số hóa đơn");
        model.addColumn("Mã mặt hàng");
        model.addColumn("Giá mặt hàng");
        model.addColumn("Số lượng");
        model.addColumn("Mức giảm giá");
        try{
            for(int i=0;i< CTHDArray().size();i++)
            {
                Vector<String> h = new Vector();
                h.add(CTHDArray().get(i).getSoHD());
                h.add(CTHDArray().get(i).getMaMH());
                h.add(CTHDArray().get(i).getGia());
                h.add(CTHDArray().get(i).getSL());
                h.add(CTHDArray().get(i).getGiamGia());
                model.addRow(h);
                return model;
            }
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
        }
        return null;
    }
    public static void InsertCTHD(String SoHD,String MaMH,String Gia,String SL,String GiamGia){
        CTHD_DAL.Insert(SoHD,MaMH,Gia,SL,GiamGia);
    }
    public static void UpdateCTHD(String SoHD,String MaMH,String Gia,String SL,String GiamGia){
        CTHD_DAL.Update(SoHD,MaMH,Gia,SL,GiamGia);
    }
    public static void DeleteCTHD(String SoHD){
        CTHD_DAL.Delete(SoHD);
    }
}
