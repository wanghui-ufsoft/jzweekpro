//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.jzweekpro.LatestReadListController');
com.yonyou.jzweekpro.LatestReadListController = function() {
    com.yonyou.jzweekpro.LatestReadListController.initializeBase(this);
    this.initialize();
}
function com$yonyou$jzweekpro$LatestReadListController$initialize(){
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
    
function com$yonyou$jzweekpro$LatestReadListController$evaljs(js){
    eval(js)
}
function com$yonyou$jzweekpro$LatestReadListController$listviewdefine0_onload(sender, args){
       var json = $param.getJSONObject("data");
       $ctx.push($stringToJSON(json));
}
function com$yonyou$jzweekpro$LatestReadListController$panel1_onload(sender, args){

}
function com$yonyou$jzweekpro$LatestReadListController$toLatestAricle(sender, args){
    var rowindex =$id("listviewdefine0").get("row");
    var jsonstr=$stringToJSON(rowindex);
    if(jsonstr == null ){
    	jsonstr = {
    	articles :[    {
        "summary": "springside作者江南白衣，针对Java集合类的整理",
        "id": 1,
        "from_url": "http://calvin1978.blogcn.com/articles/collection.html",
        "title": "关于Java集合的小抄",
        "countnum": 4,
        "from_site": "江南白衣-花钱的年华",
        "weekid": 1,
        "publishdate": "2015-04-23"
    }]
    	}
    }
    $view.open({
    "viewid" : "com.yonyou.jzweekpro.LatestContentS",//目标页面（首字母大写）全名，
    "isKeep" : "true",
    "data" :jsonstr
    });
}
com.yonyou.jzweekpro.LatestReadListController.prototype = {
    toLatestAricle : com$yonyou$jzweekpro$LatestReadListController$toLatestAricle,
    panel1_onload : com$yonyou$jzweekpro$LatestReadListController$panel1_onload,
    listviewdefine0_onload : com$yonyou$jzweekpro$LatestReadListController$listviewdefine0_onload,
    initialize : com$yonyou$jzweekpro$LatestReadListController$initialize,
    evaljs : com$yonyou$jzweekpro$LatestReadListController$evaljs
};
com.yonyou.jzweekpro.LatestReadListController.registerClass('com.yonyou.jzweekpro.LatestReadListController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
