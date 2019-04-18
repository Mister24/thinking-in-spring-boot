/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter6.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * 数据源配置
 *
 * @author mr.24
 * @version Id: DataSourceConfig, v 1.0 2019-04-17 22:32 Exp $$
 */
@Configuration
public class DataSourceConfig implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID     = -3772211249328429086L;

    /** ds.url */
    private static final String SPRING_DS_URL      = "spring.datasource.url";

    /** ds.username */
    private static final String SPRING_DS_USERNAME = "spring.datasource.username";

    /** ds.password */
    private static final String SPRING_DS_PASSWORD = "spring.datasource.password";

    /** ds.driver */
    private static final String SPRING_DS_DRIVER   = "spring.datasource.driver-class-name";

    /**
     * 配置数据源信息
     *
     * @param environment 环境上下文
     *
     * @return            数据源信息
     */
    @Bean(name = "dataSource")
    public DataSource dataSource(Environment environment) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(environment.getProperty(SPRING_DS_URL));
        dataSource.setUsername(environment.getProperty(SPRING_DS_USERNAME));
        dataSource.setPassword(environment.getProperty(SPRING_DS_PASSWORD));
        dataSource.setDriverClassName(environment.getProperty(SPRING_DS_DRIVER));

        return dataSource;
    }
}