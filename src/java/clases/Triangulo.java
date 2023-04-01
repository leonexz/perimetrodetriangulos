/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USER
 */
public class Triangulo {
    private int tm1;
    private int tm2;
    private int tn1;
    private int tn2;
    private int tp1;
    private int tp2;
    private double perimetro1;
    private double perimetro2;
    private double perimetro3;
    private double perimetroT;

    public int getTm1() {
        return tm1;
    }

    public void setTm1(int tm1) {
        this.tm1 = tm1;
    }

    public int getTm2() {
        return tm2;
    }

    public void setTm2(int tm2) {
        this.tm2 = tm2;
    }

    public int getTn1() {
        return tn1;
    }

    public void setTn1(int tn1) {
        this.tn1 = tn1;
    }

    public int getTn2() {
        return tn2;
    }

    public void setTn2(int tn2) {
        this.tn2 = tn2;
    }

    public int getTp1() {
        return tp1;
    }

    public void setTp1(int tp1) {
        this.tp1 = tp1;
    }

    public int getTp2() {
        return tp2;
    }

    public void setTp2(int tp2) {
        this.tp2 = tp2;
    }

    public double getPerimetro1() {
        return perimetro1;
    }

    public void setPerimetro1(double perimetro1) {
        this.perimetro1 = perimetro1;
    }

    public double getPerimetro2() {
        return perimetro2;
    }

    public void setPerimetro2(double perimetro2) {
        this.perimetro2 = perimetro2;
    }

    public double getPerimetro3() {
        return perimetro3;
    }

    public void setPerimetro3(double perimetro3) {
        this.perimetro3 = perimetro3;
    }
    public double getPerimetroT() {
        return perimetroT;
    }

    public void setPerimetroT(double perimetroT) {
        this.perimetroT = perimetroT;
    }

    public Triangulo(int tm1, int tm2, int tn1, int tn2, int tp1, int tp2, double perimetro1, double perimetro2, double perimetro3, double perimetroT) {
        this.tm1 = tm1;
        this.tm2 = tm2;
        this.tn1 = tn1;
        this.tn2 = tn2;
        this.tp1 = tp1;
        this.tp2 = tp2;
        this.perimetro1 = perimetro1;
        this.perimetro2 = perimetro2;
        this.perimetro3 = perimetro3;
        this.perimetroT = perimetroT;
    }

    

    public Triangulo(int tm1, int tm2, int tn1, int tn2, int tp1, int tp2) {
        this.tm1 = tm1;
        this.tm2 = tm2;
        this.tn1 = tn1;
        this.tn2 = tn2;
        this.tp1 = tp1;
        this.tp2 = tp2;
        
       this.perimetro1=(double) Math.sqrt((Math.pow(this.tn1-this.tm1,2))-Math.pow(this.tn2-this.tm2,2));
       this.perimetro2=(double) Math.sqrt((Math.pow(this.tp1-this.tm1,2))-Math.pow(this.tp2-this.tm2,2));
       this.perimetro3=(double) Math.sqrt((Math.pow(this.tp1-this.tn1,2))-Math.pow(this.tp2-this.tn2,2));
       this.perimetroT=this.perimetro1+this.perimetro2+this.perimetro3;
    }
    
}
