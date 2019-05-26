package com.demo.service.impl;

import com.demo.entity.Test;
import com.demo.mapper.TestMapper;
import com.demo.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Raynor
 * @since 2019-05-26
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
