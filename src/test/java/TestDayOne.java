import org.adventofcode.adventofcode.DayOne;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDayOne {
	@Test
	public void testNegativeLevel() {
		Integer negativeLevel;
		DayOne countCharacter = new DayOne();
		negativeLevel = countCharacter.countCharacters(')', "(())");
		Integer expected = 2;
		Assert.assertEquals(negativeLevel, expected);
	}
}
