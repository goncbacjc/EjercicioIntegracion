package com.springboot.backend.apirest.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nombre;

    @Column(name="email")
    @Email(regexp = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$")
    @NotEmpty(message = "no puede estar vacío")
    private String email;

	private String password;

    private String token;

	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date create_at;

	@Column(name="modifie_at")
	@Temporal(TemporalType.DATE)
	private Date modifie_at;

	@Column(name="last_login")
	@Temporal(TemporalType.DATE)
	private Date last_login;

	private Boolean is_active;

    @JsonIgnoreProperties(value = {"clientes", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Telefono> phones;

    public Cliente() {
        this.phones = new ArrayList<>();
    }

    @PrePersist
    public void prePersist(){
        this.create_at = new Date();
        this.is_active = true;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public Date getCreateAt() {
		return create_at;
	}

	public void setCreateAt(Date create_at) {
		this.create_at = create_at;
	}

	public Date getmodifie_at() {
		return modifie_at;
	}

	public void setmodifie_at(Date setmodifie_at) {
		this.modifie_at = modifie_at;
	}

	public Date getlast_login() {
		return last_login;
	}

	public void setlast_login(Date last_login) {
		this.last_login = last_login;
	}

	public boolean getIsActive() {
		return is_active;
	}

	public void setIsActive(boolean is_active) {
		this.is_active = is_active;
	}

	private static final long serialVersionUID = 1L;

    public List<Telefono> getPhones() {
        return phones;
    }

    public void setPhones(List<Telefono> phones) {
        this.phones = phones;
    }
}
