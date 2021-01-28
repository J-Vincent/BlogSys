package com.gao.repository;

import com.gao.pojo.Blog;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author sixkery
 * @date 2019/11/24
 */
public interface EsBlogRepository extends ElasticsearchRepository<Blog, Long> {
}
