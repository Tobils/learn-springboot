package com.tobil.springbeans.abc.foo;


import org.springframework.stereotype.Service;

@Service("userNotificationService")
public class NotificationService {

//    constructor
    public NotificationService(){

    }

    public void send(){

    }

    public void sendAsync(){}

    @Override
    public String toString(){
        return "NotificationService{}";
    }
}
