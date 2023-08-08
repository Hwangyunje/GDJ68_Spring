const id=document.getElementById("id");
const pw=document.getElementById("pw");
const pw2=document.getElementById("pw2");
const names=document.getElementById("names");
const email=document.getElementById("email");
const birth=document.getElementById("birth");
const btn=document.getElementById("btn");
const frm=document.getElementById("frm");

//idcheck결과
let idCheckResult=false;
let pwCheckResult=false;
let pw2CheckResult=false;
let nameCheckResult=false;
let emailCheckResult=false;


let checkResults=[false,false,false,false,false,false,false];

//pwCheck


//------ID Check-------------
id.addEventListener("blur",function(){
    console.log(id.id);
    const idresult=document.getElementById(id.id+"result")

    fetch("idCheck?id="+id.value, {method:"get"})
        .then((response)=>{return response.text()})
        .then((r)=>{
            alert(r.trim());
            if(r.tirm()=='1'){
                alert("중복아님")
                
                if(id.value==''||id.value.length>10){
                    idresult.innerHTML="ID는 비어있으면x,10글자미만이어야한다"
                    idresult.className="f";
                    checkResults[0]=false;
                    checkResults[6]=false;
                }else{
                    console.log("ok")
                    idresult.innerHTML="가능한id입니다";
                    idresult.className="s";
                    checkResults[0]=false;
                    checkResults[6]=true;
                }     
            }else{
                idresult.innerHTML="이미 사용중인ID입니다";
                idresult.className="f";
                checkResults[0]=false;
                checkResults[6]=false;
            }
        })
    
})
//----------------------------------------
//--------pw Check------------------------
pw.addEventListener("blur",function(){
    if(pw.value.length>5&&pw.value.length<12){
        const pwresult=document.getElementById(pw.id+"result")
        pwresult.innerHTML="올바른 비번입니다"
        pwresult.className="s";
        checkResult[1]=false;
    }else{
        pwresult.innerHTML="비번은6글자이상12글자미만이어야함"
    pwresult.className="f";
    checkResult[1]=true;
    }
})

pw.addEventListener("change",function(){
    pw2.value="";
    checkResults[2]=false;
    pw2result.innerHTML=""
})
//--------------------pw Equal check----------
pw2.addEventListener("keyup",function(){
    const pw2result=document.getElementById("pw2result")
    if(pw.value==pw2.value){
        pw2result.innerHTML="비밀번호가 같다"
        pw2result.className="s";
        checkResults[2]=false;
    }else{
        pw2result.innerHTML="비밀번호가 틀리다"
        pw2result.className="f";
        checkResults[2]=true;
    }
   
})
//---------------------------------------------

//----------name Check-------------------------
//비어있는지 체크하는 함수
function emptyCheck(element){
    if(element.value==""){
        return true;
    }else {
        return false;
    }
}

names.addEventListener("blur",function(){
    let check=emptyCheck(names)
    const nameResult=document.getElementById("nameResult");
    nameResult.innerHTML="비어있으면안됨"
    nameResult.className="f";
    checkResults[3]=false;
    if(!check){
        nameResult.innerHTML="ok"
        nameResult.className="s";
        checkResults[3]=true;
    }
})
//---------------------------------------------
//--------email check-----------------
email.addEventListener("blur",function(){
    let check=emptyCheck(email)
    const emailresult=document.getElementById("emailresult");
    emailresult.innerHTML="비어있으면안됨"
    emailresult.className="f";
    checkResults[4]=false;
    if(!check){
        emailresult.innerHTML="ok"
        emailresult.className="s";
        checkResults[4]=true;
    }
})

birth.addEventListener("change",function(){
    let check=emptyCheck(birth);
    const birthresult=document.getElementById("birthresult");
    birthresult.innerHTML="비어있으면안됨"
    birthresult.className="f";
    checkResults[5]=false;
    if(!check){
        birthresult.innerHTML="ok"
        birthresult.className="s";
        checkResults[5]=true;
    }
})

btn.addEventListener("click",function(){
    let c =checkResults.includes(false);
    if(!c){
        console.log("form전송")
        // frm.onsubmit();
    }else{
        alert("필수항목은 입력해");
    }
})