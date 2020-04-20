/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ThanhMickey
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        QLSV qlsv = new QLSV();
        
        //sinh vien 1
        String sDate1 = "01/06/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        SinhVien sinhVien1 = new SinhVien("Nguyen Van Thanh",date1,10f);
        
        //sinh vien 2
        String sDate2 = "06/01/1998";
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
        SinhVien sinhVien2 = new SinhVien("Nguyen Thi Thu",date2,7f);
        
        //sinh vien 3
        String sDate3 = "06/01/1998";
        Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
        SinhVien sinhVien3 = new SinhVien("Nguyen Thi A",date3,9f);
        
        
        //them sinh vien vao arraylist QLSV
        qlsv.addSinhVien(sinhVien1);
        qlsv.addSinhVien(sinhVien2);
        qlsv.addSinhVien(sinhVien3);
        
        
        // so sanh cac sinh vien vua add vao so sanh theo Ten
        qlsv.setiSoSanh(new SoSanhTheoTen());
        //sap xep tang dan
        qlsv.sapXep();
        //in ds sinh vien
        qlsv.inDS();
        
        System.out.println("------------------------------");
        
        //so sanh cac sinh vien vua add vao so sanh theo Diem
        qlsv.setiSoSanh(new SoSanhTheoDiem());
        //sap xep tang dan
        qlsv.sapXep();
        qlsv.inDS();
    }
    
}
