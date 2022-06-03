package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.Student;
import com.xyha.student_manager.mapper.StudentMapper;
import com.xyha.student_manager.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xyha
 * @since 2022-06-03
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
