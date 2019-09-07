# Getting Started

### Libraries & Tech
* Maven
* SpringBoot 2.1.6
* SpringBoot DataJPA
* SpringBoot WebFlux
* MapStruct 1.3.0
* QueryDsl
* GoogleJavaFormat 1.7.0
* Lombok
* PostgreSQL
* Git hooks: pre-commit

### Setup ssh-rsa

```ssh-keygen``` Leave all empty except file name.
<br/>
```ssh-agent```
<br/>
```ssh-add ~.ssh/your_ssh_id```
<br/>
```ssh-add -l```
<br/>
```cat ~.ssh/your_ssh_id.pub```
<br/>
Add <b>Deploy keys</b> to github

### Configure your maven local repo

### Maven Command
#### Format Java Code
```shell script
mvn com.coveo:fmt-maven-plugin:format
```
#### Verify Java Code Format
```shell script
mvn com.coveo:fmt-maven-plugin:check
```
#### Clean
```shell script
mvn clean
```
#### Install
```shell script
mvn clean install
```
#### Release
```shell script
mvn release:prepare release:perform
```

### Commit changes
```shell script
git add .
git commit -m "<<Your commit message>>"
```