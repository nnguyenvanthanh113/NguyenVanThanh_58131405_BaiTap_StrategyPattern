/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author ThanhMickey
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //hang hoa 1
        HangHoa hanghoa1 = new HangHoa("chuot", 1500000, "chuot ban phim");
        //hang hoa 2
        HangHoa hanghoa2 = new HangHoa("laptop", 2500000, "Laptop ASUS");
        
        //them vao arraylist
        GioHang giohang = new GioHang();
        giohang.ThemHangHoa(hanghoa1);
        giohang.ThemHangHoa(hanghoa2);
        
        //danh sach hang hoa
        giohang.InDSHangHoa();
        
        //tien khach hang phai trả tinh theo thanh toan Online
        giohang.setHinhThucTT(new ThanhToanOnline());
        System.out.println(giohang.thanhToan(hanghoa1.getGia()));
        
        //tien khach hang phai tra tinh theo thanh toan COD
        giohang.setHinhThucTT(new ThanhToanCOD());
        System.out.println(giohang.thanhToan(hanghoa2.getGia()));
        
    }
    
}
