import { useState } from "react";

function Counter() {
  /**
   * const 는 상수값이라 값을 직접 변경할수 없음으로
   * useState()를 이용 하여 값을 변경 할수 있음
   * { , }앞부분은 고치려고 하는 변수 값, 뒷 부분은 사용하려는 함수
   */
  const [cnt, setCnt] = useState(0);

  /**
   * 카운트 값 +1 씩 증가
   * setCnt()를 이용 하여 cnt 값 변경
   * 2가지 방식으로 작성 가능
   */
  const cntUp = function () {
    //setCnt(cnt + 1);
    setCnt(function (cnt) {
      return cnt + 1;
    });
    console.log(cnt);
  };

  //카운트 리셋버튼
  const cntReset = function () {
    //setCnt(0);
    // setCnt(function (cnt) {
    //   return 0;
    // });
    setCnt((cnt) => (cnt = 0));
  };

  return (
    <>
      {cnt}번 클릭
      <button onClick={cntUp}>CLICK</button>
      <button onClick={cntReset}>reset</button>
    </>
  );
}
export default Counter;
