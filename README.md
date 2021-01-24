# HelloMaven

Project example to learn Maven step by step.

## Basic Commands
```
mvn -h # Help
mvn -version # info
```

## Maven Goal
Maven uses Goal to do a task in your application (like: `build`, `run`, `clean`...)
You can download external plugins and add more goals to your application.

The general syntax looks like: `mvn [<plugin-prefix>][:<plugin-version>]:<goal>`

## Maven Lifecycle
Available -default- lifecycle phases are:
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
P.S. When executing a Goal, are previous goals are automatically executed.


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

## Plugins:
Mave uses plugin architecture, you add your plugins to the `<build>` section in the `pom.xml` file.

### Examples:

1- Jetty Maven Plugin:
You can search for `jetty-maven-plugin` plugin and add it to your maven web app:
```
  <build>
    <finalName>MavenWebApp</finalName>
    <plugins>
		<plugin>
		    <groupId>org.eclipse.jetty</groupId>
		    <artifactId>jetty-maven-plugin</artifactId>
		   <version>9.4.36.v20210114</version>
		    <configuration>
		      <webApp>
		        <contextPath>/MavenWebApp</contextPath>
		      </webApp>
		   </configuration>
		 </plugin>
    </plugins>
    
  </build>
```

You can then run your web-app using the embedded jetty server using:
`mvn jetty:run`
or you can specify the port:
`mvn -Djetty.port=9090 jetty:run`
The app should be running on: `http://localhost:9090/MavenWebApp` where `MavenWebApp` is the name (or `artifactId`) of your app. 

 2- Tomcat Plugin:
 You can also use tomcat-maven plugin instead of jetty by adding these lines to your `pom.xml`:
 ```
 		<plugins>
 		...
         <!-- Tomcat Plugin -->
        <plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
        </plugin>
      </plugins>
 ```
 You can then run your web-app using the embedded jetty server using:
`mvn tomcat7:run`
 
