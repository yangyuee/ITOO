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
 * Question实体
 * 试题表
 *
 * @author 李青松 
 * @version 2.0.0
 * @since 2.0.0 2018-11-08 10:50:39
 */
@ApiModel(value = "QuestionEntity:试题表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_question")
public class QuestionEntity extends BaseEntity implements Serializable {

	/**
	 * 题干:字符串格式
	 */
	@ApiModelProperty(value = "题干:字符串格式",required = true)
	@Column(name = "question_content")
	private String questionContent;

	/**
	 * 题干:HTML格式
	 */
	@ApiModelProperty(value = "题干:HTML格式",required = true)
	@Column(name = "question_content_html")
	private String questionContentHtml;

	/**
	 * 编号
	 */
	@ApiModelProperty(value = "编号",required = true)
	@Column(name = "serial")
	private Integer serial;

	/**
	 * 父试题id（适用于类似阅读理解题型的题）
	 */
    @ApiModelProperty(value = "父试题id（适用于类似阅读理解题型的题）")
	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 历史题id
	 */
    @ApiModelProperty(value = "历史题id")
	@Column(name = "history_id")
	private String historyId;

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
	 * 版本
	 */
    @ApiModelProperty(value = "版本")
	@Column(name = "version")
	private Integer version;

	/**
	 * 答案
	 */
	@ApiModelProperty(value = "答案",required = true)
	@Column(name = "answer")
	private String answer;

//	/**
//	 * 答案Html
//	 */
//	@ApiModelProperty(value = "答案Html",required = true)
//	@Column(name = "answer_h")
//	private byte[] answerH;

	/**
	 * 是否乱序(0不乱序,1乱序)
	 */
    @ApiModelProperty(value = "是否乱序(0不乱序,1乱序)")
	@Column(name = "is_out_of_order")
	private Integer isOutOfOrder;

	/**
	 * 是否别名（0否，1是）
	 */
    @ApiModelProperty(value = "是否别名（0否，1是）")
	@Column(name = "is_alias")
	private Integer isAlias;

	/**
	 * 答案解析:字符串格式
	 */
    @ApiModelProperty(value = "答案解析:字符串格式")
	@Column(name = "analysis")
	private String analysis;

//	/**
//	 * 答案解析:HTML格式
//	 */
//    @ApiModelProperty(value = "答案解析:HTML格式")
//	@Column(name = "analysis_h")
//	private byte[] analysisH;

	/**
	 * 来源(0手工,1excel导入,2word导入)
	 */
	@ApiModelProperty(value = "来源(0手工,1excel导入,2word导入)",required = true)
	@Column(name = "source")
	private Integer source;

	/**
	 * 检查状态(0未检查,1已检查)
	 */
    @ApiModelProperty(value = "检查状态(0未检查,1已检查)")
	@Column(name = "check_status")
	private Integer checkStatus;

	/**
	 * 检测结果
	 */
    @ApiModelProperty(value = "检测结果")
	@Column(name = "check_result")
	private String checkResult;

	/**
	 * 难度等级初始值
	 */
    @ApiModelProperty(value = "难度等级初始值")
	@Column(name = "degree_initial")
	private Integer degreeInitial;

	/**
	 * 难度等级统计值
	 */
    @ApiModelProperty(value = "难度等级统计值")
	@Column(name = "degree_statistic")
	private Integer degreeStatistic;


	/**
	 * 选项数量/填空个数
	 */
    @ApiModelProperty(value = "选项数量/填空个数")
	@Column(name = "option_count")
	private Integer optionCount;

	/**
	 * 是否有效（t是 f否）
	 */
	@ApiModelProperty(value = "是否有效（t是 f否）")
	@Column(name = "is_effective")
	private Integer isEffective;

	/**
	 * 是否必须为HTML（0否，1是）
	 */
	@ApiModelProperty(value = "是否必须为HTML（0否，1是）")
	@Column(name = "is_html")
	private Integer isHtml;

	/**
	 * 知识点
	 */
    @ApiModelProperty(value = "知识点")
	@Column(name = "knowledge_point")
	private String knowledgePoint;

	/**
	 * 子题的顺序 数字来判断顺序
	 */
    @ApiModelProperty(value = "子题的顺序 数字来判断顺序")
	@Column(name = "child_order")
	private Integer childOrder;

	/**
	 * 课程id
	 */
	@ApiModelProperty(value = "课程id",required = true)
	@Column(name = "course_id")
	private String courseId;

//	/**
//	 * 题干:HTML格式
//	 */
//	@ApiModelProperty(value = "题干:HTML格式",required = true)
//	@Column(name = "question_content_h")
//	private byte[] questionContentH;

	/**
	 * 答案:longText格式
	 */
	@ApiModelProperty(value = "答案:longText格式",required = true)
	@Column(name = "answer_html")
	private String answerHtml;

	/**
	 * 解析:longText格式
	 */
	@ApiModelProperty(value = "解析:longText格式",required = true)
	@Column(name = "analysis_html")
	private String analysisHtml;
}
