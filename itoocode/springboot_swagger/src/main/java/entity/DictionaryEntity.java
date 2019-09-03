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
 * Dictionary实体
 * 字典表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-22 16:26:53
 */
@ApiModel(value = "DictionaryEntity:字典表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_dictionary")
public class DictionaryEntity extends BaseEntity implements Serializable {

	/**
	 * 字典类型名称
	 */
	@ApiModelProperty(value = "字典类型名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 字典code
	 */
	@ApiModelProperty(value = "字典code",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 字典类型_id
	 */
    @ApiModelProperty(value = "字典类型_id")
	@Column(name = "type_id")
	private String typeId;

	/**
	 * 是否系统内置（0否1是）
	 */
    @ApiModelProperty(value = "是否系统内置（0否1是）")
	@Column(name = "inline")
	private Integer inline;


}
