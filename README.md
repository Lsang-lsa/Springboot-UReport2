# Springboot-Ureport2-Demo

## 简介

基于Springboot的UReport2简单实现，连接本地mysql

## 搭建

### 1.添加依赖

在pom.xml中添加依赖：

```xml
<dependency>
    <groupId>com.bstek.ureport</groupId>
    <artifactId>ureport2-console</artifactId>
    <version>2.2.9</version>
</dependency>
```

最新版版本号可在https://mvnrepository.com/artifact/com.bstek.ureport/ureport2-console找到。

### 2.application.yml中添加：

```yml
ureport:
  debug: false
  disableFileProvider: false
  disableHttpSessionReportCache: true
  # 保存到本地
  fileStoreDir: D:/ureportfiles
```