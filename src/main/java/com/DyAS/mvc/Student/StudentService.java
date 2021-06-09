package com.DyAS.mvc.Student;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStrundets(){
        return List.of(new Student(1L, "Jusepe"));
    }
}
