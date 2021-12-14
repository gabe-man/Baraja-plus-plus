package models;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	public HumanPlayer(String nombre) {
		super(nombre);
		this.nombre=nombre;
	}
	
	/**
	 * Juega el turno de 7 y media del jugador
	 */
	@Override
	protected void jugarTurno7ymedia() {
		char quiere=' ';
		Carta carta;
		Scanner sc=new Scanner(System.in);
		
		do {
			quiere='n';
			carta=mesa.robarCartaDeBaraja();
			mano.InsertaCartaFinal(carta);
			puntos+=carta.getValor7ymedia();
			System.out.println("Has robado la carta:" + carta.getNombreCarta());
			System.out.println("Su puntuacion es: " + puntos);
			
			if(puntos>7.5)
			{
				System.out.println("Usted se ha pasado. Ha perdido");
			}
			else if(puntos==7.5)
			{
				System.out.println("¡Siete y media! Usted gana el doble de lo apostado");
			}
			else
			{
				System.out.println("¿Quiere otra carta?(s/n)");
				quiere=sc.nextLine().charAt(0);
				while(quiere !='s' && quiere !='n')
				{
					System.out.println("Esa no es una opcion valida. Intentalo de nuevo");
					System.out.println("¿Quiere otra carta?(s/n)");
					quiere=sc.nextLine().charAt(0);
				}
			}
		}while(quiere == 's');
		sc.close();
		
	}

}
