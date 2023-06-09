package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
}
)

public interface WebConfig extends Config {


    @Key("browser")
    @DefaultValue("chrome")
    Browser getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1440x812")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://stand-qa-06-my.b2broker.tech/")
    String getBaseUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}


