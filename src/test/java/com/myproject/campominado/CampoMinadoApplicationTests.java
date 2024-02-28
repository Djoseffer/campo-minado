package com.myproject.campominado;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CampoMinadoApplicationTests {

    @Test
    void contextLoads() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

    @Test
    void testarSeIgualATres(){
        int x = 2 + 10 - 9;
        assertEquals(3, x);
    }
}
