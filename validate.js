function validateForm() {
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pass").value;

    if (username === "" || password === "") {
        alert("Both username and password are required.");
        return false; // Prevent form submission
    }

    return true; // Allow form submission
}
