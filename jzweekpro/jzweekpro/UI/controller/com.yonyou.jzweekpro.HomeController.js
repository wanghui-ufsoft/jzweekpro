//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.jzweekpro.HomeController');
com.yonyou.jzweekpro.HomeController = function() {
    com.yonyou.jzweekpro.HomeController.initializeBase(this);
    this.initialize();
}
function com$yonyou$jzweekpro$HomeController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$yonyou$jzweekpro$HomeController$evaljs(js){
    eval(js)
}
function com$yonyou$jzweekpro$HomeController$listviewdefine0_onload(sender, args){
	    $service.call("UMPush.registerDevice", {}, false);
	var json = $service.get({
	"url" : "http://10.10.2.63:9000/api/v1/page/1",
	"callback" : "jsFunction()",
	"timeout" : "5"//可选参数，超时时间，单位为秒
	})
	$cache.write("pageindex",1);
}
 function    jsFunction(){
    var resultfin =$ctx.param("result");
    var jsonresultfin = $stringToJSON(resultfin);
    
    var str = {list : jsonresultfin.list};
    if(str.list.length==0){
    	$alert("再没有更多周刊了");
    	return;
    }
    jsonresultfin.list.forEach(function(res){
       if(res.id <10){
           res.weekid=(" "+res.weekid+" ");
       } 
    });
    var json ={
        week : jsonresultfin.list
    }
    $ctx.push(json);
 }
function com$yonyou$jzweekpro$HomeController$toWeeklist(sender, args){
    var rowindex =$id("listviewdefine0").get("row");
    var jsonstr=$stringToJSON(rowindex);
    $view.open({
    "viewid" : "com.yonyou.jzweekpro.WeekListS",//目标页面（首字母大写）全名，
    "isKeep" : "true",
    "data" :{id:jsonstr.id}
    });
}
function com$yonyou$jzweekpro$HomeController$tolatestRead(sender, args){
   var indexid = $cache.read("cachearticels");
   var jsonindexid = $stringToJSON(indexid);
   var result = {
   	articles :[jsonindexid]
   };
    $view.open({
    "viewid" : "com.yonyou.jzweekpro.LatestReadList",//目标页面（首字母大写）全名，
    "isKeep" : "true",
    "data" :result
    });
}
function com$yonyou$jzweekpro$HomeController$listviewdefine1_onload(sender, args){
}
function com$yonyou$jzweekpro$HomeController$panel4_onload(sender, args){
     
}
function com$yonyou$jzweekpro$HomeController$onuprefresh(sender, args){
    var pageindex = $cache.read("pageindex");
	var currindex = parseInt(pageindex)-1;
	if(currindex<1){
	$alert("已经是最新期的周刊了");
	return;
	}
	$cache.write("pageindex", currindex);
    var json = $service.get({
    "url" : "http://10.10.2.63:9000/api/v1/page/"+currindex,
    "callback" : "jsFunction()",
    "timeout" : "5"//可选参数，超时时间，单位为秒
    })
}
function com$yonyou$jzweekpro$HomeController$ondownrefresh(sender, args){
	var pageindex = $cache.read("pageindex");
	var currindex = parseInt(pageindex)+1;
	 $cache.write("pageindex", currindex);
    var json = $service.get({
    "url" : "http://10.10.2.63:9000/api/v1/page/"+currindex,
    "callback" : "jsFunction()",
    "timeout" : "5"//可选参数，超时时间，单位为秒
    })
}
com.yonyou.jzweekpro.HomeController.prototype = {
    ondownrefresh : com$yonyou$jzweekpro$HomeController$ondownrefresh,
    onuprefresh : com$yonyou$jzweekpro$HomeController$onuprefresh,
    onuprefresh : com$yonyou$jzweekpro$HomeController$onuprefresh,
    panel4_onload : com$yonyou$jzweekpro$HomeController$panel4_onload,
    listviewdefine1_onload : com$yonyou$jzweekpro$HomeController$listviewdefine1_onload,
    tolatestRead : com$yonyou$jzweekpro$HomeController$tolatestRead,
    toWeeklist : com$yonyou$jzweekpro$HomeController$toWeeklist,
    listviewdefine0_onload : com$yonyou$jzweekpro$HomeController$listviewdefine0_onload,
    initialize : com$yonyou$jzweekpro$HomeController$initialize,
    evaljs : com$yonyou$jzweekpro$HomeController$evaljs
};
com.yonyou.jzweekpro.HomeController.registerClass('com.yonyou.jzweekpro.HomeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
