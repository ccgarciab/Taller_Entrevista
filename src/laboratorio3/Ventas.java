/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.Date;
/**
 *
 * @author Diego A. Velasquez
 */
public class Ventas {
    private Date FechaDeVenta;
    private int PrecioDeVenta;
    private int CantidadesVendidas;

    public Date getFechaDeVenta() {
        return FechaDeVenta;
    }

    public int getPrecioDeVenta() {
        return PrecioDeVenta;
    }

    public int getCantidadesVendidas() {
        return CantidadesVendidas;
    }

    public void setFechaDeVenta(Date FechaDeVenta) {
        this.FechaDeVenta = FechaDeVenta;
    }

    public void setPrecioDeVenta(int PrecioDeVenta) {
        this.PrecioDeVenta = PrecioDeVenta;
    }

    public void setCantidadesVendidas(int CantidadesVendidas) {
        this.CantidadesVendidas = CantidadesVendidas;
    }

    public Ventas(Date FechaDeVenta, int PrecioDeVenta, int CantidadesVendidas) {
        this.FechaDeVenta = FechaDeVenta;
        this.PrecioDeVenta = PrecioDeVenta;
        this.CantidadesVendidas = CantidadesVendidas;
    }
  
}
