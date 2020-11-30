## Spring Beans & Dependency injection

1. cara menggunakan
    - directly
      ```java
      @Autowired
      private NotificationService notificationService;
      ```
    - setter
        ```java
        @Autowired
        public void setNotificationService(NotificationService notificationService) {
                this.notificationService = notificationService;
        }   
        ```
    - constructor
       ```java
       @Autowired
       public PageController(NotificationService notificationService) {
              this.notificationService = notificationService;
       }
       ```

---
2. Property Configurations
   ```
   kita dapat mendefinisikan value static pada file application.propeties atau application.yml, seperti mengatur port server, nama database dan yang lainnya.
   ```
   - application.properties
        ```properties
        server.port=8081
        pageController.msg=pesan ini dari .properties config
        ```
   - application.yml
        ```yaml
        server:
            port: 8081
        pageController:
            msg: YML Config
        ```
   - Configuration Properties
        - @ConfigurationProperties
        - @EnableConfigurationProperties
        - Validation (@Valid)
        
   - Configuration Properties Example
        - applictaion.yml
          ```yaml
          myconfig:
            app-name: My Application Name
            app-description: ${myconfig.app-name} is a spring boot application
            admin-first-name: Dan
            admin-last-name: Vega
            adminEmail: danvega@gmail.com
          ```
        - implementation MyAppConfig.java
            ```java
            package com.tobil.springbeans;
            
            
            import org.springframework.beans.factory.annotation.Value;
            import org.springframework.boot.context.properties.ConfigurationProperties;
            import org.springframework.stereotype.Component;
            
            @Component
            @ConfigurationProperties(prefix = "myconfig")
            public class MyAppConfig {
            
                private String appName;
                private String appDescription;
                private String adminFirstName;
                private String adminLastName;
                private String adminEmail;
            
                public String getAppName() {
                    return appName;
                }
            
                public void setAppName(String appName) {
                    this.appName = appName;
                }
            
                public String getAppDescription() {
                    return appDescription;
                }
            
                public void setAppDescription(String appDescription) {
                    this.appDescription = appDescription;
                }
            
                public String getAdminFirstName() {
                    return adminFirstName;
                }
            
                public void setAdminFirstName(String adminFirstName) {
                    this.adminFirstName = adminFirstName;
                }
            
                public String getAdminLastName() {
                    return adminLastName;
                }
            
                public void setAdminLastName(String adminLastName) {
                    this.adminLastName = adminLastName;
                }
            
                public String getAdminEmail() {
                    return adminEmail;
                }
            
                public void setAdminEmail(String adminEmail) {
                    this.adminEmail = adminEmail;
                }
            
                @Override
                public String toString(){
                    return "MyAppConfig{" +
                            "appName='" + appName + '\'' +
                            "appDescription='" + appDescription + '\'' +
                            "adminFirstName='" + adminFirstName + '\'' +
                            "adminLastName='" + adminLastName + '\'' +
                            "adminEmail='" + adminEmail + '\'' +
                            '}';
            
                }
            }

            ```
          output akan secara otomatis menyesuaikan dengan valu yang sudah didefinisikan pada file application.yml.
      
  

 
