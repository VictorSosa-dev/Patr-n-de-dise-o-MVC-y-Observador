package mx.uam.is.practicadiseno.negocio;
/**
 * Esta clase es observado(Sujeto)
 */

import java.util.ArrayList;
import java.util.List;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;

public class ManejadorImpl implements Manejador {
	
	private MapeadorDatos mapeador;
	private ArrayList<Observador> observadores = new ArrayList<Observador>();

	/**
	 * Constructor para conectar con el 
	 * mapeardor de datos
	 * 
	 */
	public ManejadorImpl(MapeadorDatos mapeador){
		this.mapeador = mapeador;
	}


	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		System.out.print( observadores.size());
		
	}


	@Override
	public String[] dameDatos() {
		// TODO Auto-generated method stub
		return mapeador.dameDatos();
	}


	@Override
	public boolean agrega(String dato) {
		// TODO Auto-generated method stub
		return mapeador.agrega(dato);
	}


	@Override
	public boolean borra(String dato) {
		// TODO Auto-generated method stub
		return mapeador.borra(dato);
	}


	@Override
	public boolean agregaObservador(Observador o) {
		
		observadores.add(o);
		return true;
	}


	@Override
	public boolean quitaObservador(Observador o) {
		
		observadores.remove(o);
		if(observadores.isEmpty())
			System.exit(0);
		return true;
	}
	
	/**
	 * 
	 * Llamar actualiza() sobre todos los observadores
	 * se recorre la lista de observadores
	 */
	public void notifica() {
	  	for (Observador o : observadores) {
			o.actualiza();
			
		}
	
	}
}
