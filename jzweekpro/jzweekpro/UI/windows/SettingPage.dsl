<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="SettingPage" controller="SettingPageController" namespace="com.yonyou.jzweekpro">
    <import ref="SettingPage.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <action id="tohome" viewid="com.yonyou.jzweekpro.Home" method="UMView.open" iskeep="false"/>
    <div id="viewPage0">
        <div id="panel0">
            <navigatorbar id="navigatorbar0" title="设置" class="navigatorbarclass">
                <input id="button0" value="返回" class="ngbbuttonclass" onclick="tohome" type="button"/> 
            </navigatorbar>
            <listView id="listviewdefine0" bindfield="setparams" onload="this.listviewdefine0_onload()">
                <div id="panel1" onload="this.panel1_onload()">
                    <label id="label1" bindfield="oth"/>
                    <label id="label0" bindfield="labelname"/>
                    <image id="image0" errimage="icon_refresh.png" bindfield="picturepath" scaletype="fitcenter" src="icon_refresh.png"/> 
                </div> 
            </listView> 
        </div> 
    </div> 
</window>
