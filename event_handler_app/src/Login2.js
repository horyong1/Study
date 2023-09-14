import { useState } from "react";

function Login2() {
  //객체 형태로 id,pw 값 초기화
  const [inputs, setInputs] = useState({ id: "", pwd: "" });

  const { id, pw } = setInputs;

  const onInput = function (e) {};

  return (
    <>
      <div>
        ID : <input value={id} onChange={onInput} />
      </div>
      <div>
        PW : <input type="password" value={pw} onChange={onInput} />
      </div>
      <hr />
    </>
  );
}
export default Login2;
