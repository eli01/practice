package javaCrazyBook;
/**
 * 7.3.1
 * @author eli
 *
 */
public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User(10);
		User u2 = u1.clone();
		System.out.println("u1 == u2?" + (u1 == u2));
		System.out.println(u1.address == u2.address);
	}

}

class Address {
	String detail;
	public Address(String detail) {
		this.detail = detail;
	}
}

//实现Cloneable接口
class User implements Cloneable {
	int age;
	Address address;
	public User(int age) {
		this.age = age;
		address = new Address("北京昌平");
	}
	
	//实现clone()方法
	public User clone() throws CloneNotSupportedException {
		return (User)super.clone();//这里super相当于((Object)this),结果就是调用了Object的clone()方法
	}
	

}
