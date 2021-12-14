package models;

public abstract class AbstractPlayer {
	protected String nombre;
	protected double puntos;
	protected Mano mano=new Mano();
	protected Mesa mesa=new Mesa();
	
	protected abstract void jugarTurno7ymedia();
	
	public AbstractPlayer(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPuntos() {
		return puntos;
	}

	public Mano getMano() {
		return mano;
	}

	public Mesa getMesa() {
		return mesa;
	}
	
	
}
