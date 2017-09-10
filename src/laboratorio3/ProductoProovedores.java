/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author Diego A. Velasquez
 */
public class ProductoProovedores {
    private String Nombre;
    private int Costo;

    public String getNombre() {
        return Nombre;
    }

    public int getCosto() {
        return Costo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public ProductoProovedores(String Nombre, int Costo) {
        this.Nombre = Nombre;
        this.Costo = Costo;
    }
    
    public ProductoProovedores() {
        this.Nombre = null;
        this.Costo = 0;
    }
    
}
