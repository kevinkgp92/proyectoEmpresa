package com.eoi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eoi.servicios.Conexion;

public class DepartamentoDAO {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	public void altaDpto(Departamento d) throws SQLException {

		String sql = "INSERT INTO departamento (codDepto,nombreDpto, ciudad, codDirector) VALUES (?,?,?,?)";
		con = Conexion.getInstance().getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, d.getCoddeto());
		pst.setString(2, d.getNombredpto());
		pst.setString(3, d.getCiudad());
		pst.setString(4, d.getCoddirector());

		pst.executeUpdate();

	}

	public void modificarDpto(Departamento d) throws SQLException {

		String sql = "UPDATE departamento SET nombreDpto=?, ciudad=?, codDirector=? WHERE codDepto=?";
		con = Conexion.getInstance().getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, d.getNombredpto());
		pst.setString(2, d.getCiudad());
		pst.setString(3, d.getCoddirector());
		pst.setString(4, d.getCoddeto());

		pst.executeUpdate();

	}

	public void borrarDpto(String coddepto) throws SQLException {

		String sql = "DELETE FROM javajbdc.departamento WHERE codDepto =?";
		con = Conexion.getInstance().getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, coddepto);

		pst.executeUpdate();

	}

	public Departamento getDepartamento(String coddepto) throws SQLException {
		Departamento d = null;
		String sql = "SELECT * FROM departamento WHERE codDepto= ?";
		con = Conexion.getInstance().getConnection();
		pst = con.prepareStatement(sql);
		pst.setString(1, coddepto);

		rs = pst.executeQuery();

		if (rs.next()) {
			d = new Departamento();
			d.setCiudad(rs.getString("ciudad"));
			d.setCoddeto(rs.getString("codDepto"));
			d.setCoddirector(rs.getString("codDirector"));
			d.setNombredpto(rs.getString("nombreDpto"));
		}

		return d;
	}

}
