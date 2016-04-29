package com.yimei;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by hongpf on 16/4/27.
 */
public interface UserService {
    String sayHello();
    LocalDate getTime() ;
    LocalDateTime getJava8LocalDate();
    BigDecimal getBigDecimal(BigDecimal b );
}