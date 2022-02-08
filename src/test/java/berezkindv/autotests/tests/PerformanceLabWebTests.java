package berezkindv.autotests.tests;

import berezkindv.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class PerformanceLabWebTests extends TestBase {

    @Test
    @Description("Page title should have header text")
    @DisplayName("Проверка текста заголовка")
    void titleTest() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
            open("https://www.performance-lab.ru"));

        step("Проверка заголовка страницы", () -> {
            String expectedTitle = "Перфоманс Лаб - Услуги по тестированию программного обеспечения";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Menu should have item 'Тестирование сайта'")
    @DisplayName("Проверка пункта 'Тестирование сайта' в верхнем меню")
    void menuProductsTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("hover on menu", () -> {
            $("#menu-item-317").$(byText("Услуги и продукты")).hover();
        });

        step ("Проверяем видимость пункта 'Тестирование сайта'", () -> {
            $("div[class='full_menu_top']").find(byText("Тестирование сайта")).shouldBe(visible);
        });
    }

    @Test
    @Description("Menu should have item 'Вакансии'")
    @DisplayName("Проверка пункта 'Вакансии' в верхнем меню")
    void menuVacanciesTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("hover on menu", () -> {
            $("#menu-item-1619").$(byText("Вакансии")).hover();
        });

        step ("Проверяем видимость пункта 'Вакансии'", () -> {
            $("div[class='full_menu_top']").find(byText("Вакансии")).shouldBe(visible);
        });
    }

    @Test
    @Description("Menu item 'Блог' check")
    @DisplayName("Проверка пункта 'Блог' в верхнем меню")
    void menuBlogTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("clock on menu", () ->
            $("#menu-item-2613").$(byText("Блог")).click());

        step ("Проверяем открылась ли страница 'Блог'", () -> {
            $("header[class='ee-blog-header']").find(byText("Блог")).shouldBe(visible);
        });
    }

    @Test
    @Description("Phone number check")
    @DisplayName("Проверка соответствия номера телефона '7-495-989-6165'")
    void phoneNumberTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("Проверяем соответствие номера телефона", () -> {
            $(".main-page").$("div[class='phone']").shouldHave(text("7-495-989-6165"));
        });
    }

    @Test
    @Description("Page console log should not have errors")
    @DisplayName("Проверка лога консоли на наличие ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
            open("https://www.performance-lab.ru"));

        step("Лог консоли не должен содержать текст 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Description("Social links should exist")
    @DisplayName("Проверка наличия ссылок социальных серей")
    void socialLinksShouldExist() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
                open("https://www.performance-lab.ru"));

        step("Проверяем ссылку на facebook.com", () -> {
            $(".usr-social-block").$("a[href*='facebook']").should(exist);
        });
        step("Проверяем ссылку на linkedin.com", () -> {
            $(".usr-social-block").$("a[href*='linkedin']").should(exist);
        });
        step("Проверяем ссылку на twitter.com", () -> {
            $(".usr-social-block").$("a[href*='twitter']").should(exist);
        });
        step("Проверяем ссылку на instagram.com", () -> {
            $(".usr-social-block").$("a[href*='instagram']").should(exist);
        });
        step("Проверяем ссылку на vk.com", () -> {
            $(".usr-social-block").$("a[href*='vk.com']").should(exist);
        });
        step("Проверяем ссылку на youtube.com", () -> {
            $(".usr-social-block").$("a[href*='youtube']").should(exist);
        });
    }
}