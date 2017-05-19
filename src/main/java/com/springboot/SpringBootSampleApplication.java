package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


/**
 * @ComponentScan({"com.springboot.mapper", "com.springboot.controller"})手动指定要扫描的包
 * @MapperScan 指定扫描mapper所在的包
 */
@SpringBootApplication(exclude={JpaRepositoriesAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@MapperScan("com.springboot.mapper")
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
}
