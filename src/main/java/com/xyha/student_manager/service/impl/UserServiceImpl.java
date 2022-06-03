package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.User;
import com.xyha.student_manager.mapper.UserMapper;
import com.xyha.student_manager.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
