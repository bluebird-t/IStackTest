package stack;

public class StackEmptyException extends Exception {

	public StackEmptyException(String msg) {
		super(String.format("Stack is empty", msg));
	}
}
