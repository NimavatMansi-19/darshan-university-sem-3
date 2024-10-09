import { Link, Outlet } from "react-router-dom";
import Home from './Home';
import Class from './Class.js';
import New_Amission from './New_Amission.js';
import Cancel from './Cancel.js';
import Update from "./Update.js";


function Layout(){
  const logo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpQaLEba6E_wPCs9HZqiR5m-w0RF3ZaV-FHA&s";
    return(
        
        <>
            <div className="container">
                <div className="row">
                    <div className="col-4" >
                      <nav className="navbar navbar-light bg-light"> 
                        <img src={logo} width="70" height="50" className="d-inline-block align-top"  alt=""/>
                        <h3 style={{fontFamily:"Arial",fontStyle:"italic",fontWeight:"bold"}}>Khodiyar Classes</h3>
                        </nav>
                    </div>
                     <div className="col">
                     <nav className="navbar navbar-expand-lg navbar-light bg-light">
                        <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div className="navbar-nav">
                            <Link className="nav-item nav-link active" to="/Home" element={<Home />}>Home</Link>
                            <Link className="nav-item nav-link active" to="/Class" element={<Class />}>Total Students </Link>
                            <Link className="nav-item nav-link active" to="/New_Amission" element={<New_Amission />}>New Admission</Link>
                            <Link className="nav-item nav-link active" to="/Cancel" element={<Cancel />}>Admission Cancelation</Link>
                            <Link className="nav-item nav-link active" to="/Update" element={<Update />}>Update</Link>
                            
                            </div>
                        </div>
                    </nav>
                    </div>
                    </div>
                    <div className="col">
                        <Outlet />
                    </div>
                    </div>
                    <style>
        {/* Internal CSS */}
        {`
        * {
          margin: 0;
          padding: 0;
          box-sizing: border-box;
          font-family: 'Arial', sans-serif;
        }

        body {
          background-color: #f4f4f9;
        }

        header {
          background-color: #003366;
          padding: 20px;
          text-align: center;
          color: white;
        }

        header h1 {
          font-size: 40px;
        }

        header p {
          font-size: 20px;
        }

        nav {
          background-color: #0052cc;
          text-align: center;
          padding: 15px 0;
        }

        nav a {
          color: white;
          text-decoration: none;
          margin: 0 20px;
          font-size: 18px;
          font-weight: bold;
        }

        nav a:hover {
          text-decoration: underline;
        }

        
        `}
      </style>

                
            
        </>
    )
}
export default Layout;