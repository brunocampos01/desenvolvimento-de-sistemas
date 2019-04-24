## Apache Maven
- is a dependency management and a build automation
- use XML 
- example of a pom.xml 
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

- Strture diretory
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
    │   │   ├── DisplayDados.class
    │   │   ├── DisplayMesa$10.class
    │   │   ├── DisplayMesa$11.class
    │   │   ├── DisplayMesa$12.class
    │   │   ├── DisplayMesa$13.class
    │   │   ├── DisplayMesa$14.class
    │   │   ├── DisplayMesa$15.class
    │   │   ├── DisplayMesa$16.class
    │   │   ├── DisplayMesa$17.class
    │   │   ├── DisplayMesa$18.class
    │   │   ├── DisplayMesa$19.class
    │   │   ├── DisplayMesa$1.class
    │   │   ├── DisplayMesa$20.class
    │   │   ├── DisplayMesa$21.class
    │   │   ├── DisplayMesa$22.class
    │   │   ├── DisplayMesa$23.class
    │   │   ├── DisplayMesa$24.class
    │   │   ├── DisplayMesa$25.class
    │   │   ├── DisplayMesa$26.class
    │   │   ├── DisplayMesa$27.class
    │   │   ├── DisplayMesa$28.class
    │   │   ├── DisplayMesa$29.class
    │   │   ├── DisplayMesa$2.class
    │   │   ├── DisplayMesa$30.class
    │   │   ├── DisplayMesa$31.class
    │   │   ├── DisplayMesa$32.class
    │   │   ├── DisplayMesa$3.class
    │   │   ├── DisplayMesa$4.class
    │   │   ├── DisplayMesa$5.class
    │   │   ├── DisplayMesa$6.class
    │   │   ├── DisplayMesa$7.class
    │   │   ├── DisplayMesa$8.class
    │   │   ├── DisplayMesa$9.class
    │   │   ├── DisplayMesa.class
    │   │   ├── Jogador.class
    │   │   ├── Lance.class
    │   │   ├── Mesa.class
    │   │   ├── Regra.class
    │   │   └── TratamentoDado.class
    │   ├── imagens
    │   │   ├── borda_mesa_craps.PNG
    │   │   ├── come_v1.png
    │   │   ├── come_v2.png
    │   │   ├── craps_display_2000.png
    │   │   ├── craps_display_708x477.png
    │   │   ├── craps_display_800.png
    │   │   ├── craps_display_900.png
    │   │   ├── craps_display_968x677.png
    │   │   ├── craps_display_edited.png
    │   │   ├── craps_display_fundo.png
    │   │   ├── craps_display_small.png
    │   │   ├── dice_v1.jpg
    │   │   ├── dice_v2.png
    │   │   ├── dont_come_v1.png
    │   │   ├── dont_come_v2.png
    │   │   ├── dont pass bar2.png
    │   │   ├── dont_pass_bar.png
    │   │   ├── dont_pass_bar_v1.png
    │   │   ├── dont_pass_bar_v2.png
    │   │   ├── dont pass bar vertical0.png
    │   │   ├── dont_pass_bar_vertical.png
    │   │   ├── dont_pass_v1.png
    │   │   ├── dont_pass_vertical.png
    │   │   ├── eight_v1.png
    │   │   ├── eight_v2.png
    │   │   ├── field_v1.png
    │   │   ├── filed_v2.png
    │   │   ├── filed_v3.png
    │   │   ├── filed_v4.png
    │   │   ├── five_v1.png
    │   │   ├── five_v2.png
    │   │   ├── five_v3.png
    │   │   ├── five_v5.PNG
    │   │   ├── four_v1.png
    │   │   ├── four_v2.png
    │   │   ├── fundo_verde.png
    │   │   ├── hand.jpg
    │   │   ├── linha_branca.png
    │   │   ├── linha_branca_vertical.png
    │   │   ├── nine_v1.png
    │   │   ├── nine_v2.png
    │   │   ├── pass_line_horizontal_v1.png
    │   │   ├── pass_line_horizontal_v2.png
    │   │   ├── pass_line_horizontal_v3.png
    │   │   ├── pass_line_horizontal_v4.png
    │   │   ├── pass_line_v1.png
    │   │   ├── pass_line_v2.png
    │   │   ├── pass_line_vertical_v1.png
    │   │   ├── six_v1.png
    │   │   ├── six_v2.png
    │   │   ├── ten_v1.png
    │   │   └── ten_v2.png
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

### Compile
```bash
mvn clean install
```

### Problems
o Maven não adiciona o campo Main-Class no Manifest do jar gerado.
Enão após gerar o arquivo .jar e executar `java -jar <JAR_NAME>.jar` irá retornar o erro:
```xml
nenhum atributo de manifesto principal em
```
