package itdrrile.test.design.polymorphism;

import org.junit.Test;

import itdrrile.design.inheritance.ItdrrileGrandparent;
import itdrrile.design.inheritance.ItdrrileGrandson;
import itdrrile.design.inheritance.ItdrrileParent;

/**
 * java多态测试
 * 
 * @author itdrrile
 *
 */
public class ItdrrilePolymorphismTest {

	/**
	 * 多态中父类的引用指向子类的对象，引用的类型为子类的Class类型，引用调用的方法为对应子类的
	 */
	@Test
	public void testPolymorphism() {
		ItdrrileGrandparent grandparent = new ItdrrileParent();
		ItdrrileGrandparent _grandparent = new ItdrrileGrandson();

		System.out.println(grandparent);
		System.out.println(_grandparent);

		grandparent.onlyGrandParent();
		_grandparent.onlyGrandParent();

	}

}
