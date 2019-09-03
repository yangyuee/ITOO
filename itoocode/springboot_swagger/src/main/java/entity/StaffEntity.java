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
 * Staff实体
 * 教职工表
 *
 * @author 杨江涛 
 * @version 2.0.0
 * @since 2.0.0 2018-11-15 10:35:56
 */
@ApiModel(value = "StaffEntity:教职工表")
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tt_staff")
public class StaffEntity extends BaseEntity implements Serializable {

	/**
	 * 教师姓名
	 */
	@ApiModelProperty(value = "教师姓名",required = true)
	@Column(name = "name")
	private String name;

	/**
	 * 教师编码
	 */
	@ApiModelProperty(value = "教师编码",required = true)
	@Column(name = "code")
	private String code;

	/**
	 * 邮箱
	 */
    @ApiModelProperty(value = "邮箱")
	@Column(name = "email")
	private String email;

	/**
	 * 户口所在地
	 */
    @ApiModelProperty(value = "户口所在地")
	@Column(name = "account_address")
	private String accountAddress;

	/**
	 * 入职时间
	 */
	@JsonFormat(
        pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8"
    )
    @ApiModelProperty(value = "入职时间")
	@Column(name = "entrance_date")
	private Date entranceDate;

	/**
	 * 毕业院校
	 */
    @ApiModelProperty(value = "毕业院校")
	@Column(name = "graduate_school")
	private String graduateSchool;

	/**
	 * 身份证
	 */
    @ApiModelProperty(value = "身份证")
	@Column(name = "identity_card_id")
	private String identityCardId;

	/**
	 * 民族
	 */
    @ApiModelProperty(value = "民族")
	@Column(name = "nation")
	private String nation;

	/**
	 * 籍贯
	 */
    @ApiModelProperty(value = "籍贯")
	@Column(name = "native_placenative_place")
	private String nativePlacenativePlace;

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
	 * 教师工作状态（在职、 休职）
	 */
    @ApiModelProperty(value = "教师工作状态（在职、 休职）")
	@Column(name = "status")
	private String status;

	/**
	 * 电话号码
	 */
    @ApiModelProperty(value = "电话号码")
	@Column(name = "tel_num")
	private String telNum;

	/**
	 * 学位
	 */
    @ApiModelProperty(value = "学位")
	@Column(name = "degree")
	private String degree;

	/**
	 * 学历
	 */
    @ApiModelProperty(value = "学历")
	@Column(name = "education")
	private String education;

	/**
	 * 是否外聘(0/1 否/是)
	 */
    @ApiModelProperty(value = "是否外聘(0/1 否/是)")
	@Column(name = "is_external")
	private Integer isExternal;

	/**
	 * 是否有教师资格（0/1 否/是）
	 */
    @ApiModelProperty(value = "是否有教师资格（0/1 否/是）")
	@Column(name = "is_teacher")
	private Integer isTeacher;

	/**
	 * 现居地
	 */
    @ApiModelProperty(value = "现居地")
	@Column(name = "now_address")
	private String nowAddress;

	/**
	 * 职称_id
	 */
    @ApiModelProperty(value = "职称_id")
	@Column(name = "jobTitle_id")
	private String jobtitleId;

	/**
	 *  (导师制审核信息用)
	 */
    @ApiModelProperty(value = " (导师制审核信息用)")
	@Column(name = "tutuor_type")
	private String tutuorType;

	/**
	 * 是否为导师(0/1 否/是)
	 */
    @ApiModelProperty(value = "是否为导师(0/1 否/是)")
	@Column(name = "is_tutor")
	private Integer isTutor;

	/**
	 * 简介
	 */
    @ApiModelProperty(value = "简介")
	@Column(name = "brief")
	private String brief;

	/**
	 * 主要成就
	 */
    @ApiModelProperty(value = "主要成就")
	@Column(name = "achivement")
	private String achivement;

	/**
	 *  (导师制审核信息用)
	 */
    @ApiModelProperty(value = " (导师制审核信息用)")
	@Column(name = "check_or_not")
	private Integer checkOrNot;

	/**
	 * 职务id
	 */
    @ApiModelProperty(value = "职务id")
	@Column(name = "duty_id")
	private String dutyId;


}
