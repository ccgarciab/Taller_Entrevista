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
public class Empleados {
    private String NombreEmpleado;
    private int Cedula;
    private Date Horario;
    private double Sueldo;
    private Date Liquidacion;
    private Date RegistroLlegada [];

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setHorario(Date Horario) {
        this.Horario = Horario;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public int getCedula() {
        return Cedula;
    }

    public Date getHorario() {
        return Horario;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public Date getLiquidacion() {
        return Liquidacion;
    }

    public Empleados(String NombreEmpleado, int Cedula, Date Horario, double Sueldo, Date Liquidacion, Date[] RegistroLlegada) {
        this.NombreEmpleado = NombreEmpleado;
        this.Cedula = Cedula;
        this.Horario = Horario;
        this.Sueldo = Sueldo;
        this.Liquidacion = Liquidacion;
        this.RegistroLlegada = RegistroLlegada;
    }
    
}
