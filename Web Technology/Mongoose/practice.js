const express=require("express");
const mongoose=require("mongoose");
const StudentSchema=require("./Mongoose")
const bodyParser=require("body-parser");
const app=express();
app.use(bodyParser.urlencoded());

const conectionString='mongodb+srv://Mansi:Mansi.19@mongodb-wt.qd7na.mongodb.net/Btech_CSE_114';
mongoose.connect(conectionString)
.then(() => {
    console.log('Connected!');
    
        app.get('/getAllStudent',async(req,res)=>{
                 const stuData= await StudentSchema.find();
                res.send(stuData);
            })
        app.get('/getStudent/:name', async(req,res)=>{
            const stuData=await StudentSchema.findOne({name:req.params.name})
            res.send(stuData);

        })
        app.post('/getStudent',async(req,res)=>{
            stu=new StudentSchema({
                ...req.body
            })
            const ans=await stu.save();
            res.send(ans);
        })
        app


        app.listen(3000,()=>{
        console.log("Server Started on port 3000...");
    })

})




