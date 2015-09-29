//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.jzweekpro.LatestContentSController');
com.yonyou.jzweekpro.LatestContentSController = function() {
    com.yonyou.jzweekpro.LatestContentSController.initializeBase(this);
    this.initialize();
}
function com$yonyou$jzweekpro$LatestContentSController$initialize(){
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
    
function com$yonyou$jzweekpro$LatestContentSController$evaljs(js){
    eval(js)
}
function com$yonyou$jzweekpro$LatestContentSController$webview0_onload(sender, args){
   var json = $param.getJSONObject("data");
   $ctx.push(json);
   if(json.weekid == null){
   	json.weekid =1;
   }
   var url ="http://10.10.2.63:9000/api/v1/showarticle/"+json.weekid;
   $id("webview0").set("url",url);
}
function com$yonyou$jzweekpro$LatestContentSController$backLatestList(sender, args){
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
com.yonyou.jzweekpro.LatestContentSController.prototype = {
    backLatestList : com$yonyou$jzweekpro$LatestContentSController$backLatestList,
    webview0_onload : com$yonyou$jzweekpro$LatestContentSController$webview0_onload,
    initialize : com$yonyou$jzweekpro$LatestContentSController$initialize,
    evaljs : com$yonyou$jzweekpro$LatestContentSController$evaljs
};
com.yonyou.jzweekpro.LatestContentSController.registerClass('com.yonyou.jzweekpro.LatestContentSController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
