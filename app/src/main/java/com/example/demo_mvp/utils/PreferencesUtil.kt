package com.example.demo_mvp.utils

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.text.TextUtils
import com.example.demo_mvp.R

import java.util.*


internal val LoginToken = "LoginToken"
internal val SocialToken = "SocialToken"
internal val NotificationToken = "NotificationToken"
internal val PIN = "PIN"
internal val UserName = "UserName"
internal val Email = "Email"
internal val Name = "Name"
internal val CountryCode = "CountryCode"
internal val CountryRegion = "CountryRegion"
internal val CurrencySymbol = "CurrencySymbol"
internal val CurrencyName = "CurrencyName"
internal val CurrencyId = "Currencyid"
internal val ProfilePic = "ProfilePic"
internal val StripeToken = "StripeToken"
internal val ExchangeRate = "ExchangeRate"
internal val MobileNo = "MobileNo"
internal val LoginPassword = "LoginPassword"
internal val ImageUrl = "ImageUrl"
internal val Status = "Status"
internal val AdsView = "AdsView"
internal val LanguageType = "LanguageType"
internal val LanguageName = "LanguageName"
internal val AllLanguage = "AllLanguage"
internal val IsLoginSuccess = "IsLoginSuccess"
internal val IsSkip = "IsSkip"
internal val IsSetManual = "IsSetManual"
internal val IsRemember = "IsRemember"
internal val IsForgotPassword = "IsForgotPassword"
internal val IMEI = "IMEI"
internal val DeviceType = "DeviceType"
internal val SocialType = "SocialType"
internal val MODEL = "MODEL"
internal val DEVICE_ID = "DEVICE_ID"
internal val MANUFACTURER = "MANUFACTURER"
internal val BOARD = "BOARD"
internal val SDK = "SDK"
internal val ANDROID_VERSION = "ANDROID_VERSION"
internal val BRAND = "BRAND"
internal val Latitude = "Latitude"
internal val Longitude = "Longitude"
internal val IsLocation = "IsLocation"
internal val CartArray = "CartArray"
internal val ProductCartArray = "ProductCartArray"
internal val DefaultAddress = "DefaultAddress"
internal val SelectedPaymentMethod = "selected_payment_method"
internal val SelectedCard = "selected_card"
internal val CheckOut = "check_id"
fun Context.getSharedPreferences(): SharedPreferences {
    return getSharedPreferences(
        getString(R.string.app_name).replace(" ", "_"),
        Context.MODE_PRIVATE
    )
}

fun Context.setCheckOutId(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(CheckOut, data)
    editor.commit()
}

fun Context.getCheckOutId(): String {
    return getSharedPreferences().getString(CheckOut, "")!!
}

fun Context.setSelectedCard(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(SelectedCard, data)
    editor.commit()
}

fun Context.getSelectedCard(): String {
    return getSharedPreferences().getString(SelectedCard, "")!!
}

fun Context.setImageUrl(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(ImageUrl, data)
    editor.commit()
}

fun Context.getImageUrl(): String? {
    return getSharedPreferences().getString(ImageUrl, "")
}

fun Context.setIsRemember(data: Boolean) {
    val editor = getSharedPreferences().edit()
    editor.putBoolean(IsRemember, data)
    editor.commit()
}

fun Context.getIsRemember(): Boolean {
    return getSharedPreferences().getBoolean(IsRemember, false)
}

fun Context.setIsForgotPassword(data: Boolean) {
    val editor = getSharedPreferences().edit()
    editor.putBoolean(IsForgotPassword, data)
    editor.commit()
}

fun Context.getIsForgotPassword(): Boolean {
    return getSharedPreferences().getBoolean(IsForgotPassword, false)
}

fun Context.setPIN(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(PIN, data)
    editor.commit()
}

fun Context.getPIN(): String? {
    return getSharedPreferences().getString(PIN, "")
}

fun Context.setLoginToken(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(LoginToken, data)
    editor.commit()
}

fun Context.getLoginToken(): String {
    return getSharedPreferences().getString(LoginToken, "")!!
}

fun Context.setNotificationToken(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(NotificationToken, data)
    editor.commit()
}

fun Context.getNotificationToken(): String {
    return getSharedPreferences().getString(NotificationToken, "")!!//token_not_available
}

fun Context.setNotificationTokenFirstTime(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString("NotificationTokenFirst", data)
    editor.commit()
}

fun Context.getNotificationTokenFirstTime(): String {
    return getSharedPreferences().getString("NotificationTokenFirst", "")!!//token_not_available
}

