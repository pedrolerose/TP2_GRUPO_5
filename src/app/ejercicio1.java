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
        
		Entrada e1 = new EntradaDeporte(hoy, 30, "Super Clasico", "Futbol", false);	
		Entrada e2 = new EntradaDeporte(hoy, 30, "Clasificatoria", "Rugby", false);
		Entrada e3 = new EntradaInfantil(hoy, 15,"Heidy", 8, true);		
		Entrada e4 = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);	
		Entrada e5 = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");			
		
		ArrayList<Entrada> entradas = new ArrayList<Entrada>();
		entradas.add(e1);
		entradas.add(e2);
		entradas.add(e3);
		entradas.add(e4);
		entradas.add(e5);

		Cliente nvoCliente1 = new Cliente("Juan","Peron","02134532","Balcarce 50","CABA","Buenos Aires","Masculino");
		Venta venta1 = new Venta(nvoCliente1,hoy,entradas);
		
		Cliente nvoCliente2 = new Cliente("Zoila","Serda","31293211","Jalea 331","Springfield","Ohio","Femenino");
		Venta venta2 = new Venta(nvoCliente2,hoy,entradas);
		
		System.out.println(venta1.toString());
		System.out.println(venta2.toString());
	}

}
