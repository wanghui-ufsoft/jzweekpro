<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Home" controller="HomeController" namespace="com.yonyou.jzweekpro">
    <import ref="Home.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <action id="toSetPage" viewid="com.yonyou.jzweekpro.SettingPage" method="UMView.open" iskeep="false"/>
    <div id="viewPage0">
        <div id="panel0">
            <toggleButtonGroup id="togglebuttongroup0">
                <toggleButton id="togglebutton0" value="0" class="togglebtnitemclass" textOff="技术周刊" textOn="技术周刊" type="button" checked="true"/> 
            </toggleButtonGroup>
            <flipper id="flipperdefine0" viewindex="0">
                <div id="panel1" title="页面1">
                    <listView id="listviewdefine0" bindfield="week" onuprefresh="this.onuprefresh()" onload="this.listviewdefine0_onload()" ondownrefresh="this.ondownrefresh()">
                        <div id="panel3" onclick="this.toWeeklist()">
                            <label id="label0">第</label>
                            <label id="label1" bindfield="weekid"/>
                            <label id="label2">期</label>
                            <label id="label3">发布日期</label>
                            <label id="label4" bindfield="publishdate"/> 
                        </div> 
                    </listView> 
                </div>
                <div id="panel2" title="页面2">
                    <listView id="listviewdefine1" bindfield="articles" onload="this.listviewdefine1_onload()">
                        <div id="panel4" onload="this.panel4_onload()">
                            <label id="label5" bindfield="title"/>
                            <label id="label6" bindfield="publishdate"/> 
                        </div> 
                    </listView> 
                </div> 
            </flipper>
            <tabbar id="tabbar0">
                <tabbaritem id="tabbaritem0" tabbarItemType="icontext" enabled="true" text="最近阅读" class="tabitemclass" onclick="this.tolatestRead()" checked="true"/>
                <tabbaritem id="tabbaritem3" tabbarItemType="icontext" text="设置" class="tabitemclass" onclick="toSetPage"/> 
            </tabbar> 
        </div> 
    </div> 
</window>
