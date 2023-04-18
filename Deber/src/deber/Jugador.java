/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

/**
 *
 * @author Cococ
 */
public class Jugador {

    public Jugador(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public void caminar() {
        System.out.println("Hacer caminar a Juan");
    }

    public void correr() {
        System.out.println("Hacer correr a Juan");
    }

    public void viajar() {
        System.out.println("Hacer viajar a Juan");
    }
}
