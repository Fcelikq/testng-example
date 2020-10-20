
# keytorc-testng-kickstart

## What is Testng 
TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use, such as:


* Annotations.
* Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
* Test that your code is multithread safe.
* Flexible test configuration.
* Support for data-driven testing (with @DataProvider).
* Support for parameters.
* Powerful execution model (no more TestSuite).
* Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
* Embeds BeanShell for further flexibility.
* Default JDK functions for runtime and logging (no dependencies).
* Dependent methods for application server testing.

## Requirements
Maven : https://maven.apache.org

Java Jdk : https://www.oracle.com/tr/java/technologies/javase-downloads.html 

Or you can use intellij : [Intellij Download](https://www.jetbrains.com/idea/)    intellij have  maven and jdk.

if driver version expired or you have different version then get latest or your version:

Chrome Driver : https://chromedriver.chromium.org/

Gecko Driver : https://github.com/mozilla/geckodriver/releases


## Maven install
```
$ sudo apt install maven
$ sudo sh get-docker.sh
$ mvn -version
```
## Java jdk 11 install

```
$ sudo add-apt-repository ppa:openjdk-r/ppa
$ sudo apt-get update
$ sudo apt install openjdk-11-jdk
```


### Start Test
```
 $ cd "Test Project folder"
 $ mvn test  
```


