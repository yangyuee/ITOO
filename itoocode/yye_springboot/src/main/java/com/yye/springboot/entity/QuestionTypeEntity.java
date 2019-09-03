package com.yye.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;
import java.io.Serializable;
import javax.persistence.Column;

/**
 * QuestionType实体
 * 题型表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "QuestionTypeEntity:题型表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_question_type")
public class QuestionTypeEntity extends BaseEntity implements Serializable {

	/**
	 * 题型标记（0考试、1评教）
	 */
    @ApiModelProperty(value = "题型标记（0考试、1评教）")
	@Column(name = "type_flag")
	private String typeFlag;

	/**
	 * 题型简介
	 */
    @ApiModelProperty(value = "题型简介")
	@Column(name = "question_type_desc")
	private String questionTypeDesc;

	/**
	 * 题型名称
	 */
    @ApiModelProperty(value = "题型名称")
	@Column(name = "question_name")
	private String questionName;

	/**
	 * 是否为手动判分（0/1 否/是）
	 */
    @ApiModelProperty(value = "是否为手动判分（0/1 否/是）")
	@Column(name = "is_hand_score")
	private Integer isHandScore;

	/**
	 * 分数
	 */
    @ApiModelProperty(value = "分数")
	@Column(name = "score")
	private String score;

	/**
	 * 选项数量
	 */
    @ApiModelProperty(value = "选项数量")
	@Column(name = "count")
	private String count;

	/**
	 * 题型代码
	 */
    @ApiModelProperty(value = "题型代码")
	@Column(name = "question_code")
	private String questionCode;


}
