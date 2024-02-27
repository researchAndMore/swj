package com.example.sub_example.section.genericjavaclassowlmapper;

import com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.PEMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.uvek.mapper.UVEKMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericJavaClassOwlMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericJavaClassOwlMapperApplication.class, args);
        ClassLoader classLoader = GenericJavaClassOwlMapperApplication.class.getClassLoader();
        UVEKMapper.uvek(true, classLoader);
        PEMapper.plasticsEurope(true, classLoader);
    }




}
