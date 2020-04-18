/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author ThanhMickey
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Context c = new Context();
       c.setTinhToan(new Cong());
       System.out.println(c.tinh(75f, 12f));
       
       //tru
       c.setTinhToan(new Tru());
       System.out.println(c.tinh(54f, 78f));
    }
    
}
