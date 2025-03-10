
let a="hello";
a = a.split('');
const map = new Map();
a.forEach(e=>{
    if(map.has(e)){
        map.set(e, map.get(e)+1);
    }
    else{
        map.set(e,1);
    }
})
console.log(map);
