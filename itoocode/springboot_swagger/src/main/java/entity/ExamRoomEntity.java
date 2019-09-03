package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * ExamRoom实体
 * 考场表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "ExamRoomEntity:考场表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_exam_room")
public class ExamRoomEntity extends BaseEntity implements Serializable {

	/**
	 * 考场名称
	 */
    @ApiModelProperty(value = "考场名称")
	@Column(name = "name")
	private String name;

	/**
	 * 教室id
	 */
	@ApiModelProperty(value = "教室id")
	@Column(name = "roomId")
	private String roomId;
	/**
	 * 考试id
	 */
	@ApiModelProperty(value = "考试id",required = true)
	@Column(name = "exam_id")
	private String examId;

	/**
	 * 主监考老师id
	 */
    @ApiModelProperty(value = "主监考老师id")
	@Column(name = "invigilator_main_id")
	private String invigilatorMainId;

	/**
	 * 副监考老师id
	 */
    @ApiModelProperty(value = "副监考老师id")
	@Column(name = "invigilator_sub_id")
	private String invigilatorSubId;

	/**
	 * 教室容量
	 */
	@ApiModelProperty(value = "教室容量",required = true)
	@Column(name = "room_capacity")
	private Integer roomCapacity;

	/**
	 * 已占用容量
	 */
    @ApiModelProperty(value = "已占用容量")
	@Column(name = "usage_state")
	private Integer usageState;
	/**
	 * 考场选择状态
	 */
	@ApiModelProperty(value = "已占用容量")
	@Column(name = "employ_capacity")
	private Integer employCapacity;

	/**
	 * 开始时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "开始时间")
	@Column(name = "login_time")
	private Date loginTime;

	/**
	 * 理论结束时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "理论结束时间")
	@Column(name = "should_submit_time")
	private Date shouldSubmitTime;


}
