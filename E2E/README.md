# Ejercicio de E2E opcion3
Author: Rodrigo Terán

![image](https://github.com/ttbr101081/E2E/assets/79415192/83d3ec01-4a33-4eac-9b4c-eab9bc3fadd1)


Proyecto generado con serenity, Junit5, maven, java, selenium 

1. Prerequisitos: 📃
   -  IDE IntelliJ version 2023.1
   -  Chrome versiom 107
   -  maven version 3.8.6
   -  Java SE - JDK version 1.8.0_202
  
   -  dependencias y versiones nesesarias
<dependencies>
        <!-- https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core -->
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>3.3.4</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/net.serenity-bdd/serenity-junit -->
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit</artifactId>
            <version>3.3.4</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.assertj/assertj-core -->
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>3.23.1</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all -->
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-all</artifactId>
            <version>1.3</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.8.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber -->
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-cucumber</artifactId>
            <version>3.3.4</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-opera-driver -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-opera-driver</artifactId>
            <version>4.4.0</version>
        </dependency>

    </dependencies>
    <build>

        <plugins>
            <plugin>

                <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin -->
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>

                    <skip>
                        true
                    </skip>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>2.19.1</version>
                <configuration>

                    <includes>
                        <include>
                            **/*Runner.java
                        </include>
                    </includes>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>

                <groupId>net.serenity-bdd.maven.plugins</groupId>
                <artifactId>serenity-maven-plugin</artifactId>
                <version>3.2.5</version>
                <configuration>
                    <!--<tags>
                        smoke
                    </tags>-->
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>net.serenity-bdd</groupId>
                        <artifactId>serenity-junit</artifactId>
                        <version>3.3.4</version>
                    </dependency>
                </dependencies>
                <executions>
                    <execution>
                        <id>serenity-reports</id>
                        <phase>post-integration-test</phase>
                        <goals>
                            <goal>
                                aggregate
                            </goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>



2. Instrucciones para correr Automatizaciones: ✔️
   - Abrir IntelliJ
   - Abrir proyecto "E2E"
  
   **** EJECUTAR ****

   - Abrir terminal
   - Escribir el siguiete comando "mvn clean verify"
     
   
   ![image](https://github.com/ttbr101081/E2E/assets/79415192/7d64de8c-b6bf-4cc8-b5ba-ca96fc2b3af3)

  

**** VER LOS INFORMES GENERADOS AL CORRER ****

* Abrir Carpeta "target"
* Abrir Carpeta "sites"
* Abrir Carpeta "serenity"

![image](https://github.com/ttbr101081/E2E/assets/79415192/6da48c29-9f05-4fd3-b4ea-864e0457b8a4)

  
* click en index.html"
* click derecho opcion "open in" opcion "Browser"
* Elegimos browser

 ![image](https://github.com/ttbr101081/E2E/assets/79415192/f806181f-2942-4399-96bf-6b1941e9850f)

**** VER LOS INFORMES SUBIDOS ****

* Abrir Carpeta E2E
* Descomprimir carpeta "sites"

![image](https://github.com/ttbr101081/E2E/assets/79415192/7e01543f-e16d-4749-8665-29d4068faef1)

  
* Abrir carpeta "sites" luego abrir carpeta "serenity"
* abrir archivo "index.html"

![image](https://github.com/ttbr101081/E2E/assets/79415192/9922ccce-c910-491c-9e5e-8eb98a742102)

![image](https://github.com/ttbr101081/E2E/assets/79415192/598da11b-2a13-4e74-9aeb-432d34d35c89)
