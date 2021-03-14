package cn.carl.std.cocoadmin.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author zhangtao
 * @Title: PageInfo
 * @Package: cn.carl.std.cocoadmin.entity.vo
 * @Description: 分页对象 （参考JqGrid插件）
 * @date 3/14/21 8:37 PM
 * todo
 */

@Data
public class PageInfo<M> {
    //当前页码
    private int page;
    //页面大小
    private int pageSize;
    //排序字段
    private String sidx;
    //排序方式
    private String sord;
    //分页结果
    private List<M> rows;
    //总记录数
    private int records;
    //总页数
    private int total;



}
