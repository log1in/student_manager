package com.xyha.student_manager.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UpdateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("old_daily_score")
    private Integer oldDailyScore;
    @TableField("new_daily_score")
    private Integer newDailyScore;
    @TableField("old_mid_term_score")
    private Integer oldMidTermScore;
    @TableField("new_mid_term_score")
    private Integer newMidTermScore;
    @TableField("old_final_term_score")
    private Integer oldFinalTermScore;
    @TableField("new_final_term_score")
    private Integer newFinalTermScore;
    @TableField("old_total_score")
    private Integer oldTotalScore;
    @TableField("new_total_score")
    private Integer newTotalScore;
    @TableField("date")
    private LocalDateTime date;
    @TableField("update_request_id")
    private Integer updateRequestId;


}
