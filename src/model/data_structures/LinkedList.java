package model.data_structures;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> , ILinkedList<T>{

	private Node<T> cabeza;
	private int size;
	private Node<T> actual;


	public LinkedList()
	{
		cabeza = null;
		size = 0;
		actual=null;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Integer getSize() {

		return size;
	}

	
	public void add(T element) {
		if (size==0)
		{
			cabeza= (Node<T>)element;
			actual= cabeza;
		}
		else {
			Node<T> nuevo = (Node<T>) element;
			cabeza.cambiarAnterior(nuevo);
			nuevo.cambiarSiguiente(cabeza);

			cabeza = nuevo;
		}
		size ++;
	}

	
	public void addAatEnd(T element) {
		if (size==0)
		{
			cabeza = (Node<T>) element;
		}
		else {
			Node<T> act = cabeza;
			Node<T> anterior= null;
			while (act.darSiguiente()!=null)
			{
				anterior=act;
				act=act.darSiguiente();
			}
			anterior.cambiarSiguiente((Node<T>)element);
		}

	}

	
	public T getElement(int i) {
		Node<T> retorno = null;
		if (size == 0)
		{
			return (T)retorno ;
		}
		else if (i==1)
		{
			retorno = cabeza;
		}
		else {
			int index= 0;
			for (Node<T> n = cabeza; n!=null;n=n.darSiguiente())
			{
				index++;
				if (index==i)
				{
					retorno = n;
				}
			}
		}
		return (T) retorno ;
	}

	public T getCurrentElement() {

		return actual.darElement() ;
	}

	
	public void delete() {
		if (size!=0)
		{
			if (size==1)
			{
				cabeza=null;
			}
			else {
				Node<T> x= cabeza;

				cabeza= cabeza.darSiguiente();
				x.cambiarSiguiente(null);
			}


		}

	}

	
	public void deleteAtK(int i) {
		if (size !=0)
		{
			if (i==1)
			{
				cabeza.darSiguiente().cambiarAnterior(null);
				cabeza=cabeza.darSiguiente();
			}
			else {
				int index = 0;

				for (Node<T> n = cabeza; n!=null; n = n.darSiguiente())
				{
					index++;
					if (index==i)
					{
						n.darSiguiente().cambiarAnterior(n.darAnterior());
						n.darAnterior().cambiarSiguiente(n.darSiguiente());
						n.cambiarAnterior(null);
						n.cambiarSiguiente(null);
					}
				}
			}


		}

	}

	
	public T next() {
		actual =(actual.darSiguiente()!=null)? actual.darSiguiente():actual;
		return (T)actual;
	}

	
	public T previous() {
		actual =(actual.darAnterior()!=null)? actual.darAnterior():actual;
		return (T) actual;
	}

	
	public void addAtK(Object element,int i) {
	if (size !=0)
	{
		if (i ==1 )
		{
			Node<T> nuevo = (Node<T>) element;
			nuevo.cambiarSiguiente(cabeza);
			cabeza.cambiarAnterior(nuevo);
			cabeza=nuevo;
		}
		else {
			Node<T> nuevo = (Node<T>) element;
			int index= 0;
			for (Node<T> n = cabeza; n !=null; n = n.darSiguiente())
			{
				index++;
				if (index==i)
				{
					nuevo.cambiarSiguiente(n);
					nuevo.cambiarAnterior(n.darAnterior());
					n.cambiarAnterior(nuevo);
				}
			}
		}
	}
		
	}


}
