import React from 'react';
import { Link } from 'react-router-dom';
function Home() {

  // Image sources
  const imgSrc1 = "/images/img1.jpg";
  const imgSrc2 = "/images/img2.jpg";
  const imgSrc3 = "/images/ing 3.jpg";
  const imgSrc4 = "/images/img4.jpg";
  const imgSrc5 = "/images/img5.jpg";
  const videoSrc = "/images/Video.mp4";
  

  return (
    <>
      <header>
        <h1>Welcome to Khodiyar Tution Classes</h1>
        <p>Shaping the Future of Young Minds</p>
      </header>

      <section className="hero">
        <h2>Join Khodiyar Tution Classes Today!</h2>
        <p>Where Education Meets Excellence</p>
        <Link to="/New_Amission">
    <button>Enroll Now</button>
  </Link>
      </section>

      {/* Card Section */}
      <section className="card-section">
        <h2>Our Memories</h2>
        <div className="card-container">
          {/* First Card */}
          <div className="card">
            <img src={imgSrc1} alt="First highlight" className="card-img" />
            <div className="card-body">
   
            </div>
          </div>
          <div className="card">
            <img src={imgSrc4} alt="Second highlight" className="card-img" />
            <div className="card-body">
              
            </div>
          </div>
          <div className="card">
            <img src={imgSrc5} alt="Second highlight" className="card-img" />
            <div className="card-body">
              
            </div>
          </div>
          {/* Second Card */}
          <div className="card">
            <img src={imgSrc2} alt="Second highlight" className="card-img" />
            <div className="card-body">
              
            </div>
          </div>

          {/* Third Card */}
          <div className="card">
            <img src={imgSrc3} alt="Third highlight" className="card-img" />
            <div className="card-body">
              
            </div>
          </div>
        </div>
      </section>

      <section className="video-section">
        <h2>Watch Our Some of Cute Memories Video</h2>
        <div className="video-container">
          <video width="100%" height="400px" controls>
            <source src={videoSrc} type="video/mp4" />
            Your browser does not support the video tag.
          </video>
        </div>
      </section>

      <footer>
        <p>&copy; 2024 Khodiyar Classes. All Rights Reserved.</p>
      </footer>

      <style>
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

        /* Hero Section */
        .hero {
          background-color: #e6e1ba;
          background-size: cover;
          background-position: center;
          color: black;
          padding: 50px 20px;
          text-align: center;
        }

        .hero h2 {
          font-size: 36px;
          margin-bottom: 20px;
        }

        .hero p {
          font-size: 24px;
          margin-bottom: 30px;
        }

        .hero button {
          background-color: #0052cc;
          color: white;
          padding: 15px 30px;
          font-size: 18px;
          border: none;
          border-radius: 5px;
          cursor: pointer;
        }

        .hero button:hover {
          background-color: #003366;
        }

        /* Card Section */
        .card-section {
          padding: 50px 20px;
          text-align: center;
          background-color: #f9f9f9;
        }

        .card-section h2 {
          font-size: 36px;
          color: #003366;
          margin-bottom: 30px;
        }

        .card-container {
          display: flex;
          justify-content: space-around;
          flex-wrap: wrap;
        }

        .card {
          background-color: white;
          border-radius: 10px;
          box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
          width: 30%;
          margin-bottom: 20px;
          overflow: hidden;
        }

        .card-img {
          width: 100%;
          height: 200px;
          object-fit: cover;
        }

        .card-body {
          padding: 15px;
        }

        .card-body h3 {
          font-size: 22px;
          color: #003366;
          margin-bottom: 10px;
        }

        .card-body p {
          font-size: 16px;
          color: #555;
        }
         .video-section {
          padding: 50px 20px;
          text-align: center;
          background-color: #f9f9f9;
        }

        .video-section h2 {
          font-size: 36px;
          color: #003366;
          margin-bottom: 30px;
        }

        .video-container {
          max-width: 800px;
          margin: 0 auto;
          border: 2px solid #003366;
          border-radius: 10px;
          overflow: hidden;
        }

        video {
          display: block;
          width: 100%;
        }

        /* Testimonials Section */
        .testimonials {
          background-color: #f9f9f9;
          padding: 50px 20px;
          text-align: center;
        }

        .testimonials h2 {
          font-size: 36px;
          color: #003366;
          margin-bottom: 30px;
        }

        .testimonial {
          background-color: white;
          padding: 20px;
          box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
          margin-bottom: 20px;
          display: inline-block;
          max-width: 600px;
          border-radius: 10px;
          text-align: left;
        }

        .testimonial p {
          font-size: 18px;
          color: #555;
          margin-bottom: 15px;
        }

        .testimonial span {
          font-weight: bold;
          color: #0052cc;
        }

        footer {
          background-color: #003366;
          color: white;
          text-align: center;
          padding: 15px;
        }
        `}
      </style>
    </>
  );
}

export default Home;
