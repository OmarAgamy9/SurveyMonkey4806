let increment = 0;
let button = "question";
document.getElementById("addQuestionButton").onclick = addQuestion();

function addQuestion() {
    increment = increment+1;
    button = "question" + increment;

    document.getElementById("addQuestion").insertAdjacentHTML("afterend",
        "<form id='qbutton' class='selectQuestion'><h4>Select type of Question</h4><br><select name='questionTypes' id='questionTypes'><option value='multipleChoice'>Multiple Choice Question</option><option value='dropDown'>Drop Down Question</option></select><button type='button' onclick='removeQuestion(this)' >Remove question</button></form>");
    document.getElementById("qbutton").id = button;
}

function removeQuestion(th){
    let parentDiv = th.parentNode;
    let id = parentDiv.getAttribute("id");


    document.getElementById(id).innerHTML = "";
    let q = document.getElementById(id);
    q.remove();
}