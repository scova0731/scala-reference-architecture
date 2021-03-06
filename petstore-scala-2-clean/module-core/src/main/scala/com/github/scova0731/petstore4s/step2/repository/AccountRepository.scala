package com.github.scova0731.petstore4s.step2.repository

import com.github.scova0731.petstore4s.step2.domain.Account

trait AccountRepository {

  def getAccountByUsername(username: String): Account

  def getAccountByUsernameAndPassword(username: String, password: String): Account

  def insertAccount(account: Account): Unit

  def insertProfile(account: Account): Unit

  def insertSignon(account: Account): Unit

  def updateAccount(account: Account): Unit

  def updateProfile(account: Account): Unit

  def updateSignon(account: Account): Unit
}
