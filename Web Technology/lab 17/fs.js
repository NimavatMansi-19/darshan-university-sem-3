const fs=require("fs");
fs.readFile("OS.js",(err,data)=>{
    console.log(data.toString())
});
fs.exists("index.js",(exists)=>{
    console.log(exists?"found":"not found");
})
fs.stat("index.js",(err,data)=>{
    console.log(data);
})
fs.writeFile("acb.html","hello world",(err,data)=>{
    console.log("data");
})
fs.appendFile("acb.html"," hello JS",(err,data)=>{
    console.log("hi");
})
fs.unlink("acb.html",(err)=>{
    if(err){throw err}
    console.log("deleted");
})
fs.rename("index.js","path.js",(err)=>{
    if(err){throw err}
    console.log("renamed");
})
// const child_process=require("child_process");
// child_process.exec("dir",(err,stdout,stdin)=>{
//     console.log(stdout);
// })

