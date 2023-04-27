package cl1pinedaever;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
	private static Conexion instancia = new Conexion();
	private EntityManagerFactory factory;
	
	public Conexion() {
		this.factory = Persistence.createEntityManagerFactory("cl1pinedaever");
	}
	
	public static Conexion getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
}