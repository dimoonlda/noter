/**
 * Created by admin on 03.10.2016.
 */
function getNotes(completeCallBack) {
    console.log("getNotes request.");

    $.ajax({
        type: "GET",
        url: getConfig().apiUrl + "/notes"
    }).success(function(msg) {
        console.log("getNotes result: ", msg);
        completeCallBack(msg.data);
    });
}

function getNoteById(id, completeCallBack) {
    console.log("getNoteById request with params: id = " + id);

    $.ajax({
        type: "GET",
        url: getConfig().apiUrl + "/notes/" + id
    }).success(function(msg) {
        console.log("getNoteById result: ", msg);
        completeCallBack(msg.data);
    });
}

function deleteNoteById(id, completeCallBack) {
    console.log("deleteNoteById request with params: id = " + id);

    $.ajax({
        type: "DELETE",
        url: getConfig().apiUrl + "/notes/" + id
    }).success(function(msg) {
        console.log("deleteNoteById result: ", msg);
        completeCallBack();
    });
}

function saveNote(note, completeCallBack){
    console.log("saveNote with param: ", note);

    $.ajax({
        type: "POST",
        url: getConfig().apiUrl + "/notes",
        data: JSON.stringify(note),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    }).success(function(msg) {
        console.log("saveNote result: ", msg.data);
        completeCallBack(msg.data);
    });
}