import React, { useState } from 'react';
import 'antd/dist/antd.css';
import './index.css';
import { List, Typography, Pagination } from 'antd';

import LqItem from './lq-item';


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
              <LqItem item = {item}/>
            </List.Item>
          )}
        />,
    </>
    );
}

export default LqList;
