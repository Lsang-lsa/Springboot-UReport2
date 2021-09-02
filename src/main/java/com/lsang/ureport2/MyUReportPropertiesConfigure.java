package com.lsang.ureport2;

import com.bstek.ureport.UReportPropertyPlaceholderConfigurer;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;


/**
 * 继承UReportPropertyPlaceholderConfigurer，装载application.yml
 * @author Lsang
 */
public class MyUReportPropertiesConfigure extends UReportPropertyPlaceholderConfigurer {
    public MyUReportPropertiesConfigure(String path){
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
        yaml.setResources(new ClassPathResource(path));
        this.setProperties(yaml.getObject());
    }
}
