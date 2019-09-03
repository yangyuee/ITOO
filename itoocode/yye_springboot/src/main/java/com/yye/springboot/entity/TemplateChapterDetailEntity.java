package com.yye.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.*;
import java.io.Serializable;
import javax.persistence.Column;

/**
 * TemplateChapterDetail实体
 * 模板章节明细表
 *
 * @author 杨月娥 
 * @version ${version}
 * @since ${version} 2019-06-21 10:30:50
 */
@ApiModel(value = "TemplateChapterDetailEntity:模板章节明细表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_template_chapter_detail")
public class TemplateChapterDetailEntity extends BaseEntity implements Serializable {

	/**
	 * 章节
	 */
    @ApiModelProperty(value = "章节")
	@Column(name = "chapter")
	private String chapter;

	/**
	 * 章节比例
	 */
    @ApiModelProperty(value = "章节比例")
	@Column(name = "chapter_ratio")
	private Double chapterRatio;

	/**
	 * 模板_id
	 */
    @ApiModelProperty(value = "模板_id")
	@Column(name = "template_id")
	private String templateId;


}
