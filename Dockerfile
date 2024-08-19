from eclipse-temurin:17
copy target/automationbuilding.jar automationbuilding.jar
cmd ["java","-jar","automationbuilding.jar"]