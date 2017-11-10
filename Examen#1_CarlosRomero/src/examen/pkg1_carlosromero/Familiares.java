/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosromero;

import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class Familiares extends Personas{
    public String Rol;
    public String Trabajo;
    public double altura;
    public double Peso;
    public ArrayList Cosas=new ArrayList();

    public Familiares(String Rol, String Trabajo, double altura, double Peso, String Nombre, int Edad, int ID, String Sexo, String EstadoCivil) {
        super(Nombre, Edad, ID, Sexo, EstadoCivil);
        this.Rol = Rol;
        this.Trabajo = Trabajo;
        this.altura = altura;
        this.Peso = Peso;
    }


    public Familiares() {
        super();
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public ArrayList getCosas() {
        return Cosas;
    }

    public void setCosas(ArrayList Cosas) {
        this.Cosas = Cosas;
    }
    
    
}
