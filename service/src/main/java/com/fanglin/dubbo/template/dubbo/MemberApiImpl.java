package com.fanglin.dubbo.template.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.fanglin.common.core.page.Page;
import com.fanglin.common.core.page.PageResult;
import com.fanglin.common.utils.BeanUtils;
import com.fanglin.dubbo.template.api.MemberApi;
import com.fanglin.dubbo.template.entity.MemberEntity;
import com.fanglin.dubbo.template.mapper.MapperFactory;
import com.fanglin.dubbo.template.model.MemberModel;
import com.github.pagehelper.PageRowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户微服务实现类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 14:20
 **/
@Service
@Component
public class MemberApiImpl implements MemberApi {
    @Autowired
    MapperFactory mapperFactory;

    /**
     * @param memberId
     * @return
     */
    @Override
    public MemberModel getMemberDetail(Integer memberId) {
        MemberEntity memberEntity = mapperFactory.memberMapper.selectByPrimaryKey(memberId);
        return BeanUtils.copy(memberEntity, MemberModel.class);
    }

    @Override
    public int updateMember(MemberModel member) {
        return mapperFactory.memberMapper.updateByPrimaryKeySelective(BeanUtils.copy(member, MemberEntity.class));
    }

    @Override
    public int insertMember(MemberModel member) {
        MemberEntity memberEntity = BeanUtils.copy(member, MemberEntity.class);
        mapperFactory.memberMapper.insertSelective(memberEntity);
        return memberEntity.getMemberId();
    }

    @Override
    public MemberModel getMemberByUsername(String username) {
        return BeanUtils.copy(mapperFactory.memberMapper.selectOne(new MemberEntity().setUsername(username)), MemberModel.class);
    }

    @Override
    public PageResult<MemberModel> getMemberList(Page page) {
        PageRowBounds pageRowBounds=new PageRowBounds(page.getPage(),page.getLimit());
        return new PageResult<>(BeanUtils.copy(mapperFactory.memberMapper.selectByRowBounds(null, pageRowBounds), MemberModel.class), pageRowBounds.getTotal());
    }

    @Override
    public String getAuthInfo(String roleIds) {
        return mapperFactory.memberMapper.getAuthInfo(roleIds);
    }
}
