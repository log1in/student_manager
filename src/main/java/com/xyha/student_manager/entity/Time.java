package com.xyha.student_manager.entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xyha
 * @since 2022-06-03
 */
@Data
@EqualsAndHashCode()
public class Time  {

    private static final long serialVersionUID = 1L;

    private Integer week;

    private LocalDateTime timeStart;

    private LocalDateTime timeEnd;

    private Integer year;


}
