import React, { useState } from 'react';
import { Input, Space } from 'antd';
import result from "./web-api/get-search-data";

import LqList from './lq-list';

import './search-tool.css';

function SearchTool() {
    const [data, setData] = useState({content: [], totalPages: 0});
    const { Search } = Input;

    const getSearchData = async function(value){
        console.log(value);
        const data = await result.getSearchData(value);
        console.log(data);
        
        setData(data);
    } 
    
    return (
        <div>
            <div className="srearch-tool">
                <Space direction="vertical">
                    <Search placeholder="input search text" onSearch={getSearchData} enterButton style={{ width: 400 }}/>
                </Space>
            </div>,
            <LqList data={data}/>
        </div>
        );
}

export default SearchTool;

