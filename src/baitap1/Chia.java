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
public class Chia implements Tinh{

    @Override
    public float tinh(float a, float b) {
        if(b == 0)
            return Float.NaN;
        return a/b;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}