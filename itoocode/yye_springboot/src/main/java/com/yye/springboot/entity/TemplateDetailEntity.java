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
 * TemplateDetail实体
 * 模板或试卷详情表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TemplateDetailEntity:模板或试卷详情表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_template_detail")
public class TemplateDetailEntity extends BaseEntity implements Serializable {

	/**
	 * 题库id
	 */
    @ApiModelProperty(value = "题库id")
	@Column(name = "question_main_id")
	private String questionMainId;

	/**
	 * 章节
	 */
    @ApiModelProperty(value = "章节")
	@Column(name = "chapter")
	private String chapter;

	/**
	 * 模板题型id
	 */
    @ApiModelProperty(value = "模板题型id")
	@Column(name = "template_questiontype_id")
	private String templateQuestiontypeId;

	/**
	 * 小题分值
	 */
    @ApiModelProperty(value = "小题分值")
	@Column(name = "small_question_score")
	private Float smallQuestionScore;

	/**
	 * 是否必抽（0：非必抽，1：必抽）
	 */
    @ApiModelProperty(value = "是否必抽（0：非必抽，1：必抽）")
	@Column(name = "is_extract")
	private Integer isExtract;

	/**
	 * 小题数目
	 */
    @ApiModelProperty(value = "小题数目")
	@Column(name = "small_question_count")
	private Integer smallQuestionCount;

	/**
	 * 难度系数（0：简单，1：中等，2：困难，3：随机）
	 */
    @ApiModelProperty(value = "难度系数（0：简单，1：中等，2：困难，3：随机）")
	@Column(name = "degree")
	private Integer degree;


}
