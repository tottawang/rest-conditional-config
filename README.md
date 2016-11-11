# rest-coniditonal

### Run and build
Step-1 : 
./gradlew clean build

Step-2 :
java -jar -Dspring.profiles.active=linux build/libs/sample-0.0.1-SNAPSHOT.jar or
java -jar -Dspring.profiles.active=windows build/libs/sample-0.0.1-SNAPSHOT.jar

### Test
Run curl http://localhost:{your_sever_port}/api/condition
based on the profile, endpoint will return linux or windows