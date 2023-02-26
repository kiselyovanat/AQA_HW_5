import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSolutionsTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void solutionsHoverTest() {
        open("/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".enterprise-hero").$("h1").shouldHave(text("Build like the best"));
    }
}
