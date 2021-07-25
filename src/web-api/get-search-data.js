import JsonFetch from "../utils/json-fetch";

 let result = {
    // 请求数据
    getSearchData: async function(url){
        const getSearchData = await JsonFetch.get("http://localhost/backend/" + url);
        return getSearchData;
    },
}

export default result;