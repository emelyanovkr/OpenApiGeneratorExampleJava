plugins {
    id("java")
    id("org.springframework.boot") version "3.5.6"
    id("io.spring.dependency-management") version "1.1.7"
    id("org.openapi.generator") version "7.16.0"
}

group = "com.fidd.api"
version = "1.0.0"

// see https://openapi-generator.tech/docs/generators/spring
openApiGenerate {
    generatorName.set("spring")
    inputSpec.set("$rootDir/openapi/api.yaml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("com.fidd.api.controller")
    modelPackage.set("com.fidd.api.model")
    invokerPackage.set("com.fidd.api.invoker")
    // see https://openapi-generator.tech/docs/generators/spring/#config-options
    configOptions.set(
        mapOf(
            "useSpringBoot3" to "true",
            "interfaceOnly" to "false",
            "delegatePattern" to "false",
            "skipDefaultInterface" to "false",
            "useResponseEntity" to "true",
            "dateLibrary" to "java8",
            "useTags" to "true",
            "serializableModel" to "true",
            "useOptional" to "false",
            "unhandledException" to "false",
            "library" to "spring-boot",
            "hideGenerationTimestamp" to "true"
        )
    )

    globalProperties.set(
        mapOf(
            Pair("apis", ""), //no value or comma-separated api names
            Pair("models", ""), //no value or comma-separated api names
        )
    )

    generateApiTests.set(false)
    generateApiDocumentation.set(false)
    generateModelTests.set(false)
    generateModelDocumentation.set(false)
}

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.10")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation(kotlin("test"))

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}