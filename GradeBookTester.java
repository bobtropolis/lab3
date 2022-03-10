import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

private GradeBook score1;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		score1 = new GradeBook(5);
		
		score1.addScore(3.0);
		score1.addScore(57.0);
		
		
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		score1 =  null;
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(" 3.0 57.0".equals(score1.toString()));
		
	}

	@Test
	void testSum() {
		
		 assertEquals(60, score1.sum());
		
		
	}

	@Test
	void testMinimum() {
		assertEquals(3,score1.minimum());
	
	}

	@Test
	void testFinalScore() {
		assertEquals(57,0,score1.finalScore());
		
		
	}

}
