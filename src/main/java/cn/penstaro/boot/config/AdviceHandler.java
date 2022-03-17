package cn.penstaro.boot.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: Penstaro
 * @date: 2022/3/16
 * @Description:
 **/
@Component
@RestControllerAdvice
public class AdviceHandler  {

    @ExceptionHandler(IllegalArgumentException.class)
    public void exee(IllegalArgumentException e){
        System.out.println("=========================================== ");
        e.printStackTrace();
        System.out.println("=========================================== ");
    }
}
