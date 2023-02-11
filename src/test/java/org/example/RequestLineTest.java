package org.example;

import org.example.RequestLine;
import org.junit.jupiter.api.Test;

public class RequestLineTest {

    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");
    }
}
