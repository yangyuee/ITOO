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
 * StudentTeachClass实体
 * 上课班-学生管理表
 *
 * @author 郭满亮 
 * @version 2.0.0
 * @since 2.0.0 2019-01-29 15:52:00
 */
@ApiModel(value = "StudentTeachClassEntity:上课班-学生管理表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tt_student_teach_class")
public class StudentTeachClassEntity extends BaseEntity implements Serializable {

	/**
	 * 学生_id
	 */
	@ApiModelProperty(value = "学生_id",required = true)
	@Column(name = "student_id")
	private String studentId;

	/**
	 * 上课班_id
	 */
	@ApiModelProperty(value = "上课班_id",required = true)
	@Column(name = "teach_class_id")
	private String teachClassId;



}
