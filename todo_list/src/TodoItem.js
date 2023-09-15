import './TodoItem.scss'
import {MdClear} from 'react-icons/md'

function TodoItem({todo, toggleTodo, deleteTodo}) {

    const {text, checked} = todo

    const onClick = () => {
        toggleTodo(todo.no)
    }

    return (
        <div className="todoItem">
            <input type="checkbox" className="checkbox" checked={checked} onClick={onClick}/>
            <div className="text" onClick={onClick}>{text}</div>
            {/* <button><MdClear /></button> */}
            <button onClick={() => deleteTodo(todo.no)}>삭제</button>
        </div>
    )
}

export default TodoItem