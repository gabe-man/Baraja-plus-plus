package models;

import java.util.ArrayList;

public class Mesa {
	
	private Baraja baraja=new Baraja(1,true);
	
	/**
	 * Roba una carta de la baraja de la mesa
	 * @return Carta robada
	 */
	public Carta robarCartaDeBaraja()
	{
		return baraja.Robar();
	}
	
	/**
	 * Roba varias cartas de la baraja de la mesa
	 * @param n numero de cartas a robar
	 * @return Lista de cartas robadas
	 */
	public ArrayList<Carta> robarVariasCartas(int n)
	{
		ArrayList<Carta> lista=new ArrayList<Carta>();
		for (int i = 0; i < n; i++) {
			lista.add(robarCartaDeBaraja());
		}
		
		return lista;
	}
	
	/**
	 * Añade una carta a la baraja de la mesa
	 * @param carta Carta a insertar
	 */
	public void addCartaABaraja(Carta carta)
	{
		baraja.InsertaCartaFinal(carta);
	}

}
