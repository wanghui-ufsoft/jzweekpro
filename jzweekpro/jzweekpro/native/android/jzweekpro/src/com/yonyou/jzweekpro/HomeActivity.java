package com.yonyou.jzweekpro;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class HomeActivity extends UMWindowActivity {

	protected UMWindow Home = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMViewFlipper flipperdefine0 = null;
protected XVerticalLayout panel1 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected XVerticalLayout panel2 = null;
protected UMListViewBase listviewdefine1 = null;
protected XRelativeLayout panel4 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected UMXTabBar tabbar0 = null;
protected UMXTabBarItem tabbaritem0 = null;
protected UMXTabBarItem tabbaritem3 = null;

	
	protected final static int ID_HOME = 567468576;
protected final static int ID_VIEWPAGE0 = 1704346186;
protected final static int ID_PANEL0 = 1819797719;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1832594056;
protected final static int ID_TOGGLEBUTTON0 = 2136799427;
protected final static int ID_FLIPPERDEFINE0 = 1532984540;
protected final static int ID_PANEL1 = 726324178;
protected final static int ID_LISTVIEWDEFINE0 = 1162033203;
protected final static int ID_PANEL3 = 2147037774;
protected final static int ID_LABEL0 = 1910945267;
protected final static int ID_LABEL1 = 1761449536;
protected final static int ID_LABEL2 = 503981485;
protected final static int ID_LABEL3 = 1371255109;
protected final static int ID_LABEL4 = 801597649;
protected final static int ID_PANEL2 = 2144825236;
protected final static int ID_LISTVIEWDEFINE1 = 2112402401;
protected final static int ID_PANEL4 = 213619969;
protected final static int ID_LABEL5 = 591912376;
protected final static int ID_LABEL6 = 4846698;
protected final static int ID_TABBAR0 = 1875105842;
protected final static int ID_TABBARITEM0 = 257758343;
protected final static int ID_TABBARITEM3 = 1610155812;

	
	
	@Override
	public String getControllerName() {
		return "HomeController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.yonyou.jzweekpro";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("Home",ID_HOME);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("flipperdefine0",ID_FLIPPERDEFINE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("listviewdefine1",ID_LISTVIEWDEFINE1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("tabbar0",ID_TABBAR0);
  idmap.put("tabbaritem0",ID_TABBARITEM0);
  idmap.put("tabbaritem3",ID_TABBARITEM3);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

}
{ //listviewdefine1 - action:listviewdefine1_onload
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionListviewdefine1_onload(listviewdefine1,args);

}
{ //panel4 - action:panel4_onload
    UMEventArgs args = new UMEventArgs(HomeActivity.this);
    actionPanel4_onload(panel4,args);

}

	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"halign","CENTER"
,"height","44"
,"layout-type","vbox"
,"layout","hbox"
,"width","fill"
,"valign","top"
);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"background-image-off","label_4_middle.png"
,"width","320.0"
,"textoff","技术周刊"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_4_middle_touch.png"
,"height","42.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","17"
,"value","0"
,"font-family","default"
,"texton","技术周刊"
,"valign","center"
,"checked","true"
);
togglebuttongroup0.addView(togglebutton0);

return togglebuttongroup0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","4"
,"padding-right","4"
,"border-bottom-width","1px"
,"halign","LEFT"
,"width","fill"
,"border-bottom-color","#c0c0c0"
,"border-top-width","1px"
,"border-top-color","#c0c0c0"
,"height","60.0"
,"layout-type","vbox"
,"background","#FFFFFF"
,"onclick","action:panel3_onclick"
,"valign","center"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"widthwrap","15.0"
,"width","wrap"
,"content","第"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"margin-left","20"
,"font-family","default"
,"valign","center"
);
panel3.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","weekid"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel3.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"widthwrap","15.0"
,"width","wrap"
,"content","期"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
panel3.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","right"
,"widthwrap","60.0"
,"width","wrap"
,"content","发布日期"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"margin-left","40"
,"font-family","default"
,"valign","bottom"
);
panel3.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","publishdate"
,"halign","right"
,"widthwrap","32.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","hbox"
,"margin-left","8"
,"font-family","default"
,"valign","bottom"
);
panel3.addView(label4);

return panel3;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","week"
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:listviewdefine0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
listviewdefine0.addListItemView("getPanel3View");

