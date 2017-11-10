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
public class Personas {
    public String Nombre;
    public int Edad;
    public int ID;
    public String Sexo;
    public String EstadoCivil;
    public ArrayList Mensajes=new ArrayList();

    public Personas(String Nombre, int Edad, int ID, String Sexo, String EstadoCivil) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
    }

    public Personas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public ArrayList getMensajes() {
        return Mensajes;
    }

    public void setMensajes(ArrayList Mensajes) {
        this.Mensajes = Mensajes;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
}
