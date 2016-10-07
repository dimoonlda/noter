/**
 * Created by admin on 03.10.2016.
 */
function getNotes(completeCallBack) {
    console.log("getNotes request.");

    $.ajax({
        type: "GET",
        url: "http://127.0.0.1:8081/notes"
    }).success(function(msg) {
        console.log("getNotes result: ", msg);
        completeCallBack(msg.data);
    });
}

function getNoteById(id, completeCallBack) {
    console.log("getNoteById request with params: id = " + id);

    $.ajax({
        type: "GET",
        url: "http://127.0.0.1:8081/notes/" + id
    }).success(function(msg) {
        console.log("getNoteById result: ", msg);
        completeCallBack(msg.data);
    });
}

function saveNote(note){
    console.log("saveNote with param: ", note);
    note.id = 21;
    return note;
}