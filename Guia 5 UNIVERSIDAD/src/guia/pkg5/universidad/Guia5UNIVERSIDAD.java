/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.universidad;

import AccesoDatos.AlumnoData;
import AccesoDatos.InscripcionData;
import AccesoDatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author titun
 */
public class Guia5UNIVERSIDAD {

    public static void main(String[] args) {

        Alumno a1 = new Alumno(239999000, "Gonzalez", "Pepe", LocalDate.of(1980, 11, 23), true);
        Materia m1 = new Materia("Matematica", 1, true);
        Alumno a2 = new Alumno(210000000, "perez", "lorena", LocalDate.of(1978, 1, 4), true);
        Alumno a3 = new Alumno(27123456, "Gimenez", "monica", LocalDate.of(1990, 5, 8), true);
        Materia m2 = new Materia("Fisica", 1, true);

        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
        //prueba de cargar alumno y materia en db
        //ad.guardarAlumno(a3);
        //md.guardarMateria(m2);

//      prueba de cargar una inscripcion + busqueda materia y alumno xID
//        Alumno x=ad.buscarAlumno(5);
//        Materia z=md.buscarMateria(1);
//        Inscripcion i1=new Inscripcion(x,z,0);
//        id.guardarInscripcion(i1);
//prueba de busqcar alumno xdni
//        Alumno x=ad.buscarAlumnoPorDni(210000000);
//        System.out.println(x.getApellido());
//        System.out.println(x.getDni());
//        System.out.println(x.getNombre());
//        System.out.println(x.getIdAlumno());
//prueba de listar alumnos
//        List<Alumno> alux = new ArrayList<>();
//        alux=ad.listarAlumnos();
//        for (Alumno al : alux) {
//            System.out.println("apellido: " + al.getApellido());
//            System.out.println("nombre: " + al.getNombre());
//            System.out.println("dni: " + al.getDni());
//            System.out.println("Fecha nac: " + al.getFechaNacimiento());
//            System.out.println("id: " + al.getIdAlumno());
//            System.out.println("---------------------------------------------");
//        }

//prueba modificar alumno
// UPDATE alumno SET dni=27123456, apellido="Gimenez", nombre= "Monica", fechaNacimiento=1999-5-8 WHERE idAlumno=7

        Alumno x=new Alumno(7, 27123456, "Gimenez", "monica", LocalDate.of(1999, 5, 8), true);
        ad.modificarAlumno(x);
    }

}
