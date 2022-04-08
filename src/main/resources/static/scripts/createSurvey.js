const NUM_OPTIONS = 4;

var uid = 0;
var allQuestions = [];

const SAVE_SURVEY_URL = "/saveSurvey";
const QTypeNameMap = {
    mc: "Multiple Choice",
    oe: "Open Ended",
    dd: "Dropdown",
};

// Creates delete button, question label and input fields
function createForm(form) {
    uid += 1;
    const myuid = uid;

    form.setAttribute("class", "mcqForm");
    form.setAttribute("id", "mcq" + myuid);

    let delButton = document.createElement("button");
    delButton.onclick = function () {
        deleteQuestion(myuid);
    };
    delButton.setAttribute("type", "button");
    delButton.setAttribute("id", "deleteButton" + myuid);
    delButton.setAttribute("class", "deleteButton");
    delButton.innerHTML = "Delete";
    form.appendChild(delButton);

    let question = document.createElement("input");
    question.setAttribute("type", "text");
    question.setAttribute("name", "question" + myuid);
    question.setAttribute("id", "question" + myuid);
    question.setAttribute("class", "questionInput");

    let questionLabel = document.createElement("label");
    questionLabel.setAttribute("for", "question" + myuid);
    questionLabel.setAttribute("class", "questionLabel");
    questionLabel.innerHTML = "Question Text";

    form.appendChild(questionLabel);
    form.appendChild(question);
}

function createMCQ() {
    let form = document.createElement("form");
    createForm(form);

    let options = [];
    let labels = [];

    for (let i = 0; i < NUM_OPTIONS; i++) {
        let num = i + 1;

        labels.push(document.createElement("label"));
        labels[i].setAttribute("for", "option" + num);
        labels[i].setAttribute("class", "optionLabel");
        labels[i].innerHTML = "Option " + num;
        form.appendChild(labels[i]);

        options.push(document.createElement("input"));
        options[i].setAttribute("type", "text");
        options[i].setAttribute("name", "option" + num);
        options[i].setAttribute("id", "option" + num);
        options[i].setAttribute("class", "optionInput");
        form.appendChild(options[i]);
    }

    allQuestions.push({
        num: allQuestions.length + 1,
        uid: uid,
        form: form,
        type: "mc",
    });

    renderQuestions();
}

function createOEQ() {
    let form = document.createElement("form");
    createForm(form);

    allQuestions.push({
        num: allQuestions.length + 1,
        uid: uid,
        form: form,
        type: "oe",
    });

    renderQuestions();
}

function createDDQ() {
    let form = document.createElement("form");
    createForm(form);

    let options = [];
    let labels = [];

    for (let i = 0; i < NUM_OPTIONS; i++) {
        let num = i + 1;

        labels.push(document.createElement("label"));
        labels[i].setAttribute("for", "option" + num);
        labels[i].setAttribute("class", "optionLabel");
        labels[i].innerHTML = "Option " + num;
        form.appendChild(labels[i]);

        options.push(document.createElement("input"));
        options[i].setAttribute("type", "text");
        options[i].setAttribute("name", "option" + num);
        options[i].setAttribute("id", "option" + num);
        options[i].setAttribute("class", "optionInput");
        form.appendChild(options[i]);
    }

    allQuestions.push({
        num: allQuestions.length + 1,
        uid: uid,
        form: form,
        type: "dd",
    });

    renderQuestions();
}

function createQuestionHeader(q) {
    let title = document.createElement("div");
    title.setAttribute("class", "questionTitle");
    title.innerHTML = "Question " + q.num + " - " + QTypeNameMap[q.type];
    return title;
}

function renderQuestions() {
    let questionsDiv = document.getElementById("questions");
    questionsDiv.innerHTML = "";

    allQuestions.forEach((question) => {
        questionsDiv.appendChild(createQuestionHeader(question));
        questionsDiv.appendChild(question.form);
    });
}

function deleteQuestion(uid) {
    const index = allQuestions.findIndex((element) => element.uid === uid);
    allQuestions.splice(index, 1);

    for (let i = 0; i < allQuestions.length; i++) {
        allQuestions[i].num = i + 1;
    }

    renderQuestions();
}

function saveSurvey() {
    let data = [];

    allQuestions.forEach((q) => {
        let question = {};
        question["type"] = q.type;
        question["number"] = q.num;
        if (q.type === "mc") {
            question["question"] = q.form[1].value;
            question["option1"] = q.form[2].value;
            question["option2"] = q.form[3].value;
            question["option3"] = q.form[4].value;
            question["option4"] = q.form[5].value;
        } else if (q.type === "oe") {
            question["question"] = q.form[1].value;
        } else if (q.type === "dd") {
            question["question"] = q.form[1].value;
            question["option1"] = q.form[2].value;
            question["option2"] = q.form[3].value;
            question["option3"] = q.form[4].value;
            question["option4"] = q.form[5].value;
        }

        data.push(question);
    });

    const title = document.getElementById("surveyTitle").value;

    var xhr = new XMLHttpRequest();
    xhr.open("POST", SAVE_SURVEY_URL, true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify({ title: title, questions: data }));
}
