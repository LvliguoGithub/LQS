import JsonFetch from "../utils/json-fetch";

 let result = {
    // 请求数据
    getSearchData: async function(url){
        // const getSearchData = await JsonFetch.get("http://localhost/backend/" + url);
        const getSearchData = await JsonFetch.get("http://"+ document.domain +"/backend/" + url);
        return getSearchData;
    },
}

export default result;