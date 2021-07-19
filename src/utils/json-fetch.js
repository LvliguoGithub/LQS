import pickQuery from "./pick-query"; // eslint-disable-next-line

const JsonFetch = {
    get: (url,query = {}) => {
        return new Promise((resolve,reject) => {
            fetch(url + pickQuery(query),{
                method:"GET",
            }).then(res =>{
                return res.json();
            }).then(data =>{
                resolve(data);
            }).catch(error =>{
                reject(error);
            })
        })
    }
}

export default JsonFetch;