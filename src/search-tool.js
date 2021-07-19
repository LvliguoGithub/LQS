import React, { useState } from 'react';
import { Input, Space } from 'antd';
import result from "./web-api/get-search-data";

import './search-tool.css';

function SearchTool() {
    const [count, setCount] = useState("");
    const { Search } = Input;

    const getSearchData = async function(value){
        console.log(value);
        const data = await result.getSearchData(value);
        setCount(data);
        console.log(data);
    }
    
    // const onSearch = value => {
    //     console.log(value);
    //     console.log(count);
    // }
    
    return (
        <div className="srearch-tool">
            <Space direction="vertical">
                <Search placeholder="input search text" onSearch={getSearchData} enterButton style={{ width: 400 }}/>
            </Space>,
        </div>
        );
}

export default SearchTool;

