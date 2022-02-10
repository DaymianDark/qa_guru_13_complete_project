# Проект по автоматизации тестирования для Performance Lab
<a target="_blank" href="https://www.performance-lab.ru/">Вэб сайт Performance Lab</a>

## :pushpin: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="40" height="40"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="40" height="40"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="40" height="40"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="40" height="40"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="40" height="40"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="40" height="40"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>
</p>

## :scroll: Реализованные проверки

- ✓ Проверка заголовка страницы.
- ✓ Проверка меню "Услуги и продукты".
- ✓ Проверка меню "Вакансии".
- ✓ Проверка пункта меню "Блог".
- ✓ Проверка соответствия номера телефона.
- ✓ Проверка наличия ссылок социальных сетей.
- ✓ Проверка кнопки 'Сайт' на главной странице.
- ✓ Проверка кнопки 'Мобильное приложение' на главной странице.
- ✓ Проверка кнопки 'IT-система' на главной странице.
- ✓ Проверка Проверка лога консоли на наличие ошибок.

## <img src="images/Jenkins.svg" width="30" height="30"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/berezkindv_performance_lab_complete_project/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/berezkindv_performance_lab_complete_project/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserMobileView (название мобильного устройства, для примера iPhone X)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- videoStorage (адрес, по которому можно получить видео)
- threads (количество потоков)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

## <img src="images/Allure_Report.svg" width="30" height="30"  alt="Allure"/></a> Allure отчет

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>

### Тесты

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_tests.png">
</p>

### Гафики

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_graphics.png">
</p>

## <img src="images/Telegram.svg" width="30" height="30"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>

### <img src="images/Selenoid.svg" width="30" height="30"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video2.gif" width="250" height="153"  alt="video">
<img title="Selenoid Video" src="images/video3.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video4.gif" width="250" height="153"  alt="video">
</p>
