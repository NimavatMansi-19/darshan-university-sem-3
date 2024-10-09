import { useState } from "react";
import { useNavigate,Link } from "react-router-dom";

function Update() {
    const navigate = useNavigate();
    const [name, setName] = useState("");
    const [student, setStudent] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(false);
    const [updatedData, setUpdatedData] = useState({
        name: "",
        roll: "",
        Standard: ""
    });

    const fetchStudentByRoll = () => {
        setLoading(true);
        const apiUrl = "http://localhost:5000/api/users/" + name;
        
        fetch(apiUrl, { method: "GET" })
            .then((res) => {
                if (!res.ok) {
                    throw new Error('Student not found');
                }
                return res.json();
            })
            .then((data) => {
                setStudent(data);
                setUpdatedData({
                    name: data.name,
                    roll: data.roll,
                    Standard: data.Standard
                });
                setError(null);
            })
            .catch((err) => {
                setError(err.message);
                setStudent(null);
            })
            .finally(() => setLoading(false));
    };

    const editStudent = () => {
        const apiUrl = "http://localhost:5000/api/users/" + name;
        fetch(apiUrl, {
            method: "PATCH",
            body: JSON.stringify(updatedData),
            headers: {
                "Content-Type": "application/json"
            }
        }).then((res) => {
            if (res.ok) {
                navigate('/Class'); 
            }
        });
    };

    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setUpdatedData(prevData => ({
            ...prevData,
            [name]: value
        }));
    };

    return (
        <div className="container">
            <h1>Edit Student by Name </h1>

            {/* Input for roll number */}
            <input
                type="text"
                placeholder="Enter Name to be edited"
                value={name}
                onChange={(e) => setName(e.target.value)}
                className="form-control"
            />
            <button className="btn btn-primary mt-2" onClick={fetchStudentByRoll}>
                Fetch Student
            </button>
            <Link to="/Class">
                    <button  class="btn btn-primary mx-3" >Back</button>
                 </Link>

            {loading && <p>Loading student data...</p>}

            {error && <p style={{ color: 'red' }}>{error}</p>}
            {student && (
                <div>
                    <h2>Student Name: 
                        <input
                            type="text"
                            name="name"
                            value={updatedData.name}
                            onChange={handleInputChange}
                            className="form-control"
                        />
                    </h2>
                    <h3>Roll Number: 
                        <input
                            type="text"
                            name="roll"
                            value={updatedData.roll}
                            onChange={handleInputChange}
                            className="form-control"
                        />
                    </h3>
                    <h3>Standard: 
                        <input
                            type="text"
                            name="Standard"
                            value={updatedData.Standard}
                            onChange={handleInputChange}
                            className="form-control"
                        />
                    </h3>
                    {/* Edit Button */}
                    <button className="btn btn-danger" onClick={editStudent}>
                        Edit Student
                    </button>
                </div>
            )}
        </div>
    );
}

export default Update;
