import { useRef, useState } from "react";
import TodoInput from "./TodoInput";
import TodoList from "./TodoList";
import TodoTemplate from "./TodoTemplate";

function App() {

  const [todos, setTodos] = useState([
    {no: 1, text: '일기쓰기', checked: false}
  ])

  const nextNo = useRef(2)

  const addTodo = function(text) {
    setTodos(todos.concat({no:nextNo.current, text:text, checked: false}))
    nextNo.current = nextNo.current + 1
  }

  const toggleTodo = function(no) {
    setTodos(todos.map(todo => todo.no === no ? 
                  {...todo, checked: !todo.checked} : todo))
  }

  const deleteTodo = (no) => {
    setTodos(todos.filter(todo => todo.no !== no))
  }

  return (
    <TodoTemplate>
      <TodoInput addTodo={addTodo} />
      <TodoList todos={todos} toggleTodo={toggleTodo} deleteTodo={deleteTodo}/>
    </TodoTemplate>
  );
}

export default App;
