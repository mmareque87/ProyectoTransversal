/*

 */
package AccesoDatos;

import java.sql.Connection;
import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Inscripcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData aluData;
    private MateriaData mateData;

    public InscripcionData() {

        con = Conexion.getConexion();
        aluData = new AlumnoData();
        mateData = new MateriaData();
    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (idAlumno, idMateria) VALUES (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                     
            ps.setInt(1, insc.getAlumno().getIdAlumno());
           System.out.println(insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            System.out.println(insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion añadida con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Materia " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscList = new ArrayList<>();
        inscList.clear();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setMateria(mateData.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setNota(rs.getDouble("nota"));
                inscList.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return inscList;

    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
        materias.clear();

        try {
            String sql = "SELECT inscripcion.idMateria,nombre, anio FROM inscripcion, materia WHERE inscripcion.idMateria=materia.idMateria\n"
                    + "AND inscripcion.idAlumno=?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("Anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripcion" + ex.getMessage());
        }
        return materias;
    }
///// a hequear con los videos y teorias >>>>>>

    public List<Inscripcion> obtenerInscripcionesXalumno(int id) {
        InscripcionData inscrdata = new InscripcionData();
        List<Inscripcion> inscList = new ArrayList<>();
        //inscList = inscrdata.obtenerInscripciones();
        inscList.addAll(inscrdata.obtenerInscripciones());

        List<Inscripcion> inscListAlumno = new ArrayList<>();
        inscListAlumno.clear();

        for (Inscripcion inscripcion : inscList) {
            if (inscripcion.getAlumno().getIdAlumno() == id) {
                inscListAlumno.add(inscripcion);
            }
        }
        if (inscList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encuentra Alumno con ese ID");
        }
        return inscListAlumno;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
        materias.clear();

        try {
            String sql = "SELECT* FROM materia WHERE activo=1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
                        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("Anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripcion" + ex.getMessage());
        }
        return materias;
    }

}
