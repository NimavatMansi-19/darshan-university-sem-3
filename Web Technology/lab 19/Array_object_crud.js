const express=require("express");
const bodyParser=require("body-parser");
const app=express();
app.use(bodyParser.urlencoded({ extended: true }))
app.listen(5001,()=>{
    console.log("server is running on port 3001");
});
const stu=[
    {
       student_name:"abc",
        id:101,
        marks:90
        },
        {
            student_name:"pqr",
            id:102,
            marks:85
            
        }  
];
const fac=[
    {
        faculty_name:"abc",
        id:101,
        age:90
        },
        {
            faculty_name:"pqr",
            id:102,
            age:85
            
        }  
];
const laptop=[
    {
        laptop_name:"abc",
        id:101,
        age:90
        },
        {
            laptop_name:"pqr",
            id:102,
            age:85
            
        }  
];
const dataMap = {
    'fac': fac,
    'stu': stu,
    'laptop':laptop
};
app.get("/list/:var",(req,res)=>{
    const r=req.params.var;
    const data = dataMap[r];
        res.send(data);
        

});
app.get("/list/:var/:id",(req,res)=>{
    const r=req.params.var;
    const data = dataMap[r];
    const index=data.findIndex((temp)=>{
        return  temp.id==req.params.id
    })
    res.send(data[index]);
   
})
app.post("/list/:var",(req,res)=>{
    const newdata=req.body;
    const r=req.params.var;
    const data = dataMap[r];
    data.push(newdata);
    res.send(data);
});
app.delete("/list/:var/:id",(req,res)=>{
    const r=req.params.var;
    const data = dataMap[r];
    const index=data.findIndex((temp)=>{
        return  temp.id==req.params.id
    })
    data.splice(index,1);
    res.send(data);
})
app.patch("/list/:var/:id",(req,res)=>{
    const r=req.params.var;
    const data = dataMap[r];
    const index=data.findIndex((temp)=>{
        return  temp.id==req.params.id
    })
    const newdetail=req.body;
    data[index]=newdetail;
    res.send(data);
})