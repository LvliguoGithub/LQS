import React, { useState } from 'react';
import { Button, Input, Space } from 'antd';
import result from "./web-api/get-search-data";

import LtList from './lt-list';

import './search-tool.css';

function SearchTool() {
    const [data, setData] = useState({content: [], totalPages: 0});
    const { Search } = Input;

    const getSearchData = async function(value){
        const data = await result.getSearchData(value);
        setData(data);
    } 
    
    return (
        <div className="srearch-tool">
            <Space direction="vertical">
                <Search placeholder="输入搜索的内容" onSearch={getSearchData} enterButton style={{ width: 600 }}/>
                <Space>
                    <Button type="primary">文献/出版物</Button>
                    <Button type="primary">作者</Button>
                    <Button type="primary">机构</Button>
                    <Button type="primary">问题</Button>
                    <Button type="primary">方法/成果</Button>
                </Space>
                <LtList data={data}/>
            </Space>
        </div>
        );
}

export default SearchTool;

