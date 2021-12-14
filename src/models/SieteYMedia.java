package models;

import java.util.Scanner;

public class SieteYMedia extends AbstractGame{

	/**
	 * Da la bienvenida y llama al menú principal
	 */
	@Override
	public void bienvenida() {
		System.out.println("Bienvenido al Black Jack español ¡La 7 y media!");
		menuPrincipal();
		
	}

	/**
	 * Menú en el que el usuario elije el modo de juego
	 */
	@Override
	public void menuPrincipal() {
		int opc;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿A que modo quiere jugar?\n1. solitario\n2. 1vsCPU\n3. PvP\n4. multiplayer\n(De momento solo se puede solitario)");
		try
		{
			opc=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e)
		{
			opc=5;
		}
		while(opc!=1)
		{
			System.out.println("Opción no disponible. Vuelva a introducirlo");
			System.out.print("¿A que modo quiere jugar?\n1. solitario\n2. 1vsCPU\n3. PvP\n4. multiplayer\n(De momento solo se puede solitario)");
			try
			{
				opc=Integer.parseInt(sc.nextLine());
			}
			catch(Exception e)
			{
				opc=5;
			}
		}
		switch (opc) {
		case 1:
			modojuego=modojuego.solitario;
			System.out.println("Introduzca su nombre");
			this.jugadores.add(new HumanPlayer(sc.nextLine()));
			start();
			finish();
			break;

		default:
			break;
		}
	}

	@Override
	public AbstractPlayer nextTurno() {
		return null;
	}

	/**
	 * En funcion del modo de juego inicia la partida
	 */
	@Override
	public void start() {
		if(modojuego.equals(modojuego.solitario))
		{
			jugadores.get(0).jugarTurno7ymedia();
		}
	}

	@Override
	public void barajar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Recoje todas las cartas de todos los jugadores y los despide
	 */
	@Override
	public void finish() {
		for (int i = 0; i < jugadores.size(); i++) {
			for (int j = 0; j < jugadores.get(i).getMano().getLista_cartas().size(); j++) {
				mesa.addCartaABaraja(jugadores.get(i).getMano().getLista_cartas().get(j));
			}
			jugadores.get(i).getMano().getLista_cartas().clear();
		}
		System.out.println("Esperamos que haya tenido suerto");
	}

}
