/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ThanhMickey
 */
public class QLSV {
    ISoSanh<SinhVien> iSoSanh;
    ArrayList<SinhVien> sinhvien = new ArrayList();

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }
    
    public void sapXep()
    {
        for(int i = 0;i < sinhvien.size()-1;i++)
        {
            for(int j = i+1;j < sinhvien.size();j++)
            {
                //sap xep tang dan
                if(iSoSanh.soSanh(sinhvien.get(i), sinhvien.get(j)) == 1)
                {
                    Collections.swap(sinhvien,i,j);
                }
            }  
        }
    }
    public void inDS()
    {
        for(int i = 0;i < sinhvien.size();i++)
        {
            System.out.println("sinh vien " + (i+1));
            System.out.println("ho ten : " + sinhvien.get(i).getHoTen() + " "
                        + "ngay sinh : " + sinhvien.get(i).getNgaySinh() + " "
                        + "diem TB : " + sinhvien.get(i).getDiemTB());
        }
    }
    public void addSinhVien(SinhVien sinhvien)
    {
        this.sinhvien.add(sinhvien);
    }
}
