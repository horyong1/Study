import "./TodoTemplate.scss";

function TodoTemplate({ children }) {
  return (
    <div className="todoTemplate">
      <div className="todo-title">TO-DO LIST</div>
      {/* props.children 을 사용 해야 TodoTemplate사이에 값을 보여줌 */}
      <div>{children}</div>
    </div>
  );
}

export default TodoTemplate;
