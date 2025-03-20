/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Andrés Manzano
 */
public class Gato extends Mamifero {
    public String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(int numpatas, String raza ) {
        super(numpatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void InformacionMamifero() {
        System.out.println("Soy un gato y soy de raza" + "\t" + this.getRaza());
    }
    
}
