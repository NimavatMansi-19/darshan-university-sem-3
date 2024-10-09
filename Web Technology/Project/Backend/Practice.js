const express= require("express");
const app=express();
const mongoose=require("mongoose");
const User=require("../Models/model");
const router = express.Router();
router.post('/',async(req,res)=>{
    const {Name,Standard,Roll,Contact}=req.body;
    
    const ans=await User.create({
        Name:Name, 
        age:Contact
    });
    res.json(ans);
})
router.get('/',async(req,res)=>{
    const stuData= await User.find();
   res.send(stuData);
})
// get single student 
router.get('/:id',async(req,res)=>{
    const {Roll}=req.params;
    const SingleUser= await User.findById({_Roll:Roll});
   res.json(SingleUser);
})
//delete
router.delete("/:id",async(req,res)=>{
    const {id}=req.params;
    const deleteUser=await User.findByIdAndDelete({_id:id});
res.json(deleteUser);
}) 
module.exports=router; 

