package javaCrazyBook;

import java.math.BigDecimal;

/**
 * 7.3.6.2
 * @author eli
 *
 */
public class Arith {

	public static void main(String[] args) {
		System.out.println(Arith.add(3.4, 3.7));
		System.out.println(Arith.sub(0.1, 0.1));
		System.out.println(Arith.mul(0.006, 0.01));
		System.out.println(Arith.div(5, 4));
	}
	
	//默认除法计算精度
	private static final int DEF_DIV_SCALE = 10;
	
	//构造器器私有，让这个类不能实例化
	private Arith() {}
	
	/**
	 * 提供精确的加法运算
	 * @param v1 被加数
	 * @param v2 加数
	 * @return 两个参数的和
	 */
	public static double add(double v1, double v2) {
		return BigDecimal.valueOf(v1).add(BigDecimal.valueOf(v2)).doubleValue();
	}
	
	/**
	 * 提供精确的减法运算
	 * @param v1 被减数
	 * @param v2 减数
	 * @return 两个参数的差
	 */
	public static double sub(double v1, double v2) {
		return BigDecimal.valueOf(v1).subtract(BigDecimal.valueOf(v2)).doubleValue();
	}
	
	/**
	 * 提供精确的乘法运算
	 * @param v1 被乘数
	 * @param v2 乘数
	 * @return 两个参数的积
	 */
	public static double mul(double v1, double v2) {
		return BigDecimal.valueOf(v1).multiply(BigDecimal.valueOf(v2)).doubleValue();
	}
	
	/**
	 * 提供相对精确的除法运算
	 * @param v1 被除数
	 * @param v2 除数
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2) {
		return BigDecimal.valueOf(v1).divide(BigDecimal.valueOf(v2), DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
}
