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
public class Productos {
    private String Nombre;
    private int PrecioActual;
    private int Cantidad;

    public String getNombre() {
        return Nombre;
    }

    public int getPrecioActual() {
        return PrecioActual;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecioActual(int PrecioActual) {
        this.PrecioActual = PrecioActual;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Productos(String Nombre, int PrecioActual, int Cantidad) {
        this.Nombre = Nombre;
        this.PrecioActual = PrecioActual;
        this.Cantidad = Cantidad;
    }
    
}
