package com.ssx;

import com.ssx.util.RequestUtil;

public class JavaSpiProtocolInvoker {
  public static void main(String[] args) {
      RequestUtil requestUtil = new RequestUtil(new TcpProtocol());
      requestUtil.sendRequest("你好");
  }
}
