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
mvn verify # run any checks on results of integration tests to ensure quality criteria are met
mvn install # install the package into the local repository
mvn package # take the compiled code and package it in the suitable format (jar, war...)
mvn deploy # done in building environment, copy final package to the remote repository for sharing.
```

## Steps:
1- Create an app with maven:
```
mvn archetype:generate
```
It will list you the projects templates.

2- Select project template number (e.g. 1732)
3- Fill out the fields: `groupId`, `artifactId`...
