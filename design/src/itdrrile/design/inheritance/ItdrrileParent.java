package itdrrile.design.inheritance;

/**
 * java继承：爸爸
 * 
 * @author itdrrile
 *
 */
public class ItdrrileParent extends ItdrrileGrandparent {

	public ItdrrileParent() {
		System.out.println("构造了爸爸！！！！");
	}

	@Override
	public void showName() {
		System.out.println("我是爸爸！！！名字叫张翠山");
	}

	@Override
	public void showAge() {
		System.out.println("我是爸爸！！！也50多了");
	}

}
