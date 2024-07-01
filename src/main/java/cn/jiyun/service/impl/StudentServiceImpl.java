package cn.jiyun.service.impl;

import cn.jiyun.mapper.StudentMapper;
import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Page<Student> findByLimit(Integer pageSize, Integer pageNum, Student student) {
        Page<Student> studentPage = new Page<>(pageNum, pageSize);
        List<Student> list=studentMapper.findByLimit(studentPage,student);
        studentPage.setRecords(list);
        return studentPage;
    }
}
