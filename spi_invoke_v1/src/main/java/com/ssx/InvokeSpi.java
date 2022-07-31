package com.ssx;

import com.ssx.spi_v1_http.HttpProtocol;
import com.ssx.util.RequestUtil;

public class InvokeSpi {
  public static void main(String[] args) {
      RequestUtil requestUtil = new RequestUtil();
      requestUtil.sendRequest("hello");
  }
}
