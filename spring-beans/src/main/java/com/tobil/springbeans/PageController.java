package com.tobil.springbeans;

import com.tobil.springbeans.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    // notification service
    @Autowired
    private NotificationService notificationService;



    @GetMapping("/")
    public String home(){
        return notificationService.toString();
    }
}
