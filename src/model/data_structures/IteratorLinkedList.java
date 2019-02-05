package model.data_structures;

import java.io.Serializable;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class IteratorLinkedList<T> implements ListIterator<T> , Serializable{

	private static final long serialVersionUID = 57L;
	
	private Node<T> previous;
	private Node<T> act;
	
	
	public IteratorLinkedList (Node<T> node)
	{
		act= node;
		previous= null;
	}
	@Override
	public void add(T arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return act!=null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return previous!=null;
	}

	@Override
	public T next()  throws NoSuchElementException {
		T retorno= null;
		if (hasNext()==false)
		{
			throw new NoSuchElementException ("El elemento no existe");
		}else {
			Node<T> I = act; 
			Node<T> next= (Node<T>) act.darSiguiente();
			retorno = act.darElement();
			act= next;
			previous= act;
		}
		
			
		return retorno;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(T arg0) {
		// TODO Auto-generated method stub
		
	}

}
