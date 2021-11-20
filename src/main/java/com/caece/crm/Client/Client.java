package com.caece.crm.Client;
import javax.persistence.*;


@Entity
@Table(name="client")
public class Client {
	
	@Id
	@Column(name = "idclient")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclient;
	@Column (name = "name")
	private String name;
	@Column (name = "surname")
	private String surname;
	
	
	public int getId() {
		return idclient;
	}
	public void setId(int id) {
		this.idclient= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
