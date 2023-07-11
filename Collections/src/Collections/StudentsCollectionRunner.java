package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students=List.of(new Student(1,"Kalash"),
				new Student(100, "Adam"), new Student(2, "Eve"));
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(students);

		Collections.sort(studentsAl);
		System.out.println("Des " + studentsAl);

//		Collections.sort(studentsAl, new AscendingStudentComparator());
//		System.out.println("AscendingStudentComparator " + studentsAl);

		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);
	}

}
