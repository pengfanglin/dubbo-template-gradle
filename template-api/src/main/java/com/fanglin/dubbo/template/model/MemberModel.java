package com.fanglin.dubbo.template.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:20
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel(value = "用户")
public class MemberModel implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Integer memberId;
    @ApiModelProperty(value = "用户名称")
    private String memberName;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "是否禁用")
    private String isDisable;
    @ApiModelProperty(value = "角色id组合")
    private String roleIds;
    @ApiModelProperty(value = "余额")
    private Float memberBalance;
}
