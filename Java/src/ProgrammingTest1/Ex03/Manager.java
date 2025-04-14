package ProgrammingTest1.Ex03;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Manager {

	public static void main(String[] args) {
		String filePath = "Java\\src\\ProgrammingTest1\\Ex03\\student.txt";
		List<Student> studentList = new ArrayList<Student>();
		List<ArrayList<String>> stoken = new ArrayList<>();
		try(
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		) {
			String stu;
			int a = 0;
			while ((stu = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(stu, "/");
				ArrayList<String> col = new ArrayList<>();
				while (st.hasMoreTokens()) {
					col.add(st.nextToken());
				}
				stoken.add(a, col);
				a++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a;
		int b;
		
		for ( int i = 0; i < stoken.size(); i++) {
			Student studen = new Student();
			for (int j = 0; j < 4; j++) {
				List<String> temp = stoken.get(i);
				a = Integer.parseInt(temp.getFirst());
				b = Integer.parseInt(temp.get(2));
				studen.setNo(a);
				studen.setScore(b);
				studen.setName(temp.get(1));
				studen.setMajor(temp.getLast());
			}studentList.add(i, studen);
		}
		studentList.stream()
		.sorted(
			Comparator.comparing(Student::getScore).reversed()
			.thenComparing(Student::getNo)
			)
		
		.forEach(p->System.out.println(p));
		
		
		
	}
}
