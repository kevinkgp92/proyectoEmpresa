package com.eoi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eoi.servicios.Conexion;

public class EmpleadoDAO {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	public Empleado login(String email, String pass) throws SQLException {
		Empleado e = null;
		String sql = "SELECT * FROM empleado WHERE email = ? AND pass = ?";
		con = Conexion.getInstance().getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, pass);

		rs = pst.executeQuery();

		if (rs.next()) {
			e = new Empleado();
			e.setEmail(email);
			e.setPassword(pass);
			e.setNomEmp(rs.getString("nomEmp"));
			e.setRol(rs.getString("rol"));
		}

		return e;
	}

}
