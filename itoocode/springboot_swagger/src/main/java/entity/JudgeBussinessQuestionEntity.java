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
 * JudgeBussinessQuestion实体
 * 业务题判分规则表
 *
 * @author 李青松 
 * @version 2.0.0
 * @since 2.0.0 2018-12-09 20:21:09
 */
@ApiModel(value = "JudgeBussinessQuestionEntity:业务题判分规则表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_judge_bussiness_question")
public class JudgeBussinessQuestionEntity extends BaseEntity implements Serializable {

	/**
	 * rule_code
	 */
    @ApiModelProperty(value = "rule_code")
	@Column(name = "rule_code")
	private Integer ruleCode;

	/**
	 * 规则
	 */
    @ApiModelProperty(value = "规则")
	@Column(name = "rule")
	private String rule;

	/**
	 * 描述
	 */
    @ApiModelProperty(value = "描述")
	@Column(name = "descri")
	private String descri;

	/**
	 * 状态  0：不可用  1：可用
	 */
    @ApiModelProperty(value = "状态  0：不可用  1：可用")
	@Column(name = "state")
	private Integer state;


}
