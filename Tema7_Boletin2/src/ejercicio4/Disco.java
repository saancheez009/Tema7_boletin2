package ejercicio4;

public class Disco {

	private String codigo="LIBRE";
	
	private String autor;
	
	private String titulo;
	
	private String genero;
	
	private int duracion;
	
/**
 * 
 */
	public Disco() {
		super();
		// TODO Auto-generated constructor stub
	}
	
/**
 * 
 * @param codigo
 * @param autor
 * @param titulo
 * @param genero
 * @param duracion
 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	/**
	 * Constructor copia
	 * @param objDisco
	 */
	public Disco(Disco objDisco){
        
        this.codigo=objDisco.codigo;
        this.autor=objDisco.autor;
        this.titulo=objDisco.titulo;
        this.genero =objDisco.genero;
		this.duracion =objDisco.duracion;
        
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
