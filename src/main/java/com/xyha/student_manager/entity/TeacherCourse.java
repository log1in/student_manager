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
public class TeacherCourse {

    private static final long serialVersionUID = 1L;

    private String term;

    private Integer studentNumber;

    private Integer courseId;

    private Integer teacherId;

    private Integer timeId;

    private Integer classroomId;


}
