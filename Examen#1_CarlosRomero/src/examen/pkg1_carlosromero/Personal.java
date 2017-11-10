/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosromero;

/**
 *
 * @author Will
 */
public class Personal extends Personas{
    public String Ocupacion;
    public String Horario;
    public int SeamanasTrabajando;
    public double Sueldo;

    public Personal() {
        super();
    }

    public Personal(String Ocupacion, String Horario, int SeamanasTrabajando, double Sueldo, String Nombre, int Edad, int ID, String Sexo, String EstadoCivil) {
        super(Nombre, Edad, ID, Sexo, EstadoCivil);
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.SeamanasTrabajando = SeamanasTrabajando;
        this.Sueldo = Sueldo;
    }

    

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getSeamanasTrabajando() {
        return SeamanasTrabajando;
    }

    public void setSeamanasTrabajando(int SeamanasTrabajando) {
        this.SeamanasTrabajando = SeamanasTrabajando;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
}
