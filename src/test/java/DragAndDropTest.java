import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class DragAndDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }
    @Test
    void dragAndDropTest() {
        open("/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").$("header").shouldHave(text("B"));
        $("#column-b").$("header").shouldHave(text("A"));

    }
}
