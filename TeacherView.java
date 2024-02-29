import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teacher) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(TeacherGroup teacherGroup){
        logger.info(teacherGroup.toString());
    }
}
