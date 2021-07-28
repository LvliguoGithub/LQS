## 设计
- 搜索长度限制，不超过32词语（分词后数量google）。简单的可以用100字符长度（百度38个汉字）。
- 用户认证，两步走：1.在web中认证  2.增加网关能力，在网关中认证
- 页面详情展示，防用户拷贝设置。阅读器
- pdf读取内容
- SSL认证加密传输

## 技巧
### 分析词汇
~~~
GET /_analyze
{
  "text": "中国国家数字图书馆是中国国家图书馆的在线网站。它内置了文津搜索，可以搜索馆藏书，当然还能免费搜索到电子期刊，图书，论文，报纸，还有各种工具书等。",
   "analyzer": "ik_max_word"
}
~~~

### nginx配置
~~~
1. location =    # 精准匹配
2. location ^~   # 带参前缀匹配
3. location ~    # 正则匹配（区分大小写）
4. location ~*   # 正则匹配（不区分大小写）
5. location /a   # 普通前缀匹配，优先级低于带参数前缀匹配。
6. location /    # 任何没有匹配成功的，都会匹配这里处理

server {
  root D:/space/project/LQS-master/build;
	location / {
			try_files $uri $uri/ /index.html;
	}
}
~~~

限制请求、并发、速度
~~~
http {
limit_req_zone $binary_remote_addr zone=NAME:10m rate=1r/s;
limit_conn_zone $binary_remote_addr zone=NAME:10m;

server {
	location / { 
		limit_req zone=NAME burst=5; 
		}
	location /download/ { 
		limit_conn NAME 1;
		limit_rate 100k;
		}
	}
}
~~~

### windows命令
~~~
netstat -ano | findstr "10000"

tasklist | findstr "nginx"

taskkill /PID 进程号 -F -T
tasklist /?
tasklist /FI "PID eq 4"

start nginx
nginx -s stop
nginx -s quit
nginx -s reload
~~~

### lua
**Lua协程知识点**
~~~
1. 在一个worker进程中，同一时刻只有一个协程运行。
2. 协程遇到I/O操作时会被挂起，I/O操作完成后被唤醒继续操作。
~~~

### markdown
**流程图graph** https://fibncci.github.io/2020/01/markdown-flow/

## 资料
react： https://docs.microsoft.com/zh-cn/visualstudio/javascript/tutorial-nodejs-with-react-and-jsx?view=vs-2019

spring+es： https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.clients
