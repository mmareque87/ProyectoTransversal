/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.universidad;

import AccesoDatos.AlumnoData;
import AccesoDatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.time.LocalDate;

/**
 *
 * @author titun
 */
public class Guia5UNIVERSIDAD {

   
    
    public static void main(String[] args) {
    
        Alumno a1= new Alumno(239999000, "Gonzalez", "Pepe", LocalDate.of(1980, 11, 23), true);
        Materia m1= new Materia("Matematica", 1, true);
        Alumno a2= new Alumno(210000000, "perez", "lorena", LocalDate.of(1978, 1, 4), true);
        Materia m2= new Materia("Fisica", 1, true);
        
        AlumnoData ad=new AlumnoData();
        MateriaData md=new MateriaData();
        
        
        //ad.guardarAlumno(a2);
        //md.guardarMateria(m2);
                
        
        
    }
    
}
