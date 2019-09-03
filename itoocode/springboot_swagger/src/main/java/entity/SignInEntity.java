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
 * SignIn实体
 * 小练签到表
 *
 * @author 郭满亮 
 * @version 2.0.0
 * @since 2.0.0 2019-03-19 09:21:41
 */
@ApiModel(value = "SignInEntity:小练签到表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_sign_in")
public class SignInEntity extends BaseEntity implements Serializable {

	/**
	 * 教师id
	 */
    @ApiModelProperty(value = "教师id",required = true)
	@Column(name = "teacher_id")
	private String teacherId;

	/**
	 * 上课班id
	 */
    @ApiModelProperty(value = "上课班id",required = true)
	@Column(name = "course_id")
	private String courseId;

	/**
	 * 签到状态（未开始签到0、开始签到1）
	 */
    @ApiModelProperty(value = "签到状态（未开始签到0、开始签到1）",required = true)
	@Column(name = "state")
	private String state;


}
