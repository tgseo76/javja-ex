package collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> student = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        student = names.names();
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList() {
        return this.student;
    }
}
