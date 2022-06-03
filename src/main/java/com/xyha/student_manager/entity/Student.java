package com.xyha.student_manager.entity;

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
public class Student {

    private static final long serialVersionUID = 1L;

    private String name;

    private String telephone;

    private Integer userId;

    private Integer majorId;

    private Integer gradeId;

    private Integer classId;


}
