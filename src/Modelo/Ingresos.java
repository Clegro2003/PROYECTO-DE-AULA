/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Ingresos {
    private float recaudadoMes;

    public Ingresos() {
        this(0);
    }
  
    public Ingresos(float recaudadoMes) {
        this.recaudadoMes = recaudadoMes;
    }

    public float getRecaudadoMes() {
        return recaudadoMes;
    }

    public void setRecaudadoMes(float recaudadoMes) {
        this.recaudadoMes = recaudadoMes;
    }

    @Override
    public String toString() {
        return  "recaudado Mes= " + recaudadoMes;
    }
    
}
