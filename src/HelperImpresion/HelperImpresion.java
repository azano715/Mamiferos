/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HelperImpresion;

import LogicaNegocio.Gato;
import LogicaNegocio.Mamifero;
import LogicaNegocio.Pato;
import LogicaNegocio.Perro;
import java.util.ArrayList;

/**
 *
 * @author Andrés Manzano
 */
public class HelperImpresion {
    public static void ImprimirMamiferos(ArrayList<Mamifero> listamamiferos)
    {
         for (int i=0; i<listamamiferos.size();i++) {
             listamamiferos.get(i).InformacionMamifero();
             if(listamamiferos.get(i)instanceof Perro){
                 System.out.println("Ladrando"+"\t"+"Numero de patas"+"\t"+listamamiferos.get(i).getNumpatas());
             }
             if(listamamiferos.get(i)instanceof Gato){
                 System.out.println("Maullando"+"\t"+"Numero de patas"+"\t"+listamamiferos.get(i).getNumpatas());
             }
             if(listamamiferos.get(i)instanceof Pato){
                 System.out.println("Quack"+"\t"+"Numero de patas"+"\t"+listamamiferos.get(i).getNumpatas());
             }
	}

    }
   
    
}
