/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
    application
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-dstu2:5.4.1")
    implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:5.4.1")
    implementation("com.google.code.gson:gson:2.8.7")
    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("org.eclipse.rdf4j:rdf4j-runtime:3.7.2")
    implementation("org.slf4j:slf4j-api:1.7.32")
//    implementation("org.slf4j:slf4j-simple:1.7.32")
    implementation("eu.optique-project:r2rml-api-core:0.6.0")
    implementation("eu.optique-project:r2rml-api-rdf4j-binding:0.6.0")
    implementation("org.apache.jena:jena-shex:4.2.0")
}

group = "org.fhircat"
version = "1"
description = "turtle-template"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

application {
    mainClassName = "org.fhircat.mapping.PatientMappingGenerator"
    //mainClassName = "examples.PatientMappingGenerator"
}