package com.jenny.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-14 下午2:46
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    private static int cnt = 0;

    @RequestMapping("add")
    public void add() {
        Student usr = new Student();
        usr.setName("jzz" + (cnt++));
        usr.setAge(5);
        studentRepository.save(usr);
    }

    @RequestMapping("queryAll")
    public List<Student> queryAll() {
        List<Student> list = new ArrayList<Student>();
        list = studentRepository.findAll();
        return list;
    }


}
