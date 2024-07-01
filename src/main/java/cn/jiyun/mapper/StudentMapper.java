package cn.jiyun.mapper;

import cn.jiyun.pojo.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {
    List<Student> findPage(@Param("student") Student student, Page<Student> studentPage);
}
