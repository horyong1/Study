import { Component } from "react";

class Hello2 extends Component {
  //클래스로 만들땐 render를 꼭 사용 해야함
  render() {
    //div 같은 태그를 <></>이런식으로 사용 할수있음
    return (
      <>
        <h2>클래스 기반.....</h2>
      </>
    );
  }
}

export default Hello2;
