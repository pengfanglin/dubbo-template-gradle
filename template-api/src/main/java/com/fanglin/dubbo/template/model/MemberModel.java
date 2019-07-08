package com.fanglin.dubbo.template.model;

import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * 用户实体类
 * @author 彭方林
 * @date 2019/4/3 14:20
 * @version 1.0
 **/
@Data
@Accessors(chain = true)
public class MemberModel implements Serializable {
    private Integer memberId;
    private String memberName;
    private String username;
    private String password;
    private String isDisable;
    private String roleIds;
    private Float memberBalance;
}
