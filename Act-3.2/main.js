const myForm = document.querySelector('#my-form');
const nom = document.querySelector('#nom');
const prénom = document.querySelector('#prénom');
const dateDeNaissance = document.querySelector('#date de naissance');
const email = document.querySelector('#email');
const numTel = document.querySelector('#numtel');
const msg =document.querySelector('.msg');


// Listen for form submit
myForm.addEventListener('submit', onSubmit);

function onSubmit(e) {
  e.preventDefault();

  if(nom.value === '' || prénom.value ==='' || numTel.value === '' ) {
    // alert('Please enter all fields');
    msg.classList.add('error');
    msg.innerHTML = 'Entrer les données marquées par *';

    // Remove error after 3 seconds
    setTimeout(() => msg.remove(), 3000);
  }else{

  }
}
