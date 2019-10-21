package com.opslab.bean;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/*
@Data
@AllArgsConstructor
@NoArgsConstructor*/
@XmlRootElement(name = "family_member")
@XmlAccessorType(XmlAccessType.FIELD)
// 控制JAXB 绑定类中属性和字段的排序
/*@XmlType(propOrder = {
        "families"

})*/
public class ItvSysFamily  implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
    * 家庭账号
    */
    @XmlElement(name = "family_account")
    private Long familyAccount;

    /**
    * 手机号
    */
    private Long msisdn;

    /**
    * 成员生效时间
    */
    @XmlElement(name = "member_inure_time")
    private String memberInureTime;

    /**
    * 成员失效时间
    */
    @XmlElement(name = "member_expire_time")
    private String memberExpireTime;

    /**
    * 家庭归属地市
    */
    @XmlElement(name = "family_city")
    private Long familyCity;

    /**
    * 成员归属地市
    */
    @XmlElement(name = "member_city")
    private Long memberCity;

    /**
    * 成员类型
    */
    @XmlElement(name = "member_type")
    private Short memberType;



    /**
    * 失效时间
    */
    @XmlElement(name = "expire_time")
    private String expireTime;

    /**
    * 生效时间
    */
    @XmlElement(name = "inure_time")
    private String inureTime;

    /**
    * 名称(适用家庭01	本人11	丈夫12	妻子20	儿子30	女儿41	孙子42	孙女43	外孙子44	外孙女51	父亲52	母亲 61	祖父62	祖母63	外祖父64	外祖母71	哥哥73	弟弟75	姐姐77	妹妹99	其他)
    */
    @XmlElement(name = "call_name")
    private Short callName;

    /**
    * 用户类型（11 移动， 12,13,21 电信， 22,31 联通 32,42 铁通，43）
    */
    @XmlElement(name = "user_type")
    private Short userType;


    /**
    * 退出原因
    */
    @XmlElement(name = "exit_reason")
    private String exitReason;

    /**
    * 请求源
    */
    @XmlElement(name = "request_source")
    private String requestSource;

    /**
    * 接受时间
    */
    @XmlElement(name = "accept_time")
    private String acceptTime;

    /**
    * 生效类型(1立即生效  2次日生效  3次月生效)
    */
    @XmlElement(name = "inure_type")
    private Short inureType;

    /**
    *  选择处理id（家庭对应的产品）
    */
    @XmlElement(name = "option_deal_id")
    private Long optionDealId;

    /**
    * 可选处理姓名（家庭对应的产品名称）
    */
    @XmlElement(name = "option_deal_name")
    private String optionDealName;
    /**
     * 流水号id
     */
    @XmlElement(name = "operation_id")
    private Long operationId;
    /**
     * 用户名称
     */
    @XmlElement(name = "name")
    private String userName;
    /**
     * 操作码
     */
    private Integer action;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getFamilyAccount() {
        return familyAccount;
    }

    public void setFamilyAccount(Long familyAccount) {
        this.familyAccount = familyAccount;
    }

    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

    public String getMemberInureTime() {
        return memberInureTime;
    }

    public void setMemberInureTime(String memberInureTime) {
        this.memberInureTime = memberInureTime;
    }

    public String getMemberExpireTime() {
        return memberExpireTime;
    }

    public void setMemberExpireTime(String memberExpireTime) {
        this.memberExpireTime = memberExpireTime;
    }

    public Long getFamilyCity() {
        return familyCity;
    }

    public void setFamilyCity(Long familyCity) {
        this.familyCity = familyCity;
    }

    public Long getMemberCity() {
        return memberCity;
    }

    public void setMemberCity(Long memberCity) {
        this.memberCity = memberCity;
    }

    public Short getMemberType() {
        return memberType;
    }

    public void setMemberType(Short memberType) {
        this.memberType = memberType;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getInureTime() {
        return inureTime;
    }

    public void setInureTime(String inureTime) {
        this.inureTime = inureTime;
    }

    public Short getCallName() {
        return callName;
    }

    public void setCallName(Short callName) {
        this.callName = callName;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public String getExitReason() {
        return exitReason;
    }

    public void setExitReason(String exitReason) {
        this.exitReason = exitReason;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Short getInureType() {
        return inureType;
    }

    public void setInureType(Short inureType) {
        this.inureType = inureType;
    }

    public Long getOptionDealId() {
        return optionDealId;
    }

    public void setOptionDealId(Long optionDealId) {
        this.optionDealId = optionDealId;
    }

    public String getOptionDealName() {
        return optionDealName;
    }

    public void setOptionDealName(String optionDealName) {
        this.optionDealName = optionDealName;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }
}