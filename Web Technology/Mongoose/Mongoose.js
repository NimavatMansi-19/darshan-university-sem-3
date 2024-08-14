const mongoose=require("mongoose");
const StudentSchema = new mongoose.Schema({
    name: String,
    Roll:Number,
    age: Number
})
module.exports=mongoose.model("students",StudentSchema)