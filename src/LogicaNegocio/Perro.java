/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Andrés Manzano
 */
public class Perro extends Mamifero {
    public String nombre;

    public Perro() {
    }

    public Perro(int numpatas, String nombre) {
        super(numpatas);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void InformacionMamifero() {
        System.out.println("Soy un perro, mi nombre es: " + "\t" + this.getNombre());
    }
    
}
