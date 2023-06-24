# Проект автоматизации тестирования для <a target="_blank" href="https://my.b2broker.com/">B2broker</a> 

## :open_book: Содержание:
- [Технологии и инструменты](#gear-в-проекте-используются-следующие-технологии-и-инструменты)
- [Что проверяем](#heavy_check_mark-что-проверяем)
- [Запуск тестов из Jenkins](#-запуск-тестов-из-jenkins)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Отчеты](#bar_chart-отчеты-о-прохождении-тестов-доступны-в-allure)
- - [Allure](#-allure)
- - [Telegram](#-telegram)


## :gear: В проекте используются следующие технологии и инструменты:

<p align="center">
<img src="img/logo/Idea.svg" width="50" height="50"  alt="IDEA"/>
<img src="img/logo/Java.svg" width="50" height="50"  alt="Java"/>
<img src="img/logo/GitHub.svg" width="50" height="50"  alt="Github"/>
<img src="img/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="img/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="img/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="img/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
<img src="img/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="img/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
</p>

## :heavy_check_mark: Что проверяем

> - Проверка открывания страницы регистрации ;
> - Проверка открывания страницы восстановления пароля ;
> - Проверка переключения между языками ;
> - Проверка авторизации ;
> - Проверка наличия QR-code;
> - Проверка наличия информации о саппорте;
> - Проверка наличия кнопки отображения пароля.

## <img width="4%" title="Jenkins" src="img/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/b2broker_degree2/15/)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать с параметрами".
2. Выбрать параметры.
3. Нажать кнопку "Собрать".

### :earth_asia: Удаленный запуск тестов

```bash
clean
test
-DbrowserSize="${BROWSER_SIZE}"
-Dbrowser="${BROWSER}"
-DbrowserVersion="${BROWSER_VERSION}"
-DbaseUrl="${BASE_URL}"
-DremoteUrl="${REMOTE_URL}"
```

### :heavy_plus_sign: Параметры сборки

> - BROWSER (браузер)
> - VERSION (версия браузера)
> - RESOLUTION (размер окна браузера)
> - BASEURL (адрес сайта)

## :computer: Запуск тестов из терминала

Для локального запуска необходимо выполнить команду:
```
gradle clean
web_test
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="img/logo/Allure.svg"> Allure

#### Главная страница

<img src="img/screen/scr1.png" alt="Allure"/>

#### Тесты

<img src="img/screen/scr2.png" alt="Allure"/>

### <img width="3%" title="Telegram" src="img/logo/Telegram.svg"> Telegram

Настроена отправка оточета ботом в Telegram

<img src="img/screen/scr3.png" alt="Telegram"/>