fun Context.isAppOpenFirstTime(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString("FirstTimeAppOpen", data)
    editor.commit()
}

fun Context.getIsAppOpenFirstTime(): String {
    return getSharedPreferences().getString("FirstTimeAppOpen", "")!!//token_not_available
}

fun Context.setName(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(Name, data)
    editor.commit()
}

fun Context.getName(): String? {
    return getSharedPreferences().getString(Name, "")
}

fun Context.setUserName(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(UserName, data)
    editor.commit()
}

fun Context.getUserName(): String? {
    return getSharedPreferences().getString(UserName, "")
}

fun Context.setEmail(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(Email, data)
    editor.commit()
}

fun Context.getEmail(): String? {
    return getSharedPreferences().getString(Email, "")
}

fun Context.setCountryRegion(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(CountryRegion, data)
    editor.commit()
}

fun Context.getCountryRegion(): String {
    return getSharedPreferences().getString(CountryRegion, "")!!
}

fun Context.setCurrencySymbol(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(CurrencySymbol, data)
    editor.commit()
}



fun Context.getCurrencySymbol(): String {
    return getSharedPreferences().getString(CurrencySymbol, "")!!
}

fun Context.getCurrencyName(): String {
    return getSharedPreferences().getString(CurrencyName, "")!!
}

fun Context.setCurrencyName(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(CurrencyName, data)
    editor.commit()
}


fun Context.setCurrencyid(data: Int) {
    val editor = getSharedPreferences().edit()

    //DevangTailor
    // editor.putInt(CurrencyId, data)
    editor.putInt(CurrencyId, data)
    editor.commit()
}

//DevanTailor
/*fun Context.getCurrencid(): Int {
    return getSharedPreferences().getInt(CurrencyId, 0)!!
}*/

fun Context.getCurrencid(): Int {
    return getSharedPreferences().getInt(CurrencyId, 1)!!
}

fun Context.setProfilePic(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(ProfilePic, data)
    editor.commit()
}

fun Context.getProfilePic(): String {
    return getSharedPreferences().getString(ProfilePic, "")!!
}

fun Context.setStripeToken(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(StripeToken, data)
    editor.commit()
}

fun Context.getStripeToken(): String {
    return getSharedPreferences().getString(StripeToken, "")!!
}

fun Context.setExchangeRate(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(ExchangeRate, data)
    editor.commit()
}

fun Context.getExchangeRate(): String {
    return getSharedPreferences().getString(ExchangeRate, "")!!
}

fun Context.setCountryCode(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(CountryCode, data)
    editor.commit()
}

fun Context.getCountryCode(): String {
    return getSharedPreferences().getString(CountryCode, "")!!
}

fun Context.setMobileNo(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(MobileNo, data)
    editor.commit()
}

fun Context.getMobileNo(): String {
    return getSharedPreferences().getString(MobileNo, "")!!
}

fun Context.setLoginPassword(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(LoginPassword, data)
    editor.commit()
}

fun Context.getLoginPassword(): String {
    return getSharedPreferences().getString(LoginPassword, "")!!
}

fun Context.setStatus(data: Int) {
    val editor = getSharedPreferences().edit()
    editor.putInt(Status, data)
    editor.commit()
}

fun Context.getStatus(): Int? {
    return getSharedPreferences().getInt(Status, 0)
}

/*
* 1 - gallery
* 2 - arrayList
* 3 - grid
* */
fun Context.setAdsView(data: Int) {
    val editor = getSharedPreferences().edit()
    editor.putInt(AdsView, data)
    editor.commit()
}

fun Context.getAdsView(): Int? {
    return getSharedPreferences().getInt(AdsView, 1)
}


fun Context.setSocialToken(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(SocialToken, data)
    editor.commit()
}

fun Context.getSocialToken(): String {
    return getSharedPreferences().getString(SocialToken, "")!!
}

fun Context.setLanguageType(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(LanguageType, data)
    editor.commit()
}

fun Context.getLanguageType(): String {
    return getSharedPreferences().getString(LanguageType, "en-US")!!
}

fun Context.setLanguageName(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(LanguageName, data)
    editor.commit()
}

fun Context.getLanguageName(): String {
    return getSharedPreferences().getString(LanguageName, "English")!!
}

fun Context.setAllLanguage(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(AllLanguage, data)
    editor.commit()
}

fun Context.getAllLanguage(): String {
    return getSharedPreferences().getString(AllLanguage, "[]")!!
}

fun Context.getIsSetManual(): Boolean {
    return getSharedPreferences().getBoolean(IsSetManual, false)!!
}

