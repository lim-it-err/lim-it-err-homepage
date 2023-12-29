    document.getElementById('commentForm').addEventListener('submit', function(e) {
    e.preventDefault();

    // Collect the form data
    var name = document.getElementById('name').value;
    var message = document.getElementById('message').value;

    // Send the form data to the server using Fetch API
    fetch('/api/comments', {
    method: 'POST',
    headers: {
    'Content-Type': 'application/json'
},
    body: JSON.stringify({ name: name, message: message })
})
    .then(response => response.json())
    .then(data => {
    console.log('Success:', data);
    // Optionally clear the form and/or display the new comment
})
    .catch((error) => {
    console.error('Error:', error);
});
});
