package com.tobil.springbeans;

import com.tobil.springbeans.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    // define
    @Autowired
    private NotificationService notificationService;

    // define by setter
//    @Autowired
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    // define by constructor
//    @Autowired
//    public PageController(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    @GetMapping("/")
    public String home(){
        return notificationService.toString();
    }

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @GetMapping("/properties")
    public String prop(){
        return  pageControllerMsg;
    }
}
