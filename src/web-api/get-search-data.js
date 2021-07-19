import JsonFetch from "../utils/json-fetch";

 let result = {
    // 请求数据
    getSearchData: async function(value){
        const getSearchData = await JsonFetch.get("http://localhost//search?query=" + value);
        console.log('2');
    return getSearchData;
    },
}

export default result;