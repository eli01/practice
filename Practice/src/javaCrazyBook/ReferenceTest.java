package javaCrazyBook;

import java.lang.ref.WeakReference;

/**
 * 对象的软/弱/虚引用
 * @author eli
 */
public class ReferenceTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String str =  new String("疯狂java讲义");
		WeakReference wr = new WeakReference(str);//创建一个软引用引用刚刚创建的字符串对象
		str = null;
		System.out.println(wr.get());//取出弱引用引用的对象
		System.gc();//强制进行垃圾回收
		System.runFinalization();//强制调用可恢复对象的finalize()方法
		System.out.println(wr.get());//看看是否还能取出
	}

}
