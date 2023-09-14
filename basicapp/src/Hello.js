import "./Hello.css";
function Hello(props) {
  const msg = "안녕 나는 React야 반갑다 머리 터지길 바래";

  //css를 자바스크립트 객체형태로 만들어서 사용 해야함
  const style = {
    color: "blue",
    backgroundColor: "orange",
    // 'background-color': "orange",
  };

  return (
    <>
      <h1 style={style}>Hello React!!!!!!</h1>
      <h1 className="hstyle">{msg}</h1>
      <h1>
        안녕하세요 {props.name} {props.children}입니다!
      </h1>
    </>
  );
}

Hello.defaultProps = {
  name: "React.js",
};

export default Hello;
