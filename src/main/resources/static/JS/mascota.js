var c=0;
function cambiar()
{
    c++;
    if(c>3) c=1;
    document.getElementById("img-header").setAttribute("src","imagen/banner"+c+".png");
    setTimeout("cambiar()",2000);

}

document.body.setAttribute("onload","cambiar()")


/*JS para el detalle */ 
/*mascota 1*/ 
const open = document.getElementById('open');
const modal_container = document.getElementById('modal_container');
const close = document.getElementById('close');

open.addEventListener('click', () =>{
	modal_container.classList.add('show');
});

close.addEventListener('click', () =>{
	modal_container.classList.remove('show');
});
/*mascota 2*/ 
const open1 = document.getElementById('open1');
const modal_container1 = document.getElementById('modal_container1');
const close1 = document.getElementById('close1');

open1.addEventListener('click', () =>{
	modal_container1.classList.add('show1');
});

close1.addEventListener('click', () =>{
	modal_container1.classList.remove('show1');
});

/*mascota 3*/ 
const open2 = document.getElementById('open2');
const modal_container2 = document.getElementById('modal_container2');
const close2 = document.getElementById('close2');

open2.addEventListener('click', () =>{
	modal_container2.classList.add('show2');
});

close2.addEventListener('click', () =>{
	modal_container2.classList.remove('show2');
});

/*mascota 4*/ 
const open3 = document.getElementById('open3');
const modal_container3 = document.getElementById('modal_container3');
const close3 = document.getElementById('close3');

open3.addEventListener('click', () =>{
	modal_container3.classList.add('show3');
});

close3.addEventListener('click', () =>{
	modal_container3.classList.remove('show3');
});