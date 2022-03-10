package cn.penstaro.boot.controller;

import cn.penstaro.boot.entity.Dept;
import cn.penstaro.boot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/all")
    public ResponseEntity<List<Dept>> findAll(){
        return ResponseEntity.ok(deptService.findAllDeptDatas());
    }
}
