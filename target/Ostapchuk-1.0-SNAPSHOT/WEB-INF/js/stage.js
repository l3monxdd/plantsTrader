//
// $('#saveStage').click(function () {
//
//
//     var stage = {
//         number: $('#stageNumber').val()
//     };
//
//
// //потрібно переслати json object на java контроллер
//     $.ajax({
//         url: '/stage?',
//         method: 'POST',
//         dataType: 'json',
//         contentType: 'application/json; charset=UTF-8',
//         data: JSON.stringify(stage)
//
//     });
//
// });
//
// test
//
//
//










$('#saveStage').click(function () {

    if($('#stageNumber').val() == ''){

        var label = document.createElement('label');
        label.style.color = 'red';
        label.innerHTML = 'stage name is empty';
        document.getElementById('stage').appendChild(label);

    }else {


        var stage = {
            number: $('#stageNumber').val()
        };

        $('#stageNumber').val('');

        $.ajax({
            url: '/stage?',
            method: 'POST',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(stage),
            success: function (res) {

                var fromDb = '';
                for (var i in res) {
                    fromDb += '<tr><td>' + res[i].number + '<a href="/deleteStage/"' + res[i].id + '> delete</a></td></tr>';
                }
                // перший варіант через js
                // document.getElementById('result').innerHTML = fromDb;

                // другий  варіант через аякс
                $('#result').html(fromDb);

            }
        });
    }
});
