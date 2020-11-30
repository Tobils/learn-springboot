## Spring Beans & Dependency injection

cara mendefinisikan
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
