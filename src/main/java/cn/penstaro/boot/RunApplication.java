package cn.penstaro.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
@SpringBootApplication
@MapperScan("cn.penstaro.boot.mapper")
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);
    }
}
