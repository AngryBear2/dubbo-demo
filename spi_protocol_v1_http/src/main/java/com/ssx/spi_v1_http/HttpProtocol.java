package com.ssx.spi_v1_http;

import com.ssx.interfaces.Protocol;

public class HttpProtocol implements Protocol {
    @Override
    public void SendRequest(String message) {
    System.out.println("使用http协议发送："+message);
    }
}
