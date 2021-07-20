import React, { useState } from 'react';
import 'antd/dist/antd.css';
import './index.css';
import { List, Typography, Pagination } from 'antd';


function LqList(props) {
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
              <Typography.Text mark>{item.id}</Typography.Text> {item.ltName}
            </List.Item>
          )}
        />,
    </>
    );
}

export default LqList;