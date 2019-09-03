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
 * Template实体
 * 模板表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "TemplateEntity:模板表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_template")
public class TemplateEntity extends BaseEntity implements Serializable {

	/**
	 * 模板名称
	 */
	@ApiModelProperty(value = "模板名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 状态（12考试已使用、11考试使用中、10考试未使用20 固定未使用 21 固定使用中 22 随机未使用 23 随机使用中）
	 */
	@ApiModelProperty(value = "状态（12考试已使用、11考试使用中、10考试未使用20 固定未使用 21 固定使用中 22 随机未使用 23 随机使用中）",required = true,example = "10")
	@Column(name = "status")
	private Integer status;

	/**
	 * 总分值
	 */
	@ApiModelProperty(value = "总分值",required = true,example = "1.0")
	@Column(name = "score")
	private Double score;

	/**
	 * 总个数
	 */
	@ApiModelProperty(value = "总个数",required = true,example = "10")
	@Column(name = "total_number")
	private Integer totalNumber;

	/**
	 * 组卷方式(选题,抽题,随机)
	 */
	@ApiModelProperty(value = "组卷方式(选题,抽题,随机)",required = true)
	@Column(name = "organizing_type")
	private String organizingType;

	/**
	 * 课程描述
	 */
    @ApiModelProperty(value = "课程描述")
	@Column(name = "description")
	private String description;


}
