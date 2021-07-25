import React from 'react';
import 'antd/dist/antd.css';
import './index.css';
import { List, Typography, Space, Button } from 'antd';
import { StarOutlined, WechatOutlined } from '@ant-design/icons';
function LtItem(props) {

    const { Text, Link,Paragraph } = Typography;
    const href = "/lt-detail/" + props.item.id;
    const ellipsis = {rows:2}

    const space =  props.space=='null' ? '' : <Space>
    <Text>阅读数量: {0}</Text>
    <Text>推荐数量: {0}</Text>
    <Text>成熟度</Text>
    <Button icon={<StarOutlined/>}>收藏</Button>
    <Button icon={<WechatOutlined/>}>微信分享</Button>
  </Space>;

  return (
  <Space direction="vertical" size={1}>
      <Link href={href} target="_blank">{props.item.ltName}</Link>
      <Space >
        <Text type="secondary">发布时间</Text>
        <Text type="secondary">发刊的期刊来源</Text>
        <Text>DOI</Text>
      </Space>
      <Text>{props.item.authors}</Text>
      <Paragraph ellipsis={ellipsis}>{props.item.ltDigest}</Paragraph>
      {/*  */}
      <div>{space}</div>
  </Space>);
}

function LtList(props) {
  const pageSize = props.pageSize || 10
  const paginationData = { hideOnSinglePage: true, defaultPageSize:pageSize, total:props.data.totalElements }

    return (
    <>
        <List
          split={ false }
          pagination={ paginationData }
          dataSource={props.data.content}
          renderItem={item => (
            <List.Item>
                <Typography style={{ width: 1000 }}>
                    <LtItem item = {item} space={props.space}/>
                </Typography>
            </List.Item>
          )}
        />,
    </>
    );
}

export default LtList;