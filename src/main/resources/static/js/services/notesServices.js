/**
 * Created by admin on 03.10.2016.
 */
function getNotes() {
    console.log("get notes.");
    var data = [
        { "id" : 0,
            "title" : "Item 0"
        },
        { "id" : 1,
            "title" : "Item 1"
        },
        { "id" : 2,
            "title" : "Item 2"
        },
        { "id" : 3,
            "title" : "Item 3"
        },
        { "id" : 4,
            "title" : "Item 4"
        },
        { "id" : 5,
            "title" : "Item 5"
        },
        { "id" : 6,
            "title" : "Item 6"
        },
        { "id" : 7,
            "title" : "Item 7"
        },
        { "id" : 8,
            "title" : "Item 8"
        },
        { "id" : 9,
            "title" : "Item 9"
        },
        { "id" : 10,
            "title" : "Item 10"
        },
        { "id" : 11,
            "title" : "Item 11"
        },
        { "id" : 12,
            "title" : "Item 12"
        },
        { "id" : 13,
            "title" : "Item 13"
        },
        { "id" : 14,
            "title" : "Item 14"
        },
        { "id" : 15,
            "title" : "Item 15"
        },
        { "id" : 16,
            "title" : "Item 16"
        },
        { "id" : 17,
            "title" : "Item 17"
        },
        { "id" : 18,
            "title" : "Item 18"
        },
        { "id" : 19,
            "title" : "Item 19"
        },
        { "id" : 20,
            "title" : "Item 20"
        }
    ];
    return data;
}

function getNoteById(id) {
    console.log("getNoteById with params: id = " + id);
    return {
        "id": id,
        "title": "With list groups",
        "context": "Some default panel content here. Nulla vitae elit libero, a pharetra augue. Aenean lacinia bibendum nulla sed consectetur. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Nullam id dolor id nibh ultricies vehicula ut id elit."
    }
}