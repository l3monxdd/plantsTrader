// $('#saveStreet').click(function () {
//
//     if ($('#cityName').val() == '') {
//
//         var label = document.createElement('label');
//         label.style.color = 'red';
//         label.innerHTML ='street name is empty';
//         document.getElementById('street').appendChild(label);
//     }else {
//     var street = {
//       name: $('#streetName').val()
//     };
//
//     $('#streetName').val('');
//
//     $.ajax({
//         url: '/street?',
//         method: 'POST',
//         dataType: 'json',
//         contentType: 'application/json; charset=UTF-8',
//         data: JSON.stringify(street),
//         success: function (res) {
//
//             var fromDb = '';
//
//             for (var i = 0; i < res.length; i++) {
//                 fromDb += '<tr><td>' + res[i].name + '<a href="/deleteStreet/"' + res[i].id + '> delete</a></td></tr>';
//             }
//
//
//             document.getElementById('result').innerHTML = fromDb;
//         }
//     });
//     }
// });
//
// load();
//
// function load() {
//     $.ajax({
//         url: '/street?',
//         method: 'GET',
//         dataType: 'json',
//         contentType: 'application/json; charset=UTF-8',
//         success: function (res) {
//
//             var fromDb = '';
//
//             for (var i = 0; i < res.length; i++) {
//                 fromDb += '<tr><td>' + res[i].name + '<a href="/deleteStreet/"' + res[i].id + '> delete</a></td></tr>';
//             }
//
//
//             document.getElementById('result').innerHTML = fromDb;
//         }
//     });
// }

//опрацьовуємо нажаття на кнопку
$('#saveStreet').click(function () {

    if ($('#streetName').val() == '') {

        var label = document.createElement('label');
        label.style.color = 'red';
        label.innerHTML ='street name is empty';
        document.getElementById('street').appendChild(label);
    } else {

        // створюємо json object city
        var street = {
            name: $('#streetName').val()
        };

        $('#streetName').val('');

        //потрібно переслати json object на java контроллер
        $.ajax({
            url: '/street?',
            method: 'POST',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(street),
            success: function (res) {

                var fromDb = '';

                for (var i = 0; i < res.length; i++) {
                    fromDb += '<tr><td>' + res[i].name + '<a href="/deleteStreet/"' + res[i].id + '> delete</a></td></tr>';
                }


                document.getElementById('result').innerHTML = fromDb;
            }
        });
    }
});

load();

function load() {
    $.ajax({
        url: '/street?',
        method: 'GET',
        dataType: 'json',
        contentType: 'application/json; charset=UTF-8',
        success: function (res) {

            var fromDb = '';

            for (var i = 0; i < res.length; i++) {
                fromDb += '<tr><td>' + res[i].name + '<a href="/deleteStreet/"' + res[i].id + '> delete</a></td></tr>';
            }


            document.getElementById('result').innerHTML = fromDb;
        }
    });
}

function deleteStreet(idStreet) {

    $.ajax({

        url: '/street?',
        method: 'DELETE',
        data: JSON.stringify(idStreet),
        success: function (res) {
            parseResultFromDb(res);
        },
        error: function (err) {
            console.log(err)
        }
    })

}
