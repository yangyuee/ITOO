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
 * TemplateDetails实体
 * 模板题型明细表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "TemplateDetailsEntity:模板题型明细表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_template_details")
public class TemplateDetailsEntity extends BaseEntity implements Serializable {

	/**
	 * 模板id
	 */
	@ApiModelProperty(value = "模板id",required = true)
	@Column(name = "template_id")
	private String templateId;

	/**
	 * 题型id
	 */
	@ApiModelProperty(value = "题型id",required = true)
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 试题分类id
	 */
	@ApiModelProperty(value = "试题分类id",required = true)
	@Column(name = "question_classify_id")
	private String questionClassifyId;

	/**
	 * 题型名称
	 */
    @ApiModelProperty(value = "题型名称")
	@Column(name = "question_name")
	private String questionName;

	/**
	 * 题型个数
	 */
	@ApiModelProperty(value = "题型个数",required = true,example = "10")
	@Column(name = "question_number")
	private Integer questionNumber;

	/**
	 * 题型总分
	 */
	@ApiModelProperty(value = "题型总分",required = true)
	@Column(name = "question_score")
	private String questionScore;

	/**
	 * 每题分数
	 */
    @ApiModelProperty(value = "每题分数")
	@Column(name = "small_question_score")
	private String smallQuestionScore;

	/**
	 * 是否必抽题
	 */
	@ApiModelProperty(value = "是否必抽题",required = true,example = "0")
	@Column(name = "is_extract")
	private Integer isExtract;

	/**
	 * 难度比例
	 */
    @ApiModelProperty(value = "难度比例")
	@Column(name = "degree_ratio")
	private String degreeRatio;

	/**
	 * 难度系数（0：简单，1：中等，2：困难，3：随机，4：自定义）
	 */
	@ApiModelProperty(value = "难度系数（0：简单，1：中等，2：困难，3：随机，4：自定义）",required = true,example = "1")
	@Column(name = "degree")
	private Integer degree;

	/**
	 * 选项乱序
	 */
    @ApiModelProperty(value = "选项乱序",example = "1")
	@Column(name = "option_disorder")
	private Integer optionDisorder;

	/**
	 * 漏题给分
	 */
    @ApiModelProperty(value = "漏题给分",example = "1")
	@Column(name = "messing_points")
	private Integer messingPoints;

	/**
	 * 漏选分数
	 */
    @ApiModelProperty(value = "漏选分数")
	@Column(name = "messing_points_score")
	private String messingPointsScore;

	/**
	 * 题型描述
	 */
    @ApiModelProperty(value = "题型描述")
	@Column(name = "question_type_describe")
	private String questionTypeDescribe;

	/**
	 * 是否按空
	 */
    @ApiModelProperty(value = "是否按空",example = "1")
	@Column(name = "is_blanks")
	private Integer isBlanks;

	/**
	 * 是否自定义(0否；1是)
	 */
    @ApiModelProperty(value = "是否自定义(0否；1是)",example = "1")
	@Column(name = "is_custom")
	private Integer isCustom;


	/**
	 * 题型顺序
	 */
	@ApiModelProperty(value = "题型顺序",example = "1")
	@Column(name = "question_type_order")
	private Integer questionTypeOrder;

}
