import React from 'react';
import './App.css';
import { BrowserRouter, Switch, Route } from 'react-router-dom';


import Stocks from './components/Stocks';

function App() {
  return (
    <BrowserRouter>
      <div className="App">
        
        <Switch>
          <Route exact path="/" render={() => <p>Main page</p>}/>
          <Route path="/stocks" component={Stocks}/>
        </Switch>
      </div>

    </BrowserRouter>
  );
}

export default App;
