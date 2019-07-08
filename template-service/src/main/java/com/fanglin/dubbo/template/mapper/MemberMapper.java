package com.fanglin.dubbo.template.mapper;


import com.fanglin.dubbo.template.entity.MemberEntity;
import tk.mybatis.mapper.common.Mapper;

/**
 * 用户mapper
 * @author 彭方林
 * @date 2019/4/3 14:21
 * @version 1.0
 **/
public interface MemberMapper extends Mapper<MemberEntity> {
    /**
     * 用户权限信息
     * @param roleIds 角色id组合
     * @return
     */
    String getAuthInfo(String roleIds);
}
