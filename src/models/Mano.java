package models;

import java.util.Scanner;

public class Mano extends Baraja {
	Scanner sc=new Scanner(System.in);
	
	/**
	 * Lista todas las cartas de la mano de un jugador
	 */
	public void listarCartas()
	{
		for (int i = 0; i < lista_cartas.size(); i++) {
			System.out.println(lista_cartas.get(i));
		}
	}
	
	/**
	 * Deja que el jugador elija la carta que desee de su mano
	 * @return
	 */
	public Carta elegirCarta()
	{
		int eleccion=0;
		for (int i = 0; i < lista_cartas.size(); i++) {
			System.out.println((i+1)+". "+lista_cartas.get(i));
		}
		System.out.println("¿Que carta desea?");
		eleccion=Integer.parseInt(sc.nextLine());
		while(eleccion<1 || eleccion>lista_cartas.size())
		{
			System.out.println("Esa carta no existe, elija otra vez.");
			eleccion=Integer.parseInt(sc.nextLine());
		}
		
		return lista_cartas.get(eleccion-1);
	}
}
