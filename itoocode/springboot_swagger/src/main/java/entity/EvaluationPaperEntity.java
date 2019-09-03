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
 * TeEvaluationPaper实体
 * 评教问卷主表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-12-18 18:19:48
 */
@ApiModel(value = "EvaluationPaperEntity:评教问卷主表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_evaluation_paper")
public class EvaluationPaperEntity extends BaseEntity implements Serializable {

	/**
	 * 问卷名称
	 */
    @ApiModelProperty(value = "问卷名称")
	@Column(name = "name")
	private String name;

	/**
	 * 课程属性id（字典：理论课、实践课）
	 */
    @ApiModelProperty(value = "课程属性id（字典：理论课、实践课）")
	@Column(name = "course_property_id")
	private String coursePropertyId;

	/**
	 * 问卷总分数
	 */
    @ApiModelProperty(value = "问卷总分数")
	@Column(name = "score")
	private Double score;

	/**
	 * 状态（草稿状态0，运行状态1 暂停状态2）
	 */
    @ApiModelProperty(value = "状态（草稿状态0，运行状态1 暂停状态2）")
	@Column(name = "status")
	private Integer status;

	/**
	 * 学年学期id
	 */
    @ApiModelProperty(value = "学年学期id")
	@Column(name = "school_year_id")
	private String schoolYearId;

	/**
	 * （0教师评教问卷 1课程评教问卷）
	 */
    @ApiModelProperty(value = "（0教师评教问卷 1课程评教问卷）")
	@Column(name = "type")
	private Integer type;


}