fun Context.setIsSetManual(obj: Boolean) {
    val prefsEditor = getSharedPreferences().edit()
    prefsEditor.putBoolean(IsSetManual, obj)
    prefsEditor.commit()
}

fun Context.getIsLoginSuccess(): Boolean {
    return getSharedPreferences().getBoolean(IsLoginSuccess, false)!!
}

fun Context.setIsLoginSuccess(obj: Boolean) {
    val prefsEditor = getSharedPreferences().edit()
    prefsEditor.putBoolean(IsLoginSuccess, obj)
    prefsEditor.commit()
}

fun Context.getIsSkip(): Boolean {
    return getSharedPreferences().getBoolean(IsSkip, false)!!
}

fun Context.setIsSkip(obj: Boolean) {
    val prefsEditor = getSharedPreferences().edit()
    prefsEditor.putBoolean(IsSkip, obj)
    prefsEditor.commit()
}

fun Context.SetLanguage() {
    /* val res = resources
     val dm = res.displayMetrics
     val conf = res.configuration
     if (Build.VERSION.SDK_INT >= 17) {
         conf.setLocale(Locale(getLanguageType()))
     } else {
         conf.locale = Locale(getLanguageType())
     }
     res.updateConfiguration(conf, dm)*/
    setLocale()
}

fun Context.setLocale() {
    var lang = getLanguageType()
    if (TextUtils.equals(lang, "cn")) {
        lang = "zh_TW";
    }

    val myLocale: Locale
    myLocale = if (lang == "en-US") {
        Locale.ENGLISH
    } else if (lang == "zh_TW") {
        Locale.TRADITIONAL_CHINESE
    } else {
        Locale(lang)
    }
    Locale.setDefault(myLocale)
    val res = resources
    val dm = res.displayMetrics
    val conf = res.configuration

    if (Build.VERSION.SDK_INT >= 17) {
        conf.setLocale(myLocale);
    } else {
        conf.locale = myLocale
    }
    res.updateConfiguration(conf, dm)
}

fun Context.setIMEI(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(IMEI, data)
    editor.commit()
}

fun Context.getIMEI(): String {
    return getSharedPreferences().getString(IMEI, "")!!
}

fun Context.setDeviceType(data: Int) {
    val editor = getSharedPreferences().edit()
    editor.putInt(DeviceType, data)
    editor.commit()
}

// 0 - Web
// 1 - Android (mobile no or password login)
// 2 - IOS (mobile no or password login)
fun Context.getDeviceType(): String? {
    if (getSharedPreferences().getString(DeviceType, "") == "0") {
        return "IOS";
    } else if (getSharedPreferences().getString(DeviceType, "") == "1") {
        return "ANDROID"
    } else {
        return "ANDROID"
    }
    // 0 - Web
    // 1 - Android (mobile no or password login)
    // 2 - IOS (mobile no or password login)
}

fun Context.setSocialType(data: Int) {
    val editor = getSharedPreferences().edit()
    editor.putInt(SocialType, data)
    editor.commit()
}

fun Context.getSocialType(): Int {
    return getSharedPreferences().getInt(SocialType, 3)
    // 3 - Facebook
    // 4 - Google
    // 5 - AppleId
}

fun Context.setModel(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(MODEL, data)
    editor.commit()
}

fun Context.getModel(): String {
    return getSharedPreferences().getString(MODEL, "")!!
}

fun Context.setDeviceID(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(DEVICE_ID, data)
    editor.commit()
}

fun Context.getDeviceID(): String {
    return getSharedPreferences().getString(DEVICE_ID, "")!!
}


fun Context.setManufacturer(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(MANUFACTURER, data)
    editor.commit()
}

fun Context.getManufacturer(): String {
    return getSharedPreferences().getString(MANUFACTURER, "")!!
}

fun Context.setBoard(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(BOARD, data)
    editor.commit()
}

fun Context.getBoard(): String {
    return getSharedPreferences().getString(BOARD, "")!!
}

fun Context.setSDK(data: Int) {
    val editor = getSharedPreferences().edit()
    editor.putInt(SDK, data)
    editor.commit()
}

fun Context.getSDK(): String {
    return getSharedPreferences().getInt(SDK, 0).toString()
}

fun Context.setAndroidVersion(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(ANDROID_VERSION, data)
    editor.commit()
}

fun Context.getAndroidVersion(): String {
    return getSharedPreferences().getString(ANDROID_VERSION, "")!!
}

fun Context.setBrand(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(BRAND, data)
    editor.commit()
}

fun Context.getBrand(): String {
    return getSharedPreferences().getString(BRAND, "")!!
}


