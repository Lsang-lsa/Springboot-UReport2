package com.lsang.ureport2;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

/**
 * 配置
 * @author Lsang
 */
@ImportResource("classpath:ureport-console-context.xml")
@Configuration
public class UReportConfig implements EnvironmentAware {
    private Environment environment;

    @Override
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }

    @Bean
    public MyUReportPropertiesConfigure propertiesConfigure(){
        return new MyUReportPropertiesConfigure("application.yml");
    }

    @Bean
    public ServletRegistrationBean<UReportServlet> buildUreportServlet(){
        // "/ureport/*”是一定不能变的，否则系统将无法运行
        return new ServletRegistrationBean<UReportServlet>(new UReportServlet(), "/ureport/*");
    }

}
