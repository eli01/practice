package javaCrazyBook;
/**
 * 7.3.3
 * @author eli
 *
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//追加字符串
		sb.append("java");//sb = "java"
		sb.insert(0, "hello ");//sb = "hello java"
		sb.replace(5, 6, ",");//sb = "hello,java"
		sb.delete(5, 6);//sb = "hellojava"
		System.out.println(sb);
		sb.reverse();//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());//9
		System.out.println(sb.capacity());//16
		sb.setLength(5);//sb = "avajo"
		System.out.println(sb);
	}
}
