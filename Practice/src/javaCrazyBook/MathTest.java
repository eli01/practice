package javaCrazyBook;
/**
 * 7.3.4
 * @author eli
 *
 */
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*三角函数运算*/
		Math.toDegrees(1.57);//将弧度转换为角度
		Math.toRadians(90);//将角度转换成弧度
		
		Math.acos(1.2);//计算反余弦，返回的角度在0.0带PI之间
		Math.asin(0.8);//计算反正弦，返回的角度在-pi/2到pi/2之间
		Math.atan(2.3);//计算反正切，返回的角度在-pi/2到pi/2之间
		
		Math.cos(1.57);//计算三角余弦
		Math.cosh(1.2);//计算双曲余弦
		Math.sin(1.57);//计算正弦
		Math.sinh(1.2);//计算双曲正弦
		Math.tan(0.8);//计算三角正切
		Math.tanh(2.1);//计算双曲正切
		
		Math.atan2(0.1, 0.2);//将矩形坐标转换成极坐标
		
		/*取整运算*/
		Math.floor(-1.2);//取整，返回小于目标数的最大整数
		Math.ceil(1.2);//取整，返回大于目标数的最小整数
		Math.round(2.3);//取整，四舍五入
		
		/*乘方、开方、指数运算*/
		Math.sqrt(2.3);//计算平方根
		Math.cbrt(9);//计算立方根
		Math.exp(2);//e的n次幂
		Math.hypot(4, 4);//返回sqrt(x2 + y2),没有中间溢出或下溢
		Math.IEEEremainder(5, 2);//按照IEEE 754标准，对两个参数进行余数运算
		Math.pow(3, 2);//计算乘方
		Math.log(12);//计算自然对数
		Math.log10(9);//计算底数为10的对数
		Math.log1p(9);//返回参数与1之和的自然对数
		
		/*符号相关的运算*/
		Math.abs(-4.5);//计算绝对值
		Math.copySign(1.2, -1);//符号赋值，返回带有第二个参数符号的第一个参数
		Math.signum(2.3);//付爱红函数，0返回0，大于0返回1.0，小于0返回-1.0
		
		/*大小相关的运算*/
		Math.max(2.3, 2.5);//找出最大值
		Math.min(1.2, 4.2);//找出最小值
		Math.nextAfter(1.2, 1.0);//返回两个参数之间与第一个参数相邻的浮点数
		Math.nextUp(1.2);//返回比目标数略大的浮点数
		Math.random();//返回一个伪随机数，在0.0至1.0之间
	}

}
