## 资料
react： https://docs.microsoft.com/zh-cn/visualstudio/javascript/tutorial-nodejs-with-react-and-jsx?view=vs-2019

spring+es： https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.clients

## 设计：
搜索长度限制，不超过32词语（分词后数量google）。简单的可以用100字符长度（百度38个汉字）。

## 技巧
### 分析词汇
~~~
GET /_analyze
{
  "text": "中国国家数字图书馆是中国国家图书馆的在线网站。它内置了文津搜索，可以搜索馆藏书，当然还能免费搜索到电子期刊，图书，论文，报纸，还有各种工具书等。",
   "analyzer": "ik_max_word"
}
~~~
