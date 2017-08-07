package gradleTry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradleTryTest {

	GradleTry babysitter;
	
	@Before
	public void setUp() {
		babysitter = new GradleTry();
	}
	
	@Test
	public void whenHoursBeforeBedtimeIsPassedANumberItReturnsThatNumber() {
        assertEquals(1, babysitter.hoursBeforeBedtime(1));
    }

}
