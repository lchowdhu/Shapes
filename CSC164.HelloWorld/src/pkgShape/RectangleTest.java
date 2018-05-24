package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	void RectangleTestArea() {
		int iWidth=10;
		int iLength=20;
		double dPerameter= 60;
		double dArea= 200;
		
	Rectangle rec1 = new Rectangle (iWidth, iLength);
	assertEquals(dArea, rec1.Area(),0.01);
	assertEquals(dPerameter, rec1.Perameter(),0.01);
	}
}
