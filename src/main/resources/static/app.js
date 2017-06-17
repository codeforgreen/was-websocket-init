var stompClient = null;

function setConnected(connected) {
}

function connect() {
}

function disconnect() {
}

function sendName() {
}

function sendMessage() {
}

function sendPrivateMessage() {
}

function sendDisconnectMessage() {
}

function showGreeting(message) {
}

function showPrivateMessage(message) {
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendName();
    });
    $("#sendMessage").click(function () {
        sendMessage();
    });
    $("#sendPrivateMessage").click(function () {
        sendPrivateMessage();
    });
});

