/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_UAS;

/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class HitungAlas extends Pitagoras{
    private double B, C;
    
    public void SetTinggi1(double nil){
        this.B = Math.pow(nil, 2);
    }
    public void SetSisiMiring1(double nil){
        this.C = Math.pow(nil, 2);
        
    }
    public double GetTinggi1(){
        return this.B;
    }
    public double GetSisiMiring1(){
        return this.C;
    }
    
    public double HitungAlas(){
        return Math.sqrt(this.C - this.B);
    }
}
