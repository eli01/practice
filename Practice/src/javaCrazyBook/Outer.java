package javaCrazyBook;

public class Outer {

	private int outProp = 9;
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.accessInnerProp();
	}
	
	class Inner {
		private int inProp = outProp;//内部类直接使用外部类的Field
		public void acessOuterProp() {
			//非静态内部类可以直接访问外部类的成员
			System.out.println("外部类的rop的�?" + outProp);
		}
	}
	/**
	 * 该方法演示外部类访问内部类的Field的方�?
	 */
	public void accessInnerProp() {
		//System.out.println("内部类的inProp:" + inProp);//会报�?
		System.out.println("内部类的inProp值：" + new Inner().inProp);//必需通过内部类对象来访问
	}

}
