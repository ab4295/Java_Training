import java.util.Arrays;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores;
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult,int[] scores,Car car)
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.scores = scores;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Member cloned = (Member)super.clone(); /* 얕은 복사 실시, super.clone()은 Object의 clone 호출. */
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); /* scores 깊은 복사 실시 */
		cloned.car = new Car(this.car.model); /* Car깊은 복사 실시 */
		return cloned;
	}
	public Member getMember()
	{
		Member cloned = null;
		try {
			cloned = (Member)clone(); /* clone메소드의 return 타입은 Object이므로 Member 타입으로 캐스팅하장 */
		} catch(CloneNotSupportedException e) {}
		return cloned;
	}
}

/*{ public String id;
public Member(String id) {
	this.id = id;
}
*/
/*@Override
public boolean equals(Object obj)
{
	if(obj instanceof Member)*/ /* 매개 변수가 Member값인지 확인 */
	/*{
		Member member = (Member)obj;*/ /* member type으로 강제 변환 */
		/*if(id.equals(member.id)){
			return true;
		}
	}
	return false;
}
@Override
public int hashCode() {
	return id.hashCode();*/ /*id가 동일한 문자열인 경우 같은 해시코드를 리턴.*/
/*}
}*/
