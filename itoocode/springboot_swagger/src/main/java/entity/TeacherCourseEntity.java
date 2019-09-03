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
 * TeacherCourse实体
 * 教师授课表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-16 20:35:34
 */
@ApiModel(value = "TeacherCourseEntity:教师授课表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_teacher_course")
public class TeacherCourseEntity extends BaseEntity implements Serializable {

	/**
	 * 课程_id
	 */
	@ApiModelProperty(value = "课程_id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 教师_id
	 */
	@ApiModelProperty(value = "教师_id",required = true)
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 课程名称
	 */
    @ApiModelProperty(value = "课程名称")
	@Column(name = "course_name")
	private String courseName;

	/**
	 * 教师名称
	 */
    @ApiModelProperty(value = "教师名称")
	@Column(name = "teacher_name")
	private String teacherName;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;

	/**
	 * 是否需要多媒体
	 */
    @ApiModelProperty(value = "是否需要多媒体")
	@Column(name = "is_media")
	private Integer isMedia;

	/**
	 * 是否需要机房
	 */
    @ApiModelProperty(value = "是否需要机房")
	@Column(name = "is_computer")
	private Integer isComputer;


}
