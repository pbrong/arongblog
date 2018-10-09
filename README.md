## arongblog
[arong技术博客](https://blog.csdn.net/pbrlovejava)

fork from [My-Blog](https://github.com/ZHENFENG13/My-Blog) , 并且在原先的基础上进行了一些修改：
1、使用gradle重新构建项目

2、新增欢迎页

3、修改‘归档’栏目为‘时间轴’栏目

4、新增‘文章分类’栏目

5、修改项目相关bug

 
 
## 使用方法：
第一步：`git clone https://github.com/pbrong/arongblog.git`

第二步：将工程导入idea或者eclipse中打开

第三步：将resource/sql/tale.sql导入到数据库中并修改application-jdbc.properties,将其修改为你的数据库名

第四步：启动coreApplication.main()即可访问项目

localhost:8888/是欢迎页

localhost:8888/index是博客首页

localhost:8888/admin是后台管理页面
## 功能如下：
 
 [新增]欢迎页：
 ![](img/welcome.png)

 
 [修改]博客首页：
 ![](img/index1.png)
 ![](img/index2.png)
 
 [修改]时间轴：
 ![](img/metas.png)

 [新增]文章分类：
 ![](img/categorys.png)
 
 搜索：
 ![](img/search.png)
 
 **后台管理**
 
 管理登录：
 ![](img/admin-login.png)
 
 管理首页：
 ![](img/admin-index.png)
 
 发布文章：
 ![](img/admin-publish.png)
 
 文章管理：
 ![](img/admin-article.png)
 
 页面管理：
 ![](img/admin-pages.png)
 
 分类标签：
 ![](img/admin-category.png)
 
 文件管理：
 ![](img/admin-upload.png)
   
 系统设置：
 ![](img/admin-setting.png)
 
## 开源协议

[MIT](./LICENSE)

## 感谢

[ZHENFENG13](https://github.com/ZHENFENG13)
[otale](https://github.com/otale)
