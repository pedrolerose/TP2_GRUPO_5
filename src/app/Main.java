package app;

import java.util.Date;

import dominio.Banda;
import dominio.BandaSoporte;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Genero;
import dominio.Entrada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date hoy = new Date();
		
		EntradaDeporte entDep = new EntradaDeporte(hoy, 30, "Super Clasico", "Futbol", false);		
		//System.out.println(entDep.toString());

		EntradaInfantil entInf = new EntradaInfantil(hoy, 15,"Heidy", 8, true);		
		//System.out.println(entInf.toString());

		
		Banda bandaPpal = new Banda("Kiss");
		BandaSoporte[] bandasSoporte = {new BandaSoporte("Chaqueño Palavecino"),new BandaSoporte("Almafuerte")}; 
		

//		Banda bandaPpal = new Banda("Kiss");
//		BandaSoporte[] bandasSoporte = {new BandaSoporte("Chaqueño Palavecino"),new BandaSoporte("Almafuerte")}; 

		EntradaRecital entRec = new EntradaRecital(hoy, 120, "Rock and Roll", true,"G_Rock", bandaPpal, bandasSoporte);		
		//System.out.println(entRec.toString());

		String []arrayActoresPpal = {"Valeria Lynch","Pappo","Pepito Cybrian"};
		EntradaTeatro entTeat = new EntradaTeatro(hoy, 60, "Prohibido Reirse", arrayActoresPpal,"G_Comedia");		
		//System.out.println(entTeat.toString());

		Entrada[] ent = new Entrada[4];
		ent[0] = entDep;
		ent[1] = entInf;
		ent[2] = entRec;
		ent[3] = entTeat;

		for (Entrada e : ent) {
			System.out.println(e.toString());
		}

	}

}