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
public class Zapatos extends Objetos{
    public String Talla;
    public String TipoSuela;
    public int Confort;

    public Zapatos() {
        super();
    }

    public Zapatos(String Talla, String TipoSuela, int Confort) {
        this.Talla = Talla;
        this.TipoSuela = TipoSuela;
        this.Confort = Confort;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getTipoSuela() {
        return TipoSuela;
    }

    public void setTipoSuela(String TipoSuela) {
        this.TipoSuela = TipoSuela;
    }

    public int getConfort() {
        return Confort;
    }

    public void setConfort(int Confort) {
        this.Confort = Confort;
    }
    
    
}
