
var tarjeta;

//Evento cuando pierde el foco
document.getElementById("tarjetas").addEventListener("blur", function (event) {
    tarjeta = document.getElementById("tarjetas").value;
    document.getElementById("txt_tarjeta").value = "";
    switch(tarjeta){
        case "Visa":
            document.getElementById("txt_tarjeta").maxLength = "19";
            break;
        case "MasterCard":
            document.getElementById("txt_tarjeta").maxLength = "19";
            break;
        case "Dinners Club":
            document.getElementById("txt_tarjeta").maxLength = "17";
            break;
    }
});

document.getElementById("txt_tarjeta").addEventListener("keypress", function (event) {
    var num_tar = document.getElementById("txt_tarjeta").value;
    if (tarjeta == "Visa" || tarjeta == "MasterCard") {
        var ul_mast = event.which || event.keyCode;
        var numero = 0;
        numero = String.fromCharCode(ul_mast);
        num_tar = num_tar + numero;
        if (num_tar.length == 5 || num_tar.length == 10 || num_tar.length == 15) {
            document.getElementById("txt_tarjeta").value = document.getElementById("txt_tarjeta").value + "-";
        }
    }else{
        var ul_mast = event.which || event.keyCode;
        var numero = 0;
        numero = String.fromCharCode(ul_mast);
        num_tar = num_tar + numero;
        if (num_tar.length == 6 || num_tar.length == 12) {
            document.getElementById("txt_tarjeta").value = document.getElementById("txt_tarjeta").value + "-";
        }
    }
});