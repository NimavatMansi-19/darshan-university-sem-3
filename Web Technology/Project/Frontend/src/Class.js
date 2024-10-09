import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function Class() {
    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    const apiUrl = "http://localhost:5000/api/users"; // Replace with your actual API endpoint

    useEffect(() => {
        console.log("Fetching students list...");

        fetch(apiUrl, { method: "GET" })
            .then((res) => {
                if (!res.ok) {
                    throw new Error('Network response was not ok ' + res.statusText);
                }
                return res.json();
            })
            .then((res) => {
                console.log("Fetched students:", res); // Log the student data
                setData(res);
                setLoading(false);
            })
            .catch((err) => {
                console.error("Error fetching students:", err);
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
        return <p>Loading students...</p>;
    }

    // If no students are found
    if (data.length === 0) {
        return <p>No students found.</p>;
    }

    // Render the student rows
    const StudentRows = data.map((stu, index) => (
        <tr key={index}>
            <td>{stu.name}</td>
            <td>{stu.roll}</td>
            <td>
                {/* Link to the student's details page */}
                <Link className="btn btn-primary" to={"/student/" + stu.name}>Read More</Link>
            </td>
        </tr>
    ));

    return (
        <div className="container">
            <h1>Students List</h1>
            <table className="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Roll</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>{StudentRows}</tbody>
            </table>
        </div>
    );
}

export default Class;
