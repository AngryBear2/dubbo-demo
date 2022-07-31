package com.ssx.util;

import com.ssx.interfaces.Protocol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.ServiceLoader;

@Data
@AllArgsConstructor
public class RequestUtil {
    private Protocol protocol;

    public void sendRequest(String message){
        protocol.SendRequest(message);
    }

    private static RequestUtil requestUtil;

    public static RequestUtil getInstance(){
        if(requestUtil!=null){
            return requestUtil;
        }
        return new RequestUtil();
    }

    public RequestUtil(){
        ServiceLoader<Protocol> protocols = ServiceLoader.load(Protocol.class);
        Iterator<Protocol> iterator = protocols.iterator();
        if(iterator.hasNext()){
            protocol=iterator.next();
        }
    }


}
