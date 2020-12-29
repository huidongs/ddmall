package pers.huidong.ddmall.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @USER: xhd
 * @DATE: 2020-12-29
 * @Desc:
 */
@SpringBootApplication(scanBasePackages = {"pers.huidong.ddmall.db","pers.huidong.ddmall.core","pers.huidong.ddmall.wx"})
@MapperScan("pers.huidong.ddmall.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class Application {
    public static void main(String[] args){
         SpringApplication.run(Application.class,args);
    }
}
