package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import dominio.Banda;
import dominio.BandaSoporte;
import dominio.Entrada;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;

public class ejercicio2 {

	public static void main(String[] args) {
		Date hoy = new Date();
		
        Banda bandaPpal = new Banda("Divididos");
		BandaSoporte[] bandasSoporte = {new BandaSoporte("Los Tipitos"),new BandaSoporte("Las Pelotas"), new BandaSoporte("Sin Confirmar")}; 
		String []arrayActoresPpal = {"Pablo Echarri ","Franchella ","Shakira "};
		
		EntradaDeporte entDeporte = new EntradaDeporte(hoy, 30, "Super Clasico", "Futbol", false);	
		EntradaDeporte entDeporte2 = new EntradaDeporte(hoy, 30, "Clasificatoria", "Basquet", false);
		EntradaInfantil entInfantil = new EntradaInfantil(hoy, 15,"Heidy", 8, true);		
		EntradaRecital entRecital = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);	
		EntradaTeatro entTeatro = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");		
		
		TreeSet<Entrada> entradas = new TreeSet<Entrada>();
		
		entradas.add(entDeporte);
		entradas.add(entDeporte2);
		entradas.add(entInfantil);
		entradas.add(entRecital);
		entradas.add(entTeatro);
		
		 Iterator<Entrada> entradaIterator = entradas.iterator();
		 
		 while(entradaIterator.hasNext()) {
			 Entrada e = (Entrada) entradaIterator.next();
			 System.out.println(e.toString());
		 }
	}

}
