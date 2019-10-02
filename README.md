Integration tests for Simple Filter
-------------------------------------
Here are a microservice and a proxy project which have to be cloned.

Proxy: ```git clone https://github.com/bokivaol/demo.git```

Microservice: ```git clone https://github.com/bokivaol/api.git```

Microservice is created using JAVA Spring Boot.

Integration test is written using JAVA Rest Assured library.
Test class is located in Proxy project in folder: ```demo\src\test\java\com\example\demo\apiTests```

To be able to run test:
1. Run ```DemoApplication``` which is located in **demo** project.
2. Run ```ApiApplication``` which is located in **api** project.

***Both these applications must be up and running before tests are started.***

In the ```ImageTests``` class there is one test, but inside of the test there are 2 assertions
which verify that:
- **test** value after passing **demo** proxy is base 64 encoded
- the encoded value is in fact **test**

If you want to test some other String value if they are encrypted, 
you can do so by entering some String as a value of the ```String imageBodyValue``` variable.
