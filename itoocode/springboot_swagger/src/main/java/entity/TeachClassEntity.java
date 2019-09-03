package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * TeachClass实体
 * 班级表--关联教务2
 *
 * @author 郭满亮 
 * @version 2.0.0
 * @since 2.0.0 2019-02-09 19:43:37
 */
@ApiModel(value = "TeachClassEntity:班级表--关联教务2")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tt_teach_class")
public class TeachClassEntity extends BaseEntity implements Serializable {

	/**
	 * 上课班名称
	 */
	@ApiModelProperty(value = "上课班名称",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 上课班代码
	 */
	@ApiModelProperty(value = "上课班代码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 课程_id
	 */
    @ApiModelProperty(value = "课程_id")
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 上课班容量
	 */
    @ApiModelProperty(value = "上课班容量")
	@Column(name = "capacity")
	private String capacity;

	/**
	 * 学年学期
	 */
    @ApiModelProperty(value = "学年学期")
	@Column(name = "school_year")
	private String schoolYear;

	/**
	 *  剩余容量
	 */
    @ApiModelProperty(value = " 剩余容量")
	@Column(name = "remain_capacity")
	private String remainCapacity;

	/**
	 * 是否来自于签到系统 （0：否   ，1： 是 ）
	 */
    @ApiModelProperty(value = "是否来自于签到系统 （0：否   ，1： 是 ）")
	@Column(name = "is_sign")
	private Integer isSign;


}
