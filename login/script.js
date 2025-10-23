function login(){
    const email=document.getElementById("email").value;
    const password=document.getElementById("password").value;
    fetch("http://localhost:500/api",{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify({
            email,password
        })
    })
    .then(res => res.text())
    .then(data => document.getElementById("result").innerText = data)
    .catch(err => console.error(err));
}