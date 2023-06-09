package config;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    private static final WebConfig config = ConfigReader.Instance.read();

    @BeforeAll
    public static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        WebConfigForProject webConfigForProject = new WebConfigForProject(config);
        webConfigForProject.webConfig();

    }
}
