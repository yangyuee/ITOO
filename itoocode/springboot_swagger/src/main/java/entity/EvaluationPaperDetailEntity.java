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
 * TeEvaluationPaperDetail实体
 * 评教问卷详情表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-12-18 18:19:48
 */
@ApiModel(value = "EvaluationPaperDetailEntity:评教问卷详情表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_paper_detail")
public class EvaluationPaperDetailEntity extends BaseEntity implements Serializable {

	/**
	 * 问卷id
	 */
    @ApiModelProperty(value = "问卷id")
	@Column(name = "evaluation_paper_id")
	private String evaluationPaperId;

	/**
	 * 题型id
	 */
    @ApiModelProperty(value = "题型id")
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 问卷试题题干id
	 */
    @ApiModelProperty(value = "问卷试题题干id")
	@Column(name = "evaluation_main_id")
	private String evaluationMainId;

	/**
	 * 问卷试题顺序
	 */
    @ApiModelProperty(value = "问卷试题顺序")
	@Column(name = "question_order")
	private Integer questionOrder;


}
