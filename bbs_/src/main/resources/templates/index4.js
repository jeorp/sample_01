const button = document.getElementById("button1");
const body = document.getElementById("body")
button.addEventListener('mouseout', () => {
    button.style.backgroundColor = "lightblue";
    body.style.backgroundColor = "red";
});

button.addEventListener('mouseover', () => {
    button.style.backgroundColor = "orange";
});

