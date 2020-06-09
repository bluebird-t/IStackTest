package stack;

import java.util.ArrayList;
import java.util.List;

public class IStack {
	private List<String> stack = new ArrayList<String>();
	public boolean isEmpty() {
		if(stack.size() == 0)
			return true;
		return false;
	}
	public void push(String value) {
		stack.add(value);
	}
	public String pop() throws StackEmptyException {
		if(stack.isEmpty())
			throw new StackEmptyException("Error");
		int top = stack.size() -1;
		String value = stack.get(top);
		stack.remove(top);
		return value;
	}
	public boolean clear() {
		return stack.removeAll(stack);
	}
	public boolean contain(String value) {
		return stack.contains(value);
	}
	public String peek() {
		return isEmpty() ? null : stack.get(stack.size()-1);
	}
}
