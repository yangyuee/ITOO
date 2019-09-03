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
 * JudgeTask实体
 * 判分任务安排表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "JudgeTaskEntity:判分任务安排表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_judge_task")
public class JudgeTaskEntity extends BaseEntity implements Serializable {

	/**
	 * 批卷班级名称
	 */
    @ApiModelProperty(value = "批卷班级名称")
	@Column(name = "teachclass_name")
	private String teachclassName;

	/**
	 * 分配人_id
	 */
    @ApiModelProperty(value = "分配人_id")
	@Column(name = "operator_id")
	private String operatorId;

	/**
	 * 批卷班级id
	 */
    @ApiModelProperty(value = "批卷班级id")
	@Column(name = "teachclass_id")
	private String teachclassId;

	/**
	 * 考试_id
	 */
	@ApiModelProperty(value = "考试_id",required = true)
	@Column(name = "examination_id")
	private String examinationId;

	/**
	 * 大题序号
	 */
    @ApiModelProperty(value = "大题序号")
	@Column(name = "template_details_id")
	private String templateDetailsId;

	/**
	 * 批卷人
	 */
    @ApiModelProperty(value = "批卷人")
	@Column(name = "teacher_id")
	private String teacherId;


}
