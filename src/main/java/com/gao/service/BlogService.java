package com.gao.service;

import com.gao.dto.QueryRequest;
import com.gao.dto.DetailedBlog;
import com.gao.dto.FirstPageBlog;
import com.gao.dto.BlogVO;
import com.gao.dto.ShowBlog;
import com.gao.pojo.Blog;

import java.util.List;

public interface BlogService {

    ShowBlog getBlogById(Long id);

    List<QueryRequest> getAllBlog();

    int saveBlog(Blog blog);

    int updateBlog(ShowBlog showBlog);

    int deleteBlog(Long id);

    List<QueryRequest> getBlogBySearch(BlogVO searchBlog);

    List<FirstPageBlog> getAllFirstPageBlog();

    List<FirstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    //根据TypeId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTypeId(Long typeId);

    List<FirstPageBlog> getByTagId(Long tagId);
}
