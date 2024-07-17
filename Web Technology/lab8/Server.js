const http=require("http");
const fs=require("fs");
const server=http.createServer((req,res)=>{
    if(req.url=="/abc.js"){
        res.end("hello js")
        // fs.readFile("path.js",(err,data)=>{
        //     res.end(data.toString())
        // });
    }
        else{
            res.end("hello world");
            console.log(req.url)
        }
});
const server1=http.createServer((req,res)=>{
    if(req.url=="/path.js"){
        fs.readFile("path.js",(err,data)=>{
            res.end(data.toString())
        });
    }else if(req.url=="/OS.js"){
        fs.readFile("OS.js",(err,data)=>{
            res.end(data.toString())
        });
    }else if(req.url=="/fs.js"){
        fs.readFile("fs.js",(err,data)=>{
            res.end(data.toString())
        });
    }
        else{
            res.end("File not found");
            //console.log(req.url)
        }
});
const port=3000;
server.listen(port,()=>{
    console.log("server is running on port 3000");
});
const port1=5000;
server1.listen(port1,()=>{
    console.log("server is running on port 5000");
});