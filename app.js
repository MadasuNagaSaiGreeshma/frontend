
import logo from './logo.svg';
import './App.css';
import Greeshma from "./greeshma";
import Registrationform from "./registrationform.js";
import Sviet from "./sviet.js";
function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited-768x768.png"} className="App-logo" alt="logo" />
        <p>
          <code>sri vasavi Institute of Enginerring and Technology</code> 
        </p>
        <a
          className="App-link"
          href="c:\Users\jethe\OneDrive\Desktop\chinni\form.html"
          target="_blank"
          rel="noopener noreferrer"
        >
          SVIET
        </a>
        <Greeshma/>
      </header> */}
      <Registrationform></Registrationform>
      <Sviet title="Empowering Minds"/>
  </div>
  );
}

export default App;
