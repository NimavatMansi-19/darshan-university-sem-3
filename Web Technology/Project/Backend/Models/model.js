// Models/model.js
const mongoose = require("mongoose");

const studentSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
    },
    roll: {
        type: String,
        required: true,
    },
    Standard: {
        type: Number,  // Change this to String
        required: true,
    },
    Slot: {
        type: Number,  // Ensure you have this field as well
        required: true,
    },
    DateOfJoining: {
        type: String,
        required: true,
    },
});

const student = mongoose.model("student", studentSchema);

module.exports = student;
