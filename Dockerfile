FROM alpine:3.4

nkdir app
nkdit app/bin

ADD target/testng.xml app/bin/testng.xml

ENTRYPOINT java –cp Seltest-0.0.1-SANPSHOt.jar org.testng.TestNG testing.xml