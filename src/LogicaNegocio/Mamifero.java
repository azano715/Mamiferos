/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Andrés Manzano
 */
public abstract class Mamifero {
    protected int numpatas;

    public Mamifero() {
    }

    public Mamifero(int numpatas) {
        this.numpatas = numpatas;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }
    
    public abstract void InformacionMamifero();
}
