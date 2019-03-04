package paquete;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------------------------------------------------------------------------Nodos Automata 1
		Nodo NodoS=new Nodo();Nodo NodoA=new Nodo();Nodo NodoB=new Nodo();Nodo NodoC=new Nodo();Nodo NodoD=new Nodo();Nodo NodoE=new Nodo();
		Nodo NodoF=new Nodo();
		
		
		NodoS.seteInicial(true); NodoS.setValor("S");
		NodoA.setValor("A");
		NodoB.setValor("B");
		NodoC.setValor("C");
		NodoD.setValor("D");
		NodoE.setValor("E");
		NodoF.setValor("F"); NodoF.seteFinal(true);
		
		
		//--------------------------------------------------------------------------------Aristas Automata1
		Arista AristaSA = new Arista(NodoA,NodoS); Arista AristaAB=new Arista(NodoB,NodoA); Arista AristaBB=new Arista(NodoB,NodoB); Arista AristaBF=new Arista(NodoF,NodoB);
		Arista AristaSF= new Arista(NodoF,NodoS); Arista AristaSC=new Arista(NodoC,NodoS); Arista AristaSD=new Arista(NodoD,NodoS); Arista AristaDS=new Arista(NodoS,NodoD);
		Arista AristaCD=new Arista(NodoD,NodoC); Arista AristaDE=new Arista(NodoE,NodoD); Arista AristaEF=new Arista(NodoF,NodoE);
		
		
		AristaSA.Valores.add('a'); 
		AristaAB.Valores.add('b'); 
		AristaBB.Valores.add('b'); 
		AristaBF.Valores.add('c'); AristaBF.Valores.add('d'); 
		AristaSF.Valores.add('d'); 
		AristaSC.Valores.add('b');
		AristaSD.Valores.add('c');
		AristaDS.Valores.add('a');
		AristaCD.Valores.add('a');
		AristaDE.Valores.add('c');
		AristaEF.Valores.add('b');
		
		//---------------------------------------------------------------------------------Asociar aristas y nodos automata 1
		
		NodoS.IncideDesde.add(AristaSD);NodoS.IncideDesde.add(AristaSA); NodoS.IncideDesde.add(AristaSC);NodoS.IncideDesde.add(AristaSF);
		NodoS.IncideEn.add(AristaDS);
		
		
		NodoA.IncideDesde.add(AristaAB); NodoA.IncideEn.add(AristaSA); 
		
		NodoB.IncideDesde.add(AristaBB);NodoB.IncideDesde.add(AristaBF); NodoB.IncideEn.add(AristaBB);NodoB.IncideEn.add(AristaAB);
		
		NodoC.IncideDesde.add(AristaCD);NodoC.IncideEn.add(AristaSC); 
		
		NodoD.IncideDesde.add(AristaDS); NodoD.IncideDesde.add(AristaDE); NodoD.IncideEn.add(AristaSD); NodoD.IncideEn.add(AristaCD);
		
		NodoE.IncideDesde.add(AristaEF);NodoE.IncideEn.add(AristaDE);
		
		NodoF.IncideEn.add(AristaEF); NodoE.IncideEn.add(AristaSF); NodoF.IncideEn.add(AristaBF);
		
		//----------------------------------------------------------------------------------Grafo automata 1
		
		Grafo Grafo1=new Grafo();
		Grafo1.Nodos.add(NodoS);Grafo1.Nodos.add(NodoA);Grafo1.Nodos.add(NodoB);Grafo1.Nodos.add(NodoC);Grafo1.Nodos.add(NodoD);
		Grafo1.Nodos.add(NodoE);Grafo1.Nodos.add(NodoF);
		
		//Grafo1.MostrarGrafo();
		
		System.out.println("\n\n\nGrafo Inverso de automata 1\n\n");
		Grafo InvGrafo1=Grafo1.GrafoInverso();
		InvGrafo1.MostrarGrafo();
		
		
		//-----------------------------------------------------------------------------------Nodos automata 2
		
		Nodo NodoP0= new Nodo("p0", true, false); Nodo NodoP1= new Nodo("p1", false, false); Nodo NodoP2= new Nodo("p2", false,false);
		Nodo NodoP3= new Nodo("p3", false, false); Nodo NodoP4= new Nodo("p4", false, true);Nodo NodoP5= new Nodo("p5", false, true);
		Nodo NodoP6= new Nodo("p6", false, true);Nodo NodoP7= new Nodo("p7", false, true);
		
		//-----------------------------------------------------------------------------------Aristas automata 2
		
		Arista AristaP0_P0= new Arista(NodoP0,NodoP0); Arista AristaP0_P1= new Arista(NodoP1,NodoP0); 
		Arista AristaP1_P0= new Arista(NodoP0,NodoP1); Arista AristaP1_P2= new Arista(NodoP2,NodoP1);
		Arista AristaP2_P2= new Arista(NodoP2,NodoP2); Arista AristaP2_P3= new Arista(NodoP3,NodoP2);
		Arista AristaP3_P4= new Arista(NodoP4,NodoP3); Arista AristaP4_P4= new Arista(NodoP4,NodoP4);
		Arista AristaP4_P5= new Arista(NodoP5,NodoP4); Arista AristaP5_P4= new Arista(NodoP4,NodoP5);
		Arista AristaP5_P6= new Arista(NodoP6,NodoP5); Arista AristaP6_P6= new Arista(NodoP6,NodoP6);
		Arista AristaP6_P7= new Arista(NodoP7,NodoP6); Arista AristaP7_P6= new Arista(NodoP6,NodoP7);
		Arista AristaP7_P4= new Arista(NodoP4,NodoP7); Arista AristaP3_P0= new Arista(NodoP0,NodoP3);
		
		AristaP0_P0.Valores.add('b');
		AristaP0_P1.Valores.add('a');
		AristaP1_P0.Valores.add('b');
		AristaP1_P2.Valores.add('a');
		AristaP2_P2.Valores.add('a');
		AristaP2_P3.Valores.add('b');
		AristaP3_P4.Valores.add('a');
		AristaP4_P4.Valores.add('a');
		AristaP4_P5.Valores.add('b');
		AristaP5_P4.Valores.add('a');
		AristaP5_P6.Valores.add('b');
		AristaP6_P6.Valores.add('b');
		AristaP6_P7.Valores.add('a');
		AristaP7_P6.Valores.add('b');
		AristaP7_P4.Valores.add('a');
		AristaP3_P0.Valores.add('b');
		
		//-------------------------------------------------------------------------------------Asociar aristas y nodos automata 2
		
		NodoP0.IncideDesde.add(AristaP0_P0); NodoP0.IncideDesde.add(AristaP0_P1); NodoP0.IncideEn.add(AristaP3_P0); NodoP0.IncideEn.add(AristaP1_P0);
		
		NodoP1.IncideDesde.add(AristaP1_P0); NodoP1.IncideDesde.add(AristaP1_P2); NodoP1.IncideEn.add(AristaP0_P1);
		
		NodoP2.IncideDesde.add(AristaP2_P2); NodoP2.IncideDesde.add(AristaP2_P3); NodoP2.IncideEn.add(AristaP2_P2); NodoP2.IncideEn.add(AristaP1_P2);
		
		NodoP3.IncideDesde.add(AristaP3_P4); NodoP3.IncideDesde.add(AristaP3_P0); NodoP3.IncideEn.add(AristaP2_P3);
		
		NodoP4.IncideDesde.add(AristaP4_P4); NodoP4.IncideDesde.add(AristaP4_P5); NodoP4.IncideEn.add(AristaP5_P4); NodoP4.IncideEn.add(AristaP4_P4);
		
		NodoP5.IncideDesde.add(AristaP5_P4); NodoP5.IncideDesde.add(AristaP5_P6); NodoP5.IncideEn.add(AristaP4_P5);
		
		NodoP6.IncideDesde.add(AristaP6_P6); NodoP6.IncideDesde.add(AristaP6_P7); NodoP6.IncideEn.add(AristaP6_P6); NodoP6.IncideEn.add(AristaP7_P6);
		
		NodoP7.IncideDesde.add(AristaP7_P4); NodoP7.IncideDesde.add(AristaP7_P6); NodoP7.IncideEn.add(AristaP6_P7);
		
		//----------------------------------------------------------------------------------------Grafo automata 2
		
		Grafo Grafo2= new Grafo();
		Grafo2.Nodos.add(NodoP0); Grafo2.Nodos.add(NodoP1); Grafo2.Nodos.add(NodoP2);Grafo2.Nodos.add(NodoP3);Grafo2.Nodos.add(NodoP4);
		Grafo2.Nodos.add(NodoP5);Grafo2.Nodos.add(NodoP6);Grafo2.Nodos.add(NodoP7);
		System.out.println("\n\n\n");
		//Grafo2.MostrarGrafo();
		Grafo InvGrafo2=Grafo2.GrafoInverso();
		InvGrafo2.MostrarGrafo();
	}

}
