package com.knoldus

/**
 * This class is used to convert currencies
 */
class ConvertCurrencies {
  /**
   * this method convert rupee in other 10 currencies
   *
   * @param rupees          take amount in rupees
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertRupeesIntoAnotherCurrencies(rupees: Double, anotherCurrency: String): Double = {
    if (rupees >= 0) {
      anotherCurrency.toLowerCase match {
        case "dollar" => rupees / 71.22
        case "euro" => rupees / 78.39
        case "poundsterling" => rupees / 92.53
        case "yen" => rupees / 0.65
        case _ => convertRupeesIntoOtherCurrencies(rupees: Double, anotherCurrency: String)

      }
    }

    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertRupeesIntoOtherCurrencies(rupees: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase() match {
      case "ringgit" => rupees / 17.44
      case "sgd" => rupees / 52.43
      case "aud" => rupees / 48.07
      case "cad" => rupees / 54.03
      case "ars" => rupees * 0.85
      case _ => throw new Exception("invalid currency")
    }

  }

  /**
   * this method convert dollar in other 10 currencies
   *
   * @param dollar          take amount in dollar
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */

  def convertDollarIntoAnotherCurrencies(dollar: Double, anotherCurrency: String): Double = {
    if (dollar >= 0) {
      anotherCurrency.toLowerCase match {
        case "rupees" => dollar * 71.22
        case "euro" => dollar * 0.91
        case "poundsterling" => dollar * 10.78
        case "yen" => dollar * 109.73
        case _ => convertDollarIntoOtherCurrencies(dollar: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertDollarIntoOtherCurrencies(dollar: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => dollar * 4.14
      case "sgd" => dollar * 1.34
      case "aud" => dollar * 1.50
      case "cad" => dollar * 1.33
      case "ars" => dollar * 60.69
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert euro in other 10 currencies
   *
   * @param euro            take amount in euro
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */

  def convertEuroIntoAnotherCurrencies(euro: Double, anotherCurrency: String): Double = {
    if (euro >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => euro * 1.09
        case "rupees" => euro * 78.28
        case "poundsterling" => euro * 0.85
        case "yen" => euro * 120.11
        case _ => convertEuroIntoOtherCurrencies(euro: Double, anotherCurrency: String)

      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertEuroIntoOtherCurrencies(euro: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => euro * 4.53
      case "sgd" => euro * 1.52
      case "aud" => euro * 1.64
      case "cad" => euro * 1.46
      case "ars" => euro * 66.46
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert pound sterling in other 10 currencies
   *
   * @param poundSterling   take amount in poundsterling
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertPoundSterlingIntoAnotherCurrencies(poundSterling: Double, anotherCurrency: String): Double = {
    if (poundSterling >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => poundSterling * 1.29
        case "euro" => poundSterling * 1.18
        case "rupees" => poundSterling * 92.20
        case "yen" => poundSterling * 141.47
        case _ => convertPoundSterlingIntoOtherCurrencies(poundSterling: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertPoundSterlingIntoOtherCurrencies(poundSterling: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => poundSterling * 5.34
      case "sgd" => poundSterling * 1.79
      case "aud" => poundSterling * 1.93
      case "cad" => poundSterling * 1.71
      case "ars" => poundSterling * 78.33
      case _ => throw new Exception("invalid currency")

    }
  }

  /**
   * this method convert yen in other 10 currencies
   *
   * @param yen             take amount in yen
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertYenIntoAnotherCurrencies(yen: Double, anotherCurrency: String): Double = {
    if (yen >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => yen * 0.0091
        case "euro" => yen * 0.0083
        case "poundsterling" => yen * 0.0071
        case "rupees" => yen * 0.65
        case _ => convertYenIntoOtherCurrencies(yen: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertYenIntoOtherCurrencies(yen: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => yen * 0.038
      case "sgd" => yen * 0.013
      case "aud" => yen * 0.014
      case "cad" => yen * 0.012
      case "ars" => yen * 0.55
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert ringgit in other 10 currencies
   *
   * @param ringgit take amount in ringgit
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertRinggitIntoAnotherCurrencies(ringgit: Double, anotherCurrency: String): Double = {
    if (ringgit >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => ringgit * 0.24
        case "euro" => ringgit * 0.22
        case "poundsterling" => ringgit * 0.19
        case "yen" => ringgit * 26.49
        case _ => convertRinggitIntoOtherCurrencies(ringgit: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertRinggitIntoOtherCurrencies(ringgit: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "rupees" => ringgit * 17.27
      case "sgd" => ringgit * 0.34
      case "aud" => ringgit * 0.36
      case "cad" => ringgit * 0.32
      case "ars" => ringgit * 14.64
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert sgd in other 10 currencies
   *
   * @param sgd take amount in sgd
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertSgdIntoAnotherCurrencies(sgd: Double, anotherCurrency: String): Double = {
    if (sgd >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => sgd * 0.72
        case "euro" => sgd * 0.66
        case "poundsterling" => sgd * 0.56
        case "yen" => sgd * 78.96
        case _ => convertSgdIntoOtherCurrencies(sgd: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertSgdIntoOtherCurrencies(sgd: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => sgd * 2.98
      case "rupees" => sgd * 51.46
      case "aud" => sgd * 1.08
      case "cad" => sgd * 0.96
      case "ars" => sgd * 43.71
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert aud in other 10 currencies
   *
   * @param aud take amount in aud
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertAudIntoAnotherCurrencies(aud: Double, anotherCurrency: String): Double = {
    if (aud >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => aud * 0.67
        case "euro" => aud * 0.61
        case "poundsterling" => aud * 0.52
        case "yen" => aud * 73.24
        case _ => convertAudIntoOtherCurrencies(aud: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertAudIntoOtherCurrencies(aud: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => aud * 2.76
      case "sgd" => aud * 0.93
      case "rupees" => aud * 47.22
      case "cad" => aud * 0.89
      case "ars" => aud * 40.63
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert cad in other 10 currencies
   *
   * @param cad   take amount in cad
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertCadIntoAnotherCurrencies(cad: Double, anotherCurrency: String): Double = {
    if (cad >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => cad * 0.75
        case "euro" => cad * 0.69
        case "poundsterling" => cad * 0.58
        case "yen" => cad * 82.45
        case _ => convertCadIntoOtherCurrencies(cad: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertCadIntoOtherCurrencies(cad: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => cad * 3.11
      case "sgd" => cad * 1.04
      case "aud" => cad * 1.13
      case "rupees" => cad * 53.73
      case "ars" => cad * 45.63
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   * this method convert ars in other 10 currencies
   *
   * @param ars             take amount in ars
   * @param anotherCurrency currency to convert
   * @return converted currencies
   */
  def convertArsIntoAnotherCurrencies(ars: Double, anotherCurrency: String): Double = {
    if (ars >= 0) {
      anotherCurrency.toLowerCase() match {
        case "dollar" => ars * 0.016
        case "euro" => ars * 0.015
        case "poundsterling" => ars * 0.013
        case "yen" => ars * 1.81
        case _ => convertArsIntoOtherCurrencies(ars: Double, anotherCurrency: String)
      }
    }
    else {
      throw new Exception("invalid amount")
    }
  }

  private def convertArsIntoOtherCurrencies(ars: Double, anotherCurrency: String): Double = {
    anotherCurrency.toLowerCase match {
      case "ringgit" => ars * 0.058
      case "sgd" => ars * 0.023
      case "aud" => ars * 0.025
      case "rupees" => ars * 1.18
      case "cad" => ars * 0.022
      case _ => throw new Exception("invalid currency")
    }
  }
}
