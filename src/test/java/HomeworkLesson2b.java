import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
class HomeworkLesson2b {
    @Test
    void homework(){
        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенесите прямоугольник А на место В

        // это не работает
        //actions().moveToElement($(byTagAndText("header","A"))).clickAndHold().moveByOffset(217,0).release().perform();

        $(byTagAndText("header","A")).dragAndDropTo($(byTagAndText("header","B")));

        //Проверьте, что прямоугольники действительно поменялись
        $$("header").first().shouldHave(text("B"));

        //В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
    }
}
