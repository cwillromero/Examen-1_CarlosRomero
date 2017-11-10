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
public class ObjetosHogar extends Objetos{
    public String TiempoVida;
    public String Area;
    public String Intrsucciones;
    public String FechaCompra;

    public ObjetosHogar(String TiempoVida, String Area, String Intrsucciones, String FechaCompra, String Color, String Descripcion, String Marca, double Tamano, int Calidad, double Precio, Personas Duenio) {
        super(Color, Descripcion, Marca, Tamano, Calidad, Precio, Duenio);
        this.TiempoVida = TiempoVida;
        this.Area = Area;
        this.Intrsucciones = Intrsucciones;
        this.FechaCompra = FechaCompra;
    }

    

    public ObjetosHogar() {
        super();
    }

    public String getTiempoVida() {
        return TiempoVida;
    }

    public void setTiempoVida(String TiempoVida) {
        this.TiempoVida = TiempoVida;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getIntrsucciones() {
        return Intrsucciones;
    }

    public void setIntrsucciones(String Intrsucciones) {
        this.Intrsucciones = Intrsucciones;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }
    
    
}
