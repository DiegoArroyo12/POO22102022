/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;

import ico.fes.iu.swing.modelos.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author diego
 */
public class PersonaDAO implements InterfazDAO{

    public PersonaDAO() {
    }

    @Override
    public ArrayList seleccionarTodo() throws SQLException {
        String sql = "SELECT * FROM personas;";
        ArrayList<Persona> info = new ArrayList<Persona>();
        Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        
        while (rst.next()) {
            info.add(new Persona(rst.getString(1),rst.getInt(2)));
            
        }
        return info;
    }

    @Override
    public boolean insertar(Persona p) throws SQLException {
        String sql = "INSERT INTO personas VALUES(?,?);";
        PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
        pstm.setString(1, p.getNombre());
        pstm.setInt(2, p.getEdad());
        int rowCount = pstm.executeUpdate();
        
        return rowCount > 0;
    }

    @Override
    public boolean eliminar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
