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
 * QuestionSub实体
 * 试卷选项表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "QuestionSubEntity:试卷选项表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_question_sub")
public class QuestionSubEntity extends BaseEntity implements Serializable {

	/**
	 * 选项顺序
	 */
    @ApiModelProperty(value = "选项顺序")
	@Column(name = "option_order")
	private Integer optionOrder;

	/**
	 * 选项内容
	 */
    @ApiModelProperty(value = "选项内容")
	@Column(name = "options_content")
	private String optionsContent;

	/**
	 * 试题_id
	 */
    @ApiModelProperty(value = "试题_id")
	@Column(name = "question_main_id")
	private String questionMainId;

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
	 * 图片名称
	 */
    @ApiModelProperty(value = "图片名称")
	@Column(name = "image_name")
	private String imageName;

	/**
	 * 资源id
	 */
    @ApiModelProperty(value = "资源id")
	@Column(name = "resource")
	private String resource;

	/**
	 * 历史数据标识（0为非历史，1为历史数据）
	 */
    @ApiModelProperty(value = "历史数据标识（0为非历史，1为历史数据）")
	@Column(name = "history_flag")
	private Integer historyFlag;

	/**
	 * 历史数据id,来源数据
	 */
    @ApiModelProperty(value = "历史数据id,来源数据")
	@Column(name = "history_id")
	private String historyId;


}
