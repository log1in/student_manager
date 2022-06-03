package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.Class;
import com.xyha.student_manager.mapper.ClassMapper;
import com.xyha.student_manager.service.IClassService;
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
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

}
