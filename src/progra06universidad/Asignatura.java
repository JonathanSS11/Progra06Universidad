/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra06universidad;

/**
 *
 * @author HP
 */
public class Asignatura {
    
    private String clave;
    private String nombre;
    private int semestre;
    private int creditos;
    
    public Asignatura() {
    }
    
    public Asignatura(String clave, String nombre, int semestre, int creditos) {
        this.clave = clave;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
}

    