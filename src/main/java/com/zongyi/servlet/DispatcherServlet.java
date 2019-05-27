package com.zongyi.servlet;


import javax.servlet.*;
import java.io.IOException;

public class DispatcherServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("------初始化开始------");

        //加载xml并从中读取需要扫描的package
        //servletConfig.getInitParameter("")是获取web.xml中配置的参数。
        // 所以我们可以在里面配置配置文件路径
        String basePackage=loadXmlBasePackage(servletConfig.getInitParameter(""));

        //扫描到各个组件，并创建对象存入Map<String,Object>

        //再次扫描各个组件的属性，并注入需要的组件

        //controller特殊处理，每个url都对应一个方法

        System.out.println("------初始化完成------");
    }

    private String loadXmlBasePackage(String initParameter) {

        return "";
    }
























    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
