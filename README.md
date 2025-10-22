# Commons-Mobyapp
Repositorio para alojar clases y métodos comunes para la MobyApp.
Buscando las buenas prácticas y escribir código limpio y óptimo.

# Instrucciones de uso
Este repositorio es privado. Para poder usarlo, deberás darle credenciales de autenticación a Maven para que se pueda descargar la librería.

1. Generar un [Personal Access Token (PAT) (Classic)](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#creating-a-personal-access-token-classic). Asegúrate que el PAT tenga el scope de `read` y `write` en la opción `packages`.
2. Edita el archivo `$HOME\.m2\settings.xml`. Este archivo es la configuración de Maven a nivel de usuario. En este archivo deberás decirle a Maven dónde está este repositorio para descargar la librería y las credenciales de autenticación, ya que el repositorio es privado. Si el archivo no existe, créalo.
3. En el archivo `settings.xml`, agrega la siguiente información:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">

    <profiles>
        <profile>
            <id>github</id>
            <repositories>
                <!-- Repositorio central, este es el predeterminado -->
                <repository>
                    <id>central</id>
                    <url>https://repo1.maven.org/maven2</url>
                </repository>
                <!-- Agregar el repositorio para descargar la librería -->
                <repository>
                    <id>github</id>
                    <url>https://maven.pkg.github.com/Elcolora3x/Commons-Mobyapp</url>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>
    <!-- Agregar las credenciales de GitHub -->
    <servers>
        <server>
            <id>github</id>
            <username>TU_USERNAME_GITHUB</username>
            <password>TU_PERSONAL_ACCESS_TOKEN</password>
        </server>
    </servers>

</settings> 
```
4. Agrega la dependencia `libreriaclasescomunes` en el `pom.xml` en el microservicio que lo quieras usar:

```xml
<dependency>
  <groupId>io.github.elcolora3x</groupId>
  <artifactId>libreriaclasescomunes</artifactId>
  <version>ULTIMA_VERSION</version>
</dependency>
```

5. Desarrollar la MobyApp!

Para más información, romperle la puerta a el colo.