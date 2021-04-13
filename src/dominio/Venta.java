package dominio;

import java.util.*;
//import java.util.Date;
//import java.util.ArrayList;
//import java.util.Iterator;

public class Venta implements Comparable<Venta> {

	private static int cont = 0;
	private int nroUnicoDeVenta = 0;
	private Cliente cliente;
	private Date fechaDeVenta;
	private double precioTotal;
	private ArrayList<Entrada> entradaList;
	private TreeSet<Entrada> treeList;

	public Venta(Cliente _cliente, Date _fechaDeVenta, ArrayList<Entrada> _entradaList) {
		cont++;
		this.nroUnicoDeVenta = cont;
		fechaDeVenta = _fechaDeVenta;
		this.cliente = _cliente;
		precioTotal = getPrecioTotalEntradas(_entradaList);
		entradaList = _entradaList;
	}

	public Venta(Cliente _cliente, Date _fechaDeVenta, TreeSet<Entrada> _treeList) {
		cont++;
		this.nroUnicoDeVenta = cont;
		fechaDeVenta = _fechaDeVenta;
		this.cliente = _cliente;
		precioTotal = getPrecioTotalEntradas(_treeList);
		treeList = _treeList;
	}

	private double getPrecioTotalEntradas(TreeSet<Entrada> _treeList) {

		Iterator<Entrada> entradaIterator = _treeList.iterator();
		double precioTotal = 0;
		while (entradaIterator.hasNext()) {
			Entrada e = (Entrada) entradaIterator.next();
			precioTotal += e.getPrecio();
			
			
		}

		return precioTotal;
	}

	public double getPrecioTotalEntradas(ArrayList<Entrada> entradaList) {

		//modifico iterator ya que con arrays list debemos usar list iterator(nahuel revollo)
		ListIterator<Entrada> entradaIterator = entradaList.listIterator();
		double precioTotal = 0;
		while (entradaIterator.hasNext()) {
			Entrada e = (Entrada) entradaIterator.next();
			precioTotal += e.getPrecio();
		}

		return precioTotal;

	}

	public int getNroUnicoDeVenta() {
		return nroUnicoDeVenta;
	}

	public void setNroUnicoDeVenta(int nroUnicoDeVenta) {
		this.nroUnicoDeVenta = nroUnicoDeVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaDeVenta() {
		return fechaDeVenta;
	}

	public void setFechaDeVenta(Date fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public ArrayList<Entrada> getEntradaList() {
		return entradaList;
	}

	public void setEntradaList(ArrayList<Entrada> entradaList) {
		this.entradaList = entradaList;
	}

	public String entradaListToString() {

		String _ret = "";
		//modifico iterator ya que con arrays list debemos usar list iterator(nahuel revollo)
		ListIterator<Entrada> entradaIterator = entradaList.listIterator();
		while(entradaIterator.hasNext()) {
			Entrada e = (Entrada)entradaIterator.next();
			_ret += e.toString();
		}
		return _ret;
	}
	//Modificado por nahuel revollo
	public String entradaTreeListToString() {

		String _ret = "";
		
		Iterator<Entrada> entradaIterator = treeList.iterator();
		while(entradaIterator.hasNext()) {
			Entrada e = (Entrada)entradaIterator.next();
			_ret += e.toString();
			
		}
		return _ret;
	}
	
	
	//fin de la modificacion de nahuel revollo

	public String toString() {

		String _ret = "Venta - Factura \n" + 
		"Nro de venta:" + nroUnicoDeVenta + "\n" +
		"Cliente: "+ cliente.getApellido() + ", " + cliente.getNombre() + ".\n" + 
		"Fecha: " + fechaDeVenta + "\n"+ 
		"--------------------------- \n"+
		"Entradas adquiridas: \n";

		_ret = _ret + entradaListToString()+"\n";
		_ret =_ret + "-------------------------------------\n";
		_ret = _ret + "*** Precio total: $" + precioTotal+" ***";

		return _ret;
	}

	
	//Modificado por nahuel revollo
	
	public String toString2() {

		String _ret = "Venta - Factura \n" + 
		"Nro de venta:" + nroUnicoDeVenta + "\n" +
		"Cliente: "+ cliente.getApellido() + ", " + cliente.getNombre() + ".\n" + 
		"Fecha: " + fechaDeVenta + "\n"+ 
		"--------------------------- \n"+
		"Entradas adquiridas: \n";

		_ret = _ret + entradaTreeListToString()+"\n";
		_ret =_ret + "-------------------------------------\n";
		_ret = _ret + "*** Precio total: $" + precioTotal+" ***";

		return _ret;
	}
	
	
	//fin de la modificacion de nahuel revollo
	
	@Override
	public int compareTo(Venta o) {
		// TODO Auto-generated method stub
		
		if (o.getNroUnicoDeVenta() == this.nroUnicoDeVenta)
			return 0;
		if (o.getNroUnicoDeVenta()< this.nroUnicoDeVenta) {
			return 0;
		}
			
		return 1;
		
	}

}
