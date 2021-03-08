package pers.huidong.ddmall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @USER: xhd
 * @DATE: 2021-03-08
 * @Desc:
 */
@SpringBootApplication(scanBasePackages = {"pers.huidong.ddmall.db","pers.huidong.ddmall.core","pers.huidong.ddmall.admin"})
@MapperScan("pers.huidong.ddmall.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
