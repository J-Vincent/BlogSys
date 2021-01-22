package com.gao;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.lang.reflect.InvocationTargetException;

@QuarkusMain
public class BlogApplication implements QuarkusApplication {


    public static void main(String[] args) {
            Quarkus.run(BlogApplication.class,args);
    }
    @Override
    public int run(String... args) {
        Quarkus.waitForExit();
        return 0;
    }
}
