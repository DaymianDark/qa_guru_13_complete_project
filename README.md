# Проект по автоматизации тестирования Performance Lab
<a target="_blank" href="https://www.performance-lab.ru/">Вэб сайт Performance Lab</a>

## :pushpin: Содержание:

- Технологии и инструменты
- Функционал
- Терминал
- Jenkins
- Allure отчет
- Отчет в Telegram
- Видео пример прохождения тестов

## :rocket: Технологии и инструменты

<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="40" height="40"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="40" height="40"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="40" height="40"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="40" height="40"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="40" height="40"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="40" height="40"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>

## :scroll: Реальзованы проверки

- ✓ Проверка

## Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/berezkindv_performance_lab_complete_project/">Сборка в Jenkins</a>




### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
