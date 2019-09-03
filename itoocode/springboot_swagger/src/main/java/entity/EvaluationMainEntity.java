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
 * TeEvaluationMain实体
 * 评教题库主表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-12-18 18:19:48
 */
@ApiModel(value = "EvaluationMainEntity:评教题库主表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_main")
public class EvaluationMainEntity extends BaseEntity implements Serializable {

	/**
	 * 评教题干内容
	 */
    @ApiModelProperty(value = "评教题干内容")
	@Column(name = "evaluation_content")
	private String evaluationContent;

	/**
	 * 小题分数
	 */
    @ApiModelProperty(value = "小题分数")
	@Column(name = "score")
	private Double score;

	/**
	 * 题型id
	 */
    @ApiModelProperty(value = "题型id")
	@Column(name = "evaluation_main_type_id")
	private String evaluationMainTypeId;


}
