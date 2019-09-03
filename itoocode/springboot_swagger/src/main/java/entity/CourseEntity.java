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
 * Course实体
 * 课程信息表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-24 15:14:12
 */
@ApiModel(value = "CourseEntity:课程信息表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tt_course")
public class CourseEntity extends BaseEntity implements Serializable {

	/**
	 * 课程名称
	 */
	@ApiModelProperty(value = "课程名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 课程代码
	 */
	@ApiModelProperty(value = "课程代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 *  学时
	 */
    @ApiModelProperty(value = " 学时")
	@Column(name = "class_hour")
	private String classHour;

	/**
	 * 课程类别（1-理论课、2-实践课、3-理论实践课）
	 */
    @ApiModelProperty(value = "课程类别（1-理论课、2-实践课、3-理论实践课）")
	@Column(name = "course_category")
	private String courseCategory;

	/**
	 * 课程类型（1-专业必修，2-公共必修，3-专业选修，4-公共选修）
	 */
    @ApiModelProperty(value = "课程类型（1-专业必修，2-公共必修，3-专业选修，4-公共选修）")
	@Column(name = "course_type")
	private String courseType;

	/**
	 * 课程性质（1-人文社科，2-艺术体育，3-自然科学）id
	 */
    @ApiModelProperty(value = "课程性质（1-人文社科，2-艺术体育，3-自然科学）id")
	@Column(name = "course_nature")
	private String courseNature;

	/**
	 * 学分
	 */
    @ApiModelProperty(value = "学分")
	@Column(name = "class_point")
	private String classPoint;

	/**
	 * 课程分数
	 */
    @ApiModelProperty(value = "课程分数")
	@Column(name = "score")
	private String score;

	/**
	 * 学院（课程属于学院）
	 */
    @ApiModelProperty(value = "学院（课程属于学院）")
	@Column(name = "academy_id")
	private String academyId;


}
