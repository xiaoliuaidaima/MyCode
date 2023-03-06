package cn.itcast.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 十三叔
 * @date 2023/3/1
 * @apiNote
 */
@SpringBootApplication
public class CloudDubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDubboProviderApplication.class,args);
    }
}
