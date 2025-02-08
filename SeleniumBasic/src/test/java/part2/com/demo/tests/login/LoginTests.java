package part2.com.demo.tests.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import part2.com.demo.base.BaseTest;

public class LoginTests extends BaseTest {

    String expectedResult = "아이디(로그인 전화번호, 로그인 전용 아이디) 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";

    @Test
    public void testLoginErrorMessage() throws Exception {
        loginPage.setUsername("네이버 아이디");
        loginPage.setPassword("네이버 비밀번호");
        loginPage.clickLoginButton();
        Thread.sleep(1000);
        String actualMessage = loginPage.getErrorMessage();
        Assertions.assertTrue(actualMessage.contains(expectedResult));
    }
}
