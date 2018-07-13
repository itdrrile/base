package itdrrile.design.inheritance;

/**
 * java继承：孙子
 * 
 * @author itdrrile
 *
 */
public class ItdrrileGrandson extends ItdrrileGrandparent {

	public ItdrrileGrandson() {
		System.out.println("构造了孙子！！！！");
	}

	@Override
	public void showName() {
		System.out.println("我是孙子！！！名字叫张无忌");
	}

	@Override
	public void showAge() {
		System.out.println("我是孙子！！！都20了");
	}

}
