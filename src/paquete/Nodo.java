package paquete;
import java.util.ArrayList;

public class Nodo {
	protected String Valor;
	protected boolean eInicial;
	protected boolean eFinal;
	protected ArrayList<Arista> IncideEn;
	protected ArrayList<Arista> IncideDesde;
	
	public Nodo(){
		this.Valor="";
		this.eInicial=false;
		this.eFinal=false;
		this.IncideEn=new ArrayList<Arista>();
		this.IncideDesde= new ArrayList<Arista>();
	}
	public Nodo(String valor,boolean einicial, boolean efinal ) {
		this.Valor=valor;
		this.IncideDesde= new ArrayList<Arista>();
		this.IncideEn=new ArrayList<Arista>();
		this.eFinal=efinal;
		this.eInicial=einicial;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public boolean iseInicial() {
		return eInicial;
	}
	public void seteInicial(boolean eInicial) {
		this.eInicial = eInicial;
	}
	public boolean iseFinal() {
		return eFinal;
	}
	public void seteFinal(boolean eFinal) {
		this.eFinal = eFinal;
	}
	public ArrayList<Arista> getIncideEn() {
		return IncideEn;
	}
	public void setIncideEn(ArrayList<Arista> incideEn) {
		IncideEn = incideEn;
	}
	public ArrayList<Arista> getIncideDesde() {
		return IncideDesde;
	}
	public void setIncideDesde(ArrayList<Arista> incideDesde) {
		IncideDesde = incideDesde;
	}
}
