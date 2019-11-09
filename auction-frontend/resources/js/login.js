$(document).ready(function(){
    $.get("http://localhost:8080/api/test", function(data, status){
        alert("Data: " + data + "\nStatus: " + status);  // afiseaza din controller Test  body: hello world si statusul:ok
    });
});