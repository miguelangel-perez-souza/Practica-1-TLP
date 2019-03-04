package paquete;
import java.util.ArrayList;
public class Grafo {
	protected ArrayList<Nodo> Nodos;
	protected ArrayList<Arista> Aristas;
	
	public Grafo() {
		this.Nodos=new ArrayList<Nodo>();
		this.Aristas=new ArrayList<Arista>();
	}
	public Grafo(ArrayList<Nodo> nodos, ArrayList<Arista> aristas) {
		this.Nodos=nodos;
		this.Aristas=aristas;
	}
	public ArrayList<Nodo> getNodos() {
		return Nodos;
	}
	public void setNodos(ArrayList<Nodo> nodos) {
		Nodos = nodos;
	}
	public ArrayList<Arista> getAristas() {
		return Aristas;
	}
	public void setAristas(ArrayList<Arista> aristas) {
		Aristas = aristas;
	}
	public void MostrarGrafo() {
		for(Nodo e: this.Nodos) {
			System.out.println("Nodo: "+ e.getValor() + " Estado inicial: " + e.iseInicial() + " Estado final: " + e.iseFinal());
			for(Arista a: e.IncideDesde ) {
				System.out.println("Nodo " + a.IncideDesde.getValor() + " apunta a " + a.IncideEn.getValor() + " con valor:  " +a.Valores);
			}
			System.out.println("------------------------------------------------------------------------");
		}
	}
	public Grafo GrafoInverso() {
		Grafo Inverso=this;
		int count=0;
		ArrayList <Nodo> eIniciales= new ArrayList<Nodo>();
		for (Nodo e: Inverso.Nodos) {
			if(e.iseInicial()==true) {
				e.seteInicial(false);
				e.seteFinal(true);
			}
			else if(e.iseFinal()==true) {
				count++;
				e.seteFinal(false);
				eIniciales.add(e);
			}
			ArrayList<Arista> InvIncideDesde= new ArrayList<Arista>();
			ArrayList<Arista> InvIncideEn= new ArrayList<Arista>();
			if (e.IncideDesde.size()>0) {
				for(Arista a: e.IncideDesde) {
					if(a.getIncideDesde()==e){
						Nodo aux= a.IncideDesde;
						a.IncideDesde=a.IncideEn;
						a.IncideEn=aux;
					}
					InvIncideEn.add(a);
				}
			}
			if(e.IncideEn.size()>0) {
				for(Arista a: e.IncideEn) {
					if(a.getIncideEn()==e) {
						Nodo aux= a.IncideDesde;
						a.IncideDesde=a.IncideEn;
						a.IncideEn=aux;
					}
					InvIncideDesde.add(a);
				}
			}
			e.setIncideDesde(InvIncideDesde);
			e.setIncideEn(InvIncideEn);
		}
		if (count==1) {
			eIniciales.get(0).seteInicial(true);
		}
		else if (count>1) {
			Nodo NuevoInicial= new Nodo("NuevoInicial", true, false);
			for (Nodo a: eIniciales) {
				Arista NuevaArista=new Arista(a,NuevoInicial);
				NuevoInicial.IncideDesde.add(NuevaArista);
				a.IncideEn.add(NuevaArista);
			}
			Inverso.Nodos.add(NuevoInicial);
		}
		return Inverso;
	}
}
