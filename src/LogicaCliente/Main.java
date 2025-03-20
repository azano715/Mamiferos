/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LogicaCliente;

import HelperImpresion.HelperImpresion;
import LogicaNegocio.Gato;
import LogicaNegocio.Mamifero;
import LogicaNegocio.Pato;
import LogicaNegocio.Perro;
import java.util.ArrayList;

/**
 *
 * @author Andrés Manzano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero objperro = new Perro(4, "Teo");
        Mamifero objgato = new Gato(4, "Angora");
        Mamifero objpato = new Pato(2, "Cafe");
        
        ArrayList<Mamifero> listamamiferos = new ArrayList<>();
        listamamiferos.add(objperro);
        listamamiferos.add(objgato);
        listamamiferos.add(objpato);
        
        HelperImpresion.ImprimirMamiferos(listamamiferos);
    }
    
}
