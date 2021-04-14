$(function(){
    hentAlleKunder();
});

function hentAlleKunder(){
    $.get("/hentKunder", function( kunder){
        formaterKunder(kunder);
    });
}
function formaterKunder(kunder){
    let ut="<table class='table table-striped'>"+
        "<tr>"+
        "<th>Forbanavn</th><th>"+Etternavn>+"</th><th>"+Merke+"</th>"+
        "</tr>"
    for(const kunde of kunder){
        ut+="<tr>"
        ut+="<td>"+kunde.fornavn+"</td><td>"+kunde.etternavn+"</td><td>"+kunde.eierBil+"</td>"
        ut+="</tr>"
    }
    $("#kundene").html(ut);
}

function slettAlle(){
    $.get("/slett", function(){
        hentAlleKunder();
    })
}