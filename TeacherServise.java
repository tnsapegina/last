import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {
    private Teacher teacher;

    public void createTeacher(Teacher teacher, List<Teacher> teachers) {
        this.teacher = new Teacher(teacher, teacher);
    }

    public Teacher getTeacher() {
        return getTeacher();
    }

    public Teacher getTeacher(String firstName, String secondName){
        Iterator<Teacher> iterator = teacher.iterator();
        List<Teacher> result = new ArrayList<>();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if(teacher.getFirstName().equalsIgnoreCase(firstName)
                    && teacher.getSecondName().equalsIgnoreCase(secondName)){
                result.add(teacher);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Учитель с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного учителя с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teacher = new ArrayList<>(teacherGroup.getTeacher());
        Collections.sort(teacher);
        return teacher;
    }

    public List<Teacher> getSortedByFIOTeacherGroup(){
        List<Teacher> students = new ArrayList<>(teacherGroup.getTeacher());
        teacher.sort(new UserComparator<Teacher>());
        return teacher;
    }
}

