package itdrrile.test.design.inheritance;

import org.junit.Test;

import itdrrile.design.inheritance.ItdrrileGrandson;
import itdrrile.design.inheritance.ItdrrileParent;


public class ItdrrileInheritanceTest {

	@Test
	public void testParentShowName() {
		new ItdrrileParent().showName();
	}

	@Test
	public void testGrandsonShowName() {
		new ItdrrileGrandson().showName();
	}
	
	@Test
	public void testOnlyGrandParent() {
		new ItdrrileParent().onlyGrandParent();
		System.out.println("============================");
		new ItdrrileGrandson().onlyGrandParent();
	}
}
