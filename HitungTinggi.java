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
public class HitungTinggi extends Pitagoras{
    private double A, C;
    
    public void SetAlas2(double nil){
        this.A = Math.pow(nil, 2);
    }
    public void SetSisiMiring2(double nil){
        this.C = Math.pow(nil, 2);
        
    }
    public double GetAlas2(){
        return this.A;
    }
    public double GetSisiMiring2(){
        return this.C;
    }
    
    public double HitungTinggi(){
        return Math.sqrt(this.C - this.A);
    }
}
