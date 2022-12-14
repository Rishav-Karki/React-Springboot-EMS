import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import AddEmployeeComponent from './components/AddEmployeeComponent';

function App() {
  return (
    <div>
      <Router>
      <HeaderComponent/>
      <div className='container'>
        <Routes>
          <Route path='/' element = {<ListEmployeeComponent></ListEmployeeComponent>}></Route>
          <Route path='/employees' element = {<ListEmployeeComponent></ListEmployeeComponent>}></Route>
          <Route path='/add-employee' element={<AddEmployeeComponent></AddEmployeeComponent>}></Route>
          <Route path='/edit-employee/:id' element={<AddEmployeeComponent></AddEmployeeComponent>}></Route>
        </Routes>
      </div>
      <FooterComponent/>
      </Router>
    </div>
  );
}

export default App;
