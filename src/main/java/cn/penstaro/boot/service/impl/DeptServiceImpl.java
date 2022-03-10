package cn.penstaro.boot.service.impl;

import cn.penstaro.boot.mapper.DeptMapper;
import cn.penstaro.boot.entity.Dept;
import cn.penstaro.boot.service.DeptService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
@Service
@Transactional
@RequiredArgsConstructor
public class DeptServiceImpl implements DeptService {

    private final DeptMapper deptMapper;

    @Override
    public List<Dept> findAllDeptDatas() {
        LambdaQueryWrapper<Dept> queryWrapper = new LambdaQueryWrapper<>();
        return deptMapper.selectList(queryWrapper);
    }
}
