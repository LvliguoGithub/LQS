/**
 * description: 将对象转为query字符串   obj格式:  string:string|number|undefined
 */

const pickQuery = (obj) => {
    let queryArray = [];
    for(const key of Object.keys(obj)){
        const value = obj[key];
        if(value !== undefined){
            queryArray.push(`${key}=${value}`);
        }
    }
    const queryString = queryArray.length === 0 ? '' : encodeURI("?"+queryArray.join("&"));
    return queryString;
};

export default pickQuery;