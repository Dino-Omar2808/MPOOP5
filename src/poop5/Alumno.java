/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Omar Gómez
 * Clase que almacena datos de alumno
 */
public class Alumno {
    //no es posible a cambiar en publi por seguridad
    private String nombre,epellido, carrera, escuela;
    private int semestre;
    //apelando al principio de la modularidad
    private Fecha fNacimineto; 
    public Alumno() {
    }
    public Alumno(String nombre, String epellido,
            String carrera, String escuela, int semestre, 
            Fecha fNacimineto) {
        this.nombre = nombre;
        this.epellido = epellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimineto = fNacimineto;
    }
    //metodos de servicios
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del alumno
     * @param nombre el nombre del alumno 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que regresa el apellido
     * @return regresa la variable apellido
     */
    public String getEpellido() {
        return epellido;
    }
    /**
     * modifica el apellido
     * @param epellido el apellido del alumno
     */
    public void setEpellido(String epellido) {
        this.epellido = epellido;
    }
     /**
     * Metodo que regresa la carrera
     * @return regresa la variable carrera
     */
    public String getCarrera() {
        return carrera;
    }
     /**
     * Modifica la carrera
     * @param carrera la carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
     /**
     * Metodo que regresa la escuela
     * @return regresa la variable Escuela
     */
    public String getEscuela() {
        return escuela;
    }
     /**
     * Modifica la Escuela
     * @param escuela la escuela del alumno
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
     /**
     * Metodo que regresa el Semestre
     * @return regresa la variable Sememstre
     */
    public int getSemestre() {
        return semestre;
    }
     /**
     * Modifica el semestre
     * @param semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Metodo que regresa la fecha de nacimiento
     * @return regresa la fNacimineto
     */
    public Fecha getfNacimineto() {
        return fNacimineto;
    }
     /**
     * Modifica la fecha de nacimineto
     * @param fNacimineto del alumno
     */
    public void setfNacimineto(Fecha fNacimineto) {
        this.fNacimineto = fNacimineto;
    }
    /**
     * Imprime el sonido dormir
     */
    public void dormir ()
    {
        System.out.println("zzzzzz ");    
    }
    /**
     * Imprime el sonido comer
     */
    public void comer ()
    {
        System.out.println("niam niam ");    
    }
    /**
     * Imprime "Estoy estudinando "
     */
    public void estudiar ()
    {
        System.out.println("Estoy estudinando ");
    }
    /**
     * Imprime "Estoy trabajando "
     */
    public void trabajar ()
    {
        System.out.println("Estoy trabajando ");
    }
    /**
     * Imprime "Estoy jugando "
     */
    public void jugar ()
    {
        System.out.println("Estoy jugando ");
    }
    /**
     * sobre escribe la referencia de la menoria
     * de los metodos
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + 
                ", epellido=" + epellido + ", carrera=" 
                + carrera + ", escuela=" + escuela + 
                ", semestre=" + semestre + ", fNacimineto="
                + fNacimineto + '}';
    }
    
}
