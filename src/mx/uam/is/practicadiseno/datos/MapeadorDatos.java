package mx.uam.is.practicadiseno.datos;

public interface MapeadorDatos {
	/**
	 * Agrega un dato
	 *
	 * @param dato
	 * @return
	 */
	public boolean agrega(String dato);

	/**
	 * Borra un dato
	 *
	 * @param dato
	 * @return
	 */
	public boolean borra(String dato);

	/**
	 * Recupera un dato
	 *
	 * @return
	 */
	public String[] dameDatos();

	/**
	 * Checa si un dato esta presente
	 *
	 * @param dato
	 * @return
	 */
	public boolean contiene(String dato);
}
