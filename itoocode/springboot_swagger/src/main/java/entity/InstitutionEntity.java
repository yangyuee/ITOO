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
 * Institution实体
 * 党政部门表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-22 16:26:53
 */
@ApiModel(value = "InstitutionEntity:党政部门表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_institution")
public class InstitutionEntity extends BaseEntity implements Serializable {

	/**
	 * 机构名称
	 */
	@ApiModelProperty(value = "机构名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 机构代码
	 */
	@ApiModelProperty(value = "机构代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 简称
	 */
    @ApiModelProperty(value = "简称")
	@Column(name = "abbreviation")
	private String abbreviation;


}
