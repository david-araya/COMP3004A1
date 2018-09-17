package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	Deck card 
	
	public void testScore() {
		ArithmeticSolver solver = new ArithmeticSolver();

		assertEquals(4.0, solver.add(2, 2)); // 2 + 2 = 4
	}

}
