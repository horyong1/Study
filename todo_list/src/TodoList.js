import TodoItem from "./TodoItem"

function TodoList({todos, toggleTodo, deleteTodo}) {

    return <>
        {
            todos.map((todo) => <TodoItem todo={todo} toggleTodo={toggleTodo} deleteTodo={deleteTodo} />)
        }
        {/* <TodoItem />
        <TodoItem />
        <TodoItem />
        <TodoItem /> */}
    </>
}

export default TodoList