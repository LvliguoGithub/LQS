import React from 'react';
import SearchTool from './search-tool';
import './App.css';
import { useHistory } from 'react-router-dom';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

import LtDetail from './lt-detail';
import SearchLtTool from './search-lt-tool';

function App() {
    return (
      <div className="App">
        <div className="app-searh">
          <Router>
            <Switch>
              <Route path='/' exact component={SearchTool}/>
              <Route path='/lt-detail/:uid' exact component={LtDetail} />
              <Route path='/search' exact component={SearchLtTool} />
            </Switch>
          </Router>
        </div>
    </div>
  );
}

export default App;
