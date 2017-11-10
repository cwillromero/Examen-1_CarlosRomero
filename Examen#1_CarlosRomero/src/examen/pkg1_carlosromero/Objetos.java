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
public class Objetos {
    public String Color;
    public String Descripcion;
    public String Marca;
    public double Tamano;
    public int Calidad;
    public double Precio;
    public Personas Duenio;

    public Objetos() {
    }

    public Objetos(String Color, String Descripcion, String Marca, double Tamano, int Calidad, double Precio, Personas Duenio) {
        this.Color = Color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Tamano = Tamano;
        this.Calidad = Calidad;
        this.Precio = Precio;
        this.Duenio = Duenio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getTamaño() {
        return Tamano;
    }

    public void setTamaño(double Tamaño) {
        this.Tamano = Tamaño;
    }

    public int getCalidad() {
        return Calidad;
    }

    public void setCalidad(int Calidad) {
        this.Calidad = Calidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Personas getDuenio() {
        return Duenio;
    }

    public void setDuenio(Personas Duenio) {
        this.Duenio = Duenio;
    }
    
    
}
