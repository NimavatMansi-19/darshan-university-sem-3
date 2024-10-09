import React from 'react';
import ReactDOM from 'react-dom/client';
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import Layout from './Layout.js';
import Home from './Home.js';
import Class from './Class.js';
import New_Amission from './New_Amission.js';
import Cancel from './Cancel.js';
import Update from "./Update.js";
import StuDetails from './StuDetails.js';
const root = ReactDOM.createRoot(document.getElementById('root'));


root.render(
      <BrowserRouter>
        <Routes>
        <Route path='/' element={<Layout/>}>
            <Route index element={<Home/>} />
            <Route path='/Home' element={<Home/>} />
            <Route path='/Class' element={<Class/>} />
            <Route path='/New_Amission' element={<New_Amission/>} />
            <Route path='/Cancel' element={<Cancel/>} />
            <Route path='/Update' element={<Update/>} />
            <Route path='/student/:name' element={<StuDetails/>} />
        </Route>
        </Routes>
      </BrowserRouter>
);

