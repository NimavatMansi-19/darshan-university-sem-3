import { useState } from "react";
import { useNavigate,Link } from "react-router-dom";

function Cancel() {
    const navigate = useNavigate();
    const [name, setName] = useState("");
    const [student, setStudent] = useState(null);
    const [error, setError] = useState(null);
    const [loading, setLoading] = useState(false);
    const [deleted, setDeleted] = useState(false);

    const fetchStudentByRoll = () => {
        setLoading(true);
        const apiUrl = "http://localhost:5000/api/users/"+name;
        
        fetch(apiUrl, { method: "GET" })
            .then((res) => {
                if (!res.ok) {
                    throw new Error('Student not found');
                }
                return res.json();
            })
            .then((data) => {
                setStudent(data);
                setError(null);
            })
            .catch((err) => {
                setError(err.message);
                setStudent(null);
            })
            .finally(() => setLoading(false));
    };

    const deleteStudent = () => {
        const apiUrl = "http://localhost:5000/api/users/"+name;

        

                fetch(apiUrl, {method:"DELETE"})
                .then(res=>res.json())
                .then(res=>{
                    navigate('/Class');
                })
    };

    return (
        <div className="container">
            <h1>Delete Student by Name </h1>

            {/* Input for roll number */}
            <input
                type="text"
                placeholder="Enter Name to be Deleted "
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

            {/* Show loading state */}
            {loading && <p>Loading student data...</p>}

            {/* Error message */}
            {error && <p style={{ color: 'red' }}>{error}</p>}

            {/* Student info */}
            {student && !deleted && (
                <div>
                    <h2>Student Name: {student.name}</h2>
                    <h3>Roll Number: {student.roll}</h3>
                    <h3>Standard: {student.Standard}</h3>
                    {/* Delete Button */}
                    <button className="btn btn-danger" onClick={deleteStudent}>
                        Delete Student
                    </button>
                </div>
            )}

            {/* Success message */}
            {deleted && <p style={{ color: 'green' }}>Student deleted successfully.</p>}
        </div>
    );
}

export default Cancel;
