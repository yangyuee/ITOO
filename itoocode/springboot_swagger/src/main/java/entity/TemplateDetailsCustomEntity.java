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
 * TemplateDetailsCustom实体
 * 模板明细自定义表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "TemplateDetailsCustomEntity:模板明细自定义表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_template_details_custom")
public class TemplateDetailsCustomEntity extends BaseEntity implements Serializable {

	/**
	 * 试题分类id
	 */
	@ApiModelProperty(value = "试题分类id",required = true)
	@Column(name = "question_classify_id")
	private String questionClassifyId;

	/**
	 * 试题个数
	 */
	@ApiModelProperty(value = "试题个数",required = true)
	@Column(name = "question_number")
	private Integer questionNumber;

	/**
	 * 难度
	 */
	@ApiModelProperty(value = "难度",required = true)
	@Column(name = "degree")
	private Integer degree;

	/**
	 * 分数
	 */
	@ApiModelProperty(value = "分数",required = true)
	@Column(name = "question_score")
	private String questionScore;

	/**
	 * 模板题型明细id
	 */
	@ApiModelProperty(value = "模板题型明细id",required = true)
	@Column(name = "template_details_id")
	private String templateDetailsId;

	/**
	 * 是否高级
	 */
	@ApiModelProperty(value = "是否高级",required = true)
	@Column(name = "is_senior")
	private Integer isSenior;


}
