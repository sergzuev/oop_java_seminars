package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * К коду с семинара добаить класс Teacher и возможность итерации и компорации для него. 
 * Так же для учебной группы добавить преподавателя
 *  (У группы может быть только один преподаватель, у проподавателя сколько угодно групп)
 */

public class main {
    public static void main(String[] args) {

        Map<Integer, List<Student>> groups = new TreeMap<>();

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Иван", "Петров", 1));
        teachers.add(new Teacher("Надежда", "Петрова", 2));
        teachers.add(new Teacher("Светлана", "Дурова", 3));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Хазов", 5, 3));
        students.add(new Student("МИхаил", "Зуев", 4, 1));
        students.add(new Student("Илья", "Дрон", 4, 2));
        students.add(new Student("Кати", "Мишина", 3, 3));
        students.add(new Student("Влад", "Листьев", 5, 2));
        students.add(new Student("Маша", "Русакова", 4, 2));

        TeacherGroupIterator iterTeacher = new TeacherGroupIterator(teachers);
        while (iterTeacher.hasNext()) {
            Teacher teacher = iterTeacher.next();
            StudentsGroupIterator iterStudent = new StudentsGroupIterator(students);
            List<Student> listStudentGroup = new ArrayList<>();
            while (iterStudent.hasNext()) {
                Student student = iterStudent.next();
                if (student.getTeacherId() == teacher.getId()) {
                    listStudentGroup.add(student);
                }
                groups.put(teacher.getId(), listStudentGroup);
            }
        }
        for (int i : groups.keySet()) {
            System.out.printf("Преподаватель id %d: \n%s", i, groups.get(i));
            System.out.printf("\nПреподаватель id %d : кол-во: %d\n", i, groups.get(i).size());
            System.out.println();
            System.out.println();
        }
    }
}