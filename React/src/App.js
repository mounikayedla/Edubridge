import React from 'react'
import ReactDOM from 'react-dom';
import Emp from './Emp';
function App(){
return (
  ReactDOM.render(
    <React.StrictMode>
      <Emp/>
    </React.StrictMode>,
    document.getElementById('root')
  )
  
);

}


export default App