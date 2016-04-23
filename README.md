# Archetypes
## Repositorio de "Archetypes" para maven spring-webapp-archetype
## Comandos para subir el projecto a github
1. git init
2. git remote add origin https://github.com/edicsonm/Archetypes.git
3. git add --all
4. git commit -m "Initial Commit"
5. git pull origin master
6. git push -u origin master

## Create a Maven Archetype from an existing project:
1. First navigate to the root directory of the source project and run the following maven command: mvn archetype:create-from-project
2. Copy the target/generated-sources/archetype to a new directory and evaluate for changes.
3. Once the archetype matches what we want. It’s time to install it locally and generate a sample project.
4. From the archetype root run mvn install.
5. Create a new project directory /Users/ryan/projects/new_sample.
6. Run the generate command mvn archetype:generate -DarchetypeCatalog=local
7. URL from reference https://www.luckyryan.com/2013/02/15/create-maven-archetype-from-existing-project/
