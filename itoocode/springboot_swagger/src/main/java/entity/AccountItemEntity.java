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
 * AccountItem实体
 * 会计分录表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "AccountItemEntity:会计分录表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_account_item")
public class AccountItemEntity extends BaseEntity implements Serializable {

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


	/**
	 * 节点等级（0：根节点；1：一级节点；2：二级节点）
	 */
	@ApiModelProperty(value = "节点等级（0：根节点；1：一级节点；2：二级节点）")
	@Column(name = "level")
	private Integer level;


}
