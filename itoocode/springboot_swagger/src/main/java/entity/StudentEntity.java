package entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * Student实体
 * 学生信息表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "StudentEntity:学生信息表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_student")
public class StudentEntity extends BaseEntity implements Serializable {

	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "姓名",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 学号
	 */
	@ApiModelProperty(value = "学号",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 行政班id
	 */
    @ApiModelProperty(value = "行政班id")
	@Column(name = "classes_id")
	private String classesId;

	/**
	 * 专业id
	 */
    @ApiModelProperty(value = "专业id")
	@Column(name = "profession_id")
	private String professionId;

	/**
	 * 学院id
	 */
    @ApiModelProperty(value = "学院id")
	@Column(name = "academy_id")
	private String academyId;

	/**
	 * 户口所在地
	 */
    @ApiModelProperty(value = "户口所在地")
	@Column(name = "account_address")
	private String accountAddress;

	/**
	 * 邮箱
	 */
    @ApiModelProperty(value = "邮箱")
	@Column(name = "email")
	private String email;

	/**
	 * 入学时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "入学时间")
	@Column(name = "entrance_date")
	private Date entranceDate;

	/**
	 * 身份证号
	 */
    @ApiModelProperty(value = "身份证号")
	@Column(name = "identity_card_id")
	private String identityCardId;

	/**
	 * 名族
	 */
    @ApiModelProperty(value = "名族")
	@Column(name = "nation")
	private String nation;

	/**
	 * 籍贯
	 */
    @ApiModelProperty(value = "籍贯")
	@Column(name = "native_place")
	private String nativePlace;

	/**
	 * 照片
	 */
    @ApiModelProperty(value = "照片")
	@Column(name = "pictrue")
	private String pictrue;

	/**
	 * 政治面貌
	 */
    @ApiModelProperty(value = "政治面貌")
	@Column(name = "political_status")
	private String politicalStatus;

	/**
	 * 性别
	 */
    @ApiModelProperty(value = "性别")
	@Column(name = "sex")
	private String sex;

	/**
	 * 学生状态（休学、退学）
	 */
    @ApiModelProperty(value = "学生状态（休学、退学）")
	@Column(name = "status")
	private String status;

	/**
	 * 电话号码
	 */
    @ApiModelProperty(value = "电话号码")
	@Column(name = "tel_num")
	private String telNum;

	/**
	 * 毕业院校
	 */
    @ApiModelProperty(value = "毕业院校")
	@Column(name = "graduated_school")
	private String graduatedSchool;

	/**
	 * 是否可以毕业(0/1 否/是)
	 */
    @ApiModelProperty(value = "是否可以毕业(0/1 否/是)")
	@Column(name = "is_graduate")
	private Integer isGraduate;

	/**
	 * 无法毕业理由
	 */
    @ApiModelProperty(value = "无法毕业理由")
	@Column(name = "no_graduate_reason")
	private String noGraduateReason;

	/**
	 * 生源地
	 */
    @ApiModelProperty(value = "生源地")
	@Column(name = "original_place")
	private String originalPlace;

	/**
	 * 曾用名
	 */
    @ApiModelProperty(value = "曾用名")
	@Column(name = "used_name")
	private String usedName;

	/**
	 * 是否报到（0/1 否/是）
	 */
    @ApiModelProperty(value = "是否报到（0/1 否/是）")
	@Column(name = "is_registry")
	private Integer isRegistry;

	/**
	 * 缴费号
	 */
    @ApiModelProperty(value = "缴费号")
	@Column(name = "pay_number")
	private String payNumber;

	/**
	 * 宿舍id
	 */
    @ApiModelProperty(value = "宿舍id")
	@Column(name = "room_id")
	private String roomId;

	/**
	 * 年级id（从字典表获取年级信息）
	 */
    @ApiModelProperty(value = "年级id（从字典表获取年级信息）")
	@Column(name = "grade_id")
	private String gradeId;

	/**
	 * 微信openid
	 */
    @ApiModelProperty(value = "微信openid")
	@Column(name = "open_id")
	private String openId;


}
