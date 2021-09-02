package com.lsang.ureport2;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * 内置数据源
 * @author Lsang
 */
@Slf4j
@Component
public class UReportDatasource implements BuildinDatasource{

    @Autowired
    private DataSource dataSource;

    private static final String NAME = "ZZB_SGGB";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            log.error("获取ZZB_SGGB数据源失败");
            e.printStackTrace();
        }
        return null;
    }
}
