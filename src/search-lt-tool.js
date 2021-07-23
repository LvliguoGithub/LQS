import React, { useState } from 'react';
import { Card, Checkbox, DatePicker, Input, Rate, Space, Typography } from 'antd';
import result from "./web-api/get-search-data";

import LtList from './lt-list';

// TODO test code
import LtDetail from './lt-detail';

import './search-tool.css';

function SearchLtTool() {
    const [data, setData] = useState({content: [], totalPages: 0});
    const { Search } = Input;
    const { Title } = Typography;
    const { RangePicker } = DatePicker;

    const accessOptions = ['公开', '私人', '预印版'];
    const contentOptions = ['论文', '书籍', '早期引用'];

    const getSearchData = async function(value){
        const data = await result.getSearchData(value);
        setData(data);
    } 

    return (
        <Space align="start" size="large">
            <div>
                <div className="srearch-tool">
                    <Space direction="vertical">
                        <Search placeholder="输入搜索内容" onSearch={getSearchData} enterButton style={{ width: 400 }}/>
                        <LtList data={data}/>
                    </Space>
                </div>
            </div>
            
            <Space direction="vertical">
                <Title level={3}>筛选条件</Title>
                <Card size="small" title="年份" style={{ width: 300 }}>
                    <RangePicker picker="year" />
                </Card>
                <Card size="small" title="推荐度" style={{ width: 300 }}>
                    <Rate />
                </Card>
                <Card size="small" title="访问类型" style={{ width: 300 }}>
                    <Checkbox.Group options={accessOptions} />
                </Card>
                <Card size="small" title="内容类型" style={{ width: 300 }}>
                    <Checkbox.Group options={contentOptions} />
                </Card>
            </Space>
        </Space>
    );
}

export default SearchLtTool;

