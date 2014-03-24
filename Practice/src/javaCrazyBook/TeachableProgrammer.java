package javaCrazyBook;
interface Teachable {
	void work();
}
class Programmer {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	public void work() {
		System.out.println(name + "在灯下认真敲键盘...");
	}
	public Programmer() {
		
	}
	public Programmer(String name) {
		this.name = name;
	}
}
public class TeachableProgrammer extends Programmer{
	//构造函数
	public TeachableProgrammer() {
		
	}
	public TeachableProgrammer(String name) {
		super(name);
	}
	//定义一个teach方法
	private void teach() {
		System.out.println(getName() + "老师在讲台上讲解...");
	}
	
	//定义一个内部类
	private class Closure implements Teachable {
		/*
		 * 非静态内部类回调外部类实现work方法，非静态内部类回调的作用仅仅是
		 * 向客户端提供一个回调外部类的途径
		 */
		public void work() {
			teach();
		}
	}
	
	/**
	 * 返回一个非静态内部类引用，允许外部类通过该非静态内部类引用来回调外部类的方法
	 * @param args
	 */
	public Teachable getCallBackReference() {
		return new Closure();
	}
	public static void main(String[] args) {
		// 示范让TeachableProgrammer对象既执行“教学”的work方法，也执行编程的work方法
		TeachableProgrammer tp = new TeachableProgrammer();
		tp.setName("eli01");
		tp.work();
		tp.getCallBackReference().work();

	}

}
