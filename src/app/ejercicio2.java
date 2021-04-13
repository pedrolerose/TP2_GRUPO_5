package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import dominio.Banda;
import dominio.BandaSoporte;
import dominio.Cliente;
import dominio.Entrada;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Venta;

public class ejercicio2 {

	public static void main(String[] args) {
		Date hoy = new Date();
		
        Banda bandaPpal = new Banda("Divididos");
		BandaSoporte[] bandasSoporte = {new BandaSoporte("Los Tipitos"),new BandaSoporte("Las Pelotas"), new BandaSoporte("Sin Confirmar")}; 
		String []arrayActoresPpal = {"Pablo Echarri ","Franchella ","Shakira "};
		
		
		
		Entrada entDeporte = new EntradaDeporte(hoy, 30, "Super Clasico","Futbol", false);
		
		Entrada entDeporte2 = new EntradaDeporte(hoy, 30, "Clasificatoria","Rugby", false);
		
		Entrada entDeporte3 = new EntradaDeporte(hoy, 30, "Clasificatoria","Rugby", false);
		
		Entrada entInfantil = new EntradaInfantil(hoy, 15,"Heidy", 8, true);
		
		Entrada entRecital = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);	
		
		Entrada entTeatro = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");		
		
		if(entDeporte2.equals(entDeporte3))
		{
			System.out.println("Entradas iguales");
			
		}
		else
		{
		TreeSet<Entrada> T_entradas = new TreeSet<Entrada>();
		
		
		T_entradas.add(entDeporte);
		T_entradas.add(entDeporte2);
		T_entradas.add(entInfantil);
		T_entradas.add(entRecital);
		T_entradas.add(entTeatro);
		
				
		
		//modificado por Nahuel Revollo
		Cliente nvoCliente = new Cliente("Lalo","Landa","04136501","Segurola 320","CABA","Buenos Aires","Masculino");
		Venta venta1 = new Venta(nvoCliente,hoy,T_entradas);
		
		Cliente nvoCliente2 = new Cliente("Pepe","Argento","04122598","La habana 2340","CABA","Buenos Aires","Masculino");
		Venta venta2 = new Venta(nvoCliente2,hoy,T_entradas);
		
		System.out.println(venta1.toString2());
		System.out.println(venta2.toString2());
		
		//fin de la modificacion		 
		 
		 
		}
		 
	}

}
