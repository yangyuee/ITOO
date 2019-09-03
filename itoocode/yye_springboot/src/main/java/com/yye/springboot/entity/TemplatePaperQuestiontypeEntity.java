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
 * TemplatePaperQuestiontype实体
 * 模板或试卷题型详情
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TemplatePaperQuestiontypeEntity:模板或试卷题型详情")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_template_paper_questiontype")
public class TemplatePaperQuestiontypeEntity extends BaseEntity implements Serializable {

	/**
	 * 题型分值
	 */
    @ApiModelProperty(value = "题型分值")
	@Column(name = "question_type_score")
	private Double questionTypeScore;

	/**
	 * 每个题型小题的个数
	 */
    @ApiModelProperty(value = "每个题型小题的个数")
	@Column(name = "question_type_num")
	private Integer questionTypeNum;

	/**
	 * 模板主表_id
	 */
    @ApiModelProperty(value = "模板主表_id")
	@Column(name = "templateOrpaper_id")
	private String templateorpaperId;

	/**
	 * 题型类别_id
	 */
    @ApiModelProperty(value = "题型类别_id")
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 题目要求
	 */
    @ApiModelProperty(value = "题目要求")
	@Column(name = "question_require")
	private String questionRequire;

	/**
	 * 题型顺序
	 */
    @ApiModelProperty(value = "题型顺序")
	@Column(name = "question_type_order")
	private Integer questionTypeOrder;


}
