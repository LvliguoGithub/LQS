import React, { useEffect, useState } from 'react';
import { Card, Checkbox, DatePicker, Input, Rate, Space, Typography } from 'antd';
import result from "./web-api/get-search-data";
import './App.css';

import LtList from './lt-list';
import { useHistory } from 'react-router-dom';

import './search-tool.css';

function SearchLtTool(props) {
    const [data, setData] = useState({content: [], totalPages: 0});
    const { Search } = Input;
    const { Title } = Typography;
    const { RangePicker } = DatePicker;
    const searchVal= props.location.search;
    const inputValue = searchVal.substring(searchVal.indexOf('=') + 1);

    const accessOptions = ['公开', '私人', '预印版'];
    const contentOptions = ['论文', '书籍', '早期引用'];
    const history = useHistory();

    useEffect(() => {    
        const fetchData = async () => {
            const data = await result.getSearchData("search" + props.location.search);
            setData(data);
        };

        fetchData();
    }, []);

    const getSearchData = async function(value){
        history.push('/search?query=' + value);
    } 

    return (
        <Space align="start" size="large">
            <div className="srearch-tool" class="app-searh">
                <Space direction="vertical">
                    <Search placeholder="输入搜索内容" defaultValue={inputValue} onSearch={getSearchData} enterButton style={{ width: 600 }}/>
                    <LtList data={data}/>
                </Space>
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

