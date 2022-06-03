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
public class UpdateInfo  {

    private static final long serialVersionUID = 1L;

    private Integer oldDailyScore;

    private Integer newDailyScore;

    private Integer oldMidTermScore;

    private Integer newMidTermScore;

    private Integer oldFinalTermScore;

    private Integer newFinalTermScore;

    private Integer oldTotalScore;

    private Integer newTotalScore;

    private LocalDateTime date;

    private Integer updateRequestId;


}
