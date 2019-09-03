package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * DisciplineInfo实体
 * 违纪信息表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "DisciplineInfoEntity:违纪信息表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_discipline_info")
public class DisciplineInfoEntity extends BaseEntity implements Serializable {

	/**
	 * 考试id
	 */
    @ApiModelProperty(value = "考试id")
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 班级名称
	 */
    @ApiModelProperty(value = "班级名称")
	@Column(name = "class_name")
	private String className;

	/**
	 * 违纪原因
	 */
    @ApiModelProperty(value = "违纪原因")
	@Column(name = "reason")
	private String reason;

	/**
	 * 学号
	 */
    @ApiModelProperty(value = "学号")
	@Column(name = "student_code")
	private String studentCode;

	/**
	 * 学生姓名
	 */
    @ApiModelProperty(value = "学生姓名")
	@Column(name = "student_name")
	private String studentName;

	/**
	 * 监考教师_id
	 */
    @ApiModelProperty(value = "监考教师_id")
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 与考试考场关联_id
	 */
    @ApiModelProperty(value = "与考试考场关联_id")
	@Column(name = "exam_room_id")
	private String examRoomId;


}
