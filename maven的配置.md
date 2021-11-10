# Maven安装配置

![](img/%E4%B8%BA%E4%BB%80%E4%B9%88%E5%AD%A6maven.png)

## 1. Maven项目架构管理工具

![](img/Maven%E9%A1%B9%E7%9B%AE%E6%9E%B6%E6%9E%84%E7%AE%A1%E7%90%86%E5%B7%A5%E5%85%B7.png)

## 2. 下载安装Maven

https://maven.apache.org/download.cgi

![](img/maven%E4%B8%8B%E8%BD%BD.png)

![image-20210714093756820]()

**下载完成后，解压**

==尽量把电脑上的所有环境放在一个文件夹下==

mirrors（镜像）：方便下载使用

## 3. 配置环境变量

==配置如下==

- M2_HOME		  maven目录下的bin
- MAVEN_HOME   maven的目录
- path里面配置： %MAVEN_HOME%\bin

![](img/maven%E9%85%8D%E7%BD%AE.png)

![](img/maven%E9%85%8D%E7%BD%AE2.png)

**配置成功：**

![](img/%E9%85%8D%E7%BD%AE%E6%88%90%E5%8A%9F.png)

## 4. 阿里云镜像

- 镜像：mirrors
  - 作用：加速我们的下载
- 国内建议用阿里云镜像

**全局配置**
添加阿里云的镜像到maven的setting.xml配置中，这样就不需要在每个pom中都添加镜像仓库的配置，在mirrors节点下面添加子节点：

```xml
<mirror>      
	  <id>nexus-aliyun</id>    
	  <name>nexus-aliyun</name>  
	  <url>http://maven.aliyun.com/nexus/content/groups/public</url>    
	  <mirrorOf>central</mirrorOf>      
	</mirror>

```

![](img/setting.xml.png)

![](img/%E9%85%8D%E7%BD%AE%E9%95%9C%E5%83%8F.png)

## 5. 本地仓库

在本地的仓库，远程仓库；

**建立一个本地仓库：**localRepository

```xml
  <localRepository>D:\Maven\apache-maven-3.8.1\maven-repo</localRepository>
```

![](img/%E9%BB%98%E8%AE%A4%E4%BB%93%E5%BA%93%E5%9C%B0%E5%9D%80.png)

![](img/maven%E4%BB%93%E5%BA%93%E9%85%8D%E7%BD%AE.png)

## 6. 在Idea中使用Maven

- 启动IDEA
- 创建一个Maven项目
- ![](img/%E5%88%9B%E5%BB%BAmavenWeb%E9%A1%B9%E7%9B%AE.png)

![](img/%E9%A1%B9%E7%9B%AE%E9%85%8D%E7%BD%AE2.png)

![](img/maven%E5%BB%BA%E7%AB%8B%E9%A1%B9%E7%9B%AE.png)

![](img/maven%E5%BB%BA%E7%AB%8B%E9%A1%B9%E7%9B%AE3.png)

![]()

==创建成功==

![]()

- $\textcolor{red}{搭建成功看项目多了什么东西}$

- ==IDEA中的Maven设置==

  - 注意：IDEA项目创建成功后看一眼Maven的配置

  - ![](img/IDEa%E4%B8%AD%E4%BF%AE%E6%94%B9maven.png)

    

![](img/%E8%87%AA%E5%8A%A8%E5%AF%BC%E5%85%A5%E6%BA%90%E7%A0%81.png)

**到这里，Maven的配置和使用就OK了**

## 7. 创建一个普通的maven项目



![](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE.png)

![创建普通的maven项目2](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE2.png)

![创建普通的maven项目3](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE3.png)

![创建普通的maven项目4](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE4.png)

![创建普通的maven项目5](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE5.png)

![创建普通的maven项目6](img/%E5%88%9B%E5%BB%BA%E6%99%AE%E9%80%9A%E7%9A%84maven%E9%A1%B9%E7%9B%AE6.png)



## 9. 在IDEA中配置Tomcat

 

![](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat.png)

![idea中配置Tomcat2](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat2.png)

![idea中配置Tomcat3](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat3.png)



==解决问题==

![](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat4.png)

![idea中配置Tomcat5](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat5.png)



**不写默认访问路径：localhost:8080**

**假如写了：**

## 10. pom文件

pom.xml 是Maven的核心配置文件

![](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat6.png)

![idea中配置Tomcat7](img/idea%E4%B8%AD%E9%85%8D%E7%BD%AETomcat7.png)



# $\textcolor{red}{Maven的高级之处在于，它会帮你导入这个JAR包所依赖的其他地方}$

==约定大于配置==

![](img/resource%E8%A7%A3%E5%86%B3%E6%96%B9%E6%A1%88.png)

在项目依赖下面加一个resource

==搜索Maven资源导出==

![](img/%E8%B5%84%E6%BA%90%E5%AF%BC%E5%87%BA.png)

# eclipse中创建maven

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/eclipse%E4%B8%AD%E7%9A%84maven%E7%9A%84%E9%85%8D%E7%BD%AE.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E9%85%8D%E7%BD%AE2.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E9%85%8D%E7%BD%AE3.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E5%88%9B%E5%BB%BA1.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E5%88%9B%E5%BB%BA2.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E5%88%9B%E5%BB%BA3.png)

![](Idea%E9%87%8C%E9%9D%A2%E9%85%8D%E7%BD%AEmaven.assets/%E5%88%9B%E5%BB%BA4.png)

