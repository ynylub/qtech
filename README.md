# qtech

#### 介绍
采用 springboot + thymeleaf(模板引擎) 开发的 送修&领取平台。

#### 软件架构
Linux + Nginx + MySQL + JDK
1. Linux版本：CentOS 7.8
2. MySQL版本：5.7
3. Nginx版本：1.9.9
4. JDK  版本：11

#### 安装教程

```
# 在 idea 使用 maven命令打包成 jar包，然后放到 linux服务器中启动
# maven 打包命令
mvn clean 
mvn package
# xshell 终端启动命令,temp.txt 文件需要手动创建
nohup java -jar -Dfile.encoding=UTF-8 qtech-0.0.1-SNAPSHOT.jar >./temp.txt &
```



#### 使用说明

1.  数据库文件 qtech.sql，可添加作者微信 ynylub获取(注明来意)


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
