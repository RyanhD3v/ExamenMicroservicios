package gs.api.publication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_publicacion", updatable = false, nullable= false)
	private Long id;
	
	@Column(name = "animo")
	private String animo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	
	@Column(name = "id_usuario", updatable = false)
	private Long id_user;
	
	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public Publicacion() {
		
	}
	
	public Publicacion(Long id, String animo, String descripcion, Long id_user) {
		
		this.id = id;
		this.animo = animo;
		this.descripcion = descripcion;
		this.id_user = id_user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnimo() {
		return animo;
	}

	public void setAnimo(String animo) {
		this.animo = animo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	
	
	

}
