const express=require("express");
const fs=require("fs");
const app=express();
app.get('/',(req,res)=>{
 res.send("Hello World")
})
app.get('/About',(req,res)=>{
     res.send("Welcome to about page")
    })
app.get('/Contact',(req,res)=>{
        res.send("Welcome to Contact page")
       })
app.get('/Service',(req,res)=>{
        res.send("Welcome to Service page")
       })
    
app.get('/Home',(req,res)=>{
        fs.readFile('file.txt',(err,data)=>{
            res.send(data.toString());
        })
        
        })
app.listen(3000);