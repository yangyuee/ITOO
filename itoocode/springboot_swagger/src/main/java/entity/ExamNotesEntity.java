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
 * ExamNotes实体
 * 考生须知表
 *
 * @author 任晓帅 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 19:40:28
 */
@ApiModel(value = "ExamNotesEntity:考生须知表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("te_exam_notes")
public class ExamNotesEntity extends BaseEntity implements Serializable {

	/**
	 * 内容：字符串格式
	 */
	@ApiModelProperty(value = "内容：字符串格式",required = true)
	@Column(name = "content")
	private String content;

	/**
	 * 内容：HTML格式
	 */
	@ApiModelProperty(value = "内容：HTML格式",required = true)
	@Column(name = "content_html")
	private byte[] contentHtml;

	/**
	 * 阅读时长（单位秒，默认30秒）
	 */
    @ApiModelProperty(value = "阅读时长（单位秒，默认30秒）")
	@Column(name = "read_time")
	private Integer readTime;


}
