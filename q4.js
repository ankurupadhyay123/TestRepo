var Clock = {
    months: [
        "January",
        "Feb",
        "March",
        "April",
        "May",
        "June",
        "July",
        "Aug",
        "Sept",
        "October",
        "Nov",
        "Dec"
    ],

    getMonth: function (index) {
        return Clock.months[index];
    },
    getCurrentDate: function () {
        return new Date();
    },
    writeDate: function () {
        document.getElementById("timeDisp").innerHTML = Clock.formatDate();
    },
    formatDate: function formatDate() {
        var date = Clock.getCurrentDate();
        var dd = date.getDate();
        var month = Clock.getMonth(date.getMonth());
        var year = date.getFullYear();
        var hours = date.getHours();
        var min = date.getMinutes();
        var sec = date.getSeconds();

        //dd Month, yyyy HH:MM:ss
        return dd + " " + month + ", " + year + " " + hours + ":" + min + ":" + sec;
    }
};

Clock.writeDate();

var copiedClock = Clock;

    copiedClock.writeDate= function () {
        document.getElementById("timeDisp2").innerHTML = copiedClock.formatDate();
    };

copiedClock.writeDate();