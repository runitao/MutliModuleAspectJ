Refer to https://www.mojohaus.org/aspectj-maven-plugin/multimodule/mu't.html

* How to run
```
mvn clean package

java -cp ${HOME}/.m2//repository/org/aspectj/aspectjrt/1.9.7/aspectjrt-1.9.7.jar:${HOME}/.m2//repository/org/slf4j/slf4j-log4j12/1.7.25/slf4j-log4j12-1.7.25.jar:${HOME}/.m2//repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:${HOME}/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:./foo/target/foo-1.0-SNAPSHOT.jar:./bar/target/bar-1.0-SNAPSHOT.jar:./validation-api/target/validation-api-1.0-SNAPSHOT.jar:./validation-aspect/target/validation-aspect-1.0-SNAPSHOT.jar:./dev me.runitao.foo.Foo

java -cp ${HOME}/.m2//repository/org/aspectj/aspectjrt/1.9.7/aspectjrt-1.9.7.jar:${HOME}/.m2//repository/org/slf4j/slf4j-log4j12/1.7.25/slf4j-log4j12-1.7.25.jar:${HOME}/.m2//repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:${HOME}/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar:./foo/target/foo-1.0-SNAPSHOT.jar:./bar/target/bar-1.0-SNAPSHOT.jar:./validation-api/target/validation-api-1.0-SNAPSHOT.jar:./validation-aspect/target/validation-aspect-1.0-SNAPSHOT.jar:./dev me.runitao.bar.Bar
```
