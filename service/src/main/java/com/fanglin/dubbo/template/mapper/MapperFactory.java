package com.fanglin.dubbo.template.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * mapper工厂
 * @author 彭方林
 * @date 2019/4/3 14:20
 * @version 1.0
 **/
@Component
public class MapperFactory {
    @Autowired
    public MemberMapper memberMapper;
}
