package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * TeacherCourseTeachClass实体
 * 教师-课程-上课班对应表
 *
 * @author 郭满亮 
 * @version 2.0.0
 * @since 2.0.0 2019-02-01 19:19:48
 */
@ApiModel(value = "TeacherCourseTeachClassEntity:教师-课程-上课班对应表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_teacher_course_teach_class")
public class TeacherCourseTeachClassEntity extends BaseEntity implements Serializable {

	/**
	 * 上课班id
	 */
	@ApiModelProperty(value = "上课班id",required = true)
	@Column(name = "teach_class_id")
	private String teachClassId;

	/**
	 * 教师_id
	 */
	@ApiModelProperty(value = "教师_id",required = true)
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
    @ApiModelProperty(value = "课程名称")
	@Column(name = "course_name")
	private String courseName;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;


}
