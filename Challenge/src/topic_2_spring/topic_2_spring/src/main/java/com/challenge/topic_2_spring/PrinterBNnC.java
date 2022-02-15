package com.challenge.topic_2_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("B/N and color")
public class PrinterBNnC implements Printer{
    @Override
    public String print() {
        return "Printing with the B/N and color printer";
    }
}
