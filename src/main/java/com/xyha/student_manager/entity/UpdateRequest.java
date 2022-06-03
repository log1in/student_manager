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
public class UpdateRequest {

    private static final long serialVersionUID = 1L;

    private Integer teacherId;

    private Integer adminId;

    /**
     * 0未审核1已审核
     */
    private Integer status;

    private Integer studentCourseId;

    private String requestInfo;


}
