plugins {
	java
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.kumar"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	// https://mvnrepository.com/artifact/mysql/mysql-connector-java
	implementation("mysql:mysql-connector-java:8.0.33")

    // https://mvnrepository.com/artifact/com.google.guava/guava
    implementation("com.google.guava:guava:33.3.1-jre")

	//automatic reloading through spring boot devtools
	developmentOnly("org.springframework.boot:spring-boot-devtools:3.3.4")

	// Actuator - provides pre-defined endpoints
	implementation("org.springframework.boot:spring-boot-starter-actuator:3.3.4")

	//Lombok annotations
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	//Spring Boot Security Starter
//	implementation("org.springframework.boot:spring-boot-starter-security:3.3.4")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
