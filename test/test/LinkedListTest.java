package test;

import junit.framework.TestCase;
import model.data_structures.LinkedList;

public class LinkedListTest extends TestCase  {
	
	private int a,b,c,d,e,f,g;
	private LinkedList<Integer> arreglo ; 
	
	private void setupEscenario1( ){
		arreglo = new LinkedList<Integer>();
		a=1;
		b=41;
		c=521;
		d=63;
		e=254;
		f=75;
		g=345;
		arreglo.add(a);
		arreglo.add(b);
		arreglo.add(c);
		arreglo.add(d);
		arreglo.add(e);
		arreglo.add(f);
	}
	
	public void testCrearArreglo()
	{
		setupEscenario1();
		assertEquals (a,arreglo.getElement(5).intValue());
	}
	
	public void testTamano(){
		setupEscenario1();
		assertEquals (arreglo.getSize().intValue(),6);
		
	}
	
	public void testAgregar(){
		setupEscenario1();
		arreglo.add(35);
		assertEquals(arreglo.getElement(0).intValue(),35);
	}
	public void testAgregarAtK()
	{
		setupEscenario1();
		Integer jk= 12;
		arreglo.addAtK(jk, 1);
		assertEquals(arreglo.getSize().intValue(),7);
		
		
	}
	public void testEliminar()
	{
		setupEscenario1();
		int tamano = arreglo.getSize();
		arreglo.delete();
		assertEquals(arreglo.getSize().intValue(),tamano-1);
		
	}
	
	
}
