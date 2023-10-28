import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {

    int result;
    @BeforeAll
    static void beforeAll(){
        System.out.println("\n@BeforeALL\n");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("\nbeforeEach");
        result = getResult();
    }
    @Test
    void firstTest(){
        System.out.println("###   firstTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void secondTest(){
        System.out.println("###   secondTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void thirdTest(){
        System.out.println("###   thirdTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void fourthTest(){
        System.out.println("###   fourthTest()");
        Assertions.assertTrue(result>2);
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
        result = getResult();
    }

    @AfterAll
    static void afterAll(){
        System.out.println("\n@AfterALL\n");
    }
    private int getResult(){
        return 3;
    }
}

