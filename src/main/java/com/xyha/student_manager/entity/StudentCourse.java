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
public class StudentCourse {

    private static final long serialVersionUID = 1L;

    private Integer studentId;

    private Integer teacherCourseId;

    /**
     * 0初修1补考2缓考3重修
     */
    private Integer status;

    private Integer scoreId;


}
