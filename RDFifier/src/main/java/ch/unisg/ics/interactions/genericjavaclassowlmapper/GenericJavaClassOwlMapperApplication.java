package ch.unisg.ics.interactions.genericjavaclassowlmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.mapper.EcoSpold02Mapper.ec2mapper;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.PEMapper.plasticsEurope;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.mapper.UVEKMapper.uvek;

@SpringBootApplication
public class GenericJavaClassOwlMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericJavaClassOwlMapperApplication.class, args);
        ClassLoader classLoader = GenericJavaClassOwlMapperApplication.class.getClassLoader();
        uvek(true, classLoader);
        plasticsEurope(true, classLoader);
        ec2mapper(true, classLoader);
    }




}
