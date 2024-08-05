const express=require("express");
const app=express();

app.use(express.json());
const list=[];
//display
app.get("/lists",(req,res)=>{
    res.send(list);
});
//Add
app.post("/lists",(req,res)=>{
    const {name}=req.body;
    list.push(name);
    res.send(list);
})
//s
app.put("/lists/:index",(req,res)=>{
    const id=req.params.index;
    const {name}=req.body;
    list[id]=name;
    res.send(list);
})
//delete
app.delete("/lists/:index",(req,res)=>{
    const id = req.params.index;
    list.splice(id,1);
    res.send(list);
})
app.listen(3001,()=>{
    console.log("server is running on port 3001");
});