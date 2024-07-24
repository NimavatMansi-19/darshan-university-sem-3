
const http=require("http");
const fs=require("fs");

const server=http.createServer((req,res)=>{
    res.setHeader("Content-type","text/html");
    res.write("<a style='float:left;text-decoration: none;margin: 25px;font-size: 20px;'  href='Login>Login</a>");
    res.write("<a style='margin-left:50px;border:2px solid black;color;background-color: blue;text-decoration:none;border-radius:3px;color:white' href='contact.html'>contact</a>");
   

    if(req.url=="/About.html"){
         fs.readFile("About.html",(err,data)=>{
             res.end(data.toString())
         });
    }
     else if(req.url=="/contact.html"){
        fs.readFile("contact.html",(err,data)=>{
            res.end(data.toString())
        });
   }
   
else{
   fs.readFile("Home.html",(err,data)=>{
    res.end(data.toString())
   });
}

});

const port=3000;
server.listen(port,()=>{
    console.log("server is running on port 3000");
});
