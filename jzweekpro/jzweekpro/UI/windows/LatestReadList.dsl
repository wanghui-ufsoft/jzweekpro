<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="LatestReadList" controller="LatestReadListController" namespace="com.yonyou.jzweekpro">
    <import ref="LatestReadList.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <action id="tohome" viewid="com.yonyou.jzweekpro.Home" method="UMView.open" iskeep="false"/>
    <div id="viewPage0">
        <div id="panel0">
            <navigatorbar id="navigatorbar0" title="最近阅读文章" class="navigatorbarclass">
                <input id="button0" value="返回" class="ngbbuttonclass" onclick="tohome" type="button"/> 
            </navigatorbar>
            <listView id="listviewdefine0" bindfield="articles" onload="this.listviewdefine0_onload()">
                <div id="panel1" onload="this.panel1_onload()" onclick="this.toLatestAricle()">
                    <label id="label0" bindfield="title"/>
                    <label id="label1" bindfield="publishdate"/> 
                </div> 
            </listView> 
        </div> 
    </div> 
</window>
