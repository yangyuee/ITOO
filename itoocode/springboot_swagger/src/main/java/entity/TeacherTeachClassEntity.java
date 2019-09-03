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
 * TeacherTeachClass实体
 * 教师和上课班关系表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-27 15:51:13
 */
@ApiModel(value = "TeacherTeachClassEntity:教师和上课班关系表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tt_teacher_teach_class")
public class TeacherTeachClassEntity extends BaseEntity implements Serializable {

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
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;


}
