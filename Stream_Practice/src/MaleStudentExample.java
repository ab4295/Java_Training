import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args)
	{
		List<Student> totalList = Arrays.asList(
				new Student("Chayo1",10,Student.Sex.MALE),
				new Student("Chayo2",20,Student.Sex.FEMALE),
				new Student("Chayo3",30,Student.Sex.MALE),
				new Student("Chayo4",40,Student.Sex.FEMALE),
				new Student("Chayo5",50,Student.Sex.MALE));
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(
						()->new MaleStudent(),
						(r,t)->((MaleStudent) r).accumulate(t),
						(r1,r2)->r1.combine(r2));
		
		/* */
		maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));
	}
}
