import React, { useState } from 'react';
import 'antd/dist/antd.css';
import './index.css';
import { List, Typography, Pagination, Space, Button } from 'antd';

function LtItem(props) {
  const { Text, Link } = Typography;
  return (
  <Space direction="vertical">
      <Link href="/lq-detail" target="_blank">{props.item.ltName}</Link>
      <Space >
        <Text>发布时间</Text>
        <Text>发刊的期刊来源</Text>
        <Text>DOI</Text>
      </Space>
      <Text>作者1，作者2</Text>
      <Text>{props.item.desc}</Text>
      <Space>
        <Text>阅读数量: {0}</Text>
        <Text>推荐数量: {0}</Text>
        <Text>成熟度</Text>
        <Button>收藏</Button>
        <Button>微信分享</Button>
      </Space>
  </Space>);
}

function LtList(props) {
  const [current, setCurrent] = useState(1);

  const onChange = function(value) {
    console.log(value)
  }

    return (
    <>
        <List
          footer={<Pagination current={current} onChange={onChange} total={props.data.totalPages} />}
          dataSource={props.data.content}
          renderItem={item => (
            <List.Item>
              <LtItem item = {item}/>
            </List.Item>
          )}
        />,
    </>
    );
}

export default LtList;
