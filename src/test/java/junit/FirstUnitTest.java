package junit;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;


public class FirstUnitTest {

    @BeforeAll
    static void beforeAll(){
        //Configuration.browser = chrome;
        System.out.println( "Это метод @beforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Это метод @AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Это метод @beforeEatch для предусловий");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Это метод @AfterEach для постусловий");
    }

    @Test
    void firstTest() {
        System.out.println("Это firstTest()");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest(){
        System.out.println("Это secondTest()");
        Assertions.assertTrue(3 > 2);
    }
}
