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
 * QuestionClassify实体
 * 试题分类表
 *
 * @author 李青松 
 * @version 2.0.0
 * @since 2.0.0 2018-11-08 10:50:39
 */
@ApiModel(value = "QuestionClassifyEntity:试题分类表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_question_classify")
public class QuestionClassifyEntity extends BaseEntity implements Serializable {

	/**
	 * 分类名
	 */
	@ApiModelProperty(value = "分类名",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 父试题分类id
	 */
    @ApiModelProperty(value = "父试题分类id")
	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id")
	@Column(name = "courese_id")
	private String courseId;

	/**
	 * 该分类下试题数量
	 */
    @ApiModelProperty(value = "该分类下试题数量")
	@Column(name = "question_count")
	private Integer questionCount;

	/**
	 * 该分类下试题数量
	 */
	@ApiModelProperty(value = "该分类等级")
	@Column(name = "level")
	private Integer level;

}