return listviewdefine0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"title","页面1"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup);
panel1.addView(listviewdefine0);

return panel1;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL4
,"border-bottom-width","1"
,"halign","LEFT"
,"height","60.0"
,"onload","action:panel4_onload"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","CENTER"
,"border-bottom-color","#C7C7C7"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","title"
,"halign","center"
,"widthwrap","32.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","relative"
,"font-size","14"
,"left","30.0"
,"font-family","default"
,"valign","center"
,"top","10.0"
);
panel4.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","publishdate"
,"halign","center"
,"widthwrap","24.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","15.0"
,"layout-type","relative"
,"font-size","10"
,"left","210.0"
,"font-family","default"
,"valign","center"
,"top","30.0"
);
panel4.addView(label6);

return panel4;
}
public View getListviewdefine1View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine1 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE1
,"bindfield","articles"
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:listviewdefine1_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
listviewdefine1.addListItemView("getPanel4View");

return listviewdefine1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"title","页面2"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View listviewdefine1 = (View) getListviewdefine1View((UMActivity)context,binderGroup);
panel2.addView(listviewdefine1);

return panel2;
}
public View getFlipperdefine0View(final UMActivity context,IBinderGroup binderGroup) {
flipperdefine0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPERDEFINE0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"viewindex","0"
,"valign","TOP"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
flipperdefine0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
flipperdefine0.addView(panel2);

return flipperdefine0;
}
public View getTabbar0View(final UMActivity context,IBinderGroup binderGroup) {
tabbar0 = (UMXTabBar)ThirdControl.createControl(new UMXTabBar(context),ID_TABBAR0
,"halign","CENTER"
,"height","46"
,"layout-type","vbox"
,"layout","hbox"
,"width","fill"
,"valign","top"
);
tabbaritem0 = (UMXTabBarItem)ThirdControl.createControl(new UMXTabBarItem(context),ID_TABBARITEM0
,"enabled","true"
,"text","最近阅读"
,"weight","1"
,"width","0"
,"icon-width","23"
,"font-pressed-color","#e50011"
,"tabbaritemtype","icontext"
,"icon-height","23"
,"height","44.0"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_fav"
,"icon-pressed-image","tab_fav_touch"
,"onclick","action:tabbaritem0_onclick"
,"font-family","default"
,"checked","true"
,"icon-text-spacing","3"
);
tabbar0.addView(tabbaritem0);
tabbaritem3 = (UMXTabBarItem)ThirdControl.createControl(new UMXTabBarItem(context),ID_TABBARITEM3
,"text","设置"
,"weight","1"
,"width","0"
,"icon-width","23"
,"font-pressed-color","#e50011"
,"tabbaritemtype","icontext"
,"icon-height","23"
,"height","44.0"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_setting"
,"icon-pressed-image","tab_setting_touch"
,"onclick","toSetPage"
,"font-family","default"
,"icon-text-spacing","3"
);
tabbar0.addView(tabbaritem3);

return tabbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup);
panel0.addView(togglebuttongroup0);
View flipperdefine0 = (View) getFlipperdefine0View((UMActivity)context,binderGroup);
panel0.addView(flipperdefine0);
View tabbar0 = (View) getTabbar0View((UMActivity)context,binderGroup);
panel0.addView(tabbar0);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Home = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_HOME
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","HomeController"
,"valign","TOP"
,"namespace","com.yonyou.jzweekpro"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Home.addView(viewPage0);

return (UMWindow)Home;
}

	
	public void actionPanel4_onload(View control, UMEventArgs args) {
    String actionid = "panel4_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.panel4_onload()",UMActivity.getViewId(control),args);
}
public void actionToSetPage(View control, UMEventArgs args) {
    String actionid = "toSetPage";
    args.put("viewid","com.yonyou.jzweekpro.SettingPage");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionListviewdefine1_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine1_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listviewdefine1_onload()",UMActivity.getViewId(control),args);
}
public void actionPanel3_onclick(View control, UMEventArgs args) {
    String actionid = "panel3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.toWeeklist()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listviewdefine0_onload()",UMActivity.getViewId(control),args);
}
public void actionTabbaritem0_onclick(View control, UMEventArgs args) {
    String actionid = "tabbaritem0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.tolatestRead()",UMActivity.getViewId(control),args);
}


}
