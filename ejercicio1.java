package app;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;

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

		int desicion = 1;
		
		if (desicion == 1) {
			mainEjercicio1();
		}else if(desicion ==2 ){
			mainEjercicio2();
		}else {
			mainEjercicio1();
			mainEjercicio2();
		}
		
//        Date hoy = new Date();
//		
//        Banda bandaPpal = new Banda("Kiss");
//		BandaSoporte[] bandasSoporte = {new BandaSoporte("Chaqueño Palavecino"),new BandaSoporte("Almafuerte")}; 
//		String []arrayActoresPpal = {"Valeria Lynch","Pappo","Pepito Cybrian"};
        
//		EntradaDeporte entDep = new EntradaDeporte(hoy, 30, "Super Clasico", "Futbol", false);	
//		EntradaDeporte entDep2 = new EntradaDeporte(hoy, 30, "Clasificatoria", "Basquet", false);
//		EntradaInfantil entInf = new EntradaInfantil(hoy, 15,"Heidy", 8, true);		
//		EntradaRecital entRec = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);	
//		EntradaTeatro entTeat = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");		
//		
//		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
//		
//		entradas.add(entDep);
//		entradas.add(entDep2);
//		entradas.add(entInf);
//		entradas.add(entRec);
//		entradas.add(entTeat);
//		
//		 Iterator<Entrada> entradaIterator = entradas.iterator();
//		 
//		 while(entradaIterator.hasNext()) {
//			 Entrada e = (Entrada) entradaIterator.next();
//			 System.out.println(e.toString());
//		 }
//		 
//		 		 
//		 /* TODO: Borrar esto, solo se incluyo para mostrar las clases*/
//		 
//		 System.out.println("\n \n ===============================================");
//		 Cliente _cliente1 = new Cliente("Ricardo", "Lopez", "41672222", "Francia 1312", "Pacheco", "Buenos Aires", "Masculino");
//		 Venta vta = new Venta(_cliente1, hoy, entradas);
//		 System.out.println(vta.toString());
//		 
//		 System.out.println(" =============================================== ");
		 
		 
		 /*------------------------------------------------------------------------------------------------------------------------*/
		 

	}
	
	private static void mainEjercicio1() {
		// TODO Auto-generated method stub
		
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
		 Cliente _cliente1 = new Cliente("Raul", "Perez", "22334455", "Mendoza 2260", "Gral Pacheco", "Bs As", "Masculino");
		 Venta vta = new Venta(_cliente1, hoy, entradas);
		 System.out.println(vta.toString());
		 
		 System.out.println(" =============================================== ");
		
	}
	
	private static void mainEjercicio2() {
		// TODO Auto-generated method stub
		
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
			 
			 /* TODO: Borrar esto, solo se incluyo para mostrar las clases*/
			 
//			 System.out.println("\n \n ===============================================");
//			 Cliente _cliente1 = new Cliente("Raul", "Perez", "22334455", "Mendoza 2260", "Gral Pacheco", "Bs As", "Masculino");
//			 Venta vta = new Venta(_cliente1, hoy, entradas);
//			 System.out.println(vta.toString());
//			 
//			 System.out.println(" =============================================== ");
	}

}
