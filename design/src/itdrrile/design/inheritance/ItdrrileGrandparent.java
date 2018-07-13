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
		System.out.println(this); // 这里得this对象指的是调用该方法对应得那个对象，不是指的爷爷的对象
		this.showAge();
	}
}
