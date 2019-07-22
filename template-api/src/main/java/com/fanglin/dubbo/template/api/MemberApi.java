package com.fanglin.dubbo.template.api;

import com.fanglin.common.core.others.BusinessException;
import com.fanglin.common.core.page.Page;
import com.fanglin.common.core.page.PageResult;
import com.fanglin.dubbo.template.model.MemberModel;

/**
 * 用户微服务接口
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:18
 **/
public interface MemberApi {

    /**
     * 修改用户信息
     *
     * @param member
     * @return
     */
    int updateMember(MemberModel member) throws BusinessException;

    /**
     * 获取用户信息
     *
     * @param memberId
     * @return
     */
    MemberModel getMemberDetail(Integer memberId) throws BusinessException;

    /**
     * 添加用户
     *
     * @param member
     * @return
     */
    int insertMember(MemberModel member) throws BusinessException;

    /**
     * 通过用户名获取用户信息
     *
     * @param username
     * @return
     */
    MemberModel getMemberByUsername(String username) throws BusinessException;

    /**
     * 获取用户列表
     *
     * @param page
     * @return
     */
    PageResult<MemberModel> getMemberList(Page page) throws BusinessException;

    /**
     * 用户权限信息
     *
     * @param roleIds
     * @return
     */
    String getAuthInfo(String roleIds) throws BusinessException;
}
