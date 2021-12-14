package models;

import java.util.ArrayList;

public class Baraja {
	protected ArrayList<Carta> lista_cartas;

	/**
	 * Crea una Baraja vacia
	 */
	public Baraja() {
		super();
		lista_cartas=new ArrayList<Carta>();
	}
	
	/**
	 * Crea una baraja de 40 u 80 caratas
	 * @param tipobaraja Indica el tipo de Baraja a crear (1: 40 cartas,2: 80 cartas)
	 */
	public Baraja(int tipobaraja) {
		super();
		lista_cartas=new ArrayList<Carta>();
		if(tipobaraja==1)
		{
			for (int i = 0; i < 40; i++) {
				this.lista_cartas.add(new Carta(i+1));
			}
		}
		if(tipobaraja==2)
		{
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 40; j++) {
					this.lista_cartas.add(new Carta(i+1));
				}
			}
		}
	}
	
	/**
	 * Crea una baraja de 40 u 80 cartas barajada o sin barajar 
	 * @param tipobaraja Decide que tipo de baraja crear (40 u 80)
	 * @param barajar Decide si barajar la baraja creada
	 */
	public Baraja(int tipobaraja, boolean barajar) {
		super();
		lista_cartas=new ArrayList<Carta>();
		if(tipobaraja==1)
		{
			for (int i = 0; i < 40; i++) {
				this.lista_cartas.add(new Carta(i+1));
			}
		}
		if(tipobaraja==2)
		{
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 40; j++) {
					this.lista_cartas.add(new Carta(i+1));
				}
			}
		}
		if(barajar)
		{
			Barajar();
		}
	}
	
	/**
	 * Baraja la baraja
	 */
	public void Barajar()
	{
		ArrayList<Carta> aux=new ArrayList<Carta>();
		int posicion;
		int j=this.lista_cartas.size();
		for (int i = 0; i < j; i++) {
			posicion=(int)(Math.random()*(this.lista_cartas.size()));
			aux.add(this.lista_cartas.get(posicion));
			this.lista_cartas.remove(posicion);
		}
		for (int i = 0; i < aux.size(); i++) {
			this.lista_cartas.add(aux.get(i));
		}
	}
	
	/**
	 * Corta  la baraja por la posicion indicada
	 * @param posicion Posición desde la cual cortar la baraja
	 */
	public void Cortar(int posicion)
	{
		ArrayList<Carta> aux=new ArrayList<Carta>();
		for (int i = 0; i < posicion; i++) {
			aux.add(this.lista_cartas.get(i));
			this.lista_cartas.remove(i);
		}
		this.lista_cartas.addAll(aux);
	}
	
	/**
	 * Roba la primera carta de la baraja
	 * @return Devuelve la carta robada
	 */
	public Carta Robar()
	{
		Carta carta;
		carta=this.lista_cartas.get(0);
		this.lista_cartas.remove(0);
		return carta;
	}
	
	/**
	 * Mete una carta al final de la baraja mediante la id de la carta
	 * @param id_carta Id de la carta a introducir en la baraja
	 */
	public void InsertaCartaFinal(int id_carta)
	{
		this.lista_cartas.add(new Carta(id_carta));
	}
	
	/**
	 * Mete una carta al principio de la baraja mediante la id de la carta
	 * @param id_carta Id de la carta a introducir en la baraja
	 */
	public void InsertaCartaPricipio(int id_carta)
	{
		this.lista_cartas.add(0, new Carta(id_carta));
	}
	
	/**
	 * Mete una carta al final de la baraja mediante la id de la carta
	 * @param carta Carta a introducir
	 */
	public void InsertaCartaFinal(Carta carta)
	{
		this.lista_cartas.add(carta);
	}
	
	/**
	 * Mete una carta al principio de la baraja mediante la id de la carta
	 * @param carta Carta a introducir
	 */
	public void InsertaCartaPrincipio(Carta carta)
	{
		this.lista_cartas.add(0, carta);
	}
	
	/**
	 * Devulve el numero de cartas que quedan en la baraja
	 */
	public void getNumeroCartas()
	{
		int cont=0;
		for (int i = 0; i < this.lista_cartas.size(); i++) {
			cont++;
		}
		if(cont>0)
		{
			System.out.println("Quedan " + cont + " carta(s) en la baraja");
		}
		else
		{
			System.out.println("La baraja esta vacia");
		}
	}
	
	/**
	 * Nos dice si la baraja está vacia o si está llena
	 * @return devuelve true en caso de estar vacia
	 */
	public boolean isVacia()
	{
		int cont=0;
		boolean vacio=false;
		for (int i = 0; i < this.lista_cartas.size(); i++) {
			cont++;
		}
		if (cont==0)
		{
			vacio=true;
		}
		return vacio;
	}
	
	

	public ArrayList<Carta> getLista_cartas() {
		return lista_cartas;
	}

	public void setLista_cartas(ArrayList<Carta> lista_cartas) {
		this.lista_cartas = lista_cartas;
	}

	@Override
	public String toString() {
		return "Baraja [lista_cartas=" + lista_cartas + "]";
	}
	
	
}
