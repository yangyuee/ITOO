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
 * Semester实体
 * 学年学期表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-17 11:17:35
 */
@ApiModel(value = "SemesterEntity:学年学期表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_semester")
public class SemesterEntity extends BaseEntity implements Serializable {

	/**
	 * 学年学期名称
	 */
	@ApiModelProperty(value = "学年学期名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 学年学期code
	 */
	@ApiModelProperty(value = "学年学期code",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 是否毕业
	 */
    @ApiModelProperty(value = "是否毕业")
	@Column(name = "is_graduate")
	private Integer isGraduate;

	/**
	 * 是否当前
	 */
    @ApiModelProperty(value = "是否当前")
	@Column(name = "is_current")
	private Integer isCurrent;


}
