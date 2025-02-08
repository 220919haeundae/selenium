package part1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginShouldFailTest {

    WebDriver driver;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naver.com");
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//        driver.close();
//    }

    @Test
    public void testLoggingIntoApplication() throws Exception {
        WebElement e = driver.findElement(By.className("MyView-module__naver_logo____Y442"));
        e.click();
        driver.findElement(By.name("id")).sendKeys("아이디");
        driver.findElement(By.name("pw")).sendKeys("비밀번호");
        driver.findElement(By.id("log.login")).click();

        Thread.sleep(1000);

        String result = driver.findElement(By.cssSelector("#err_common>.error_message")).getText();
        String expectedResult = "아이디(로그인 전화번호, 로그인 전용 아이디) 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }
}
