import { LuPlus } from "react-icons/lu";
import "./TodoInput.scss";

function TodoInput() {
  return (
    <form className="todoInput">
      <input placeholder="오늘 할일을 입력하세요" />
      <button>
        <LuPlus />
      </button>
    </form>
  );
}

export default TodoInput;
