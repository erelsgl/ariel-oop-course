package lesson9.stacks;

import java.util.ArrayList;

/**
 * A WRONG way to define a stack.
 * It is wrong to use INHERITANCE here, 
 * since a stack is NOT an ArrayList.
 * For a better way, see Stack1.
 *
 * @author erelsgl
 *
 * @param <T>
 */
public class Stack0<T> extends ArrayList<T> {
	public void push (T item) {
		super.add(item);
	}
	
	public T pop() {
		return remove(size()-1);
	}
}
