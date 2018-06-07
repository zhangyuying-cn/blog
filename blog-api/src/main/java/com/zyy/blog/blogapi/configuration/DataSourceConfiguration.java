package com.zyy.blog.blogapi.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DriverManagerDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author zyy.
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {
    private String dataSourceUrl = "jdbc:mysql://39.105.83.157:3306/blog?useSSL=false&amp;useUnicode=true&amp;characterEncoding=utf-8";

    private String dataSourcePwd = "CB2559900c04";

    private String dataSourceUser = "root";

    private String dataSourceDriver = "com.mysql.jdbc.Driver";

    @Bean(name = "dataSource")
    public DataSource dataSource() throws Exception {
        Class.forName(dataSourceDriver);
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create().type(ComboPooledDataSource.class);
        dataSourceBuilder.username(dataSourceUser);
        dataSourceBuilder.password(dataSourcePwd);
        dataSourceBuilder.url(dataSourceUrl);
        dataSourceBuilder.driverClassName(dataSourceDriver);
        return dataSourceBuilder.build();

//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//
//        driverManagerDataSource.setDriverClass(dataSourceDriver);
//        driverManagerDataSource.setJdbcUrl(dataSourceUrl);
//        driverManagerDataSource.setUser(dataSourceUser);
//        driverManagerDataSource.setPassword(dataSourcePwd);
//        return driverManagerDataSource;



    }


}
