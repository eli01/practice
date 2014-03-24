package javaCrazyBook;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random rand = new Random();//默认以当前时间作为种子
		rand.nextBoolean();//随机返回true或false
		
		byte[] buffer = new byte[16];//16 x 8 bits
		rand.nextBytes(buffer);//给buffer数组每个元素一个随机值
		System.out.println(Arrays.toString(buffer));
		
		rand.nextFloat();//生成0.0-1.0之间的伪随机float值
		
		rand.nextDouble();//生成0.0-1.0之间伪随机double值
		
		rand.nextGaussian();//生成平均值是0.0，标准差是1.0的伪高斯值
		
		rand.nextInt(26);//生成0-26之间的伪随机数
		
		rand.nextLong();//生成一个处于long整数取值范围内的伪随机数
	}

}
