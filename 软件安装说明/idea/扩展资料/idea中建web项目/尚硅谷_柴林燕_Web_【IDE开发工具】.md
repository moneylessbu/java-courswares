# 一、新建动态web项目

## 1、新建项目

![1576488700029](imgs/1576488700029.png)

## 2、选择创建动态web项目

![1576488818094](imgs/1576488818094.png)

## 3、项目命名

![1576488877344](imgs/1576488877344.png)

![1576488896128](imgs/1576488896128.png)

## 4、编辑index.jsp

![1576489007595](imgs/1576489007595.png)

# 二、配置Tomcat

## 1、新增tomcat服务器配置

![1576489068085](imgs/1576489068085.png)

## 2、选择服务器类型

![1576490221741](imgs/1576490221741.png)

## 3、配置服务器参数

![1576490377444](imgs/1576490377444.png)

## 4、部署项目

![1576490455599](imgs/1576490455599.png)

![1576490418234](imgs/1576490418234.png)

## 5、完成配置

![1576490495803](imgs/1576490495803.png)

## 6、启动运行

![1576490676996](imgs/1576490676996.png)

![1576490719274](imgs/1576490719274.png)

## 7、访问web项目

在浏览器地址栏输入： http://localhost:8080/webidea/ 

![1576490745736](imgs/1576490745736.png)

# 三、tomcat启动报程序包javax.servlet.http不存在

单击工具栏按钮![1576747064373](imgs/1576747064373.png)

![1576746968064](imgs/1576746968064.png)

![1576747053535](imgs/1576747053535.png)



# 四、tomcat控制台乱码问题

![img](imgs/wps1.jpg)

1、 点击Help => Edit custom VM Options，在最后面添加 “-Dfile.encoding=UTF-8”

![img](imgs/wps2.jpg)

2、点击Run菜单的 Edit Configurations，在tomcat配置中的 VM option中添加 “-Dfile.encoding=UTF-8”

![img](imgs/wps3.jpg)

3、在第二步的Startup/Connection页签的Run和Debug添加一个key为JAVA_TOOL_OPTIONS， value为-Dfile.encoding=UTF-8的环境变量

![img](imgs/wps4.jpg)

4、保存后重启idea，可以发现控制台中文乱码显示正常了

