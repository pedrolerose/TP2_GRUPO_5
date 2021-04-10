package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import dominio.Banda;
import dominio.BandaSoporte;
import dominio.Cliente;
import dominio.Entrada;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Venta;

public class ejercicio1 {

	public static void main(String[] args) {

        Date hoy = new Date();
		
        Banda bandaPpal = new Banda("Kiss");
		BandaSoporte[] bandasSoporte = {new BandaSoporte("Chaqueño Palavecino"),new BandaSoporte("Almafuerte")}; 
		String []arrayActoresPpal = {"Valeria Lynch","Pappo","Pepito Cybrian"};
        
		EntradaDeporte entDep = new EntradaDeporte(hoy, 30, "Super Clasico", "Futbol", false);	
		EntradaDeporte entDep2 = new EntradaDeporte(hoy, 30, "Clasificatoria", "Basquet", false);
		EntradaInfantil entInf = new EntradaInfantil(hoy, 15,"Heidy", 8, true);		
		EntradaRecital entRec = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);	
		EntradaTeatro entTeat = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");		
		
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		
		entradas.add(entDep);
		entradas.add(entDep2);
		entradas.add(entInf);
		entradas.add(entRec);
		entradas.add(entTeat);
		
		 Iterator<Entrada> entradaIterator = entradas.iterator();
		 
		 while(entradaIterator.hasNext()) {
			 Entrada e = (Entrada) entradaIterator.next();
			 System.out.println(e.toString());
		 }
		 
		 		 
		 /* TODO: Borrar esto, solo se incluyo para mostrar las clases*/
		 
		 System.out.println("\n \n ===============================================");
		 Cliente _cliente1 = new Cliente("Ricardo", "Lopez", "41672222", "Francia 1312", "Pacheco", "Buenos Aires", "Masculino");
		 Venta vta = new Venta(_cliente1, hoy, entradas);
		 System.out.println(vta.toString());
		 
		 System.out.println(" =============================================== ");
		 
		 
		 /*------------------------------------------------------------------------------------------------------------------------*/
		 

	}

}
