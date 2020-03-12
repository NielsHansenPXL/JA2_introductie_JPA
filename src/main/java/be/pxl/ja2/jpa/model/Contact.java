package be.pxl.ja2.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //annotatie voor Hibernate
@Table(name = "contacts")
public class Contact {
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Welke strategie moet Hibernate gebruiken om ID's te genereren. Hier IDENTITY = auto-increment
	private int id;
	private String name;
	private int phone;
	private String email;

	public Contact() { // in entity klasse ALTIJD een default constructor voorzien, Hibernate gebruikt deze om objecten aan te maken.
	}

	public Contact(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phone=" + phone +
				", email='" + email + '\'' +
				'}';
	}
}
