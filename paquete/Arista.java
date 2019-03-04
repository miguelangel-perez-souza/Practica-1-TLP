package paquete;
import java.util.ArrayList;

public class Arista {
	protected ArrayList<Character> Valores;
	protected Nodo IncideDesde;
	protected Nodo IncideEn;
	
	public Arista() {
		this.Valores= new ArrayList<Character>();
		this.IncideDesde= new Nodo();
		this.IncideEn= new Nodo();
	}
	 public Arista( Nodo incideen, Nodo incidedesde) {
		 this.Valores=new ArrayList<Character>();
		 this.IncideDesde=incidedesde;
		 this.IncideEn=incideen;
	 }
	public ArrayList<Character> getValores() {
		return Valores;
	}
	public void setValores(ArrayList<Character> valores) {
		Valores = valores;
	}
	public Nodo getIncideDesde() {
		return IncideDesde;
	}
	public void setIncideDesde(Nodo incideDesde) {
		IncideDesde = incideDesde;
	}
	public Nodo getIncideEn() {
		return IncideEn;
	}
	public void setIncideEn(Nodo incideEn) {
		IncideEn = incideEn;
	}
	
}
