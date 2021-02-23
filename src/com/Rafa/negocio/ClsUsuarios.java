package com.Rafa.negocio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

import javax.swing.JOptionPane;

import com.Rafa.ConexionBD.ConexionBD;
import com.Rafa.Entidades.Usuario;

public class ClsUsuarios {
	   
	   ConexionBD con = new ConexionBD();
	    Connection coneccion = con.retornarConexion();
	public ArrayList<Usuario> MostrarUsuario() {
		ArrayList<Usuario> lista = new ArrayList<>();
		try {
			CallableStatement st = coneccion.prepareCall("Select *from Usuario");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Usuario U = new Usuario();
				U.setUsuario(rs.getString("Usuario"));
				U.setPassWord(rs.getString("PassWord"));
				lista.add(U);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error" + e);
		}
		return lista;
	}

}
