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
 * QuestionMain实体
 * 试卷题干库
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "QuestionMainEntity:试卷题干库")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_question_main")
public class QuestionMainEntity extends BaseEntity implements Serializable {

	/**
	 * 题干
	 */
    @ApiModelProperty(value = "题干")
	@Column(name = "question_content")
	private String questionContent;

	/**
	 * 答案
	 */
    @ApiModelProperty(value = "答案")
	@Column(name = "answer")
	private String answer;

	/**
	 * 答案解析
	 */
    @ApiModelProperty(value = "答案解析")
	@Column(name = "analysis")
	private String analysis;

	/**
	 * 父试题id（适用于类似阅读理解题型的题）
	 */
    @ApiModelProperty(value = "父试题id（适用于类似阅读理解题型的题）")
	@Column(name = "p_id")
	private String pId;

	/**
	 * 题库_id
	 */
    @ApiModelProperty(value = "题库_id")
	@Column(name = "question_id")
	private String questionId;

	/**
	 * 难度等级（1简单，2中等，3困难）
	 */
    @ApiModelProperty(value = "难度等级（1简单，2中等，3困难）")
	@Column(name = "degree")
	private Integer degree;

	/**
	 * 章节 
	 */
    @ApiModelProperty(value = "章节 ")
	@Column(name = "chapter")
	private String chapter;

	/**
	 * 题型代码
	 */
    @ApiModelProperty(value = "题型代码")
	@Column(name = "question_code")
	private String questionCode;

	/**
	 * 图片名称
	 */
    @ApiModelProperty(value = "图片名称")
	@Column(name = "image_name")
	private String imageName;

	/**
	 * 原图_id地址
	 */
    @ApiModelProperty(value = "原图_id地址")
	@Column(name = "image_id")
	private String imageId;

	/**
	 * 缩略图_id地址
	 */
    @ApiModelProperty(value = "缩略图_id地址")
	@Column(name = "thumb_id")
	private String thumbId;

	/**
	 * 填空数量
	 */
    @ApiModelProperty(value = "填空数量")
	@Column(name = "blank_count")
	private Integer blankCount;

	/**
	 * 子题的顺序 数字来判断顺序
	 */
    @ApiModelProperty(value = "子题的顺序 数字来判断顺序")
	@Column(name = "child_order")
	private Integer childOrder;

	/**
	 * 是否有效（t是 f否）
	 */
    @ApiModelProperty(value = "是否有效（t是 f否）")
	@Column(name = "is_effective")
	private String isEffective;

	/**
	 * 是否乱序（0 否，1 是）
	 */
    @ApiModelProperty(value = "是否乱序（0 否，1 是）")
	@Column(name = "is_out_of_order")
	private Integer isOutOfOrder;

	/**
	 * 是否别名（0 否，1 是）
	 */
    @ApiModelProperty(value = "是否别名（0 否，1 是）")
	@Column(name = "is_alias")
	private Integer isAlias;

	/**
	 * 模板是否可用（0否，1是）
	 */
    @ApiModelProperty(value = "模板是否可用（0否，1是）")
	@Column(name = "is_paper")
	private Integer isPaper;

	/**
	 * 资源地址
	 */
    @ApiModelProperty(value = "资源地址")
	@Column(name = "resource")
	private String resource;

	/**
	 * 历史数据标识（0为非历史，1为历史数据）
	 */
    @ApiModelProperty(value = "历史数据标识（0为非历史，1为历史数据）")
	@Column(name = "history_flag")
	private Integer historyFlag;

	/**
	 * history_id
	 */
    @ApiModelProperty(value = "history_id")
	@Column(name = "history_id")
	private String historyId;

	/**
	 * serial_number
	 */
	@ApiModelProperty(value = "serial_number",required = true)
	@Column(name = "serial_number")
	private String serialNumber;


}
