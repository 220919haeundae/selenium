package part2.com.demo.tests.products;

import com.demo.pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import part2.com.demo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() throws Exception {
        ProductsPage productsPage = loginPage.logIntoApplication("네이버 아이디", "네이버 비번");

        Thread.sleep(1000);

        Assertions.assertTrue(productsPage.isProductsHeaderDisplayed());

    }

}
