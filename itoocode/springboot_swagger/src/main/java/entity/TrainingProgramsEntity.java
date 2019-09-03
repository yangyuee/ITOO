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
 * TrainingPrograms实体
 * 培养计划表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "TrainingProgramsEntity:培养计划表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_training_programs")
public class TrainingProgramsEntity extends BaseEntity implements Serializable {

	/**
	 * 课程_id
	 */
	@ApiModelProperty(value = "课程_id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 专业_id
	 */
	@ApiModelProperty(value = "专业_id",required = true)
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 学年学期_id（字典）
	 */
	@ApiModelProperty(value = "学年学期_id（字典）",required = true)
	@Column(name = "semester_id")
	private String semesterId;

	/**
	 * 课程类型_id（1-专业必修，2-公共必修，3-专业选修，4-公共选修）
	 */
    @ApiModelProperty(value = "课程类型_id（1-专业必修，2-公共必修，3-专业选修，4-公共选修）")
	@Column(name = "course_type_id")
	private String courseTypeId;

	/**
	 *  课程类别（字典:1-理论课、2-实践课、3-理论实践课）
	 */
    @ApiModelProperty(value = " 课程类别（字典:1-理论课、2-实践课、3-理论实践课）")
	@Column(name = "course_category_id")
	private String courseCategoryId;

	/**
	 *  考核形式（字典:1-考查、2-考试）
	 */
    @ApiModelProperty(value = " 考核形式（字典:1-考查、2-考试）")
	@Column(name = "examination_form_id")
	private String examinationFormId;

	/**
	 * 是否排课(0/1 否/是)
	 */
    @ApiModelProperty(value = "是否排课(0/1 否/是)")
	@Column(name = "is_arrangement")
	private Integer isArrangement;

	/**
	 * 单双周(0/1 单/双)
	 */
    @ApiModelProperty(value = "单双周(0/1 单/双)")
	@Column(name = "odd_week_or_not")
	private Integer oddWeekOrNot;

	/**
	 * 年级
	 */
    @ApiModelProperty(value = "年级")
	@Column(name = "grade")
	private String grade;

	/**
	 * 理论课学时
	 */
    @ApiModelProperty(value = "理论课学时")
	@Column(name = "theory_class_hour")
	private String theoryClassHour;

	/**
	 * 实践课学时
	 */
    @ApiModelProperty(value = "实践课学时")
	@Column(name = "practice_class_hour")
	private String practiceClassHour;

	/**
	 * 课程分数
	 */
    @ApiModelProperty(value = "课程分数")
	@Column(name = "course_score")
	private Double courseScore;

	/**
	 * 是否启用（0/1 否/是） 
	 */
    @ApiModelProperty(value = "是否启用（0/1 否/是） ")
	@Column(name = "is_use")
	private Integer isUse;


}
