FROM alpine:3.8

WORKDIR /app/bin

ADD target/SelTest-0.0.1-SANPSHOT.jar SelTest-0.0.1-SANPSHOT.jar
ADD target/SelTest-0.0.1-SANPSHOT-tests.jar SelTest-0.0.1-SANPSHOT-tests.jar
ADD target/libs libs
ADD target/testng.xml testng.xml

ENTRYPOINT java –cp SelTest-0.0.1-SANPSHOT.jar:SelTest-0.0.1-SANPSHOT-tests.jar:libs/* org.testng.TestNG testng.xml