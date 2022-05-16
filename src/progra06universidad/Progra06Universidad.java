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
public class Progra06Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante001 = new Estudiante();
        Estudiante estudiante002 = new Estudiante(123456, "Jonathan", "Salgado", "Sotero", "SASJ021130HMCLTNA4", "Noviembre", "San Mateo", 19);
        
        Asignatura asignatura001 = new Asignatura();
        Asignatura asignatura002 = new Asignatura("ADE123", "Programacion II", 4, 28);
        
        System.out.println(estudiante002.getNombre());
        System.out.println(estudiante002.getPaterno());
        System.out.println(estudiante002.getMaterno());
        System.out.println(estudiante002.getCurp());
        System.out.println(estudiante002.getFechaNacimiento());
        System.out.println(estudiante002.getDomicilio());
        System.out.println(estudiante002.getEdad());
        
        
        System.out.println(asignatura002.getClave());
        System.out.println(asignatura002.getNombre());
        System.out.println(asignatura002.getSemestre());
        System.out.println(asignatura002.getCreditos());
    }

}