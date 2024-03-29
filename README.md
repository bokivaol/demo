Integration tests for Simple Filter
-------------------------------------
To be able to run the test you have to clone both applications Microservice(project ***api***) and Proxy(project ***demo***).

Here is the ***demo*** project which has to be cloned.

- ***demo project***: ```git clone https://github.com/bokivaol/demo.git```

- ***api*** project is created by using JAVA Spring Boot. It can be cloned from the following link [api](https://github.com/bokivaol/api)

Integration test is written by using JAVA Rest Assured library.
Test class is located in [demo](https://github.com/bokivaol/demo) project in the folder: ```src\test\java\com\example\demo\apiTests```

To be able to run test:
1. Run ```DemoApplication``` class which is located in **demo** project(current project).
2. Run ```ApiApplication``` class which is located in [api](https://github.com/bokivaol/api) project.

***Both these applications must be up and running before tests are started.***

In the ```ImageTests``` class there is one test, but inside of that test there are 3 assertions
which verify that:
- Response status code is 200 OK.
- **test** value after passing **demo** proxy is base 64 encoded
- The encoded value is in fact **test**

Test could be started in different ways.

***Way No. 1 to run the tests using IDE***

To run the test:
- Use some IDE for eg. IntelliJ.
- Git clone both ***demo*** and ***api*** projects
- Using IntelliJ go into ***demo*** project in the folder ```src\main\java\com\example\demo```
- Open ```DemoApplication``` file using IntelliJ
- Right click in the opened file
- Click on Run
- Using IntelliJ go into ***api*** project in the folder ```src\main\java\com\example\api```
- Open ```ApiApplication``` file using IntelliJ
- Right click in the opened file
- Click on Run
- Using IntelliJ go into ***demo*** project in the folder ```src\test\java\com\example\demo\apiTests```
- Open ```ImageTests``` file
- Right click in the opened file
- Click on Run

***Way No. 2 to run the tests using Cmder***

To run the test:
- Install Cmder if you are using Windows
- Git clone both ***demo*** and ***api*** projects
- Open one tab in Cmder
- Navigate to ***demo*** project root folder
- Run ```mvn spring-boot:run```
- Open new (2nd) tab in Cmder
- Navigate to ***api*** project root folder
- Run ```mvn spring-boot:run```
- Open new (3rd) tab in Cmder
- Navigate to ***demo*** project root folder
- Run ```mvn test```

If you want to test some other String value wheather or not it is encrypted, you can do so by entering some String as a value of the ```String imageBodyValue``` variable which is located in ```ImageTests``` file.
