package com.hlebnikov.topbodyapp.fakeData

import com.hlebnikov.topbodyapp.utils.Call
import com.hlebnikov.topbodyapp.utils.CallInfoBody
import com.hlebnikov.topbodyapp.utils.CallListBody
val fake_call_list: CallListBody = CallListBody(
    count = 3,
    next = 3,
    previous = 3,
    results = listOf(        Call(
        id = 3,
        name = "Приседать каждый день 30 раз",
        image_list = "https://trainer.top-body.ru/media/achives/3/list.jpg",
        avatar = arrayOf("https://trainer.top-body.ru/media/avatars/21fab422-b2b0-4620-a71a-7f11e1e78117.png"),
        count_users = 14,
        status = "not_accepted"
    ),
        Call(
            id = 3,
            name = "Приседать каждый день 30 раз",
            image_list = "https://trainer.top-body.ru/media/achives/3/list.jpg",
            avatar = arrayOf("https://trainer.top-body.ru/media/avatars/21fab422-b2b0-4620-a71a-7f11e1e78117.png"),
            count_users = 14,
            status = "not_accepted"
        ),
        Call(
            id = 3,
            name = "Приседать каждый день 30 раз",
            image_list = "https://trainer.top-body.ru/media/achives/3/list.jpg",
            avatar = arrayOf("https://trainer.top-body.ru/media/avatars/21fab422-b2b0-4620-a71a-7f11e1e78117.png"),
            count_users = 14,
            status = "not_accepted"
        )
    )
)


val fakeCallInfo: CallInfoBody = CallInfoBody(
    name = "Приседания каждый день 10 раз",
    count_users = 51,
    image_card = "https://trainer.top-body.ru/media/achives/1/card.jpg",
    avatar = arrayOf("https://trainer.top-body.ru/media/avatars/21fab422-b2b0-4620-a71a-7f11e1e78117.png"),
    count_users_4 = 47,
    task_minutes = 4,
    frequence = "each_day",
    skip_days = 5,
    status = "not_accepted",
    achive_win = "https://trainer.top-body.ru/media/achives/1/win.jpg",
    duration = 87,
    count_exercises = 2,
    exercises = arrayOf(25, 25),
    name_exercises = arrayOf("Приседания", "Приседания"),
    repeats_or_time = arrayOf(10, 1)

)

