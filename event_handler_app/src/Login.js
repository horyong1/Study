import { useState } from "react";

function Login() {
  //객체 형태로 id,pw 값 초기화
  const [inputs, setInputs] = useState({ id: "", pwd: "" });

  const { id, pw } = setInputs;

  // const [id, setId] = useState("");
  // const [pw, setPw] = useState("");

  // //e.target.value e가 이벤트에서 해당 태그 타켓 벨류 값을 가져옴
  // const changeId = function (e) {
  //   console.log("id : " + e.target.value);
  //   setId(e.target.value);
  // };

  // const changePw = function (e) {
  //   console.log("pw : " + e.target.value);
  //   // setPw(e.target.value);

  //   //e.target value 를 const { value } 에 넣어 바로 value 값을 사용 가능하게 함
  //   const { value } = e.target;
  //   setPw(value);
  // };

  return (
    <>
      <div>
        ID : <input value={id} onChange={changeId} />
      </div>
      <div>
        PW : <input type="password" value={pw} onChange={changePw} />
      </div>
      <hr />
    </>
  );
}
export default Login;
