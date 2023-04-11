package kr.hs.study.config;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public Car c1(){
        return new Car(3, "3");}
    @Bean
    public Train t1(){
        return new Train("muGungHwa", 2,"ho");}
}
