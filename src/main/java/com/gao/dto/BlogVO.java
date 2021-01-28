package com.gao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 博客列表页进行多条件查询时所使用的类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogVO {
    private String title;
    private Long typeId;
}
