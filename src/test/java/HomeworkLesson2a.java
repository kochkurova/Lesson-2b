import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
class HomeworkLesson2a {
    @Test
    void homework(){
        //На главной странице GitHub выберите меню Solutions -> Enterprise с помощью команды hover для Solutions
        open("https:github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        //Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $("body").shouldHave(text("Build like the best"));
    }
}