fun Context.setLatitude(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(Latitude, data)
    editor.commit()
}

fun Context.getLatitude(): String {
    return getSharedPreferences().getString(Latitude, "0")!!
}

fun Context.setLongitude(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(Longitude, data)
    editor.commit()
}

fun Context.getLongitude(): String {
    return getSharedPreferences().getString(Longitude, "0")!!
}

fun Context.setIsLocation(data: Boolean) {
    val editor = getSharedPreferences().edit()
    editor.putBoolean(IsLocation, data)
    editor.commit()
}

fun Context.getIsLocation(): Boolean {
    return getSharedPreferences().getBoolean(IsLocation, false)
}

fun Context.setDefaultAddress(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(DefaultAddress, data)
    editor.commit()
}

fun Context.getDefaultAddress(): String {
    return getSharedPreferences().getString(DefaultAddress, "")!!
}

fun Context.setSelectedPaymentMethodId(data: String) {
    val editor = getSharedPreferences().edit()
    editor.putString(SelectedPaymentMethod, data)
    editor.commit()
}

fun Context.getSelectedPaymentMethodId(): String {
    return getSharedPreferences().getString(SelectedPaymentMethod, "")!!
}

/*fun Context.setCartArrayList(arrayList: ArrayList<UserCartData>) {

    val editor = getSharedPreferences().edit()
    val gson = Gson()
    val json = gson.toJson(arrayList)
    editor.putString(CartArray, json)
    editor.apply()     // This line is IMPORTANT !!!
}

fun Context.getCartArrayList(): ArrayList<UserCartData>? {
    val gson = Gson()
    val json = getSharedPreferences().getString(CartArray, "")
    val type = object : TypeToken<ArrayList<UserCartData>>() {
    }.type

    return if (gson.fromJson<ArrayList<UserCartData>>(json, type) == null) {
        ArrayList()
    } else {
        gson.fromJson<ArrayList<UserCartData>>(json, type)
    }
}

fun Context.setProductCartArrayList(arrayList: ArrayList<UserCartData>) {

    val editor = getSharedPreferences().edit()
    val gson = Gson()
    val json = gson.toJson(arrayList)
    editor.putString(ProductCartArray, json)
    editor.apply()     // This line is IMPORTANT !!!
}

fun Context.getProductCartArrayList(): ArrayList<UserCartData>? {
    val gson = Gson()
    val json = getSharedPreferences().getString(ProductCartArray, "")
    val type = object : TypeToken<ArrayList<UserCartData>>() {
    }.type

    return if (gson.fromJson<ArrayList<UserCartData>>(json, type) == null) {
        ArrayList()
    } else {
        gson.fromJson<ArrayList<UserCartData>>(json, type)
    }
}*/

fun Context.ClearData() {
    val allLanguage = getAllLanguage()
    val languageType = getLanguageType()
    val isSetManual = getIsSetManual()
    val isRemember = getIsRemember()
    val mobileNo = getMobileNo()
    val countryCode = getCountryCode()
    val countryRegion = getCountryRegion()
    val manufacturer = getManufacturer()
    val model = getModel()
    val board = getBoard()
    val sdkVersion = getSDK()
    val osVersion = getAndroidVersion()
    val device_id = getDeviceID()
    val brand = getBrand()
    val imei = getIMEI()
    val lat = getLatitude()
    val long = getLongitude()
    val isLocation = getIsLocation()
    val notificationToken = getNotificationToken()
    val getDefaultAddress = getDefaultAddress()
    val getCurrencySymbol = getCurrencySymbol()
    val getCurrencid = getCurrencid()
    val getCurrencyName = getCurrencyName()

    val editor = getSharedPreferences().edit()
    editor.clear() //clear all stored data
    editor.apply()

    setAllLanguage(allLanguage)
    setLanguageType(languageType)
    setIsSetManual(isSetManual)
    setIsRemember(isRemember)
    setCountryCode(countryCode)
    setCountryRegion(countryRegion)
    setMobileNo(mobileNo)
    setManufacturer(manufacturer)
    setModel(model)
    setBoard(board)
    setSDK(sdkVersion.toInt())
    setAndroidVersion(osVersion)
    setDeviceID(device_id)
    setBrand(brand)
    setIMEI(imei)
    setLatitude(lat)
    setLongitude(long)
    setIsLocation(isLocation)
    setNotificationToken(notificationToken)
    setDefaultAddress(getDefaultAddress)
    setCurrencySymbol(getCurrencySymbol)
    setCurrencyid(getCurrencid)
    setCurrencyName(getCurrencyName)
}