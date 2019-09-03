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
 * ExamClassify实体
 * 考试分类表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "ExamClassifyEntity:考试分类表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_exam_classify")
public class ExamClassifyEntity extends BaseEntity implements Serializable {

	/**
	 * 名称
	 */
	@ApiModelProperty(value = "名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 父节点，用于树显示
	 */
    @ApiModelProperty(value = "父节点，用于树显示")
	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 是否为叶子节点（0否  1是）
	 */
    @ApiModelProperty(value = "是否为叶子节点（0否  1是）")
	@Column(name = "is_leaf")
	private Integer isLeaf;


}
