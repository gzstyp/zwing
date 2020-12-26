package com.fwtai.controller;

import com.fwtai.tool.ToolQRCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * 生成二维码
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-12-26 22:52
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Controller
public class QRCodeController{

    @GetMapping("/createQrCode")
    public void createQrCode(final HttpServletRequest request,final HttpServletResponse response){
        try {
            final OutputStream os = response.getOutputStream();
            ToolQRCode.encode("http://www.baidu.com/","/static/images/yinlz_logo.png",os,true);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}