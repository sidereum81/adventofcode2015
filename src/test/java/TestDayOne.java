import org.adventofcode.adventofcode.DayOne;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDayOne {
	@Test
	public void testCountCharacter() {
		Integer negativeLevel;
		DayOne countCharacter = new DayOne();
		negativeLevel = countCharacter.countCharacters(')', "(())");
		Integer expected = 2;
		Assert.assertEquals(negativeLevel, expected);
	}

	@Test
	public void testGetFloor1() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("()()()))");
		Double expectedResult = -2.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor2() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber(")())())");
		Double expectedResult = -3.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor3() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber(")))");
		Double expectedResult = -3.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor4() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("()()");
		Double expectedResult = 0.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor5() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("(())");
		Double expectedResult = 0.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor6() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("(()(()(");
		Double expectedResult = 3.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor7() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("(((");
		Double expectedResult = 3.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}

	@Test
	public void testGetFloor8() {
		Double floorNumber = 0.0;
		DayOne dayOne = new DayOne();
		floorNumber = dayOne.getFloorNumber("))(((((");
		Double expectedResult = 3.0;
		Assert.assertEquals(floorNumber, expectedResult);
	}
}
