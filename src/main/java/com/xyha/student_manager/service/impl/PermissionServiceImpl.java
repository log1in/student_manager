package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.Permission;
import com.xyha.student_manager.mapper.PermissionMapper;
import com.xyha.student_manager.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
