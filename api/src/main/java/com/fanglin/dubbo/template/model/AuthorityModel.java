package com.fanglin.dubbo.template.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 权限实体类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:29
 **/
@Data
@Accessors(chain = true)
public class AuthorityModel implements Serializable {
    /**
     * 主键
     */
    private Long authorityId;
    /**
     * 权限名称
     */
    private String authorityName;
    /**
     * 权限标识
     */
    private String authorityValue;
    /**
     * 禁用
     */
    private String isDisable;
    private String isDisableShow;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public AuthorityModel setIsDisable(String isDisable) {
        this.isDisable = isDisable;
        this.isDisableShow = "0".equals(isDisable) ? "正常" : "禁用";
        return this;
    }
}
