import React, { useState } from 'react';
import { Input, Space } from 'antd';
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
        <div>
            <div className="srearch-tool" style="width:1800">
                <Space direction="vertical">
                    <Search placeholder="input search text" onSearch={getSearchData} enterButton style={{ width: 1000 }}/>
                </Space>
            </div>
            <LtList data={data}/>
        </div>
        );
}

export default SearchTool;

