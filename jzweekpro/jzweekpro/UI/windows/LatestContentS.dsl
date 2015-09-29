<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="LatestContentS" controller="LatestContentSController" namespace="com.yonyou.jzweekpro">
    <import ref="LatestContentS.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <action id="backlastest" viewid="com.yonyou.jzweekpro.LatestReadList" method="UMView.open" iskeep="false"/>
    <div id="viewPage0">
        <div id="panel0">
            <navigatorbar id="navigatorbar0" class="navigatorbarclass">
                <input id="button0" value="返回" class="ngbbuttonclass" onclick="this.backLatestList()" type="button"/> 
            </navigatorbar>
            <webView id="webview0" bindfield="id" onload="this.webview0_onload()"/> 
        </div> 
    </div> 
</window>
