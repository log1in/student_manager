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
public class Score{

    private static final long serialVersionUID = 1L;

    private Integer dailyScore;

    private Integer midTermScore;

    private Integer finalTermScore;

    private Integer totalScore;


}
