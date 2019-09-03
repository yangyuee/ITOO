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
 * TemplateDetailsExtract实体
 * 模板明细必抽题表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "TemplateDetailsExtractEntity:模板明细必抽题表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_template_details_extract")
public class TemplateDetailsExtractEntity extends BaseEntity implements Serializable {

	/**
	 * 试题id
	 */
	@ApiModelProperty(value = "试题id",required = true)
	@Column(name = "question_id")
	private String questionId;

	/**
	 * 模板题型明细id
	 */
	@ApiModelProperty(value = "模板题型明细id",required = true)
	@Column(name = "template_details_id")
	private String templateDetailsId;


}
