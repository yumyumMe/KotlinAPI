package com.kotlin_api.repository

import com.kotlin_api.entity.Item
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import javax.persistence.Tuple

interface ItemRepository: JpaRepository<Item, String> {

    @Query(
            "select i, k from Item i join Kind k on i.itemId = k.itemId" +
                    " where exists (" +
                    " select 1 from ItemHolder h where h.item.itemId = i.itemId and exists (" +
                    " select 1 from Account a where a.accountId = h.account.accountId and exists (" +
                    " select 1 from User u where u.userId = a.user.userId and u.userId = :uid)))"
            )
    fun findItemInfoUIDAndStatus(@Param("uid") uid: String, pageable: Pageable): Page<Tuple>

}