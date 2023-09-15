import {GrAddCircle} from 'react-icons/gr'
import './TodoInput.scss'
import { useState } from 'react'

function TodoInput({addTodo}) {

    const [value, setValue] = useState('')

    const inputText = (e) => {
        setValue(e.target.value)
    }

    const onClick = (e) => {
        addTodo(value)
        setValue('')
        e.preventDefault()
    }

    return (
    <form className="todoInput">
        <input placeholder="오늘 할일을 입력하세요" 
            value={value} onChange={inputText} />
        {/* <button><GrAddCircle /></button> */}
        <button onClick={onClick}>추가</button>
    </form>)

}
export default TodoInput