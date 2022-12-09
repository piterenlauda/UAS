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
public class HitungSisiMiring extends Pitagoras{
    private double A, B;
    
    public void SetAlas3(double nil){
        this.A = Math.pow(nil, 2);
    }
    public void SetTinggi3(double nil){
        this.B = Math.pow(nil, 2);
        
    }
    public double GetAlas3(){
        return this.A;
    }
    public double GetTinggi3(){
        return this.B;
    }
    
    public double HitungSisiMiring(){
        return Math.sqrt(this.A + this.B);
    }
}
