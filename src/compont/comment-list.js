import React, { useState } from 'react';
import 'antd/dist/antd.css';
import '../index.css';
import { List, Typography, Space, Comment, Tooltip } from 'antd';
import moment from 'moment';

function CommentItem(props) {
    
    const { Text, Link } = Typography;

  return (
  <Space direction="vertical">
      <Space >
        <Text type="secondary">发布时间</Text>
        <Text type="secondary">发刊的期刊来源</Text>
        <Text>DOI</Text>
      </Space>
      <Text>作者1，作者2</Text>
      <Text>{props.item.desc}</Text>
  </Space>);
}

function CommentList(props) {
  const pageSize = props.pageSize || 10
  const paginationData = { hideOnSinglePage: true, defaultPageSize:pageSize, total:props.data.totalElements }

    return (
    <>
        <List
          split={ false }
          pagination={ paginationData }
          dataSource={props.data.content}
          renderItem={item => (
              <Comment 
              author={"lvliguo"}
              avatar={'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png'}
              content={
                  <p>内容{item.digest}xxxxxxxxxxxxxxxxxxx</p>
              }
              datetime= {
                <Tooltip title={moment().subtract(1, 'days').format('YYYY-MM-DD HH:mm:ss')}>
                  <span>{moment().subtract(1, 'days').fromNow()}</span>
                </Tooltip>
              }
              />
            )}
        />,
    </>
    );
}

export default CommentList;