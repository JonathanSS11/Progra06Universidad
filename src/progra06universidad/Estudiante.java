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
public class Estudiante {
    
    //atributos
    private int matricula;
    private String nombre;
    private String paterno;
    private String materno;
    private String curp;
    private String fechaNacimiento;
    private String domicilio;
    private int edad;
    
    //constructores
    public Estudiante(int matricula, String nombre, String paterno, String materno, String curp, String fechaNacimiento, String domicilio, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.edad = edad;
    }
    
    public Estudiante() {
    }
    
    //getter y setter
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

    
