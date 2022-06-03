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
public class Course {

    private static final long serialVersionUID = 1L;

    private String name;

    private String period;

    private Integer credit;

    /**
     * 0必修1选修
     */
    private Integer required;

    private Integer academyId;


}
