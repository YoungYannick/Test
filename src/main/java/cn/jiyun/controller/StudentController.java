package cn.jiyun.controller;

import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;


    @RequestMapping("findByLimit")
    public Page<Student> findByLimit(Integer pageNum, Integer pageSize,@RequestBody Student student) {
        Page<Student> page = studentService.findByLimit(pageSize,pageNum,student);
        return page;
    }
}
