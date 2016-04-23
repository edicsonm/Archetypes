# Archetypes
## Repositorio de "Archetypes" para maven
-. spring-webapp-archetype
Comandos: 
1. git init
2. git remote add origin https://github.com/edicsonm/Archetypes.git
3. git add --all
4. git commit -m "Initial Commit"
5. git pull origin master
   git push -u origin master


   Create a Maven Archetype from an existing project:
First navigate to the root directory of the source project and run the following maven command: mvn archetype:create-from-project
Copy the target/generated-sources/archetype to a new directory and evaluate for changes.
Once the archetype matches what we want. It’s time to install it locally and generate a sample project.
From the archetype root run mvn install.
Create a new project directory /Users/ryan/projects/new_sample.
Run the generate command mvn archetype:generate -DarchetypeCatalog=local
URL from reference:
https://www.luckyryan.com/2013/02/15/create-maven-archetype-from-existing-project/

# WebAppJSF
## Respositorio del Proyecto Base Usando JSF 2.0

1. git init 
2. git remote add origin https://github.com/edicsonm/WebAppJSF 
3. git add --all git commit -m "Initial Commit" 
4. git pull origin master 
5. git push -u origin master

