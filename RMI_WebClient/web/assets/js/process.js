window.init = (function(){
    var txt_result = $("#txt-result")
    var value_a
    var value_b
    var flag
    var operator
    
    function initButtons(){
       $("#vl-1").click(function(){
           if (flag) {
               txt_result.text("1")
               flag = false
           }else{
                if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("1")
                }else{
                    txt_result.text(txt_result.text() + "1")
                }
               
           }
       });
       $("#vl-2").click(function(){
          if (flag) {
              txt_result.text("2")
              flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("2")
                }else{
                    txt_result.text(txt_result.text() + "2")
                }
           }
       });
       $("#vl-3").click(function(){
          if (flag) {
                txt_result.text("3")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("3")
                }else{
                    txt_result.text(txt_result.text() + "3")
                }
           }
       });
       $("#vl-4").click(function(){
          if (flag) {
                txt_result.text("4")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("4")
                }else{
                    txt_result.text(txt_result.text() + "4")
                }
           }
       });
       $("#vl-5").click(function(){
          if (flag) {
                txt_result.text("5")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("5")
                }else{
                    txt_result.text(txt_result.text() + "5")
                }
           }
       });
       $("#vl-6").click(function(){
          if (flag) {
                txt_result.text("6")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("6")
                }else{
                    txt_result.text(txt_result.text() + "6")
                }
           }
       });
       $("#vl-7").click(function(){
          if (flag) {
                txt_result.text("7")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("7")
                }else{
                    txt_result.text(txt_result.text() + "7")
                }
           }
       });
       $("#vl-8").click(function(){
          if (flag) {
                txt_result.text("8")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("8")
                }else{
                    txt_result.text(txt_result.text() + "8")
                }
           }
       });
       $("#vl-9").click(function(){
          if (flag) {
                txt_result.text("9")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("9")
                }else{
                    txt_result.text(txt_result.text() + "9")
                }
           }
       });
       $("#vl-0").click(function(){
          if (flag) {
                txt_result.text("0")
                flag = false
           }else{
               if (txt_result.text().length === 1 && txt_result.text() === "0") {
                    txt_result.text("0")
                }else{
                    txt_result.text(txt_result.text() + "0")
                }
           }
       });
       //operators methods
       $("#btn-add").click(function(){
          operator = "addition"
          flag = true
          value_a = txt_result.text()
       });
       $("#btn-sub").click(function(){
          operator = "substraction"
          flag = true
          value_a = txt_result.text()
       });
       $("#btn-mul").click(function(){
          operator = "multiplication"
          flag = true
          value_a = txt_result.text()
       });
       $("#btn-div").click(function(){
          operator = "division"
          flag = true
          value_a = txt_result.text()
       });
       $("#btn-point").click(function(){
            if (txt_result.text().indexOf(".") === -1) {
                txt_result.text(txt_result.text() + ".")
            }
       });
       $("#btn-ac").click(function(){
           txt_result.text("0")
           flag = true
           value_a = ""
           value_b = ""
       });
       $("#btn-equal").click(function(){
           value_b = txt_result.text()
           $.ajax({
               type: 'GET',
               url: '/RMI_WebClient/ProcessServlet',
               dataType: 'json',
               data: {value_a: value_a, value_b: value_b, operator: operator},
               success: function(response){
                   //console.log(response)
                   txt_result.text(response)
                   flag = true
               },
               failure: function(response){
                   console.log(response)
               },
               error: function(response){
                   console.log(response)
               }
           });
       });
    }
    
    var _start = function () {
        initButtons()
        flag = false
        value_a = ""
        value_b = ""
    };

    return {
        start: _start
    };
})(jQuery);