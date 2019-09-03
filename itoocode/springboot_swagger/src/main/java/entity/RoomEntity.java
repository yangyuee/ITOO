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
 * Room实体
 * 房间表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "RoomEntity:房间表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_room")
public class RoomEntity extends BaseEntity implements Serializable {

	/**
	 * 房间代码
	 */
	@ApiModelProperty(value = "房间代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 房间名称
	 */
	@ApiModelProperty(value = "房间名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 容量
	 */
	@ApiModelProperty(value = "容量",required = true)
	@Column(name = "room_capacity")
	private Integer roomCapacity;

	/**
	 * 房间ip范围
	 */
    @ApiModelProperty(value = "房间ip范围")
	@Column(name = "room_ip")
	private String roomIp;

	/**
	 * 建筑id
	 */
    @ApiModelProperty(value = "建筑id")
	@Column(name = "building_id")
	private String buildingId;

	/**
	 * 房间类型：0-普通教室，1-多媒体教室，2-机房，3-实验室，4-办公室，5-室外教室(体育场)
	 */
    @ApiModelProperty(value = "房间类型：0-普通教室，1-多媒体教室，2-机房，3-实验室，4-办公室，5-室外教室(体育场)")
	@Column(name = "room_type")
	private String roomType;

	/**
	 * 剩余容量
	 */
    @ApiModelProperty(value = "剩余容量")
	@Column(name = "surplus_capacity")
	private Integer surplusCapacity;

	/**
	 * 房间是否被占用（0 没有占用，1 被占用）
	 */
    @ApiModelProperty(value = "房间是否被占用（0 没有占用，1 被占用）")
	@Column(name = "is_used")
	private Integer isUsed;


}
