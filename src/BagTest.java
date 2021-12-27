import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BagTest
{

	static Bag b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		b = new Bag();
	}

	@Test
	void testAdd()
	{
		Random rand = new Random();

		for (int i = 0; i < 10; i++)
		{
			int item = rand.nextInt();

			b.add(item);
			assertTrue(b.contains(item));
		}
		assertTrue(b.size() == 10);
	}

}
