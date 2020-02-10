package com.knoldus

import org.scalatest._

class ConvertCurrenciesSpec extends FlatSpec with BeforeAndAfterAll {


  var convertCurrenciesObject: ConvertCurrencies = new ConvertCurrencies

  override def beforeAll(): Unit = {
    convertCurrenciesObject = new ConvertCurrencies()
  }

  override def afterAll(): Unit = {
    if (convertCurrenciesObject != null) {
      convertCurrenciesObject = null
    }
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into dollar" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 0.07020499859590003
    assert(expectedResult == actualResult)
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into euro" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "euro")
    val expectedResult = 0.06378364587319811
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 0.054036528693396736
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertRupeesIntoAnotherCurrencies" should "convert  negative rupees into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into yen" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "yen")
    val expectedResult = 7.692307692307692
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into ringgit" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 0.286697247706422
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into sgd" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 0.09536524890329964
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into aud" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "aud")
    val expectedResult = 0.10401497815685459
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into cad" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "cad")
    val expectedResult = 0.09254118082546733
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into ars" in {
    val actualResult = convertCurrenciesObject.convertRupeesIntoAnotherCurrencies(5, "ars")
    val expectedResult = 4.25
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into euro" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "euro")
    val expectedResult = 4.55
    assert(expectedResult == actualResult)
  }

