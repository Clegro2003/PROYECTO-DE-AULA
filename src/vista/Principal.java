/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import Modelo.*;

/**
 *
 * @author AndreaS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gastos gasto=new Gastos(1_000_000,500_000);
        Ingresos ingreso=new Ingresos(5_000_000);
        
        Gestionador gestion=new Gestionador();
        gestion.registrarEmpresa(10789,"FGB", 500,"Activa","Economia", gasto, ingreso);
        impEmpresa(gestion);
        consultar(gestion,10789);
        
    }
    public static void consultar(Gestionador gestion,int nit){
        Empresa buscar=gestion.consultarEmpresa(nit);
        if(buscar!=null){
            System.out.println("Se encontro la siguiente empresa con el nit : "+nit+"\n"+" ");
            System.out.println(buscar);
        }
        else{
            System.out.println("La empresa buscada no esta registrada");
        }
        
    }
    public static void impEmpresa(Gestionador gestion){
        System.out.println("Total De Empresas : "+gestion.getEmpresa().size());
        for(Empresa c:gestion.getEmpresa()){
            System.out.println("---------------------------------------");
            System.out.println(c);
            System.out.println("----------------------------------------");
        }
    }
}
