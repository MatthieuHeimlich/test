package util;



import org.junit.Test;

import junit.framework.TestCase;
import view.QuizPaneControll;

public class QuizPaneControllTest extends TestCase {

	boolean statusTest;
	String resultTest;
	String correctAnswerTest;	



	@Test
	public void test() {
		resultTest = "black";
		correctAnswerTest = "black";
		assertTrue(QuizPaneControll.verification(resultTest, correctAnswerTest));
		resultTest = "white";
		correctAnswerTest = "black";
		assertFalse(QuizPaneControll.verification(resultTest, correctAnswerTest));
	}

}
