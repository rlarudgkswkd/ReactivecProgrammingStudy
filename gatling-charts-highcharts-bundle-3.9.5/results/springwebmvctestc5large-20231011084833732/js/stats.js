var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "10000",
        "ok": "9993",
        "ko": "7"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "432"
    },
    "maxResponseTime": {
        "total": "10098",
        "ok": "10098",
        "ko": "6605"
    },
    "meanResponseTime": {
        "total": "942",
        "ok": "940",
        "ko": "3982"
    },
    "standardDeviation": {
        "total": "913",
        "ok": "906",
        "ko": "2942"
    },
    "percentiles1": {
        "total": "760",
        "ok": "760",
        "ko": "6293"
    },
    "percentiles2": {
        "total": "1252",
        "ok": "1251",
        "ko": "6603"
    },
    "percentiles3": {
        "total": "2461",
        "ok": "2451",
        "ko": "6604"
    },
    "percentiles4": {
        "total": "4472",
        "ok": "4463",
        "ko": "6605"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 5320,
    "percentage": 53
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1971,
    "percentage": 20
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 2702,
    "percentage": 27
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 7,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "714.286",
        "ok": "713.786",
        "ko": "0.5"
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
        "ok": "9993",
        "ko": "7"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "432"
    },
    "maxResponseTime": {
        "total": "10098",
        "ok": "10098",
        "ko": "6605"
    },
    "meanResponseTime": {
        "total": "942",
        "ok": "940",
        "ko": "3982"
    },
    "standardDeviation": {
        "total": "913",
        "ok": "906",
        "ko": "2942"
    },
    "percentiles1": {
        "total": "760",
        "ok": "760",
        "ko": "6293"
    },
    "percentiles2": {
        "total": "1252",
        "ok": "1251",
        "ko": "6603"
    },
    "percentiles3": {
        "total": "2461",
        "ok": "2451",
        "ko": "6604"
    },
    "percentiles4": {
        "total": "4472",
        "ok": "4463",
        "ko": "6605"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 5320,
    "percentage": 53
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 1971,
    "percentage": 20
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 2702,
    "percentage": 27
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 7,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "714.286",
        "ok": "713.786",
        "ko": "0.5"
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
