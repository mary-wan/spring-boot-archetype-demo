# 𝐌𝐚𝐯𝐞𝐧 𝐀𝐫𝐜𝐡𝐞𝐭𝐲𝐩𝐞𝐬: 𝐒𝐭𝐚𝐧𝐝𝐚𝐫𝐝𝐢𝐳𝐞 𝐚𝐧𝐝 𝐒𝐢𝐦𝐩𝐥𝐢𝐟𝐲 𝐘𝐨𝐮𝐫 𝐏𝐫𝐨𝐣𝐞𝐜𝐭 𝐂𝐫𝐞𝐚𝐭𝐢𝐨𝐧

🎯 **𝐃𝐞𝐟𝐢𝐧𝐢𝐭𝐢𝐨𝐧**: An archetype in Maven is like a project template or blueprint. It provides a consistent way to generate new Maven projects with predefined structures, dependencies, and configurations.

🎯 **𝐏𝐮𝐫𝐩𝐨𝐬𝐞**: Archetypes standardize project creation, ensuring all developers start on the same foundation. They're instrumental when you want to follow a specific project structure or create projects with similar characteristics.

🎯 **𝐇𝐨𝐰 𝐃𝐨 𝐀𝐫𝐜𝐡𝐞𝐭𝐲𝐩𝐞𝐬 𝐖𝐨𝐫𝐤?**

### 𝑪𝒓𝒆𝒂𝒕𝒊𝒏𝒈 𝒂 𝑵𝒆𝒘 𝑷𝒓𝒐𝒋𝒆𝒄𝒕:
💡 When creating a new Maven project, you can use an archetype to kickstart it.  
💡 Archetypes encapsulate everything needed for a specific type of project (e.g., web application, Maven plugin).  

### 𝑪𝒐𝒏𝒔𝒊𝒔𝒕𝒆𝒏𝒕 𝑷𝒓𝒐𝒋𝒆𝒄𝒕 𝑺𝒕𝒓𝒖𝒄𝒕𝒖𝒓𝒆:
💡 Archetypes define the directory structure, initial files, and essential configurations.  
💡 Developers don't have to reinvent the wheel—they start with a well-defined layout.  

### 𝑪𝒖𝒔𝒕𝒐𝒎𝒊𝒛𝒂𝒕𝒊𝒐𝒏:
💡 Archetypes allow parameterization. You can provide values during project creation (e.g., group ID, artifact ID, version).  
💡 This flexibility ensures that generated projects adapt to your specific needs.  

🎯 **𝐔𝐬𝐞 𝐂𝐚𝐬𝐞𝐬 𝐟𝐨𝐫 𝐌𝐚𝐯𝐞𝐧 𝐀𝐫𝐜𝐡𝐞𝐭𝐲𝐩𝐞𝐬**

### 𝑺𝒕𝒂𝒏𝒅𝒂𝒓𝒅𝒊𝒛𝒊𝒏𝒈 𝑻𝒆𝒂𝒎 𝑷𝒓𝒐𝒋𝒆𝒄𝒕𝒔:
💡 In a team, everyone follows the same project structure and conventions.  
💡 Archetypes ensure consistency across multiple projects.  

### 𝑸𝒖𝒊𝒄𝒌 𝑷𝒓𝒐𝒋𝒆𝒄𝒕 𝑺𝒆𝒕𝒖𝒑:
💡 Instead of manually creating directories and files, use an archetype.  
💡 Within seconds, you have a working Maven project.  

### 𝑩𝒂𝒔𝒆𝒍𝒊𝒏𝒆 𝒇𝒐𝒓 𝑵𝒆𝒘 𝑨𝒑𝒑𝒍𝒊𝒄𝒂𝒕𝒊𝒐𝒏𝒔:
💡 Open-source projects (like Apache Wicket or Apache Cocoon) use archetypes.  
💡 End-users get a solid foundation for their applications.

🎯 **𝐂𝐮𝐬𝐭𝐨𝐦 𝐒𝐩𝐫𝐢𝐧𝐠 𝐁𝐨𝐨𝐭 𝐒𝐭𝐚𝐫𝐭𝐞𝐫𝐬**

💡 Custom starters simplify dependency management by bundling common dependencies, configurations, and best practices for specific use cases.

💡 They promote code reuse and standardization across projects, reducing boilerplate code.

💡 With custom starters, developers can quickly set up new applications with pre-configured settings, enhancing productivity.

💡 Utilizing a custom starter streamlines the developer's tasks by handling aspects such as validation and logging, allowing them to concentrate solely on the business logic.


🎯 **How to run the project**

1. Clone the repository.
2. `cd /demo-spring-boot-starter`
3. Run `mvn clean install` to build the package. This creates the jar file `0.0.1-SNAPSHOT`.
4. `cd /spring-boot-archetype`
5. Run `mvn archetype:create-from-project`. This generates the archetype that we will use to generate our projects.
6. `cd /spring-boot-archetype/target/generated-sources/archetype`. This is our generated archetype.
7. Run `mvn install` to generate the archetype package `0.0.1-SNAPSHOT`. This adds the archetype to our local `archetype-catalog.xml` file, which is contained in the `.m2` repository. Path: `Username\.m2\repository`.
8. We can now use our custom archetype to generate a new project.
9. Open CMD, run `mvn archetype:generate -DarchetypeCatalog=local`.
10. Select `com.demo.main:spring-boot-archetype-archetype`.
11. Enter `groupId`: `com.demo.main` (contained in the archetype-catalog.xml file).
12. Enter `artifactId`: `test-app` (name of the project you want to generate).
13. Enter `version`: `1.0.1` (version of your project).
14. Enter `package`: `com.demo.test.app` (your project package).
15. Enter `Y` to generate the project.
16. Open the generated project `test-app` and run `mvn install` to install the required packages.
17. Run the app.

🎯 **Testing the Demo Controller**

We can test our demo controller using the following `curl` request. Import the request into Postman:

💡 Remove a mandatory field like `serviceCode`. This should result in a bad request exception, which is handled by our custom starter



```bash
curl --location 'http://localhost:8080/v1/test' \
--header 'conversation-id: 0a2248c3-9ba9-496b-b0a3-b54a7405febb' \
--header 'Content-Type: application/json' \
--data '{
    "header": {
        "messageID": "TEST-12354",
        "serviceCode": "4003",
        "serviceName": "DEMO-APP",
        "timeStamp": "1728572123"
    },
    "requestPayload": {
        "account": "23456AST"
    }
}'

