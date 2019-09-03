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
 * QuestionType实体
 * 题型分类表
 *
 * @author 郭凯
 * @version 2.0.0
 * @since 2.0.0 2018-11-21 21:10:06
 */
@ApiModel(value = "QuestionTypeEntity:题型分类表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_question_type")
public class QuestionTypeEntity extends BaseEntity implements Serializable {

	/**
	 * 题型名称
	 */
	@ApiModelProperty(value = "题型名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 题型简介
	 */
    @ApiModelProperty(value = "题型简介")
	@Column(name = "description")
	private String description;

	/**
	 * 默认分值
	 */
    @ApiModelProperty(value = "默认分值")
	@Column(name = "default_score")
	private String defaultScore;

	/**
	 * 编号
	 */
	@ApiModelProperty(value = "编号")
	@Column(name = "code")
	private String code;

	/**
	 * 判分类型:0自动,1手动,2智能
	 */
	@ApiModelProperty(value = "判分类型:0自动,1手动,2智能",required = true)
	@Column(name = "score_type")
	private Integer scoreType;


}
