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
 * Building实体
 * 建筑表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "BuildingEntity:建筑表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_building")
public class BuildingEntity extends BaseEntity implements Serializable {

	/**
	 * 建筑名称
	 */
	@ApiModelProperty(value = "建筑名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 建筑代码
	 */
	@ApiModelProperty(value = "建筑代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 建筑类型（0-教学楼，1-办公楼，2-宿舍楼，3-图书馆，4-餐厅）
	 */
    @ApiModelProperty(value = "建筑类型（0-教学楼，1-办公楼，2-宿舍楼，3-图书馆，4-餐厅）")
	@Column(name = "type")
	private String type;

	/**
	 * 父节点
	 */
    @ApiModelProperty(value = "父节点")
	@Column(name = "parent_id")
	private String parentId;

	/**
	 * 是否存在机考考场（0 不存在，1 存在）
	 */
    @ApiModelProperty(value = "是否存在机考考场（0 不存在，1 存在）")
	@Column(name = "is_computer_room")
	private Integer isComputerRoom;

	/**
	 * 地理位置(0_西校区，1_东校区)
	 */
    @ApiModelProperty(value = "地理位置(0_西校区，1_东校区)")
	@Column(name = "school_branch")
	private String schoolBranch;


}
