'Test' @ [12:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'split' @ [14:99] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'exampleTenors' @ [15:9] ==> val exampleTenors: List<String> defined in net.corda.finance.contracts.FinanceTypesTest.`valid tenor tests`[LocalVariableDescriptor]

'all' @ [15:23] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Tenor' @ [15:29] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'it' @ [15:35] ==> value-parameter it: String defined in net.corda.finance.contracts.FinanceTypesTest.`valid tenor tests`.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [15:39] ==> public final val name: String defined in net.corda.finance.contracts.Tenor[DeserializedPropertyDescriptor]

'isNotEmpty' @ [15:44] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [18:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'split' @ [20:50] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'exampleTenors' @ [21:19] ==> val exampleTenors: List<String> defined in net.corda.finance.contracts.FinanceTypesTest.`invalid tenor tests`[LocalVariableDescriptor]

'assertFailsWith' @ [22:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'Tenor' @ [22:67] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

't' @ [22:73] ==> val t: String defined in net.corda.finance.contracts.FinanceTypesTest.`invalid tenor tests`[LocalVariableDescriptor]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Tenor' @ [28:21] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'BusinessCalendar' @ [29:24] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [29:41] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'of' @ [30:36] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'currentDay' @ [31:28] ==> val currentDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'plusMonths' @ [31:39] ==> public open fun plusMonths(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'plusDays' @ [31:53] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'maturityDate' @ [32:39] ==> val maturityDate: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'toEpochDay' @ [32:52] ==> public open fun toEpochDay(): Long defined in java.time.LocalDate[JavaMethodDescriptor]

'currentDay' @ [32:67] ==> val currentDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'toEpochDay' @ [32:78] ==> public open fun toEpochDay(): Long defined in java.time.LocalDate[JavaMethodDescriptor]

'toInt' @ [32:92] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'tenor' @ [34:36] ==> val tenor: Tenor defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'daysToMaturity' @ [34:42] ==> public final fun daysToMaturity(startDate: LocalDate, calendar: BusinessCalendar): Int defined in net.corda.finance.contracts.Tenor[DeserializedSimpleFunctionDescriptor]

'currentDay' @ [34:57] ==> val currentDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'calendar' @ [34:69] ==> val calendar: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'assertEquals' @ [36:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'actualDaysToMaturity' @ [36:22] ==> val actualDaysToMaturity: Int defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'expectedDaysToMaturity' @ [36:44] ==> val expectedDaysToMaturity: Int defined in net.corda.finance.contracts.FinanceTypesTest.`tenor days to maturity adjusted for holiday`[LocalVariableDescriptor]

'Test' @ [39:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [41:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'createGenericSchedule' @ [41:36] ==> public final fun createGenericSchedule(startDate: LocalDate, period: Frequency, calendar: BusinessCalendar = ..., dateRollConvention: DateRollConvention = ..., noOfAdditionalPeriods: Int = ..., endDate: LocalDate? = ..., periodOffset: Int? = ...): List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'of' @ [41:80] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'Monthly' @ [41:117] ==> enum entry Monthly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'assertFalse' @ [43:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [43:21] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'of' @ [43:31] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ret' @ [43:50] ==> val ret: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`schedule generator 1`[LocalVariableDescriptor]

'println' @ [44:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'ret' @ [44:17] ==> val ret: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`schedule generator 1`[LocalVariableDescriptor]

'Test' @ [47:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [49:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'createGenericSchedule' @ [49:36] ==> public final fun createGenericSchedule(startDate: LocalDate, period: Frequency, calendar: BusinessCalendar = ..., dateRollConvention: DateRollConvention = ..., noOfAdditionalPeriods: Int = ..., endDate: LocalDate? = ..., periodOffset: Int? = ...): List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'of' @ [49:80] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'Monthly' @ [49:117] ==> enum entry Monthly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'BusinessCalendar' @ [49:164] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [49:181] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Following' @ [49:244] ==> enum entry Following defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertFalse' @ [51:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [51:21] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'of' @ [51:31] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ret' @ [51:51] ==> val ret: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`schedule generator 2`[LocalVariableDescriptor]

'println' @ [52:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'ret' @ [52:17] ==> val ret: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`schedule generator 2`[LocalVariableDescriptor]

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [58:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [58:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'cal' @ [59:24] ==> val cal: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`create a UK calendar`[LocalVariableDescriptor]

'holidayDates' @ [59:28] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[DeserializedPropertyDescriptor]

'println' @ [60:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'holdates' @ [60:17] ==> val holdates: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`create a UK calendar`[LocalVariableDescriptor]

'assertTrue' @ [61:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [61:20] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'of' @ [61:30] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'holdates' @ [61:50] ==> val holdates: List<LocalDate> defined in net.corda.finance.contracts.FinanceTypesTest.`create a UK calendar`[LocalVariableDescriptor]

'Test' @ [64:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [66:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [66:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [67:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [67:20] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'of' @ [67:30] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'cal' @ [67:48] ==> val cal: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`create a US UK calendar`[LocalVariableDescriptor]

'holidayDates' @ [67:52] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[DeserializedPropertyDescriptor]

'assertTrue' @ [68:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [68:20] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'of' @ [68:30] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'cal' @ [68:49] ==> val cal: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`create a US UK calendar`[LocalVariableDescriptor]

'holidayDates' @ [68:53] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[DeserializedPropertyDescriptor]

'println' @ [69:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [72:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [74:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [74:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'ldn' @ [75:22] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified following`[LocalVariableDescriptor]

'applyRollConvention' @ [75:26] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'of' @ [75:56] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ModifiedFollowing' @ [75:93] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertEquals' @ [76:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [76:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'result' @ [76:50] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified following`[LocalVariableDescriptor]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [81:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [81:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'ldn' @ [82:22] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified following pt 2`[LocalVariableDescriptor]

'applyRollConvention' @ [82:26] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'of' @ [82:56] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ModifiedFollowing' @ [82:93] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [83:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'result' @ [83:50] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified following pt 2`[LocalVariableDescriptor]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [89:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [89:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'ldn' @ [90:22] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified previous`[LocalVariableDescriptor]

'applyRollConvention' @ [90:26] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'of' @ [90:56] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ModifiedPrevious' @ [90:91] ==> enum entry ModifiedPrevious defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertEquals' @ [91:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [91:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'result' @ [91:48] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of modified previous`[LocalVariableDescriptor]

'Test' @ [94:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [96:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [96:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'ldn' @ [97:22] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of previous`[LocalVariableDescriptor]

'applyRollConvention' @ [97:26] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'of' @ [97:56] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'Previous' @ [97:93] ==> enum entry Previous defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertEquals' @ [98:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [98:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'result' @ [98:50] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of previous`[LocalVariableDescriptor]

'Test' @ [101:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [103:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [103:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'ldn' @ [104:22] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of following`[LocalVariableDescriptor]

'applyRollConvention' @ [104:26] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'of' @ [104:56] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'Following' @ [104:93] ==> enum entry Following defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'assertEquals' @ [105:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [105:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'result' @ [105:50] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar test of following`[LocalVariableDescriptor]

'Test' @ [108:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [110:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [110:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'of' @ [111:34] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'mapOf' @ [112:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<Int, (LocalDate..LocalDate?)>): Map<Int, (LocalDate..LocalDate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'to' @ [112:30] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'firstDay' @ [112:35] ==> val firstDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'to' @ [113:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [113:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [114:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [114:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [115:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [115:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [116:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [116:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [117:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [117:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [118:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [118:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [119:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [119:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'component1' @ [122:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, (LocalDate..LocalDate?)>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'component2' @ [122:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, (LocalDate..LocalDate?)>.component2(): (LocalDate..LocalDate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'expected' @ [122:28] ==> val expected: Map<Int, (LocalDate..LocalDate?)> defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'ldn' @ [123:26] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'moveBusinessDays' @ [123:30] ==> public final fun moveBusinessDays(date: LocalDate, direction: DateRollDirection, i: Int): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'firstDay' @ [123:47] ==> val firstDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'FORWARD' @ [123:75] ==> enum entry FORWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'inc' @ [123:84] ==> val inc: Int defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'assertEquals' @ [124:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'exp' @ [124:26] ==> val exp: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'result' @ [124:31] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date advancing`[LocalVariableDescriptor]

'Test' @ [128:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'BusinessCalendar' @ [130:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [130:36] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'of' @ [131:34] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'mapOf' @ [132:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<Int, (LocalDate..LocalDate?)>): Map<Int, (LocalDate..LocalDate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'to' @ [132:30] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'firstDay' @ [132:35] ==> val firstDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'to' @ [133:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [133:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [134:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [134:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [135:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [135:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [136:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [136:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [137:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [137:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [138:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [138:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [139:17] ==> public infix fun <A, B> Int.to(that: (LocalDate..LocalDate?)): Pair<Int, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'of' @ [139:32] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'component1' @ [142:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, (LocalDate..LocalDate?)>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'component2' @ [142:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, (LocalDate..LocalDate?)>.component2(): (LocalDate..LocalDate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'expected' @ [142:28] ==> val expected: Map<Int, (LocalDate..LocalDate?)> defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'ldn' @ [143:26] ==> val ldn: BusinessCalendar defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'moveBusinessDays' @ [143:30] ==> public final fun moveBusinessDays(date: LocalDate, direction: DateRollDirection, i: Int): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[DeserializedSimpleFunctionDescriptor]

'firstDay' @ [143:47] ==> val firstDay: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'BACKWARD' @ [143:75] ==> enum entry BACKWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'inc' @ [143:85] ==> val inc: Int defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'assertEquals' @ [144:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (LocalDate..LocalDate?), actual: (LocalDate..LocalDate?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.time.LocalDate..java.time.LocalDate?)

'exp' @ [144:26] ==> val exp: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

'result' @ [144:31] ==> val result: LocalDate defined in net.corda.finance.contracts.FinanceTypesTest.`calendar date preceeding`[LocalVariableDescriptor]

