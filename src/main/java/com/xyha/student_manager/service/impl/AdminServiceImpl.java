package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.Admin;
import com.xyha.student_manager.mapper.AdminMapper;
import com.xyha.student_manager.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
