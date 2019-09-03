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
 * Datum实体
 * 资料表
 *
 * @author 贾建清 
 * @version 2.0.0
 * @since 2.0.0 2018-12-08 12:31:48
 */
@ApiModel(value = "DatumEntity:资料表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_datum")
public class  DatumEntity extends BaseEntity implements Serializable {

	/**
	 * 题型id
	 */
	@ApiModelProperty(value = "题型id",required = true)
	@Column(name = "question_type_id")
	private String questionTypeId;

	/**
	 * 存放路径
	 */
    @ApiModelProperty(value = "存放路径")
	@Column(name = "datum_url")
	private String datumUrl;

	/**
	 * 资料名称
	 */
    @ApiModelProperty(value = "资料名称")
	@Column(name = "datum_name")
	private String datumName;


}
