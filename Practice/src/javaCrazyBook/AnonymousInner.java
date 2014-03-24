package javaCrazyBook;
/**
 * 测试匿名内部类
 * @author eli
 *
 */
public class AnonymousInner {
	public void test(Device d) {
		System.out.println("够买了一个" + d.getName()
							+ "花掉了" + d.getPrice());
	}
	 public static void main(String[] args) {
		 AnonymousInner ai = new AnonymousInner();
		 ai.test(new Device("电子示波器") {
			 public double getPrice() {
				 return 67.8;
			 }
		 });
		 
		 //调用无参数的构造器成创建Device匿名实现类的对象
		 Device d =  new Device() {
			 //初始化块
			 {
				 System.out.println("匿名内部类初始化块...");
			 } 
			 //实现抽象方法
			 public double getPrice() {
				 return 55;
			 }
			 //重写父类方法
			 public String getName() {
				 return "键盘";
			 }
			 
		 };
		 ai.test(d);
	 }
}

abstract class Device {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double getPrice();
	
	public Device() {
		
	}
	public Device(String name) {
		this.name = name;
	}
}
