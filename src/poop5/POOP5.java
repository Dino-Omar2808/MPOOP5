/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;
 // TODO code application logic here
        //Tarea
        //CREAR Una cuenta de github
        //marcdown investigar
/**
 *
 * @author Omar Gómez
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno=new Alumno();
        alumno.setNombre("Pedro");
        alumno.setEpellido("Gomez");
        Fecha fecha= new Fecha(29,9,2023);
        Alumno alu2= new Alumno("Luis", 
                "Hernandez", "Medicina",
                "FACMED",4,fecha);
        String var=alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alu2);
    }    
}
//entregrar extra 
//comentarios a todas las clase y metodos 