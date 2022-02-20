package com.challenge.topic_2_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrinterController {

    @Autowired
    @Qualifier("B/N")
    Printer bnPrinter; //Black and white printer

    @Autowired
    @Qualifier("B/N and color")
    Printer bncPrinter; //Black and white and color printer

    @RequestMapping("/printer1")
    public String printing1(){
        return bnPrinter.print();
    }

    @RequestMapping("/printer2")
    public String printing2(){
        return bncPrinter.print();
    }


}
