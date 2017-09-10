/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.*;

/**
 *
 * @author Diego A. Velasquez
 */
public class Prooveedores {
    private String Nombre;
    private int Nit;
    private int Telefono;
    private Date FechaDePago;
    private ArrayList<ProductoProovedores> productos;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setFechaDePago(Date FechaDePago) {
        this.FechaDePago = FechaDePago;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNit() {
        return Nit;
    }

    public int getTelefono() {
        return Telefono;
    }

    public Date getFechaDePago() {
        return FechaDePago;
    }

    public void agregarProducto(String Nombre, int Costo) {
        this.productos.add(new ProductoProovedores(Nombre,Costo));
    }

    // Dado el nombre, buscar un producto y retornar el costo
    public int producto(String Nombre) {
	for (int i = 0 ; i<this.productos.size(); i++){
	     if(this.productos.get(i).getNombre().equalsIgnoreCase(Nombre)){
		  return this.productos.get(i).getCosto();
  	     }
        }
        int checkerror = 0;
        return checkerror;
    }
    public Prooveedores(String Nombre, int Nit, int Telefono, Date FechaDePago) {
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.Telefono = Telefono;
        this.FechaDePago = FechaDePago;
        this.productos = new ArrayList<ProductoProovedores>();

    }
}
