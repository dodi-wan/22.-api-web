
# Project final
## Task 21 Jayjay


### Automation Framework: Web UI + API (Cucumber + Java + Gradle)
#### Framework untuk automation testing web (saucedemo).

##### overview:
###### Project how to know difference positive test, negative test, behaviuor expected (expected failed in real case no failed)

###### properties:
- intellij idea or IDE
- CI github action
- java
- gradle
- Junit 5
- ci: Github Action
- org.junit:junit-bom:5.10.0
- org.junit.jupiter:junit-jupiter
- junit platform
- cucumber gherkin
- selenium
- github.bonigarcia
- net.java.dev.jna


##### structure
---
 ```markdown
   | Folder/File                   | Deskripsi                                                                                                                                                                                                               |
   |-------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
   | `.github/workflows/`          | Konfigurasi GitHub Actions CI/CD, file CI API@WEB.yml                                                                                                                                                                   |
   | `src/main/java/helper/api`    | helper for utilities for api using RestAssure similiar like postman header, content type, and set URL.                                                                                                                  |
   | `src/main/java/helper/driver` | helper for web setup browser, setting browser chrome, close browser.                                                                                                                                                    |
   | `src/main/resources`          | setup endpoint link URL dummyapi.io                                                                                                                                                                                     |
   | `src/main/resources/pages/api`| pages object model for api RestAssured get, post, put, delete, filter, and else                                                                                                                                         | 
   | `src/main/resources/pages/web`| pages object model for web saucedemo found locator element and return message notification                                                                                                                              |
   | `src/test/resources/api`      | story scenario for API, telling story how to get data api, create data, update data, edit data, delete data, filter data, and else                                                                                      |
   | `src/test/resources/web`      | story scenario for user using e-commerce, story how to login, log-out, checkout, click filter product, find bug, behaviour expected and else                                                                            |
   | `src/test/java/stepdef/api`   | langkah untuk menjalankan file gherkin disebut stepdef atau 'glue code' pada tahap ini akan memanggil class method page object model di repo src/main/java/pages/api menyesuaikan behaviour scenario test gherkin       |
   | `src/test/java/stepdef/web`   | langkah untuk menjalankan file gherkin disebut stepdef atau 'glue code' pada tahap ini akan memanggil class method page object model di repo src/main/java/pages/web menyesuaikan behaviour scenario test gherkin       |
   | `src/test/java/hooks`         | tujuannya untuk menjalankan kode sebelum dan sesudah atau seluruh suite test, agar clean dan terorganisir. seperti menyiapkan url, driver, close connection database dan test tidak terpengaruh dengan test sebelumnya  |
   | `src/test/java/runners        | untuk menjalankan test secara keseluruhan, per/scenario, beberapa test dengan anotasi. tujuannya untuk memberikan visual hasil test dan memberikan perintah untuk membuat report seperti; json, html dan sebagainya.    |
   | `target`                      | output report hasil runner test menyesuaikan format seperti; html, json, dan sebagainya                                                                                                                                 |
   | `build.gradle`                | depedensi konfigurasi Java, Junit, cucumber, RestAssured, json, web driver manager, selenium, and else                                                                                                                  |
```

### Setup & Run

1. Clone repository:
   ```bash
   git clone https://github.com/dodi-wan/22.-api-web.git
   cd automation-framework

2. Build & Test:
   ```bash
   ./gradlew build
   ./gradlew clean test

3. Report:
  ```bash
  for report target folder:
    - cucumber-report.html

