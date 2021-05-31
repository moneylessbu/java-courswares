# 	git命令

```java
//git
git status //查看状态
git add    //提交到暂存区
git commit --m 版本号     //提交到本地库
get reflog //查看版本号
git reset --hard 版本号 //穿梭回指定版本
git branch -v //查看分支
git branch 分支名  //添加分支
git checkout 分支名   //切换分支
git merge 分支名   //合并分支
git remote -v  //查看别名

 //创建远程库别名
git remote add + 别名 + 远程库链接【https://github.com/moneylessbu/gitSpace.git】 


ssh-keygen -t rsa -C "1289494540@qq.com" 



```

# linux命令

```
解压 
tar -zxvf 文件名

vim文档编辑指令

gg  第一行开头
G   最后一行开头   12G 去12行开头

i  当前位置输入
I  行的开头输入

A  行的末尾输入
o  插入空行 空行开头输入

dd
u  Ctrl+r
yy p

替换
:%s/hello/hi


less分页
空格   b    回车   
q	退出
/关键词 查找 n N
=	详细的文件信息

进程操作
ps 
ps -ef
pstree

redis有关
# 临时关闭防火墙
查看防火墙状态
systemctl status firewalld.service
关闭防火墙
systemctl stop firewalld.service

/usr/local/redis/redis.conf
```