  "convertDollarIntoAnotherCurrencies" should "convert dollar into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 53.9
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into yen" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "yen")
    val expectedResult = 548.65
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertDollarIntoAnotherCurrencies" should "convert negative dollar into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertDollarIntoAnotherCurrencies" should "convert dollar into ringgit" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 20.7
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into sgd" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 6.7
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into aud" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "aud")
    val expectedResult = 7.5
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into cad" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "cad")
    val expectedResult = 6.65
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into ars" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "ars")
    val expectedResult = 303.45
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into rupees" in {
    val actualResult = convertCurrenciesObject.convertDollarIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 356.1
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into dollar" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 5.45
    assert(expectedResult == actualResult)
  }

  "convertEuroIntoAnotherCurrencies" should "convert euro into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 4.25
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into yen" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "yen")
    val expectedResult = 600.55
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertEuroIntoAnotherCurrencies" should "convert negative euro into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(-55, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertEuroIntoAnotherCurrencies" should "convert euro into ringgit" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 22.650000000000002
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro  into sgd" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 7.6
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into aud" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "aud")
    val expectedResult = 8.2
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into cad" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "cad")
    val expectedResult = 7.3
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into rupees" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 391.4
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert euro into ars" in {
    val actualResult = convertCurrenciesObject.convertEuroIntoAnotherCurrencies(5, "ars")
    val expectedResult = 332.29999999999995
    assert(expectedResult == actualResult)
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert pound sterling into dollar" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 6.45
    assert(expectedResult == actualResult)
  }

  "convertPoundSterlingIntoAnotherCurrencies" should "convert pound sterling into euro" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "euro")
    val expectedResult = 5.8999999999999995
    assert(expectedResult == actualResult)
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert pound sterling into yen" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "yen")
    val expectedResult = 707.35
    assert(expectedResult == actualResult)
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert PoundSterling into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert negative PoundSterling into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertPoundSterlingIntoAnotherCurrencies" should "convert pound sterling into ringgit" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 26.7
    assert(expectedResult == actualResult)
  }
  "convertpoundSterlingIntoAnotherCurrencies" should "convert PoundSterling  into sgd" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 8.95
    assert(expectedResult == actualResult)
  }
  "convertPoundsterlingIntoAnotherCurrencies" should "convert pound  sterling into aud" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "aud")
    val expectedResult = 9.65
    assert(expectedResult == actualResult)
  }
  "convertPoundsterlingIntoAnotherCurrencies" should "convert pound sterling into cad" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "cad")
    val expectedResult = 8.55
    assert(expectedResult == actualResult)
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert Pound sterling into rupees" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 461
    assert(expectedResult == actualResult)
  }
  "convertPoundSterlingIntoAnotherCurrencies" should "convert Pound sterling into ars" in {
    val actualResult = convertCurrenciesObject.convertPoundSterlingIntoAnotherCurrencies(5, "ars")
    val expectedResult = 391.65
    assert(expectedResult == actualResult)
  }

  "convertYenIntoAnotherCurrencies" should "convert yen into dollar" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 0.0455
    assert(expectedResult == actualResult)
  }

  "convertYenIntoAnotherCurrencies" should "convert yen into euro" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "euro")
    val expectedResult = 0.0415
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert yen into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 0.035500000000000004
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert yen into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertYenIntoAnotherCurrencies" should "convert negative yen into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertYenIntoAnotherCurrencies" should "convert yen into ringgit" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 0.19
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert yen  into sgd" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 0.065
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert yen into aud" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "aud")
    val expectedResult = 0.07
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert yen into cad" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "cad")
    val expectedResult = 0.06
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yen into rupees" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 3.25
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yen into ars" in {
    val actualResult = convertCurrenciesObject.convertYenIntoAnotherCurrencies(5, "ars")
    val expectedResult = 2.75
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into dollar" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 1.2
    assert(expectedResult == actualResult)
  }

  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into euro" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "euro")
    val expectedResult = 1.1
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 0.95
    assert(expectedResult == actualResult)
  }
  "convertRinggitntoAnotherCurrencies" should "convert ringgit into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertRinggitntoAnotherCurrencies" should "convert negative ringgit into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into yen" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "yen")
    val expectedResult = 132.45
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit  into sgd" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 1.7000000000000002
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into aud" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "aud")
    val expectedResult = 1.7999999999999998
    assert(expectedResult == actualResult)
  }
  "convertRingittIntoAnotherCurrencies" should "convert ringgit into cad" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "cad")
    val expectedResult = 1.6
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into rupees" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 86.35
    assert(expectedResult == actualResult)
  }
  "convertRinggitIntoAnotherCurrencies" should "convert ringgit into ars" in {
    val actualResult = convertCurrenciesObject.convertRinggitIntoAnotherCurrencies(5, "ars")
    val expectedResult = 73.2
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into dollar" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 3.5999999999999996
    assert(expectedResult == actualResult)
  }

  "convertSgdIntoAnotherCurrencies" should "convert sgd into euro" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "euro")
    val expectedResult = 3.3000000000000003
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 2.8000000000000003
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertSgdIntoAnotherCurrencies" should "convert negative sgd into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertSgdIntoAnotherCurrencies" should "convert sgd into yen" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "yen")
    val expectedResult = 394.79999999999995
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd  into ringgit" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 14.9
    assert(expectedResult == actualResult)
  }
  "convertsgdIntoAnotherCurrencies" should "convert sgd into aud" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "aud")
    val expectedResult = 5.4
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into cad" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "cad")
    val expectedResult = 4.8
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into rupees" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 257.3
    assert(expectedResult == actualResult)
  }
  "convertSgdIntoAnotherCurrencies" should "convert sgd into ars" in {
    val actualResult = convertCurrenciesObject.convertSgdIntoAnotherCurrencies(5, "ars")
    val expectedResult = 218.55
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into dollar" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 3.35
    assert(expectedResult == actualResult)
  }

  "convertAudIntoAnotherCurrencies" should "convert aud into euro" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "euro")
    val expectedResult = 3.05
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 2.6
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertAudIntoAnotherCurrencies" should "convert negative aud into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertAudIntoAnotherCurrencies" should "convert aud into yen" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "yen")
    val expectedResult = 366.2
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud  into ringgit" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 13.799999999999999
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into sgd" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 4.65
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into cad" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "cad")
    val expectedResult = 4.45
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into rupees" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 236.1
    assert(expectedResult == actualResult)
  }
  "convertAudIntoAnotherCurrencies" should "convert aud into ars" in {
    val actualResult = convertCurrenciesObject.convertAudIntoAnotherCurrencies(5, "ars")
    val expectedResult = 203.15
    assert(expectedResult == actualResult)
  }

  "convertCadIntoAnotherCurrencies" should "convert cad into dollar" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 3.75
    assert(expectedResult == actualResult)
  }

  "convertCadIntoAnotherCurrencies" should "convert cad into euro" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "euro")
    val expectedResult = 3.4499999999999997
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 2.9
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertCadIntoAnotherCurrencies" should "convert negative cad into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertCadIntoAnotherCurrencies" should "convert cad into yen" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "yen")
    val expectedResult = 412.25
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert Cad  into ringgit" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 15.549999999999999
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into sgd" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 5.2
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into aud" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "aud")
    val expectedResult = 5.6499999999999995
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into rupees" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 268.65
    assert(expectedResult == actualResult)
  }
  "convertCadIntoAnotherCurrencies" should "convert cad into ars" in {
    val actualResult = convertCurrenciesObject.convertCadIntoAnotherCurrencies(5, "ars")
    val expectedResult = 228.15
    assert(expectedResult == actualResult)
  }

  "convertArsIntoAnotherCurrencies" should "convert ars into dollar" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "dollar")
    val expectedResult = 0.08
    assert(expectedResult == actualResult)
  }

  "convertArsIntoAnotherCurrencies" should "convert ars into euro" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "euro")
    val expectedResult = 0.075
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into pound sterling" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "poundsterling")
    val expectedResult = 0.065
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }
  "convertArsIntoAnotherCurrencies" should "convert negative ars into canadian" in {
    try {
      val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(-5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid amount")
      }
    }
  }

  "convertArsIntoAnotherCurrencies" should "convert ars into yen" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "yen")
    val expectedResult = 9.05
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars  into ringgit" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "ringgit")
    val expectedResult = 0.29000000000000004
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into sgd" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "sgd")
    val expectedResult = 0.11499999999999999
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into aud" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "aud")
    val expectedResult = 0.125
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into rupees" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "rupees")
    val expectedResult = 5.8999999999999995
    assert(expectedResult == actualResult)
  }
  "convertArsIntoAnotherCurrencies" should "convert ars into cad" in {
    val actualResult = convertCurrenciesObject.convertArsIntoAnotherCurrencies(5, "cad")
    val expectedResult = 0.10999999999999999
    assert(expectedResult == actualResult)
  }
}