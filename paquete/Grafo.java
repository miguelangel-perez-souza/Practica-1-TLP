package paquete;
import java.util.ArrayList;
public class Grafo {
	protected ArrayList<Nodo> Nodos;
	protected ArrayList<Arista> Aristas;
	
	//Constructores
	
	public Grafo() {
		this.Nodos=new ArrayList<Nodo>();
		this.Aristas=new ArrayList<Arista>();
	}
	public Grafo(ArrayList<Nodo> nodos, ArrayList<Arista> aristas) {
		this.Nodos=nodos;
		this.Aristas=aristas;
	}
	
	//getters y setters
	
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
	
	//metodos
	
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
			
			System.out.println("Nodo: "+ e.Valor);
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
					System.out.println("Nodo Incide Desde1: " + a.IncideDesde.Valor + " Nodo Incide En1: " + a.IncideEn.Valor);
					Nodo aux= a.IncideDesde;
					a.IncideDesde=a.IncideEn;
					a.IncideEn=aux;
					System.out.println("Nodo Incide Desde2: " + a.IncideDesde.Valor + " Nodo Incide En2: " + a.IncideEn.Valor);
					InvIncideEn.add(a);
				}
			}
			System.out.println("\n\n----------------------------------------------------------");
			if(e.IncideEn.size()>0) {
				for(Arista a: e.IncideEn) {
					System.out.println("Nodo Incide Desde21: " + a.IncideDesde.Valor + " Nodo Incide En1: " + a.IncideEn.Valor);
					Nodo aux= a.IncideDesde;
					a.IncideDesde=a.IncideEn;
					a.IncideEn=aux;
					System.out.println("Nodo Incide Desde2: " + a.IncideDesde.Valor + " Nodo Incide En2: " + a.IncideEn.Valor);
					InvIncideDesde.add(a);
				}
			}
			System.out.println("\n\n***********************************************************************************************");
			e.setIncideDesde(InvIncideDesde);
			e.setIncideEn(InvIncideEn);
		}
		if (count==1) {
			eIniciales.get(0).seteInicial(true);
		}
		else if (count>1) {
			Nodo NuevoInicial= new Nodo("NuevoInicial", true, false);
			for (Nodo a: eIniciales) {
				Arista NuevaArista=new Arista(NuevoInicial,a);
				NuevoInicial.IncideDesde.add(NuevaArista);
				a.IncideEn.add(NuevaArista);
			}
			Inverso.Nodos.add(NuevoInicial);
		}
		return Inverso;
	}
	
	public Grafo interseccion(Grafo grafo2) {
		Grafo grafoI;
		
		return grafoI;
	}
	
	public void total(Grafo g) {
		for(int i = 0; i < g.getNodos().size(); i++) {
			for(int j = 0; i < g.getNodos().get(i).getIncideDesde().size() ; j++) {
				
			}
		}
	}
}