import Hello from "./Hello";
import Hello2 from "./Hello2";
function App() {
  return (
    <div>
      {/* <h1>Hello React</h1> */}
      <Hello name="리엑트" />
      <Hello />
      <Hello>GOOD-BYE</Hello>
      <Hello2 />
    </div>
  );
}

export default App;
