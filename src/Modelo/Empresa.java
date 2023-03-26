/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author AndreaS
 */
public class Empresa {

    private int nit;
    private String nombre;
    private int numTrabajadores;
    private String estado;
    private String tipo;
    private Gastos gastos;
    private Ingresos ingresos;


    public Empresa() {
        this.nit=0;
        this.nombre = null;
        this.numTrabajadores=0;
        this.estado = null;
        this.tipo = null;
        this.gastos=new Gastos();
        this.ingresos=new Ingresos();
    }
    

    
    public Empresa(int nit, String nombre, int numTrabajadores, String estado, String tipo, Gastos gastos, Ingresos ingresos) {
        this.nit = nit;
        this.nombre = nombre;
        this.numTrabajadores = numTrabajadores;
        this.estado = estado;
        this.tipo = tipo;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Gastos getGastos() {
        return gastos;
    }

    public void setGastos(Gastos gastos) {
        this.gastos = gastos;
    }

    public Ingresos getIngresos() {
        return ingresos;
    }

    public void setIngresos(Ingresos ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "Empresa :"+nombre+"\n"+"nit= " + nit+"\n"+ "numero de Trabajadores= "+ numTrabajadores +"\n"+"estado= " + estado +"\n"+ "tipo= " + tipo +"\n"+ "gastos= " + gastos +"\n"+"ingresos= " + ingresos;
    }

   

    
        
}
