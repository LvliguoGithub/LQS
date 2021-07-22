## 设计
- 搜索长度限制，不超过32词语（分词后数量google）。简单的可以用100字符长度（百度38个汉字）。

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
~~~

## 资料
react： https://docs.microsoft.com/zh-cn/visualstudio/javascript/tutorial-nodejs-with-react-and-jsx?view=vs-2019

spring+es： https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.clients
