package com.crc.business.oa.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description TODO
 * @Author xiaoming
 * @Date 2021/10/25 14:25
 * @Version 1.0
 */
@Data
public class ProjectChangeData {
    @ApiModelProperty("uuId")
    public String uid;

    @ApiModelProperty("ldapId")
    private String ldapId;

    @ApiModelProperty("单据编号")
    private String documentNumber;

    @ApiModelProperty("审批状态")
    private String approvalStatus;

    @ApiModelProperty("城市公司")
    private String cityFirm;

    @ApiModelProperty("申请日期")
    private String applyDate;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("紧急程度")
    private String emergencyLevel;

    @ApiModelProperty("大区")
    private String region;

    @ApiModelProperty("项目")
    private String project;

    @ApiModelProperty("项目分期")
    private String projectStaging;

    @ApiModelProperty("申请部门")
    private String applyDepartment;

    @ApiModelProperty("经办人")
    private String operatorName;

    @ApiModelProperty("变更原因")
    private String reasonForChange;

    @ApiModelProperty("设计修改通知单编号")
    private String designModificationNoticeNumber;

    @ApiModelProperty("项目变更申请编号")
    private String projectChangeApplicationNumber;

    @ApiModelProperty("提出方")
    private String proposeName;

    @ApiModelProperty("是否考核")
    private String whetherAssess;

    @ApiModelProperty("变更类别")
    private String changeCategory;

    @ApiModelProperty("原因说明")
    private String reasonExplanation;

    @ApiModelProperty("变更部位及内容")
    private String changePartAndContent;

    @ApiModelProperty("变更部位现状")
    private String changeStatusPart;

    @ApiModelProperty("相关专业")
    private String relatedMajors;

    @ApiModelProperty("估计对工期的影响")
    private String estimateImpactConstructionPeriod;

    @ApiModelProperty("估计引起返工、窝工、报废等索偿之签证内容")
    private String estimatedContentOfClaim;

    @ApiModelProperty("此变更对预算的影响")
    private String impactOfThisChangeBudget;

    @ApiModelProperty("是否无效成本")
    private String invalidCost;

    @ApiModelProperty("责任部门")
    private String responsibleDepartment;

    @ApiModelProperty("无效成本金额")
    private String invalidCostAmount;

    @ApiModelProperty("是否合同内变更")
    private String whetherChangeContract;

    @ApiModelProperty("合约部估算说明")
    private String contractDepartmentEstimates;

    @ApiModelProperty("是否后补变更")
    private String whetherMakeChanges;

    @ApiModelProperty("是否计入有效累计变更")
    private String whetherIncludedEffectiveCumulativeChange;

    @ApiModelProperty("后补变更责任部门")
    private String subsequentChangeResponsibleDepartment;

    @ApiModelProperty("不计入有效累计变更原因")
    private String notIncludedEffectiveCumulativeChangeReason;

    @ApiModelProperty("项目施工进度")
    private String projectConstructionProgress;

    @ApiModelProperty("无效成本责任部门")
    private String ineffectiveCostResponsibleDepartment;

    @ApiModelProperty("成本增减说明")
    private String costIncreaseDecreaseDescription;

    @ApiModelProperty("变更预估金额合计")
    private String changeTotalEstimatedAmount;

    @ApiModelProperty("项目变更编号")
    private String itemChangeNumber;

    @ApiModelProperty("第三方单据编号")
    private String thirdPartyDocumentNumber;

    @ApiModelProperty("对应联系单编号")
    private String correspondingContactNumber;

    @ApiModelProperty("预计开始时间")
    private String estimatedStartTime;

    @ApiModelProperty("预计结束时间")
    private String estimatedEndTime;

    @ApiModelProperty("混合字段")
    private String mixedField;

    @ApiModelProperty("用于统计的城市公司")
    private String statisticsCityName;
}
