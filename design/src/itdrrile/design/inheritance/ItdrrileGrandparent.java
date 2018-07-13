package itdrrile.design.inheritance;

/**
 * java继承：爷爷
 * 
 * @author itdrrile
 *
 */
public class ItdrrileGrandparent {

	public ItdrrileGrandparent() {
		System.out.println("构造了爷爷！！！");
	}
	
	public void showName() {
		System.out.println("我是爷爷！！！名字叫张三丰");
	}
	
	public void showAge() {
		System.out.println("我是爷爷！！！已经80了");
	}
	
	public void onlyGrandParent() {
		System.out.println(this);
		this.showAge();
	}
}
