package cn.penstaro.boot.service;

import cn.penstaro.boot.entity.Dept;

import java.util.List;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
public interface DeptService {
    List<Dept> findAllDeptDatas();
}
