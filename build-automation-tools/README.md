# Apache Maven
- It's a **dependency management and a build automation**
- use XML 
- example of a file `pom.xml` 
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>craps</groupId>
    <artifactId>game</artifactId>
    <version>craps</version>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>

        <dependency>
            <groupId>ant</groupId>
            <artifactId>ant</artifactId>
            <version>1.6.5</version>
        </dependency>

        <dependency>
            <groupId>netgames</groupId>
            <artifactId>netgames</artifactId>
            <scope>system</scope>
            <version>1.0</version>
            <systemPath>/home/campos/projetos/game-craps/src/main/resources/servidorNetGames/ngnrtFramework.jar</systemPath>
        </dependency>

    </dependencies>

</project>
```

- Structure directory
```editorconfig
.
├── craps2017.jar
├── game_craps.iml
├── LICENSE
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── dominioDoProblema
│   │   │   └── rede
│   │   └── resources
│   │       ├── documentacao-e-uml
│   │       ├── imagens
│   │       ├── readme.md
│   │       └── servidorNetGames
│   └── test
│       └── java
└── target
    ├── classes
    │   ├── documentacao-e-uml
    │   │   ├── CRAPS_entraga_final.vpp
    │   │   ├── CRAPS_entraga_final.vux
    │   │   ├── CRAPS_versão_final_2017.vpp
    │   │   ├── CRAPS_versão_final_2017.vux
    │   │   ├── formulário de pedido de tema de trabalho (jogo).pdf
    │   │   ├── readme.md
    │   │   ├── Release Notes.txt
    │   │   └── requisitos funcionais e não funcionais - CRAPS.pdf
    │   ├── dominioDoProblema
    │   │   ├── AtorJogador.class
    │   │   ├── CrapsTest.class
    │   │   ├── Dado.class
    │   │   ├── ...
    │   ├── imagens
    │   │   ├── borda_mesa_craps.PNG
    │   │   ├── come_v1.png
    │   │   ├── ...
    │   ├── readme.md
    │   ├── rede
    │   │   └── AtorNetGames.class
    │   └── servidorNetGames
    │       ├── jogoMultiPlayer.properties
    │       ├── NetGamesFileOffline.jar
    │       ├── ngnrtFramework.jar
    │       ├── server.properties
    │       └── servidor.jar
    ├── game-craps.jar
    ├── maven-archiver
    │   └── pom.properties
    └── maven-status
        └── maven-compiler-plugin
            ├── compile
            └── testCompile

```

## Compile
```bash
mvn clean install
```

## Run Test
- Execute
```bash
# Run all the unit test classes.
mvn test
```
- Skip
```
mvn clean install DSkipTests
```

## Problems
Execute `java -jar <JAR_NAME>.jar`
```xml
nenhum atributo de manifesto principal em
```
The Maven not add the filed `Main-Class` in generated `manisfest`.
