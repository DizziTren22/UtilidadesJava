package utilidadesJava.manejolambda.objetos;

public class Persona {
	
	private Long idPersona;
	
	private String nombrePersona;
	
	private Long idTipoIdentificacion;
	
	private String numeroIdentificacion;
	
	public Persona(Long idPersona, String nombrePersona, Long idTipoIdentificacion, String numeroIdentificacion) {
		super();
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo idPersona
	 * @return El idPersona asociado a la clase
	 */
	public Long getIdPersona() {
		return idPersona;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idPersona
	 * @param idPersona El nuevo idPersona a modificar.
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombrePersona
	 * @return El nombrePersona asociado a la clase
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombrePersona
	 * @param nombrePersona El nuevo nombrePersona a modificar.
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo idTipoIdentificacion
	 * @return El idTipoIdentificacion asociado a la clase
	 */
	public Long getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idTipoIdentificacion
	 * @param idTipoIdentificacion El nuevo idTipoIdentificacion a modificar.
	 */
	public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroIdentificacion
	 * @return El numeroIdentificacion asociado a la clase
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroIdentificacion
	 * @param numeroIdentificacion El nuevo numeroIdentificacion a modificar.
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
}
