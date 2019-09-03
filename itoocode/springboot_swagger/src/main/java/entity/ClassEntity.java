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
 * Class实体
 * 班级表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "ClassEntity:班级表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_class")
public class ClassEntity extends BaseEntity implements Serializable {

	/**
	 * 行政班名称
	 */
	@ApiModelProperty(value = "行政班名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 行政班代码
	 */
	@ApiModelProperty(value = "行政班代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 专业(班级是属于专业的)
	 */
	@ApiModelProperty(value = "专业(班级是属于专业的)",required = true)
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 年级
	 */
    @ApiModelProperty(value = "年级")
	@Column(name = "grade")
	private String grade;


}
