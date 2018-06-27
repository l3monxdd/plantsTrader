// зберігає сутність при кліку на кнопку, та підвантажує всі сутності за допомогою функції
// loadAllEntity(res);
$('#saveAuthor').click(function () {
    var author = {
        "fname": $('#fname').val(),
        "lname": $('#lname').val(),
        "email": $('#email').val(),
        "accountNumber": $('#accountNumber').val()
    };

    $.ajax({
        url: "/author?",
        method: "POST",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(author),
        success: function (res) {
             loadAllEntity(res);
        },
        error : function () {
            console.log(err);
        }
    });
});

load();
// завантажує сутності при відкритті сторінки
function load() {
    $.ajax({
        method: "GET",
        url: "/author?",
        success: function (res) {
            loadAllEntity(res);
        }
    });
}
//видаляє сутність по id та здійснює виклик функції loadAllEntity(res);
function deleteElement(idAuthor){
    $.ajax({

        method: 'DELETE',
        url: '/author/'+idAuthor,
        data: JSON.stringify(idAuthor),
        success: function (res) {
            loadAllEntity(res);
        },
        error: function (err) {
            console.log(err)
        }
    });
    console.log(idAuthor);
}
// переберає масив обєктів res, парсить та присвоює елементи масиву '#result'
function loadAllEntity(res) {
    var someVar = '';

    for (var i in res) {
        someVar += '<tr><td id=' + res[i].id + "author" + '>' + res[i].fname + '</td><td><button class="btn btn-default updateCity '+res[i].id+'" onclick="updateCity(' + res[i].id + ')">update</button></td><td><button class="btn btn-default" id="deleteAuthor" onclick="deleteElement(' + res[i].id + ')">delete</button></td></tr>';
    }

    $('#result').html(someVar);

}



