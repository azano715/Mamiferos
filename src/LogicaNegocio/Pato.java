/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Andrés Manzano
 */
public class Pato extends Mamifero {
   public String color;

    public Pato() {
    }

    public Pato(String color) {
        this.color = color;
    }

    public Pato(int numpatas, String color) {
        super(numpatas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void InformacionMamifero() {
         System.out.println("Soy un pato de color" + "\t" + this.getColor());
    }
    
}
