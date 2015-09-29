<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="WeekContentS" controller="WeekContentSController" namespace="com.yonyou.jzweekpro">
    <import ref="WeekContentS.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <navigatorbar id="navigatorbar0" class="navigatorbarclass">
                <input id="button0" value="返回" class="ngbbuttonclass" onclick="this.backList()" type="button"/> 
            </navigatorbar>
            <webView id="webview0" bindfield="id" onload="this.webview0_onload()"/> 
        </div> 
    </div> 
</window>
