import Base.BaseCore;
import Base.ConfigReader;
import Base.Screenshot;
import MailTestUI.CreateMail;
import MailTestUI.MailAuthorization;
import MailTestUI.MailRecoveryCheck;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(Screenshot.class)
public class TestIPR extends BaseCore {
    MailAuthorization mailAuthorization = new MailAuthorization(driver);
    CreateMail createMail = new CreateMail(driver);
    MailRecoveryCheck mailRecoveryCheck = new MailRecoveryCheck();

    @Test
    @Description("Проверка адреса сайта")
    @Owner("Иванов Иван Иванович iii@mail.ru")
    public void mailHomePage() {
        setURL(ConfigReader.URL);
        Assertions.assertEquals(ConfigReader.URL, driver.getCurrentUrl());

    }

    @Test
    @Description("Проверка кнопки Войти")
    @Owner("Иванов Иван Иванович iii@mail.ru")
    public void buttonEntry() {
        setURL(ConfigReader.URL);
        mailAuthorization.pressLoginButton();
        mailAuthorization.elementVisibilityCheck();

    }

    @Test
    @Description("Проверка кнопки Создать почту")
    @Owner("Иванов Иван Иванович iii@mail.ru")
    public void buttonCreateMail() {
        setURL(ConfigReader.URL);
        createMail.checkButtonCreateMail();
        createMail.elementVisibility();

    }

    @Test
    @Description("Проверка кнопки Создать почту")
    @Owner("Иванов Иван Иванович iii@mail.ru")
    public void mailRecovery(){
        setURL(ConfigReader.URL);
        mailRecoveryCheck.chekRecovery("pupkin@mail.ru");
    }
}
