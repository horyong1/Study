import "./App.css";
import TodoTemplate from "./TodoTemplate";
import TodoInput from "./TodoInput";

function App() {
  return (
    <div>
      <TodoTemplate>
        <TodoInput />
        todo 목록
      </TodoTemplate>
    </div>
  );
}

export default App;
