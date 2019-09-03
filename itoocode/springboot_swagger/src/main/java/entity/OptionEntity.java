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
 * Option实体
 * 选项表
 *
 * @author 李青松 
 * @version 2.0.0
 * @since 2.0.0 2018-11-08 10:50:39
 */
@ApiModel(value = "OptionEntity:选项表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_option")
public class OptionEntity extends BaseEntity implements Serializable {

	/**
	 * 选项顺序
	 */
	@ApiModelProperty(value = "选项顺序",example = "1")
	@Column(name = "option_order")
	private Integer optionOrder;

	/**
	 * 选项名：字符串格式
	 */
	@ApiModelProperty(value = "选项名：字符串格式",required = true)
	@Column(name = "option_name")
	private String optionName;

	/**
	 * 选项名：HTML格式
	 */
	@ApiModelProperty(value = "选项名：HTML格式",required = true)
	@Column(name = "option_name_html")
	private String optionNameHtml;

	/**
	 * 试题id
	 */
	@ApiModelProperty(value = "试题id",required = true)
	@Column(name = "question_id")
	private String questionId;
	/**
	 * 选项是否乱序（0 否，1 是）
	 */
    @ApiModelProperty(value = "选项是否乱序（0 否，1 是）",example = "1")
	@Column(name = "is_out_of_order")
	private Integer isOutOfOrder;

	/**
	 * 历史题id
	 */
    @ApiModelProperty(value = "历史题id")
	@Column(name = "history_id")
	private String historyId;

//	/**
//	 * 选项名：HTML格式
//	 */
//	@ApiModelProperty(value = "选项名：HTML格式",required = true)
//	@Column(name = "option_name_h")
//	private byte[] optionNameH;

}
