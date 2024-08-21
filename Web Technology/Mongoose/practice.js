const express=require("express");
const mongoose=require("mongoose");
const StudentSchema=require("./Mongoose")
const bodyParser=require("body-parser");
require("dotenv").config();
const app=express();
app.use(bodyParser.urlencoded());

const conectionString='mongodb+srv://'+process.env.mongodb_user+':'+process.env.mongodb_pass+'@mongodb-wt.qd7na.mongodb.net/Btech_CSE_114';
mongoose.connect(conectionString)
.then(() => {
    console.log('Connected!');
        //get All
        app.get('/getAllStudent',async(req,res)=>{
                 const stuData= await StudentSchema.find();
                res.send(stuData);
            })
            //get one
        app.get('/getStudent/:name', async(req,res)=>{
            const stuData=await StudentSchema.findOne({name:req.params.name})
            res.send(stuData);

        })
        //Add
        app.post('/getStudent',async(req,res)=>{
            stu=new StudentSchema({
                ...req.body
            })
            const ans=await stu.save();
            res.send(ans);
        })
        //update
        app.patch('/getStudent/:roll',async(req,res)=>{
            const stuData=await StudentSchema.findOne({Roll:req.params.roll})
            stuData.name=req.body.name;
            stuData.Roll=req.body.roll;
            const ans=await stuData.save();
            res.send(ans);
        })
        //delete
        app.delete('/getStudent/:roll',async(req,res)=>{
            const stuData=await StudentSchema.deleteOne({Roll:req.params.roll})
            res.send(stuData)
        })
        //search
        app.get('/getStudent/search/:text',async(req,res)=>{
            const stuData=await StudentSchema.find({
                name:{
                    $regex:req.params.text
                }
            })
            res.send(stuData);
        })

        app.listen(process.env.port,()=>{
        console.log("Server Started on port 3000...");
    })

})




