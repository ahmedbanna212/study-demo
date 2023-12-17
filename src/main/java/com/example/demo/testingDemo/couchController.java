package com.example.demo.testingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class couchController {
  /*  @Autowired
    @Qualifier("footballCouch")*/
    couch couch;

    @Autowired
    public couchController(@Qualifier("footballCouch") couch theCouch){
        this.couch=theCouch;
    }

    @GetMapping("/testing")
    String getCouchTest(){
        return couch.getMotive();
    }
}
