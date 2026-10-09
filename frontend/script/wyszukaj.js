document.querySelectorAll("th button").forEach((button) => {
  button.addEventListener("click", () => {
    button.classList.toggle("active");
  });
});
