package model.data_structures;

/**
 * Abstract Data Type for a linked list of generic objects
 * This ADT should contain the basic operations to manage a list
 * add, addAtEnd, AddAtK, getElement, getCurrentElement, getSize, delete, deleteAtK
 * next, previous
 * @param <T>
 */
public interface ILinkedList<T> extends Iterable<T> {

	Integer getSize();
	void add( T element);
	void addAtK(T element,int i);
	void addAatEnd(T element);
	T getElement(int i);
	T getCurrentElement();
	void delete();
	void deleteAtK(int i);
	T next();
	T previous();
}
