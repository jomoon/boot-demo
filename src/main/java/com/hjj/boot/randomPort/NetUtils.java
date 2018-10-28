package com.hjj.boot.randomPort;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetUtils {
    public static boolean isLocalPortUsing(int port) {
        boolean flag = true;
        try {
            //如果该端口还在使用则返回true,否则返回false,127.0.0.1代表本机
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }

    public static boolean isPortUsing(String host,int port) throws UnknownHostException {
        boolean flag = false;
        InetAddress address = InetAddress.getByName(host);

        try {
            Socket socket = new Socket(address, port);
            flag = true;
        } catch (IOException e) {
        }
        return flag;
    }
}
