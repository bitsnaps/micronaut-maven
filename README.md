# HelloMaven

Project example to learn Maven step by step.

## Basic Commands
```
mvn -h # Help
mvn -version # info
```
## Maven Lifecycle
```
mvn validate # make sure the project is valid
mvn compile # compile the source of the project
mvn test # test using the suitable testing framework
mvn integration-test # process and deploy the package if necessary into an environment where integration tests can be run
mvn verify # run any checks on results of integration tests to ensure quality criteria are met
mvn install # install the package into the local repository
mvn package # take the compiled code and package it in the suitable format (jar, war, ear...)
mvn deploy # done in building environment, copy final package to the remote repository for sharing.
```
When execute a Goal, the previous goal is automatically executed.

## Steps:
1- Create an app with maven:
```
mvn archetype:generate
```
It will list you the projects templates.

2- Select project template number (e.g. 1732)
3- Fill out the fields:
- `groupId` (e.g. `com.corposense`)
- `artifactId` (e.g. `HelloMaven`)
- `version` (e.g. `1.0-SNAPSHOT`)
- `package` (e.g. `com.corposense.app`)
then enter `Y` to confirm and create the project.
P.S. The project should be created along with `pom.xml` (Project Object Model).
4- Compile the build the project:
```
mvn compile
mvn package
```
5- You can then run the project:
```
java -cp target\HelloMaven-1.0-SNAPSHOT.jar com.corposense.app.App
```
