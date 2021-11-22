package com.qxx.service.impl;

import com.qxx.entity.Blog;
import com.qxx.mapper.BlogMapper;
import com.qxx.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xuan
 * @since 2021-11-03
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
