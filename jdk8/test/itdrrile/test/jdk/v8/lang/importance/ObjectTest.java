package itdrrile.test.jdk.v8.lang.importance;

import org.junit.Test;

import itdrrile.jdk.v8.lang.importance.ItdrrileObject;

/**
 * 测试Object类 
 * Object为对象的意思，其成员方法均为对象的方法（非static）
 * 
 * @author itdrrile
 *
 */
public class ObjectTest implements Cloneable{

	/**
	 * 测试hashCode()方法 主要作用是为了配合基于散列的集合一起正常运行，这样的散列集合包括HashSet、HashMap以及HashTable
	 * hashCode方法的存在是为了减少equals方法的调用次数，从而提高程序效率
	 * Java中的hashCode方法就是根据一定的规则将与对象相关的信息（比如对象的存储地址，对象的字段等）映射成一个数值，这个数值称作为散列值
	 */
	@Test
	public void testHashCode() {
		ItdrrileObject itdrrile = new ItdrrileObject();
		int hashCode = itdrrile.hashCode();
		System.out.println(hashCode); // 569951967
	}

	/**
	 * 测试equals(Object obj)方法 Object中的equals方法是用的是“==”，判断两个对象是否同一，即两个对象是否具有相同的内存地址
	 */
	@Test
	public void testEquals() {
		ItdrrileObject itdrrile1 = new ItdrrileObject();
		ItdrrileObject itdrrile2 = new ItdrrileObject();
		boolean isSame = itdrrile1.equals(itdrrile2);
		System.out.println(isSame); // false
		System.out.println(itdrrile1 == itdrrile2); // false
		System.out.println(itdrrile1.hashCode()); // 186888796
		System.out.println(itdrrile2.hashCode()); // 1418902458
	}

	/**
	 * hashCode()和equals(Object obj)方法的关系
	 * （1）两个对象的hashCode不同，则equals一定返回false（没重写equals方法）
	 * （2）不同的两个对象hashCode可能相同，hashCode值的计算与对象的相关信息有关（不一定仅仅是存储地址），因此，两个对象的hashCode相同，则equals方法不一定返回true（没重写equals方法）
	 */

	/**
	 * 测试toString()方法
	 * Object中toString()方法结果形式：对象类的全限定名+@+对象hashCode的十六进制数值
	 */
	@Test
	public void testToString() {
		ItdrrileObject itdrrile = new ItdrrileObject();
		String toString = itdrrile.toString();
		System.out.println(toString); // itdrrile.jdk.v6.lang.importance.ItdrrileObject@53c86be5
		System.out.println(itdrrile.hashCode());
		/*十六进制转十进制*/
		int res = Integer.parseInt(toString.split("@")[1], 16);
		System.out.println(res);
	}
	
	/**
	 * 测试clone()方法
	 * （1）Object的clone方法为protected修饰，因此只能子类中调用，在ObjectTest中不能使用ItdrrileObject进行测试，只能用自身测试
	 * （2）调用clone方法的对象类必须实现Cloneable接口，不然报异常CloneNotSupportedException
	 * （3）clone方法得到的对象与原对象不同，是浅克隆
	 * （4）浅克隆：被复制对象的所有变量都含有与原来的对象相同的值，而所有的【对其他对象的引用仍然指向原来的对象】。
	 * 		被克隆的类必须实现Cloneable接口
	 * （5）深克隆：被复制对象的所有变量都含有与原来的对象相同的值，那些【引用其他对象的变量将指向被复制过的新对象】，而不再是原有的那些被引用的对象。深克隆的是实现实际上是对对象的序列化和反序列化
	 * 		被克隆类以及被克隆类的引用必须实现Serializable接口
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void testClone() throws CloneNotSupportedException {
		ObjectTest test = new ObjectTest();
		ObjectTest _test = (ObjectTest) test.clone();
		
		System.out.println(test == _test);
		System.out.println(test.equals(_test));
		System.out.println(test.toString());
		System.out.println(_test.toString());
	}
	
	/**
	 * 测试finalize()方法
	 * Object中的finalize方法为protected修饰
	 * 在下面三种情况下对象不再被引用时调用finalize方法：
	 * （1）所有对象被Garbage Collection时自动调用,比如运行System.gc()的时候.
	 * （2）程序退出时为每个对象调用一次finalize方法。
	 * （3）显式的调用finalize方法
	 * 作用：Java技术允许使用 finalize方法在垃圾收集器将对象从内存中清除出去之前做必要的清理工作
	 * 		子类覆盖 finalize方法以整理系统资源或者执行其他清理工作。
	 * @throws Throwable
	 */
	@Test
	public void testFinalize() throws Throwable {
		ObjectTest test = new ObjectTest();
		new ObjectTest();
		System.gc(); // 第二个对象没有被任何引用，gc的时候调用finalize方法
		Thread.sleep(3000);
		System.out.println(test.hashCode());
		test = null;
		System.gc(); // 第一个对象的引用变为null，再gc的时候调用finalize方法
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.toString() + "is disposed!");
	}
		
}
