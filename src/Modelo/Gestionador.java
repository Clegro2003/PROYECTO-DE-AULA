/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author AndreaS
 */
public class Gestionador {
    private ArrayList<Empresa> empresa;

    public Gestionador() {
        this.empresa=new ArrayList();
    }

    public ArrayList<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresa> empresa) {
        this.empresa = empresa;
    }

   public void registrarEmpresa(int nit, String nombre, int numTrabajadores, String estado, String tipo, Gastos gastos, Ingresos ingresos){
       if(this.consultarEmpresa(nit)==null){
         Empresa emp=new Empresa(nit,nombre,numTrabajadores,estado,tipo,gastos,ingresos); 
         this.empresa.add(emp);
       }   
   }
    
    public Empresa consultarEmpresa(int numero){
        
        if(this.empresa!=null){
            
            for(Empresa c: this.empresa){
                if(c.getNit()==numero){
                    return c;
                }
            }
            return null;
        }
        else{
            return null;
        }
        
    }
    

    
}
