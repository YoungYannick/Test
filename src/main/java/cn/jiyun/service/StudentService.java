package cn.jiyun.service;

import cn.jiyun.pojo.Student;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface StudentService extends IService<Student> {
    Page<Student> findByLimit(Integer pageSize, Integer pageNum, Student student);
}
