import { useState } from "react";
import { useNavigate,Link } from "react-router-dom";

function New_Amission(){
    const [data, setData] = useState({});
    const navigate = useNavigate();
    
    return(
        <>
        <style>{`
                body {
                    font-family: 'Arial', sans-serif;
                    background-color: #f4f4f9;
                    margin: 0;
                    padding: 0;
                }

                .form-container {
                    max-width: 600px;
                    margin: 60px auto;
                    padding: 30px;
                    background-color: #fff;
                    border-radius: 10px;
                    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.15);
                }

                .form-title {
                    text-align: center;
                    font-size: 24px;
                    margin-bottom: 30px;
                    color: #333;
                }

                .form-group {
                    margin-bottom: 20px;
                }

                .form-group label {
                    display: block;
                    margin-bottom: 8px;
                    font-weight: 600;
                    color: #555;
                    font-size: 14px;
                }

                .form-group input {
                    width: 100%;
                    padding: 12px;
                    font-size: 16px;
                    border: 1px solid #ddd;
                    border-radius: 5px;
                    background-color: #f9f9f9;
                    transition: background-color 0.3s, border-color 0.3s;
                }

                .form-group input:focus {
                    background-color: #fff;
                    border-color: #007bff;
                    outline: none;
                }

                .button-container {
                    display: flex;
                    justify-content: flex-end;
                    margin-top: 30px;
                }

                .btn-primary {
                    padding: 12px 24px;
                    background-color: #007bff;
                    border: none;
                    border-radius: 5px;
                    color: white;
                    font-size: 16px;
                    font-weight: bold;
                    cursor: pointer;
                    transition: background-color 0.3s ease;
                }

                .btn-primary:hover {
                    background-color: #0056b3;
                }

                @media (max-width: 768px) {
                    .form-container {
                        padding: 20px;
                        margin: 20px;
                    }

                    .btn-primary {
                        width: 100%;
                        text-align: center;
                    }
                }
            `}</style>

            <div class="form-group row">
                <label for="text2" class="col-4 col-form-label">Name</label> 
                <div class="col-8">
                <input onChange={(e)=>{
                    setData({...data,name:e.target.value})
                }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text1" class="col-4 col-form-label">roll</label> 
                <div class="col-8">
                <input onChange={(e)=>{
                    setData({...data,roll:e.target.value})
                }}  type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text4" class="col-4 col-form-label">Standard</label> 
                <div class="col-8">
                <input onChange={(e)=>{
                    setData({...data,Standard:e.target.value})
                }}  type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text3" class="col-4 col-form-label">Slot</label> 
                <div class="col-8">
                <input onChange={(e)=>{
                    setData({...data,Slot:e.target.value})
                }}  type="text" class="form-control" />
                </div>
            </div> 
            <div class="form-group row">
                <label for="text3" class="col-4 col-form-label">Date_Joining</label> 
                <div class="col-8">
                <input onChange={(e)=>{
                    setData({...data,DateOfJoining:e.target.value})
                }}  type="text" class="form-control" />
                </div>
            </div> 
            <div class="form-group row">
                <div class="offset-4 col-8">
                <button onClick={()=>{
                    const apiUrl = "http://localhost:5000/api/users";

                    fetch(apiUrl,{
                        method:"POST",
                        body:JSON.stringify(data),
                        headers:{
                            "Content-Type":"application/json"
                        }
                    })
                    .then(res=>res.json())
                    .then(res=>{
                        navigate('/Class');
                    });
                }} name="submit" class="btn btn-primary">Submit</button>
                <Link to="/Class">
                    <button  class="btn btn-primary mx-3" >Back</button>
                 </Link>
                </div>
            </div>
        </>
    );
}

export default New_Amission;