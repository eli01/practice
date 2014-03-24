package javaCrazyBook;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author eli
 *
 */

public 
class ScannerTest {
	private Scanner sc =new Scanner(System.in);//将键盘输入作为输入源
	
	/**
	 * 测试Scanner从键盘读取键盘输入
	 */
	private void testString() {
		//sc.useDelimiter("\n");//把回车作为作为分隔符,默认用空白作为分隔符
		String temp = null;
		while(sc.hasNext()) {
			if((temp = sc.next()).equals("a")) {
				System.out.println("结束输入！");
				//break;
			}
			System.out.println("键盘输入的内容是：" + temp);
		}
	}
	
	/**
	 * 测试Scanner从键盘读取Long类型字符
	 * @param args
	 */
	private void testLong() {
		while(sc.hasNextLong()) {
			System.out.println(sc.nextLong() + " ");
		}
	}
	
	/**
	 * 将文件作为输入源
	 */
	private void testFile() {
		Scanner scfile = null;
		try {
			scfile = new Scanner(new File("files/使用说明.txt"));
			while(scfile.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("找不到文件！");
		} finally {
			if(scfile != null) sc.close();
		}
	}
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		//st.testString();
		//st.testLong();
		st.testFile();
	}
}
