package com.mdubbo.registry.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mdubbo.registry.service.registryService;

/**
 * @Author 阁楼麻雀
 * @Date 2016-7-27
 * @Desc 服务实现类
 */
@Service()
public class registryServiceImpl implements registryService {

    public String Hello(String name) {
        return name+" say:HELLO WORLD!";
    }
}
