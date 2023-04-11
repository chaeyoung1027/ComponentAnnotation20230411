package kr.hs.study.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestBean1 {
    @Autowired
    private Car data1;      //컨테이너에 Car type의 객체가 있으면 data1에 가져다 넣어라,
    @Autowired
    private Train data2;


    public Car getData1() {
        return data1;
    }

    public Train getData2() {
        return data2;
    }
}