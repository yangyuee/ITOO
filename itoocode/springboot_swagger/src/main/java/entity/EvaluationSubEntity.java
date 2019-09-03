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
 * TeEvaluationSub实体
 * 评教试题选项表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-12-18 18:19:48
 */
@ApiModel(value = "EvaluationSubEntity:评教试题选项表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_sub")
public class EvaluationSubEntity extends BaseEntity implements Serializable {

	/**
	 * 选项内容
	 */
    @ApiModelProperty(value = "选项内容")
	@Column(name = "option_content")
	private String optionContent;

	/**
	 * 选项顺序
	 */
    @ApiModelProperty(value = "选项顺序")
	@Column(name = "option_order")
	private Integer optionOrder;

	/**
	 * 选项分数
	 */
    @ApiModelProperty(value = "选项分数")
	@Column(name = "option_score")
	private Integer optionScore;

	/**
	 * 评教题库主表id
	 */
    @ApiModelProperty(value = "评教题库主表id")
	@Column(name = "evaluation_main_id")
	private String evaluationMainId;


}
