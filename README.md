cucumber-jvm-scrum-test
=======================

Demo Project

To run the test from commandline

mvn clean install

To run the test for a specific taq

mvn clean install -Dcucumber.options="--tags @bar"

To run a specific feature

mvn clean install -Dcucumber.option="classpath:com/scrum/features/login.feature"