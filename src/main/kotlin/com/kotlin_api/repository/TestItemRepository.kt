package com.kotlin_api.repository

import com.kotlin_api.entity.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TestItemRepository: JpaRepository<Item, String> {

    @Query(
        "SELECT \n" +
                "item.id, item.item_name, item.image_url, \n" +
                "item.creater_id, item.create_date\n" +
                "FROM\n" +
                "item\n" +
                "JOIN\n" +
                "creater\n" +
                "ON\n" +
                "item.creater_id = creater.creater_id\n" +
                "JOIN\n" +
                "account\n" +
                "ON\n" +
                "creater.creater_id = account.creater_id\n" +
                "JOIN\n" +
                "user\n" +
                "ON\n" +
                "account.user_id = user.user_id\n" +
                "\n"
    , nativeQuery = true)
    fun getItemList(userId: String): Array<Item>

}