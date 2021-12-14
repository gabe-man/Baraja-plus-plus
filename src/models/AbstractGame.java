package models;

import java.util.ArrayList;

import modojuego.modojuego;

public abstract class AbstractGame {
	protected boolean finished;
	protected modojuego modojuego;
	protected ArrayList<AbstractPlayer> jugadores=new ArrayList<AbstractPlayer>();
	protected Mesa mesa;
	protected int ronda;
	
	abstract void bienvenida();
	abstract void menuPrincipal();
	abstract AbstractPlayer nextTurno();
	abstract void start();
	abstract void barajar();
	abstract void finish();

}
