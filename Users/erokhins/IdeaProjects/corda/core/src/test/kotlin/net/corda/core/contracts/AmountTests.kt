'Test' @ [18:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Amount' @ [20:17] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: (Currency..Currency?)) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'getInstance' @ [20:36] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'assertTrue' @ [21:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [21:20] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'x' @ [21:30] ==> val x: Amount<(Currency..Currency?)> defined in net.corda.core.contracts.AmountTests.`make sure Amount has decimal places`[LocalVariableDescriptor]

'toString' @ [21:32] ==> public open fun toString(): String defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'Test' @ [24:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Amount' @ [27:25] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [27:32] ==> val quantity: Long defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'GBP' @ [27:42] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [28:27] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'expectedGBP' @ [29:22] ==> val expectedGBP: BigDecimal defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'amountGBP' @ [29:35] ==> val amountGBP: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [29:45] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [30:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'amountGBP' @ [30:22] ==> val amountGBP: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'Amount' @ [30:33] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'fromDecimal' @ [30:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any> fromDecimal(displayQuantity: BigDecimal, token: Currency, rounding: RoundingMode = ...): Amount<Currency> defined in net.corda.core.contracts.Amount.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'amountGBP' @ [30:52] ==> val amountGBP: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [30:62] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'amountGBP' @ [30:75] ==> val amountGBP: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'token' @ [30:85] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Amount' @ [31:25] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [31:32] ==> val quantity: Long defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'JPY' @ [31:42] ==> @field:JvmField public val JPY: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [32:27] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'assertEquals' @ [33:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'expectedJPY' @ [33:22] ==> val expectedJPY: BigDecimal defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'amountJPY' @ [33:35] ==> val amountJPY: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [33:45] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [34:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'amountJPY' @ [34:22] ==> val amountJPY: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'Amount' @ [34:33] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'fromDecimal' @ [34:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any> fromDecimal(displayQuantity: BigDecimal, token: Currency, rounding: RoundingMode = ...): Amount<Currency> defined in net.corda.core.contracts.Amount.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'amountJPY' @ [34:52] ==> val amountJPY: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [34:62] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'amountJPY' @ [34:75] ==> val amountJPY: Amount<Currency> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'token' @ [34:85] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'TestAsset' @ [35:25] ==> public constructor TestAsset(name: String) defined in net.corda.core.contracts.AmountTests.TestAsset[ClassConstructorDescriptorImpl]

'Amount' @ [36:26] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: AmountTests.TestAsset) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> TestAsset

'quantity' @ [36:33] ==> val quantity: Long defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'testAsset' @ [36:43] ==> val testAsset: AmountTests.TestAsset defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'BigDecimal' @ [37:28] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'assertEquals' @ [38:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'expectedBond' @ [38:22] ==> val expectedBond: BigDecimal defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'amountBond' @ [38:36] ==> val amountBond: Amount<AmountTests.TestAsset> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [38:47] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [39:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<AmountTests.TestAsset>, actual: Amount<AmountTests.TestAsset>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<TestAsset>

'amountBond' @ [39:22] ==> val amountBond: Amount<AmountTests.TestAsset> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'Amount' @ [39:34] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'fromDecimal' @ [39:41] ==> @JvmStatic @JvmOverloads public final fun <T : Any> fromDecimal(displayQuantity: BigDecimal, token: AmountTests.TestAsset, rounding: RoundingMode = ...): Amount<AmountTests.TestAsset> defined in net.corda.core.contracts.Amount.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TestAsset

'amountBond' @ [39:53] ==> val amountBond: Amount<AmountTests.TestAsset> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'toDecimal' @ [39:64] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'amountBond' @ [39:77] ==> val amountBond: Amount<AmountTests.TestAsset> defined in net.corda.core.contracts.AmountTests.`decimal conversion`[LocalVariableDescriptor]

'token' @ [39:88] ==> public final val token: AmountTests.TestAsset defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'BigDecimal' @ [43:53] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'name' @ [44:43] ==> public final val name: String defined in net.corda.core.contracts.AmountTests.TestAsset[PropertyDescriptorImpl]

'Test' @ [47:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'..' @ [49:30] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Amount' @ [50:30] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'baseQuantity' @ [50:37] ==> val baseQuantity: Int defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'toLong' @ [50:50] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'GBP' @ [50:60] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'..' @ [51:36] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'baseAmount' @ [52:30] ==> val baseAmount: Amount<Currency> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'splitEvenly' @ [52:41] ==> public final fun splitEvenly(partitions: Int): List<Amount<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'partitionCount' @ [52:53] ==> val partitionCount: Int defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'assertEquals' @ [53:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'partitionCount' @ [53:30] ==> val partitionCount: Int defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'splits' @ [53:46] ==> val splits: List<Amount<Currency>> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'size' @ [53:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [54:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'baseAmount' @ [54:30] ==> val baseAmount: Amount<Currency> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'splits' @ [54:42] ==> val splits: List<Amount<Currency>> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'sumOrZero' @ [54:49] ==> @JvmStatic public final fun <T : Any> Iterable<Amount<Currency>>.sumOrZero(token: Currency): Amount<Currency> defined in net.corda.core.contracts.Amount.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> Currency

'baseAmount' @ [54:59] ==> val baseAmount: Amount<Currency> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'token' @ [54:70] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'splits' @ [55:27] ==> val splits: List<Amount<Currency>> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'min' @ [55:34] ==> public fun <T : Comparable<Amount<Currency>>> Iterable<Amount<Currency>>.min(): Amount<Currency>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Amount<Currency>

'splits' @ [56:27] ==> val splits: List<Amount<Currency>> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'max' @ [56:34] ==> public fun <T : Comparable<Amount<Currency>>> Iterable<Amount<Currency>>.max(): Amount<Currency>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Amount<Currency>

'assertTrue' @ [57:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'max' @ [57:28] ==> val max: Amount<Currency> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'quantity' @ [57:32] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'min' @ [57:43] ==> val min: Amount<Currency> defined in net.corda.core.contracts.AmountTests.split[LocalVariableDescriptor]

'quantity' @ [57:47] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Test' @ [62:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BigDecimal' @ [67:24] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'AmountTransfer' @ [68:25] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [68:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [68:52] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'GBP' @ [68:62] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [68:67] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'partyB' @ [68:75] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertEquals' @ [69:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal, actual: BigDecimal, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal

'baseSize' @ [69:22] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferA' @ [69:32] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'toDecimal' @ [69:42] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'AmountTransfer' @ [70:25] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [70:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [70:52] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'negate' @ [70:61] ==> public open fun negate(): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'GBP' @ [70:71] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyB' @ [70:76] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'partyA' @ [70:84] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertEquals' @ [71:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (BigDecimal..BigDecimal?), actual: (BigDecimal..BigDecimal?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.math.BigDecimal..java.math.BigDecimal?)

'baseSize' @ [71:22] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'negate' @ [71:31] ==> public open fun negate(): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'transferB' @ [71:41] ==> val transferB: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'toDecimal' @ [71:51] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'AmountTransfer' @ [72:25] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [72:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'BigDecimal' @ [72:52] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'GBP' @ [72:74] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [72:79] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'partyB' @ [72:87] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'AmountTransfer' @ [73:25] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [73:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [73:52] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'USD' @ [73:62] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [73:67] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'partyB' @ [73:75] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'AmountTransfer' @ [74:25] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [74:40] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [74:52] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'GBP' @ [74:62] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [74:67] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'partyC' @ [74:75] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertEquals' @ [75:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'transferA' @ [75:22] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferA' @ [75:33] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertEquals' @ [76:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'transferA' @ [76:22] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [76:32] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'transferA' @ [76:44] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [76:54] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [77:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'transferA' @ [77:22] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferB' @ [77:33] ==> val transferB: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertEquals' @ [78:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'transferA' @ [78:22] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [78:32] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'transferB' @ [78:44] ==> val transferB: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [78:54] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'assertNotEquals' @ [79:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'transferC' @ [79:25] ==> val transferC: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferA' @ [79:36] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertNotEquals' @ [80:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'transferC' @ [80:25] ==> val transferC: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [80:35] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'transferA' @ [80:47] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [80:57] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'assertNotEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'transferD' @ [81:25] ==> val transferD: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferA' @ [81:36] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertNotEquals' @ [82:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'transferD' @ [82:25] ==> val transferD: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [82:35] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'transferA' @ [82:47] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [82:57] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'assertNotEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'transferE' @ [83:25] ==> val transferE: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'transferA' @ [83:36] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'assertNotEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'transferE' @ [84:25] ==> val transferE: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [84:35] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'transferA' @ [84:47] ==> val transferA: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfers equality`[LocalVariableDescriptor]

'hashCode' @ [84:57] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BigDecimal' @ [92:24] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'AmountTransfer' @ [93:30] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [93:45] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [93:57] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'GBP' @ [93:67] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [93:72] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyB' @ [93:80] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [94:31] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [94:46] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [94:58] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negate' @ [94:67] ==> public open fun negate(): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'GBP' @ [94:77] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyB' @ [94:82] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyA' @ [94:90] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [95:34] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [95:49] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [95:61] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'multiply' @ [95:70] ==> public open fun multiply(p0: (BigDecimal..BigDecimal?)): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'BigDecimal' @ [95:79] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'GBP' @ [95:97] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [95:102] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyB' @ [95:110] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [96:38] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [96:53] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [96:65] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'USD' @ [96:75] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [96:80] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyB' @ [96:88] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [97:38] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [97:53] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [97:65] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'GBP' @ [97:75] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [97:80] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyC' @ [97:88] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [98:32] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [98:47] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'baseSize' @ [98:59] ==> val baseSize: BigDecimal defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negate' @ [98:68] ==> public open fun negate(): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'GBP' @ [98:78] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [98:83] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyB' @ [98:91] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'AmountTransfer' @ [99:28] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'zero' @ [99:43] ==> @JvmStatic public final fun <T : Any, P : Any> zero(token: Currency, source: String, destination: String): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'GBP' @ [99:48] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [99:53] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'partyB' @ [99:61] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'simpleTransfer' @ [100:27] ==> val simpleTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'flippedTransfer' @ [100:44] ==> val flippedTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'flippedTransfer' @ [101:27] ==> val flippedTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'simpleTransfer' @ [101:45] ==> val simpleTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertEquals' @ [102:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'doubleSizeTransfer' @ [102:22] ==> val doubleSizeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'sumFlipped1' @ [102:42] ==> val sumFlipped1: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertEquals' @ [103:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'doubleSizeTransfer' @ [103:22] ==> val doubleSizeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'sumFlipped2' @ [103:42] ==> val sumFlipped2: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertFailsWith' @ [104:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [104:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'simpleTransfer' @ [105:13] ==> val simpleTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'differentTokenTransfer' @ [105:30] ==> val differentTokenTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertFailsWith' @ [107:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [107:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'simpleTransfer' @ [108:13] ==> val simpleTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'differentPartyTransfer' @ [108:30] ==> val differentPartyTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'simpleTransfer' @ [110:26] ==> val simpleTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negativeTransfer' @ [110:43] ==> val negativeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertEquals' @ [111:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'zeroTransfer' @ [111:22] ==> val zeroTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'sumsToZero' @ [111:36] ==> val sumsToZero: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'flippedTransfer' @ [112:32] ==> val flippedTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negativeTransfer' @ [112:50] ==> val negativeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertEquals' @ [113:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'zeroTransfer' @ [113:22] ==> val zeroTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'sumFlippedToZero' @ [113:36] ==> val sumFlippedToZero: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'+' @ [114:32] ==> public final operator fun plus(other: AmountTransfer<Currency, String>): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'flippedTransfer' @ [114:33] ==> val flippedTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negativeTransfer' @ [114:51] ==> val negativeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'negativeTransfer' @ [114:71] ==> val negativeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'assertEquals' @ [115:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AmountTransfer<Currency, String>, actual: AmountTransfer<Currency, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AmountTransfer<Currency, String>

'negativeTransfer' @ [115:22] ==> val negativeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'sumUntilNegative' @ [115:40] ==> val sumUntilNegative: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer aggregation`[LocalVariableDescriptor]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [123:30] ==> public fun <T> listOf(vararg elements: SourceAndAmount<Currency, String>): List<SourceAndAmount<Currency, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceAndAmount<Currency, String>

'SourceAndAmount' @ [124:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyA' @ [124:33] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'DOLLARS' @ [124:41] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'SourceAndAmount' @ [125:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyB' @ [125:33] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'DOLLARS' @ [125:41] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'SourceAndAmount' @ [126:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyC' @ [126:33] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'DOLLARS' @ [126:41] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'SourceAndAmount' @ [127:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyB' @ [127:33] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'DOLLARS' @ [127:41] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'SourceAndAmount' @ [128:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyA' @ [128:33] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'POUNDS' @ [128:41] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'SourceAndAmount' @ [129:17] ==> public constructor SourceAndAmount<T : Any, out P : Any>(source: String, amount: Amount<Currency>, ref: Any? = ...) defined in net.corda.core.contracts.SourceAndAmount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <out P : Any> -> String

'partyB' @ [129:33] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'POUNDS' @ [129:41] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'toMap' @ [131:36] ==> public final fun <T : (Any..Any?), K : (Any..Any?), U : (Any..Any?)> toMap(p0: (((SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?)) -> (Pair<String, Currency>..Pair<String, Currency>?)..(((SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?)) -> (Pair<String, Currency>..Pair<String, Currency>?))?), p1: (((SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?)) -> (BigDecimal..BigDecimal?)..(((SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?)) -> (BigDecimal..BigDecimal?))?), p2: (((BigDecimal..BigDecimal?), (BigDecimal..BigDecimal?)) -> (BigDecimal..BigDecimal?)..(((BigDecimal..BigDecimal?), (BigDecimal..BigDecimal?)) -> (BigDecimal..BigDecimal?))?)): (Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?) defined in java.util.stream.Collectors[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SourceAndAmount<Currency, String>
    <K : (Any..Any?)> -> Pair<String, Currency>
    <U : (Any..Any?)> -> BigDecimal

'Pair' @ [131:115] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'it' @ [131:120] ==> value-parameter it: (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [131:123] ==> public final val source: String defined in net.corda.core.contracts.SourceAndAmount[DeserializedPropertyDescriptor]

'it' @ [131:131] ==> value-parameter it: (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [131:134] ==> public final val amount: Amount<Currency> defined in net.corda.core.contracts.SourceAndAmount[DeserializedPropertyDescriptor]

'token' @ [131:141] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'it' @ [131:153] ==> value-parameter it: (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [131:156] ==> public final val amount: Amount<Currency> defined in net.corda.core.contracts.SourceAndAmount[DeserializedPropertyDescriptor]

'toDecimal' @ [131:163] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'x' @ [131:188] ==> value-parameter x: (BigDecimal..BigDecimal?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [131:192] ==> value-parameter y: (BigDecimal..BigDecimal?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`.<anonymous>[ValueParameterDescriptorImpl]

'sourceAccounts' @ [132:30] ==> val sourceAccounts: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'stream' @ [132:45] ==> public open fun stream(): Stream<SourceAndAmount<Currency, String>> defined in kotlin.collections.List[JavaMethodDescriptor]

'collect' @ [132:54] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?)): (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.collections.MutableMap<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>..kotlin.collections.Map<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'collector' @ [132:62] ==> val collector: (Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'AmountTransfer' @ [134:29] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [134:44] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'BigDecimal' @ [134:56] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'USD' @ [134:74] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [134:79] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'partyB' @ [134:87] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'smallTransfer' @ [135:42] ==> val smallTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'apply' @ [135:56] ==> public final fun apply(balances: List<SourceAndAmount<Currency, String>>, newRef: Any? = ...): List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'sourceAccounts' @ [135:62] ==> val sourceAccounts: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'accountsAfterSmallTransfer' @ [136:25] ==> val accountsAfterSmallTransfer: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'stream' @ [136:52] ==> public open fun stream(): Stream<SourceAndAmount<Currency, String>> defined in kotlin.collections.List[JavaMethodDescriptor]

'collect' @ [136:61] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?)): (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.collections.MutableMap<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>..kotlin.collections.Map<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'collector' @ [136:69] ==> val collector: (Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'assertEquals' @ [137:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [137:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [137:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [137:42] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [137:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [137:60] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'newTotals' @ [137:81] ==> val newTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [137:91] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [137:96] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [137:104] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [138:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [138:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [138:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [138:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [138:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [138:60] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'newTotals' @ [138:81] ==> val newTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [138:91] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [138:96] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [138:104] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [139:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [139:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [139:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [139:42] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [139:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals' @ [139:57] ==> val newTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [139:67] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [139:72] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [139:80] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [140:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [140:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [140:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [140:42] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [140:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals' @ [140:57] ==> val newTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [140:67] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [140:72] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [140:80] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [141:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [141:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [141:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [141:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [141:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals' @ [141:57] ==> val newTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [141:67] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [141:72] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [141:80] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'AmountTransfer' @ [143:29] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [143:44] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'BigDecimal' @ [143:56] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'USD' @ [143:75] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyB' @ [143:80] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'partyC' @ [143:88] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'largeTransfer' @ [144:42] ==> val largeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'apply' @ [144:56] ==> public final fun apply(balances: List<SourceAndAmount<Currency, String>>, newRef: Any? = ...): List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'sourceAccounts' @ [144:62] ==> val sourceAccounts: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'accountsAfterLargeTransfer' @ [145:26] ==> val accountsAfterLargeTransfer: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'stream' @ [145:53] ==> public open fun stream(): Stream<SourceAndAmount<Currency, String>> defined in kotlin.collections.List[JavaMethodDescriptor]

'collect' @ [145:62] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?)): (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.collections.MutableMap<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>..kotlin.collections.Map<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'collector' @ [145:70] ==> val collector: (Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [146:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [146:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [146:42] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [146:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals2' @ [146:57] ==> val newTotals2: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [146:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [146:73] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [146:81] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [147:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [147:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [147:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [147:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [147:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [147:60] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'newTotals2' @ [147:82] ==> val newTotals2: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [147:93] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [147:98] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [147:106] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [148:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [148:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [148:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [148:42] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [148:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [148:60] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'newTotals2' @ [148:82] ==> val newTotals2: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [148:93] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [148:98] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [148:106] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [149:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [149:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [149:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [149:42] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [149:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals2' @ [149:57] ==> val newTotals2: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [149:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [149:73] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [149:81] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [150:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [150:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [150:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [150:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [150:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals2' @ [150:57] ==> val newTotals2: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [150:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [150:73] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [150:81] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'AmountTransfer' @ [152:32] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [152:47] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'BigDecimal' @ [152:59] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'USD' @ [152:78] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [152:83] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'partyB' @ [152:91] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'assertFailsWith' @ [153:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [153:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'tooLargeTransfer' @ [154:13] ==> val tooLargeTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'apply' @ [154:30] ==> public final fun apply(balances: List<SourceAndAmount<Currency, String>>, newRef: Any? = ...): List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'sourceAccounts' @ [154:36] ==> val sourceAccounts: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'AmountTransfer' @ [156:32] ==> public companion object defined in net.corda.core.contracts.AmountTransfer[FakeCallableDescriptorForObject]

'fromDecimal' @ [156:47] ==> @JvmStatic @JvmOverloads public final fun <T : Any, P : Any> fromDecimal(displayQuantityDelta: BigDecimal, token: Currency, source: String, destination: String, rounding: RoundingMode = ...): AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTransfer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency
    <P : Any> -> String

'BigDecimal' @ [156:59] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'USD' @ [156:78] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'partyA' @ [156:83] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'partyB' @ [156:91] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'emptyingTransfer' @ [157:45] ==> val emptyingTransfer: AmountTransfer<Currency, String> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'apply' @ [157:62] ==> public final fun apply(balances: List<SourceAndAmount<Currency, String>>, newRef: Any? = ...): List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTransfer[DeserializedSimpleFunctionDescriptor]

'sourceAccounts' @ [157:68] ==> val sourceAccounts: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'accountsAfterEmptyingTransfer' @ [158:26] ==> val accountsAfterEmptyingTransfer: List<SourceAndAmount<Currency, String>> defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'stream' @ [158:56] ==> public open fun stream(): Stream<SourceAndAmount<Currency, String>> defined in kotlin.collections.List[JavaMethodDescriptor]

'collect' @ [158:65] ==> public abstract fun <R : (Any..Any?), A : (Any..Any?)> collect(p0: (Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<in (SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), out (Any..Any?), (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?)): (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.collections.MutableMap<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>..kotlin.collections.Map<(kotlin.Pair<kotlin.String, java.util.Currency>..kotlin.Pair<kotlin.String, java.util.Currency>?), (java.math.BigDecimal..java.math.BigDecimal?)>)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'collector' @ [158:73] ==> val collector: (Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>..Collector<(SourceAndAmount<Currency, String>..SourceAndAmount<Currency, String>?), *, (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'assertEquals' @ [159:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'newTotals3' @ [159:28] ==> val newTotals3: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [159:39] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [159:44] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [159:52] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [160:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [160:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [160:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [160:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [160:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'BigDecimal' @ [160:60] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'newTotals3' @ [160:82] ==> val newTotals3: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [160:93] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [160:98] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [160:106] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [161:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [161:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [161:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [161:42] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [161:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals3' @ [161:57] ==> val newTotals3: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [161:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyC' @ [161:73] ==> val partyC: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'USD' @ [161:81] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [162:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [162:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [162:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [162:42] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [162:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals3' @ [162:57] ==> val newTotals3: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [162:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyA' @ [162:73] ==> val partyA: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [162:81] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BigDecimal?, actual: BigDecimal?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BigDecimal?

'originalTotals' @ [163:22] ==> val originalTotals: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [163:37] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [163:42] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [163:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'newTotals3' @ [163:57] ==> val newTotals3: (MutableMap<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>..Map<(Pair<String, Currency>..Pair<String, Currency>?), (BigDecimal..BigDecimal?)>?) defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'Pair' @ [163:68] ==> public constructor Pair<out A, out B>(first: String, second: Currency) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Currency

'partyB' @ [163:73] ==> val partyB: String defined in net.corda.core.contracts.AmountTests.`amount transfer apply`[LocalVariableDescriptor]

'GBP' @ [163:81] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

