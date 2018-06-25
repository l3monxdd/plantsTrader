// $('#saveAuthor').click( function () {
//   console.log('function is working');
// });

document.getElementById('saveAuthor').onclick = function () {
    console.log('js is working');

    var author = {
        "fname": document.getElementById('fname').value,
        "lname": document.getElementById('lname').value,
        "email": document.getElementById('email').value,
        "accountNumber": document.getElementById('accountNumber').value
    };

    // console.log(author);
    // var test = $('#fname').val();

    $.ajax({
        type: "POST",
        url: "/author?",
        data: JSON.stringify(author),
        contentType: "application/json; charset=utf-8",
        dataType: "json"
    });
};
load();

function load() {
    $.ajax({
        method: "GET",
        url: "/author?",  // '/author/height/'+id?offset=20&quantity=10
        // contentType: "application/json; charset=utf-8",
        // dataType: "json",
        success: function (res) {
            //
            // var fromDB = '';
            //
            // for(var a in res){
            //     fromDB +=
            //         '<tr><td>' + res[a].fname +
            //          res[a].lname +
            //          res[a].email +
            //          res[a].accountNumber +
            //         '<button id="deleteAuthor" onclick="deleteElement('+res[a].id+')"> delete</button></td></tr>';
            // }
            //
            // document.getElementById('result').innerHTML = fromDB;
            var authorFromDB = '';

            for (var i in res) {
                authorFromDB += '<tr><td id=' + res[i].id + "author" + '>' + res[i].fname + '</td><td><button class="btn btn-default updateCity '+res[i].id+'" onclick="updateCity(' + res[i].id + ')">update</button></td><td><button class="btn btn-default" id="deleteAuthor" onclick="deleteElement(' + res[i].id + ')">delete</button></td></tr>';
            }

            document.getElementById('result').innerHTML = authorFromDB;

        }
    });
}

function deleteElement(idAuthor){
    $.ajax({

        method: 'DELETE',
        url: '/author/'+idAuthor,
        data: JSON.stringify(idAuthor),
        success: function (res) {
            // var fromDB = '';
            //
            // for(var a in res){
            //     fromDB +=
            //         '<tr><td>' + res[a].fname +
            //         res[a].lname +
            //         res[a].email +
            //         res[a].accountNumber +
            //         '<button id="deleteAuthor" onclick="deleteElement('+res[a].id+')"> delete</button></td></tr>';
            // }

            // document.getElementById('result').innerHTML = fromDB;

            var authorFromDB = '';

            for (var i in res) {
                authorFromDB += '<tr><td id=' + res[i].id + "author" + '>' + res[i].fname + '</td><td><button class="btn btn-default updateCity '+res[i].id+'" onclick="updateCity(' + res[i].id + ')">update</button></td><td><button class="btn btn-default" id="deleteAuthor" onclick="deleteElement(' + res[i].id + ')">delete</button></td></tr>';
            }

            document.getElementById('result').innerHTML = authorFromDB;
        },
        error: function (err) {
            console.log(err)
        }
    });
    console.log(idAuthor);
}



