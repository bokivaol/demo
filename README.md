Integration tests for Simple Filter
-------------------------------------
To be able to run test you have to clone both applications Microservice(project ***api***) and Proxy(project ***demo***)
Here is a Proxy project which has to be cloned.

Proxy: ```git clone https://github.com/bokivaol/demo.git```

[Microservice](https://github.com/bokivaol/api) application is created using JAVA Spring Boot.

Integration test is written using JAVA Rest Assured library.
Test class is located in [Proxy](https://github.com/bokivaol/demo) project in folder: ```src\test\java\com\example\demo\apiTests```

To be able to run test:
1. Run ```DemoApplication``` which is located in **demo** project(current project).
2. Run ```ApiApplication``` which is located in [api](https://github.com/bokivaol/api) project.

***Both these applications must be up and running before tests are started.***

In the ```ImageTests``` class there is one test, but inside of the test there are 2 assertions
which verify that:
- **test** value after passing **demo** proxy is base 64 encoded
- the encoded value is in fact **test**

Test could be started in different ways.

***Way No. 1 to run the tests using IDE***

To run the test:
- Use some IDE for eg. IntelliJ.
- Go into ***demo*** project in folder ```src\main\java\com\example\demo```
- Open ```DemoApplication``` file using IntelliJ
- Right click in the opened file
- Click on Run
- Go into ***api*** project in folder ```src\main\java\com\example\api```
- Open ```ApiApplication``` file using IntelliJ
- Right click in the opened file
- Click on Run
- Go into ***demo*** project in folder ```src\test\java\com\example\demo\apiTests```
- Open ```ImageTests``` file
- Right click in the opened file
- Click on Run

***Way No. 1 to run the tests using Cmder***

To run the test:

If you want to test some other String value if they are encrypted, 
you can do so by entering some String as a value of the ```String imageBodyValue``` variable.
