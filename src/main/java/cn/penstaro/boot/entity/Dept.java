package cn.penstaro.boot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {
    @TableId
    private Integer deptno;
    private String dname;
    private String loc;
}
