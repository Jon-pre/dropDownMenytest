$(function(){
    hentAlleBiler();
});

function hentAlleBiler() {
    $.get("/hentBiler", function ( biler ){
        formaterBiler(biler)
    });
}

function formaterBiler(biler){
    let ut="<Select id ='valgtBil'>";
    for(const Bil of biler){
        ut+=" <option value='"+bil.merke+"'>"+bil.modell+"</option>"
    }
    ut+="</select>";
     $("#bilene").html(ut);
}

function lagreKunde() {
    const kunde = {
        fornavn : $("#fornavn").val(),
        etternavn : $("#etternavn").val(),
        eierBil : $("#valgtBil").val()
    };
    const url = "/lagreKunde";
    $.post(url, kunde, function() {
    });
}