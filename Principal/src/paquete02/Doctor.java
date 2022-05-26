/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

public class Doctor {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Doctor (String n, double o, String t){
        nombre = n;
        tipo = t;
        sueldo = o;
    }
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public void establecerSueldo(double n){
        sueldo = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
