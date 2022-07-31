package com.ssx.spi_v1_tcp;

import com.ssx.interfaces.Protocol;

public class TcpProtocol implements Protocol {
    @Override
    public void SendRequest(String message) {
    System.out.println("使用Tcp发送消息:"+message);
    }
}
