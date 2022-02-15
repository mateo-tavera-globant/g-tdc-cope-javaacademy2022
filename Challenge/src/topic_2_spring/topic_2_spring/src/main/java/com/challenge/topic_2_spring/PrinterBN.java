package com.challenge.topic_2_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("B/N")
public class PrinterBN implements Printer{

    @Override
    public String print() {
        return "Printing with the B/N printer";
    }
}
