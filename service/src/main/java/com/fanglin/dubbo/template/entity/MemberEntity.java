package com.fanglin.dubbo.template.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:20
 **/
@Data
@Accessors(chain = true)
@Table(name = "member")
public class MemberEntity implements Serializable {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    private Integer memberId;
    private String memberName;
    private String username;
    private String password;
    private String isDisable;
    private String roleIds;
    private Float memberBalance;
}
