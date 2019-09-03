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
 * Profession实体
 * 专业表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "ProfessionEntity:专业表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_profession")
public class ProfessionEntity extends BaseEntity implements Serializable {

	/**
	 * 专业名称
	 */
	@ApiModelProperty(value = "专业名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 专业代码
	 */
	@ApiModelProperty(value = "专业代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 学制（4，3，2等）
	 */
    @ApiModelProperty(value = "学制（4，3，2等）")
	@Column(name = "school_length")
	private String schoolLength;

	/**
	 * 专业性质（1专科,2本科,3专接本）
	 */
    @ApiModelProperty(value = "专业性质（1专科,2本科,3专接本）")
	@Column(name = "nature")
	private String nature;

	/**
	 * 学院_id
	 */
    @ApiModelProperty(value = "学院_id")
	@Column(name = "academy_id")
	private String academyId;


}
