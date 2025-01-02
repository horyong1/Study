import { useState } from "react";

function Login2() {
  //객체 형태로 id,pw 값 초기화
  const [inputs, setInputs] = useState({ id: "", pwd: "" });

  const { id, pwd } = inputs;

  const onInput = function (e) {
    const { value, name } = e.target;
    //...inputs 전개 연산자를 사용 하여 데이터 변경
    //전개 연산자 없이 데이터 변경하면 객체인 id pwd 가 둘중 하나가 사라진다고 인식할수 있음
    setInputs({ ...inputs, [name]: value });
    console.log(value);
  };

  return (
    <>
      <h1>{id}님 환영!!!</h1>
      <div>
        ID : <input value={id} onChange={onInput} name="id" />
      </div>
      <div>
        PW : <input type="password" value={pwd} onChange={onInput} name="pwd" />
      </div>
      <hr />
    </>
  );
}
export default Login2;
