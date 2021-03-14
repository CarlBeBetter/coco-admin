package cn.carl.std.cocoadmin.service.impl;

import cn.carl.std.cocoadmin.entity.vo.PageInfo;
import cn.carl.std.cocoadmin.entity.vo.Result;
import cn.carl.std.cocoadmin.service.CommonService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author zhangtao
 * @Title: CommonServiceImpl
 * @Package: cn.carl.std.cocoadmin.service.impl
 * @Description: 通用service
 * todo：具体实现
 * @date 3/14/21 9:17 PM
 */
@Slf4j
public class CommonServiceImpl<E,V,T> implements CommonService<E,V,T> {
    @Override
    public Result<PageInfo<E>> page(E vo) {
        return null;
    }

    @Override
    public Result<List<E>> list(E vo) {
        return null;
    }

    @Override
    public Result<E> get(T id) {
        return null;
    }

    @Override
    public Result<E> save(E vo) {
        return null;
    }

    @Override
    public Result<E> delete(T id) {
        return null;
    }
}
