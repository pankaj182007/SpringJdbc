package org.springJdbc;

import org.springJdbc.dao.StudentDao;
import org.springJdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean("ds")
    public DataSource dataSource()
    {
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("12345");
        return ds;
    }

    @Bean("jdbcTamp")
    public JdbcTemplate jdbcTemplate()
    {
     JdbcTemplate jdbcTemp=new JdbcTemplate();
     jdbcTemp.setDataSource(dataSource());
     return jdbcTemp;
    }
    @Bean("studentDaoImpl")
    public StudentDao studentDao()
    {
        StudentDaoImpl studentDao=new StudentDaoImpl();
        studentDao.setJdbcTemplate(jdbcTemplate());
        return studentDao;
    }
}
