import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";

function StuDetails() {
    const [data, setData] = useState({});
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    
    const { name } = useParams(); // Get student name from URL params

    const apiUrl = `http://localhost:5000/api/users/${name}`;


    useEffect(() => {
        fetch(apiUrl, { method: "GET" })
            .then((res) => {
                if (!res.ok) {
                    throw new Error('Network response was not ok ' + res.statusText);
                }
                return res.json();
            })
            .then((res) => {
                setData(res);
                setLoading(false);
            })
            .catch((err) => {
                setError(err.message);
                setLoading(false);
            });
    }, [apiUrl]);

    // Error handling
    if (error) {
        return <p>Error: {error}</p>;
    }

    // Loading state
    if (loading) {
        return <p>Loading student details...</p>;
    }

    // Display the student details
    return (
        <div className="container">
            <Link to="/Class" className="btn btn-info">Back</Link>
            
            <div class="row">
             <div class="col mb-3 mb-sm-0">
             <div class="card">
                 <div class="card-body">
                    <h3 class="card-title">{data.name}</h3>
                <p class="card-text">
                 {data.name} Studying in Standard {data.Standard} and Joined on {data.DateOfJoining} ans coming in Slot number {data.Slot}
                </p>
                <Link to="/Update">
                    <button  class="btn btn-primary mx-3" >Edit</button>
                 </Link>
                 <Link to="/Cancel">
                    <button  class="btn btn-primary mx-3" >Delete</button>
                 </Link>
                 <Link to="/Class">
                    <button  class="btn btn-primary mx-3" >Back</button>
                 </Link>
                </div>
             </div>
             </div>
        </div>
    </div>
    );
}

export default StuDetails;
