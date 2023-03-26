
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Gastos {
    private float sueldoMes;
    private float inversionMes;

    public Gastos() {
        this(0,0);
    }

    public Gastos(float sueldoMes, float inversionMes) {
        this.sueldoMes = sueldoMes;
        this.inversionMes = inversionMes;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(float sueldoMes) {
        this.sueldoMes = sueldoMes;
    }

    public float getInversionMes() {
        return inversionMes;
    }

    public void setInversionMes(float inversionMes) {
        this.inversionMes = inversionMes;
    }

    @Override
    public String toString() {
        return "sueldo Mes= " + sueldoMes + ", inversionMes= " + inversionMes;
    }
    
    
    
}
