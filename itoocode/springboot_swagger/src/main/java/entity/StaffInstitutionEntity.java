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
 * StaffInstitution实体
 * 教师-机构对应表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "StaffInstitutionEntity:教师-机构对应表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_staff_institution")
public class StaffInstitutionEntity extends BaseEntity implements Serializable {

	/**
	 * 职工id
	 */
	@ApiModelProperty(value = "职工id",required = true)
	@Column(name = "staff_id")
	private String staffId;

	/**
	 * 机构id
	 */
	@ApiModelProperty(value = "机构id",required = true)
	@Column(name = "institution_id")
	private String institutionId;

	/**
	 * 职位
	 */
    @ApiModelProperty(value = "职位")
	@Column(name = "position")
	private String position;

	/**
	 * 是否为主要职能（0否  1是）
	 */
    @ApiModelProperty(value = "是否为主要职能（0否  1是）")
	@Column(name = "is_main")
	private Integer isMain;


}
