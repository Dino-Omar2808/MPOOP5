/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author dinos
 */
public class Fecha {
    private int dia, mes, anio;
    public Fecha() {
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Metodo que regresa el Dia
     * @return regresa la variable Dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * Modifica el dia
     * @param dia  
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Metodo que regresa el Mes
     * @return regresa la variable Mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Modifica el mes
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Metodo que regresa el Anio
     * @return regresa la variable Anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Modifica el Anio
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
//para no regresar la referencia si no el valor
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + 
                ", mes=" + mes + ", anio=" 
                + anio + '}';
    }
    
    
}
