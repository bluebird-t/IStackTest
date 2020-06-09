package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IStackTest {

	@Test
	void testIsEmpty() {
		IStack stack = new IStack();
		assertTrue(stack.isEmpty());
		stack.push("fish");
		assertFalse(stack.isEmpty());
	}

	@Test
	void testPush() {
		IStack stack = new IStack();
		stack.push("duck");
		assertFalse(stack.isEmpty());
	}

	@Test
	void testPop() throws StackEmptyException {
		IStack stack = new IStack();
		Throwable exception = assertThrows(StackEmptyException.class, () -> stack.pop());
        assertEquals("Stack is empty", exception.getMessage());
        
        stack.push("fish");
        stack.pop();
        assertTrue(stack.isEmpty());
        
        stack.push("fish");
        stack.push("duck");
        assertEquals(stack.pop(),"duck");
        assertEquals(stack.peek(), "fish");
	}

	@Test
	void testClear() {
		IStack stack = new IStack();
		stack.push("fish");
        stack.push("duck");
        stack.clear();
        assertTrue(stack.isEmpty());
	}

	@Test
	void testContain() {
		IStack stack= new IStack();
		stack.push("fish");
        stack.push("duck");
        stack.push("mouse");
        stack.push("bird");
        assertTrue(stack.contain("fish"));
        assertTrue(stack.contain("bird"));
        assertTrue(stack.contain("duck"));
        assertFalse(stack.contain("chicken"));
	}

	@Test
	void testPeek() {
		IStack stack = new IStack();
		assertNull(stack.peek());
		stack.push("fish");
        stack.push("duck");
        stack.push("mouse");
        stack.push("bird");
        assertEquals(stack.peek(), "bird");
        
         stack.clear();
         stack.push("fish");
         assertEquals(stack.peek(), "fish");
         
	}

}
