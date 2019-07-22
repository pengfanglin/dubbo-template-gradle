package com.fanglin.dubbo.template.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:20
 **/
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "member")
public class MemberEntity {
    /**
     * 用户id
     */
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    private Integer memberId;
    /**
     * 用户名称
     */
    private String memberName;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 是否禁用
     */
    private String isDisable;
    /**
     * 角色组合
     */
    private String roleIds;
    /**
     * 余额
     */
    private Float memberBalance;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
