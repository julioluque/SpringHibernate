package ar.jluque.hibernateorm;

import javax.annotation.Generated;
import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;

/**
 * CONEXIONES ESTABLES Y QUERYS
 * 
 * MySql 
 * create table CLIENTES (
 * 	Id int (11) not null auto_increment, 
 * 	Nombre varchar (45), 
 * 	Apellidos varchar (45), 
 * 	Direccion varchar (45), 
 * constraint primary key Id (Id)); 
 * 
 * Oracle 
 * create table clientes (
 * 	Id int generated by default as identity not null primary key, 
 * 	Nombre varchar2(45), 
 * 	Apellidos varchar2(45), 
 * 	Direccion varchar2(45)); 
 * 
 * Sql Server
 * create table clientes (
 * 	Id int not null IDENTITY primary key, 
 * 	Nombre varchar(45), 
 * 	Apellidos varchar(45),
 * 	Direccion varchar(45));
 * 
 * @author Alfredo
 */

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Apellidos")
	private String apellidos;

	@Column(name = "Direccion")
	private String direccion;

	public Clientes() {
	}

	public Clientes(String nombre, String apellidos, String direccion) {
		// Id es autoincremental
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}

}
