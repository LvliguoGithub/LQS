import React, { useEffect } from 'react';
import { Button, Input, Space } from 'antd';

import './search-tool.css';
import { useHistory } from 'react-router-dom';

function SearchTool(props) {
    const history = useHistory();
    const { Search } = Input;

    useEffect(() => {

    }, []);

    const getSearchData = async function(value){
        // todo 判断空
        history.push('/search?query=' + value);
    } 
    
    return (
        <div class="home-page">
            <div className="srearch-tool" id="home-page">
                <Space direction="vertical" align="center">
                    <Search placeholder="输入搜索的内容" onSearch={getSearchData} enterButton style={{ width: 600 }}/>
                    <Space>
                        <Button type="primary">文献/出版物</Button>
                        <Button type="primary">作者</Button>
                        <Button type="primary">机构</Button>
                        <Button type="primary">问题</Button>
                        <Button type="primary">方法/成果</Button>
                    </Space>
                </Space>
            </div>
        </div>
        );
}

export default SearchTool;