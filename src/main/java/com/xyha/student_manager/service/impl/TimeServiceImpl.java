package com.xyha.student_manager.service.impl;

import com.xyha.student_manager.entity.Time;
import com.xyha.student_manager.mapper.TimeMapper;
import com.xyha.student_manager.service.ITimeService;
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
public class TimeServiceImpl extends ServiceImpl<TimeMapper, Time> implements ITimeService {

}
