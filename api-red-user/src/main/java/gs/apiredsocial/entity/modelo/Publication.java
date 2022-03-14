package gs.apiredsocial.entity.modelo;

public class Publication {
	
	private Long id_publication;
	private String animo;
	private String descripcion;
	private Long id_user;
	
	
	public Publication() {
		
	}
	
	public Publication(Long id, String animo, String descripcion, Long id_user) {
		super();
		this.id_publication = id;
		this.animo = animo;
		this.descripcion = descripcion;
		this.id_user = id_user;
	}
	
	public Long getId() {
		return id_publication;
	}
	public void setId(Long id) {
		this.id_publication = id;
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
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	
	

}
