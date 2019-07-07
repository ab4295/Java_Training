
public class MemberExample {
	public static void main(String[] args)
	{
		Member original1 = new Member("blue","Chayo","12345",25,true,new int[] {90,90},new Car("K5"));
		
		Member cloned = original1.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "K9";
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		System.out.print("scores: {");
		for(int i = 0;i<cloned.scores.length;i++)
		{
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original1.id);
		System.out.println("name: " + original1.name);
		System.out.println("password: " + original1.password);
		System.out.println("age: " + original1.age);
		System.out.println("adult: " + original1.adult);
		System.out.print("scores: {");
		for(int i = 0;i<original1.scores.length;i++)
		{
			System.out.print(original1.scores[i]);
			System.out.print((i==(original1.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + original1.car.model);
	}
}

	/*Member obj1 = new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	
	if(obj1.equals(obj2)) {
		System.out.println("obj1과 obj2는 동일합니다.");
	} else {
		System.out.println("obj1과 obj2는 동일하지 않습니다.");
	}
	
	if(obj1.equals(obj3)) {
		System.out.println("obj1과 obj3은 동일합니다.");
	} else {
		System.out.println("obj1과 obj3은 동일하지 않습니다.");
	}*/