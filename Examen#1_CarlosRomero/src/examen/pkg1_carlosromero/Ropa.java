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
public class Ropa extends Objetos{
    public String Talla;
    public String Material;
    public String Pais;

    public Ropa() {
        super();
    }

    public Ropa(String Talla, String Material, String Pais) {
        this.Talla = Talla;
        this.Material = Material;
        this.Pais = Pais;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
}
