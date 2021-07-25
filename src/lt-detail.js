import React, { useEffect, useState } from 'react';
import { Card, Divider, Image, Layout, List, Space, Typography } from 'antd';

import './index.css';
import LtList from './lt-list';
import result from "./web-api/get-search-data";
import CommentList from './compont/comment-list';

function LtDetail(props) {
  const commentData = {content: [{ltName: ''}], totalPages: 1};
  const [ltInfo, setLtInfo] = useState({ltName:'', ltDigest:''});
  const [data, setData] = useState({content: [], totalPages: 1});

  const { Title, Paragraph, Text } = Typography;
      
  useEffect(() => {
    const fetchData = async () => {
        const ltInfo = await result.getSearchData("search/" + props.match.params.uid);
        setLtInfo(ltInfo);
    };

    fetchData();
}, []);

  return (
    <div className="main-page">
      <Space direction="vertical">
        <Space align="start" size="large" >
          <Typography style={{ width: 1000 }}>
            <Title level={3}>{ltInfo.ltName}</Title>
            <Paragraph>【作者】{ltInfo.authors}</Paragraph>
            <Paragraph>【机构】{ltInfo.unit}</Paragraph>
            <Paragraph>【摘要】{ltInfo.ltDigest}</Paragraph>
            <Image 
              width={200}
              src="https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
            />
          </Typography>

          <Space direction="vertical">
            <Card style={{ width: 500 }}>
              <Typography>
                <Title level={4}>被引用</Title>
                <List 
                  dataSource={["[1]引用1", "[2]引用2"]}
                  renderItem={item => (
                    <List.Item>
                      <Text>{item}</Text>
                    </List.Item>
                  )}
                />
              </Typography>
            </Card>

            <Card style={{ width: 500 }}>
              <Typography>
                <Title level={4}>参考文献</Title>
                <List 
                  dataSource={["[1]参考1", "[2]参考2"]}
                  renderItem={item => (
                    <List.Item>
                      <Text>{item}</Text>
                    </List.Item>
                  )}
                />
              </Typography>
            </Card>

          </Space>
        </Space>

        <Divider/>
        
        <div>
          <Space direction="vertical">
            <Title level={4}>评论</Title>
            <CommentList data={commentData} pageSize={5}></CommentList>
          </Space>
        </div>
        
        <Divider/>
        <div>
          <Space direction="vertical">
            <Title level={4}>相关推荐</Title>
            <LtList data={data} pageSize={5} space='null' ></LtList>
          </Space>
        </div>
      </Space>
    </div>
  );
}

export default LtDetail;