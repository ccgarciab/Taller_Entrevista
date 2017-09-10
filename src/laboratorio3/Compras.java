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
public class Compras {
    private Date Compra;
    private int Deuda;

    public Date getCompra() {
        return Compra;
    }

    public int getDeuda() {
        return Deuda;
    }

    public void setCompra(Date Compra) {
        this.Compra = Compra;
    }

    public void setDeuda(int Deuda) {
        this.Deuda = Deuda;
    }

    public Compras(Date Compra, int Deuda) {
        this.Compra = Compra;
        this.Deuda = Deuda;
    }
    
}
