package javaCrazyBook;

import java.util.Objects;

/**
 * 7.3.2
 * @author eli
 *
 */
public class ObjectsTest {
	static ObjectsTest obj;
	public static void main(String[] args) {
		//输出一个null对象的hashcode值
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString()
		System.out.println(Objects.toString(obj));
		/*
		 * 要求obj不能为null，否则引发异常,主要对方法的形参进行输入校验
		 * 当传入的参数不为null时返回参数本身，为null时印发异常
		 */
		System.out.println(Objects.requireNonNull(obj));
	}

}
