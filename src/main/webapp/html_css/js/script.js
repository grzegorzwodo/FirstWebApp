function changeValue() {
    var divElement = document.getElementById("testId");
    console.log(divElement);
    divElement.innerHTML = "ZMIENIONE";
    divElement.style="background-color: red";
}

function validate() {
    var age = document.getElementsByName("age")[0];
    if(age.value<1) {
        age.style="background-color: red";
        return false;
    }else {
        age.style="";
    }
    var name = document.getElementsByName("name")[0];
    if(name.value.length<2) {
        name.style="background-color: red";
        return false;
    }else {
        name.style="background-color: red";
    }
    return true;
}
