package javaCrazyBook;
/**
 * java疯狂讲义6.8.1：枚举类测试
 * @author eli
 */
public class SeasonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

/**
 * 编写一个枚举类
 */
class Season {
	//将season定义为不可变类，其Field也定义成final
	private final String name;
	private final String desc;
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	//定义4个静态不可变成员变量
	public static final Season SPRING = new Season("春天", "趁春踏青");
	public static final Season SUMMER = new Season("夏天", "夏日炎炎");
	public static final Season FALL = new Season("秋天", "秋高气爽");
	public static final Season WINTER = new Season("冬天", "围炉赏雪");
	
	//定义获得实例的公有方法
	public static Season getSeason(int seasonNum) {
		switch(seasonNum) {
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3:
			return FALL;
		case 4:
			return WINTER;
		default:
			return null;
		}
	}
	
	
	//构造器
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
}