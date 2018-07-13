package itdrrile.test.jdk.v8.lang.importance;

import java.io.Serializable;

import org.junit.Test;

import itdrrile.jdk.v8.lang.importance.ItdrrileClass;
import itdrrile.jdk.v8.lang.importance.ItdrrileObject;

/**
 * 
 * 测试 java.lang.Class
 * @author itdrrile
 *
 */
public class ClassTest {
	
	/**
	 * 测试Class构造函数
	 */
	@Test
	public void testConstructor() {
		/*Class类中构造函数被private修饰，Class对象是在加载类时由 Java虚拟机以及通过调用类加载器中的 defineClass方法自动构造的*/
		// new Class(); // The constructor Class() is not visible
	}
	
	/**
	 * 测试toString()方法，重写了Object的toString方法
	 */
	@Test
	public void testToString() {
		/*interface*/
		System.out.println(Serializable.class.toString()); // interface java.io.Serializable
		/*base type*/
		System.out.println(int.class.toString()); // int
		/*other class*/
		System.out.println(Object.class.toString()); // class java.lang.Object

	}

	/**
	 * 测试forName()方法
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testForName() throws ClassNotFoundException {
		/*使用类或接口的完全限定名，默认初始化类的static模块*/
		Class<?> clazz = Class.forName("itdrrile.jdk.v6.lang.importance.ItdrrileClass");
		System.out.println("clazz==" + clazz.toString());
		System.out.println(ItdrrileClass.init);
	}
	
	/**
	 * 测试forName(String name, boolean initialize, ClassLoader loader)方法
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testForName1() throws ClassNotFoundException {
		/*第二个参数initialize表示是否初始化static成员变量、static块、static方法，false代表不进行初始化*/
		Class<?> clazz1 = Class.forName("itdrrile.jdk.v6.lang.importance.ItdrrileClass", false,
				Thread.currentThread().getContextClassLoader());
		System.out.println("clazz1==" + clazz1.toString());
		System.out.println(ItdrrileClass.init);
	}
	
	/**
	 * 测试newInstance()方法：newInstance方法仅使用无参构造创建对象
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void testNewInstance() throws InstantiationException, IllegalAccessException {
		ItdrrileClass itdrrile = new ItdrrileClass();
		ItdrrileClass _itdrrile = itdrrile.getClass().newInstance();
		System.out.println("itdrrile.toString -> " + itdrrile.toString());
		System.out.println("_itdrrile.toString -> " + _itdrrile.toString());
		
		Class<ItdrrileClass> itdrrile1 = ItdrrileClass.class;
		ItdrrileClass _itdrrile1 = itdrrile1.newInstance();
		System.out.println("itdrrile1.toString -> " + itdrrile1.toString());
		System.out.println("_itdrrile1.toString -> " + _itdrrile1.toString());
	}
	
	
	/**
	 * 测试isInstance(Object obj)方法：判断obj对象是否为给定的class对象的一个实例，是instanceof运算符的动态等效方法
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void testIsInstance() throws InstantiationException, IllegalAccessException {
		ItdrrileClass itdrrile = new ItdrrileClass();
		boolean isInstance = ItdrrileClass.class.isInstance(itdrrile);
		System.out.println(isInstance);
		
		boolean insof = itdrrile instanceof ItdrrileClass;
		System.out.println(insof);
	}
	
	/**
	 * 测试isAssignableFrom(Class<?> cls)方法：判断cls对象是否可转化为给定类型的对象
	 */
	@Test
	public void testIsAssignableFrom() {
		ItdrrileClass itdrrile = new ItdrrileClass();
		boolean isSameClass = ItdrrileClass.class.isAssignableFrom(itdrrile.getClass());
		boolean _isSameClass = ItdrrileObject.class.isAssignableFrom(itdrrile.getClass());
		boolean isSuperClass = Object.class.isAssignableFrom(itdrrile.getClass());
		boolean _isSuperClass = ItdrrileClass.class.isAssignableFrom(Object.class);
		System.out.println(isSameClass); // true 可转化为相同类型的对象
		System.out.println(_isSameClass); // false 不可转化为其它不同类型的对象
		System.out.println(isSuperClass); // true 可转化为超类类型的对象（向上转化）
		System.out.println(_isSuperClass); // false 不可转化为其子类类型的对象（不能向下转化）
	}
		
}
