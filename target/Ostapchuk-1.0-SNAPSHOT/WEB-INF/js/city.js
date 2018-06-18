//опрацьовуємо нажаття на кнопку
$('#saveCity').click(function () {

    if ($('#cityName').val() == '') {

        var label = document.createElement('label');
        label.style.color = 'red';
        label.innerHTML ='city name is empty';
        document.getElementById('stage').appendChild(label);
    } else {

        // створюємо json object city
        var city = {
            name: $('#cityName').val()
        };

        $('#cityName').val('');

        //потрібно переслати json object на java контроллер
        $.ajax({
            url: '/city?',
            method: 'POST',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            data: JSON.stringify(city),
            success: function (res) {

                var fromDb = '';

                for (var i = 0; i < res.length; i++) {
                    fromDb += '<tr><td>' + res[i].name + '<a href="/deleteCity/"' + res[i].id + '> delete</a></td></tr>';
                }


                document.getElementById('result').innerHTML = fromDb;
            }
        });
    }
});

load();

function load() {
    $.ajax({
        url: '/city?',
        method: 'GET',
        dataType: 'json',
        contentType: 'application/json; charset=UTF-8',
        success: function (res) {

            var fromDb = '';

            for (var i = 0; i < res.length; i++) {
                fromDb += '<tr><td>' + res[i].name + '<a href="/deleteCity/"' + res[i].id + '> delete</a></td></tr>';
            }


            document.getElementById('result').innerHTML = fromDb;
        }
    });
}
