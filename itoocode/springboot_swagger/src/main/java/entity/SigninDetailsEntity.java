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
 * SigninDetails实体
 * 学生签到表详情
 *
 * @author 郭满亮
 * @version 2.0.0
 * @since 2.0.0 2019-03-19 09:21:41
 */
@ApiModel(value = "SigninDetailsEntity:学生签到表详情")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "te_signin_details")
public class SigninDetailsEntity extends BaseEntity implements Serializable {

    /**
     * sign_in_id
     */
    @ApiModelProperty(value = "sign_in_id")
    @Column(name = "sign_in_id")
    private String signInId;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    @Column(name = "student_id")
    private String studentId;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    @Column(name = "student_name")
    private String studentName;

    /**
     * 学号
     */
    @ApiModelProperty(value = "学号")
    @Column(name = "student_code")
    private String studentCode;

    /**
     * 学生状态（未签到0、已签到1）
     */
    @ApiModelProperty(value = "学生状态（未签到0、已签到1）")
    @Column(name = "state")
    private String state;

    /**
     * 学生签到位置
     */
    @ApiModelProperty(value = "学生签到位置")
    @Column(name = "position")
    private String position;

    /**
     * 创建班课老师姓名
     */
    @ApiModelProperty(value = "创建班课老师姓名")
    @Column(name = "teacherName")
    private String teacherName;

    /**
     * 上课班名称
     */
    @ApiModelProperty(value = "上课班名称")
    @Column(name = "courseName")
    private String courseName;
}
