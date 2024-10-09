const express = require("express");
const mongoose = require("mongoose");
const app = express();
const student=require("./Models/model");
const connectionString = `mongodb+srv://23010101177:Mansi19@mongodb-wt.qd7na.mongodb.net/Btech_CSE_114`;
const cors = require('cors');
app.use(cors());

app.use(express.json());
const UserRoute = require("./Routes/UserRoute");
app.use("/api/users", UserRoute); 
// Connect to MongoDB
mongoose.connect(connectionString)
    .then(() => {
        console.log("Connected to MongoDB!");
        app.listen(5000, () => {
            console.log("Server is running on port 5000");
        });
    });

    
    

