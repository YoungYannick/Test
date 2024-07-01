package cn.jiyun.controller;


import cn.jiyun.config.R;
import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("findPage")
    public Page<Student> findPage(Integer pageNum, Integer pageSize, @RequestBody Student student) {
        return studentService.findPage(pageNum,pageSize,student);
    }
    @RequestMapping("deleteById")
    public R deleteById(Integer id) {
        try {
            studentService.removeById(id);
            return R.success("删除成功");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return R.error("删除失败");
    }
}
