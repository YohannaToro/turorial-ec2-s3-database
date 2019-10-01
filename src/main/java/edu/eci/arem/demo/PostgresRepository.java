package edu.eci.arem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import edu.eci.arem.demo.persistence.SaludoPersistence;
import edu.eci.arem.demo.model.*;



@Component
public class PostgresRepository implements SaludoPersistence {
	
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<Saludo> findAll() throws SQLException {
		String query = "SELECT * FROM test;";
		List<Saludo> auctions = new ArrayList<Saludo>();
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Saludo auction = new Saludo();
				auction.setDescription(rs.getString("description"));						
				auctions.add(auction);
			}
			connection.close();
			return auctions;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
	
	}
}