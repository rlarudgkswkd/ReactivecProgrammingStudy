var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "10000",
        "ok": "10000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1431",
        "ok": "1431",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "196",
        "ok": "196",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "271",
        "ok": "271",
        "ko": "-"
    },
    "percentiles1": {
        "total": "45",
        "ok": "45",
        "ko": "-"
    },
    "percentiles2": {
        "total": "263",
        "ok": "263",
        "ko": "-"
    },
    "percentiles3": {
        "total": "781",
        "ok": "781",
        "ko": "-"
    },
    "percentiles4": {
        "total": "971",
        "ok": "971",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9576,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 405,
    "percentage": 4
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 19,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "909.091",
        "ok": "909.091",
        "ko": "-"
    }
},
contents: {
"req_get-all-todos-cac19": {
        type: "REQUEST",
        name: "Get All Todos",
path: "Get All Todos",
pathFormatted: "req_get-all-todos-cac19",
stats: {
    "name": "Get All Todos",
    "numberOfRequests": {
        "total": "10000",
        "ok": "10000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1431",
        "ok": "1431",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "196",
        "ok": "196",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "271",
        "ok": "271",
        "ko": "-"
    },
    "percentiles1": {
        "total": "45",
        "ok": "45",
        "ko": "-"
    },
    "percentiles2": {
        "total": "263",
        "ok": "263",
        "ko": "-"
    },
    "percentiles3": {
        "total": "781",
        "ok": "781",
        "ko": "-"
    },
    "percentiles4": {
        "total": "971",
        "ok": "971",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 9576,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 405,
    "percentage": 4
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 19,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "909.091",
        "ok": "909.091",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
