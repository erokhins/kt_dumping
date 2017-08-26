'CordaSerializable' @ [33:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [40:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'JsonDeserialize' @ [41:1] ==> public constructor JsonDeserialize(using: KClass<out raw (JsonDeserializer<(Any..Any?)>..JsonDeserializer<*>?)> = ..., contentUsing: KClass<out raw (JsonDeserializer<(Any..Any?)>..JsonDeserializer<*>?)> = ..., keyUsing: KClass<out (KeyDeserializer..KeyDeserializer?)> = ..., builder: KClass<*> = ..., converter: KClass<out raw (Converter<(Any..Any?), (Any..Any?)>..Converter<*, *>?)> = ..., contentConverter: KClass<out raw (Converter<(Any..Any?), (Any..Any?)>..Converter<*, *>?)> = ..., `as`: KClass<*> = ..., keyAs: KClass<*> = ..., contentAs: KClass<*> = ...) defined in com.fasterxml.jackson.databind.annotation.JsonDeserialize[JavaClassConstructorDescriptor]

'ExpressionDeserializer' @ [41:26] ==> public object ExpressionDeserializer : JsonDeserializer<Expression> defined in net.corda.finance.contracts in file FinanceTypes.kt[FakeCallableDescriptorForObject]

'JsonSerialize' @ [42:1] ==> public constructor JsonSerialize(using: KClass<out raw (JsonSerializer<(Any..Any?)>..JsonSerializer<*>?)> = ..., contentUsing: KClass<out raw (JsonSerializer<(Any..Any?)>..JsonSerializer<*>?)> = ..., keyUsing: KClass<out raw (JsonSerializer<(Any..Any?)>..JsonSerializer<*>?)> = ..., nullsUsing: KClass<out raw (JsonSerializer<(Any..Any?)>..JsonSerializer<*>?)> = ..., `as`: KClass<*> = ..., keyAs: KClass<*> = ..., contentAs: KClass<*> = ..., typing: JsonSerialize.Typing = ..., converter: KClass<out raw (Converter<(Any..Any?), (Any..Any?)>..Converter<*, *>?)> = ..., contentConverter: KClass<out raw (Converter<(Any..Any?), (Any..Any?)>..Converter<*, *>?)> = ..., include: JsonSerialize.Inclusion = ...) defined in com.fasterxml.jackson.databind.annotation.JsonSerialize[JavaClassConstructorDescriptor]

'ExpressionSerializer' @ [42:24] ==> public object ExpressionSerializer : JsonSerializer<Expression> defined in net.corda.finance.contracts in file FinanceTypes.kt[FakeCallableDescriptorForObject]

'JsonSerializer<Expression>' @ [45:31] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Expression

'generator' @ [47:9] ==> value-parameter generator: JsonGenerator defined in net.corda.finance.contracts.ExpressionSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [47:19] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'expr' @ [47:31] ==> value-parameter expr: Expression defined in net.corda.finance.contracts.ExpressionSerializer.serialize[ValueParameterDescriptorImpl]

'expr' @ [47:36] ==> public final val expr: String defined in net.corda.finance.contracts.Expression[PropertyDescriptorImpl]

'JsonDeserializer<Expression>' @ [51:33] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Expression

'Expression' @ [53:16] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[ClassConstructorDescriptorImpl]

'parser' @ [53:27] ==> value-parameter parser: JsonParser defined in net.corda.finance.contracts.ExpressionDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [53:34] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'CordaSerializable' @ [58:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'if (name == "ON") {
            // Overnight
            amount = 1
            unit = TimeUnit.Day
        } else {
            val regex = """(\d+)([DMYW])""".toRegex()
            val match = regex.matchEntire(name)?.groupValues ?: throw IllegalArgumentException("Unrecognised tenor name: $name")

            amount = match[1].toInt()
            unit = TimeUnit.values().first { it.code == match[2] }
        }' @ [64:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'name' @ [64:13] ==> public final val name: String defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'amount' @ [66:13] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'unit' @ [67:13] ==> private final val unit: Tenor.TimeUnit defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'Day' @ [67:29] ==> enum entry Day defined in net.corda.finance.contracts.Tenor.TimeUnit[FakeCallableDescriptorForObject]

'toRegex' @ [69:45] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'regex' @ [70:25] ==> val regex: Regex defined in net.corda.finance.contracts.Tenor.<init>[LocalVariableDescriptor]

'matchEntire' @ [70:31] ==> public final fun matchEntire(input: CharSequence): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'name' @ [70:43] ==> public final val name: String defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'groupValues' @ [70:50] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [70:71] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'name' @ [70:123] ==> public final val name: String defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'amount' @ [72:13] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'match' @ [72:22] ==> val match: List<String> defined in net.corda.finance.contracts.Tenor.<init>[LocalVariableDescriptor]

'toInt' @ [72:31] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'unit' @ [73:13] ==> private final val unit: Tenor.TimeUnit defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'values' @ [73:29] ==> public final fun values(): Array<Tenor.TimeUnit> defined in net.corda.finance.contracts.Tenor.TimeUnit[SimpleFunctionDescriptorImpl]

'first' @ [73:38] ==> public inline fun <T> Array<out Tenor.TimeUnit>.first(predicate: (Tenor.TimeUnit) -> Boolean): Tenor.TimeUnit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TimeUnit

'it' @ [73:46] ==> value-parameter it: Tenor.TimeUnit defined in net.corda.finance.contracts.Tenor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [73:49] ==> public final val code: String defined in net.corda.finance.contracts.Tenor.TimeUnit[PropertyDescriptorImpl]

'match' @ [73:57] ==> val match: List<String> defined in net.corda.finance.contracts.Tenor.<init>[LocalVariableDescriptor]

'when (unit) {
            TimeUnit.Day -> startDate.plusDays(amount.toLong())
            TimeUnit.Week -> startDate.plusWeeks(amount.toLong())
            TimeUnit.Month -> startDate.plusMonths(amount.toLong())
            TimeUnit.Year -> startDate.plusYears(amount.toLong())
        }' @ [78:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (LocalDate..LocalDate?), entry1: (LocalDate..LocalDate?), entry2: (LocalDate..LocalDate?), entry3: (LocalDate..LocalDate?)): (LocalDate..LocalDate?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.time.LocalDate..java.time.LocalDate?)

'unit' @ [78:34] ==> private final val unit: Tenor.TimeUnit defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'Day' @ [79:22] ==> enum entry Day defined in net.corda.finance.contracts.Tenor.TimeUnit[FakeCallableDescriptorForObject]

'startDate' @ [79:29] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'plusDays' @ [79:39] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'amount' @ [79:48] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'toLong' @ [79:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Week' @ [80:22] ==> enum entry Week defined in net.corda.finance.contracts.Tenor.TimeUnit[FakeCallableDescriptorForObject]

'startDate' @ [80:30] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'plusWeeks' @ [80:40] ==> public open fun plusWeeks(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'amount' @ [80:50] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'toLong' @ [80:57] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Month' @ [81:22] ==> enum entry Month defined in net.corda.finance.contracts.Tenor.TimeUnit[FakeCallableDescriptorForObject]

'startDate' @ [81:31] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'plusMonths' @ [81:41] ==> public open fun plusMonths(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'amount' @ [81:52] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'toLong' @ [81:59] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Year' @ [82:22] ==> enum entry Year defined in net.corda.finance.contracts.Tenor.TimeUnit[FakeCallableDescriptorForObject]

'startDate' @ [82:30] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'plusYears' @ [82:40] ==> public open fun plusYears(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'amount' @ [82:50] ==> private final val amount: Int defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'toLong' @ [82:57] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calendar' @ [85:36] ==> value-parameter calendar: BusinessCalendar defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'applyRollConvention' @ [85:45] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'maturityDate' @ [85:65] ==> val maturityDate: (LocalDate..LocalDate?) defined in net.corda.finance.contracts.Tenor.daysToMaturity[LocalVariableDescriptor]

'ModifiedFollowing' @ [85:98] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'calculateDaysBetween' @ [86:30] ==> public fun calculateDaysBetween(startDate: LocalDate, endDate: LocalDate, dcbYear: DayCountBasisYear, dcbDay: DayCountBasisDay): Int defined in net.corda.finance.contracts in file FinanceTypes.kt[SimpleFunctionDescriptorImpl]

'startDate' @ [86:51] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[ValueParameterDescriptorImpl]

'adjustedMaturityDate' @ [86:62] ==> val adjustedMaturityDate: LocalDate defined in net.corda.finance.contracts.Tenor.daysToMaturity[LocalVariableDescriptor]

'Y360' @ [86:102] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'DActual' @ [86:125] ==> enum entry DActual defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'daysToMaturity' @ [88:16] ==> val daysToMaturity: Int defined in net.corda.finance.contracts.Tenor.daysToMaturity[LocalVariableDescriptor]

'name' @ [91:39] ==> public final val name: String defined in net.corda.finance.contracts.Tenor[PropertyDescriptorImpl]

'CordaSerializable' @ [93:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'' @ [95:12] ==> private constructor TimeUnit(code: String) defined in net.corda.finance.contracts.Tenor.TimeUnit[ClassConstructorDescriptorImpl]

'' @ [95:23] ==> private constructor TimeUnit(code: String) defined in net.corda.finance.contracts.Tenor.TimeUnit[ClassConstructorDescriptorImpl]

'' @ [95:35] ==> private constructor TimeUnit(code: String) defined in net.corda.finance.contracts.Tenor.TimeUnit[ClassConstructorDescriptorImpl]

'' @ [95:46] ==> private constructor TimeUnit(code: String) defined in net.corda.finance.contracts.Tenor.TimeUnit[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [103:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [112:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'' @ [113:56] ==> private constructor DateRollDirection(value: Long) defined in net.corda.finance.contracts.DateRollDirection[ClassConstructorDescriptorImpl]

'' @ [113:69] ==> private constructor DateRollDirection(value: Long) defined in net.corda.finance.contracts.DateRollDirection[ClassConstructorDescriptorImpl]

'-' @ [113:70] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [120:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'' @ [125:11] ==> private constructor DateRollConvention(direction: () -> DateRollDirection, isModified: Boolean) defined in net.corda.finance.contracts.DateRollConvention[ClassConstructorDescriptorImpl]

'UnsupportedOperationException' @ [125:20] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'' @ [127:14] ==> private constructor DateRollConvention(direction: () -> DateRollDirection, isModified: Boolean) defined in net.corda.finance.contracts.DateRollConvention[ClassConstructorDescriptorImpl]

'FORWARD' @ [127:35] ==> enum entry FORWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'' @ [132:22] ==> private constructor DateRollConvention(direction: () -> DateRollDirection, isModified: Boolean) defined in net.corda.finance.contracts.DateRollConvention[ClassConstructorDescriptorImpl]

'FORWARD' @ [132:43] ==> enum entry FORWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'' @ [134:13] ==> private constructor DateRollConvention(direction: () -> DateRollDirection, isModified: Boolean) defined in net.corda.finance.contracts.DateRollConvention[ClassConstructorDescriptorImpl]

'BACKWARD' @ [134:34] ==> enum entry BACKWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'' @ [139:21] ==> private constructor DateRollConvention(direction: () -> DateRollDirection, isModified: Boolean) defined in net.corda.finance.contracts.DateRollConvention[ClassConstructorDescriptorImpl]

'BACKWARD' @ [139:42] ==> enum entry BACKWARD defined in net.corda.finance.contracts.DateRollDirection[FakeCallableDescriptorForObject]

'CordaSerializable' @ [148:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'super' @ [155:16] ==> <this> defined in net.corda.finance.contracts.DayCountBasisDay[LazyClassReceiverParameterDescriptor]

'toString' @ [155:22] ==> public open fun toString(): String defined in kotlin.Enum[DeserializedSimpleFunctionDescriptor]

'drop' @ [155:33] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [160:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'super' @ [167:16] ==> <this> defined in net.corda.finance.contracts.DayCountBasisYear[LazyClassReceiverParameterDescriptor]

'toString' @ [167:22] ==> public open fun toString(): String defined in kotlin.Enum[DeserializedSimpleFunctionDescriptor]

'drop' @ [167:33] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [172:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Suppress' @ [181:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [182:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'' @ [184:11] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusYears' @ [184:17] ==> public open fun plusYears(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [184:27] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [184:31] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.Annual.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [185:15] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusMonths' @ [185:21] ==> public open fun plusMonths(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [185:32] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [185:36] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.SemiAnnual.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [186:14] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusMonths' @ [186:20] ==> public open fun plusMonths(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [186:31] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [186:35] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.Quarterly.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [187:12] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusMonths' @ [187:19] ==> public open fun plusMonths(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [187:30] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [187:34] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.Monthly.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [188:11] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusWeeks' @ [188:18] ==> public open fun plusWeeks(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [188:28] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [188:32] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.Weekly.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [189:13] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusWeeks' @ [189:20] ==> public open fun plusWeeks(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [189:30] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [189:34] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.BiWeekly.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [190:10] ==> private constructor Frequency(annualCompoundCount: Int, offset: LocalDate.(Long) -> LocalDate) defined in net.corda.finance.contracts.Frequency[ClassConstructorDescriptorImpl]

'plusDays' @ [190:18] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'*' @ [190:27] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [190:31] ==> value-parameter it: Long defined in net.corda.finance.contracts.Frequency.Daily.<init>.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [194:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'accordingToCalendar' @ [195:78] ==> value-parameter accordingToCalendar: BusinessCalendar defined in net.corda.finance.contracts.isWorkingDay[ValueParameterDescriptorImpl]

'isWorkingDay' @ [195:98] ==> public open fun isWorkingDay(date: LocalDate): Boolean defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'this' @ [195:111] ==> <this> defined in net.corda.finance.contracts.isWorkingDay[ReceiverParameterDescriptorImpl]

'CordaSerializable' @ [204:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [206:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Exception' @ [207:43] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'name' @ [207:55] ==> value-parameter name: String defined in net.corda.finance.contracts.BusinessCalendar.UnknownCalendar.<init>[ValueParameterDescriptorImpl]

'listOf' @ [210:25] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'calendars' @ [212:34] ==> public final val calendars: List<String> defined in net.corda.finance.contracts.BusinessCalendar.Companion[PropertyDescriptorImpl]

'map' @ [212:44] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pair<String, String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, String>

'it' @ [213:13] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.TEST_CALENDAR_DATA.<anonymous>[ValueParameterDescriptorImpl]

'BusinessCalendar' @ [213:19] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'java' @ [213:43] ==> public val <T> KClass<BusinessCalendar>.java: Class<BusinessCalendar> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BusinessCalendar

'getResourceAsStream' @ [213:48] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [213:71] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.TEST_CALENDAR_DATA.<anonymous>[ValueParameterDescriptorImpl]

'bufferedReader' @ [213:96] ==> @InlineOnly public inline fun InputStream.bufferedReader(charset: Charset = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'readText' @ [213:113] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toMap' @ [214:11] ==> public fun <K, V> Iterable<Pair<String, String>>.toMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'parse' @ [217:68] ==> public open fun parse(p0: (CharSequence..CharSequence?), p1: (DateTimeFormatter..DateTimeFormatter?)): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'it' @ [217:74] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.parseDateFromString[ValueParameterDescriptorImpl]

'ISO_LOCAL_DATE' @ [217:96] ==> public final val ISO_LOCAL_DATE: (DateTimeFormatter..DateTimeFormatter?) defined in java.time.format.DateTimeFormatter[JavaPropertyDescriptor]

'BusinessCalendar' @ [220:51] ==> public constructor BusinessCalendar(holidayDates: List<LocalDate>) defined in net.corda.finance.contracts.BusinessCalendar[ClassConstructorDescriptorImpl]

'calname' @ [221:17] ==> value-parameter vararg calname: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.getInstance[ValueParameterDescriptorImpl]

'flatMap' @ [221:25] ==> public inline fun <T, R> Array<out String>.flatMap(transform: (String) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'TEST_CALENDAR_DATA' @ [221:36] ==> public final val TEST_CALENDAR_DATA: Map<String, String> defined in net.corda.finance.contracts.BusinessCalendar.Companion[PropertyDescriptorImpl]

'it' @ [221:55] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.getInstance.<anonymous>[ValueParameterDescriptorImpl]

'UnknownCalendar' @ [221:68] ==> public constructor UnknownCalendar(name: String) defined in net.corda.finance.contracts.BusinessCalendar.UnknownCalendar[ClassConstructorDescriptorImpl]

'it' @ [221:84] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.getInstance.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [221:89] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toSet' @ [222:25] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [223:25] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LocalDate): List<LocalDate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LocalDate

'parseDateFromString' @ [223:31] ==> public final fun parseDateFromString(it: String): LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion[SimpleFunctionDescriptorImpl]

'it' @ [223:51] ==> value-parameter it: String defined in net.corda.finance.contracts.BusinessCalendar.Companion.getInstance.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [224:25] ==> public fun <T> Iterable<LocalDate>.toList(): List<LocalDate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalDate

'sorted' @ [224:34] ==> public fun <T : Comparable<LocalDate>> Iterable<LocalDate>.sorted(): List<LocalDate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> LocalDate

'getInstance' @ [230:64] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[SimpleFunctionDescriptorImpl]

'Following' @ [231:95] ==> enum entry Following defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [232:72] ==> public const final val MAX_VALUE: Int defined in java.lang.Integer[JavaPropertyDescriptor]

'ArrayList' @ [235:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalDate

'startDate' @ [237:31] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'currentDate' @ [240:17] ==> var currentDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'getOffsetDate' @ [240:31] ==> public final fun getOffsetDate(startDate: LocalDate, period: Frequency, steps: Int = ...): LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion[SimpleFunctionDescriptorImpl]

'currentDate' @ [240:45] ==> var currentDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'period' @ [240:58] ==> value-parameter period: Frequency defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'periodOffset' @ [241:21] ==> value-parameter periodOffset: Int? = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'periodOffset' @ [241:45] ==> value-parameter periodOffset: Int? = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'ctr' @ [241:61] ==> var ctr: Int defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'ret' @ [242:21] ==> val ret: ArrayList<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'add' @ [242:25] ==> public open fun add(element: LocalDate): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'calendar' @ [242:29] ==> value-parameter calendar: BusinessCalendar = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'applyRollConvention' @ [242:38] ==> public open fun applyRollConvention(testDate: LocalDate, dateRollConvention: DateRollConvention): LocalDate defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'currentDate' @ [242:58] ==> var currentDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'dateRollConvention' @ [242:71] ==> value-parameter dateRollConvention: DateRollConvention = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'ctr' @ [243:17] ==> var ctr: Int defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'ctr' @ [245:22] ==> var ctr: Int defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'noOfAdditionalPeriods' @ [245:28] ==> value-parameter noOfAdditionalPeriods: Int = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'currentDate' @ [245:55] ==> var currentDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'endDate' @ [245:70] ==> value-parameter endDate: LocalDate? = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[ValueParameterDescriptorImpl]

'currentDate' @ [245:81] ==> var currentDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'ret' @ [248:20] ==> val ret: ArrayList<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar.Companion.createGenericSchedule[LocalVariableDescriptor]

'steps' @ [255:17] ==> value-parameter steps: Int = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.getOffsetDate[ValueParameterDescriptorImpl]

'startDate' @ [255:36] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.getOffsetDate[ValueParameterDescriptorImpl]

'period' @ [256:20] ==> value-parameter period: Frequency defined in net.corda.finance.contracts.BusinessCalendar.Companion.getOffsetDate[ValueParameterDescriptorImpl]

'invoke' @ [256:27] ==> public abstract operator fun invoke(p1: LocalDate, p2: Long): LocalDate defined in kotlin.Function2[FunctionInvokeDescriptor]

'startDate' @ [256:34] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.Companion.getOffsetDate[ValueParameterDescriptorImpl]

'steps' @ [256:45] ==> value-parameter steps: Int = ... defined in net.corda.finance.contracts.BusinessCalendar.Companion.getOffsetDate[ValueParameterDescriptorImpl]

'toLong' @ [256:51] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (other is BusinessCalendar) {
        /** Note this comparison is OK as we ensure they are sorted in getInstance() */
        this.holidayDates == other.holidayDates
    } else {
        false
    }' @ [260:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'other' @ [260:53] ==> value-parameter other: Any? defined in net.corda.finance.contracts.BusinessCalendar.equals[ValueParameterDescriptorImpl]

'this' @ [262:9] ==> <this> defined in net.corda.finance.contracts.BusinessCalendar[LazyClassReceiverParameterDescriptor]

'holidayDates' @ [262:14] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[PropertyDescriptorImpl]

'other' @ [262:30] ==> value-parameter other: Any? defined in net.corda.finance.contracts.BusinessCalendar.equals[ValueParameterDescriptorImpl]

'holidayDates' @ [262:36] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[PropertyDescriptorImpl]

'this' @ [268:16] ==> <this> defined in net.corda.finance.contracts.BusinessCalendar[LazyClassReceiverParameterDescriptor]

'holidayDates' @ [268:21] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[PropertyDescriptorImpl]

'hashCode' @ [268:34] ==> public open fun hashCode(): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'when {
                date.dayOfWeek == DayOfWeek.SATURDAY -> false
                date.dayOfWeek == DayOfWeek.SUNDAY -> false
                holidayDates.contains(date) -> false
                else -> true
            }' @ [272:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'date' @ [273:17] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.isWorkingDay[ValueParameterDescriptorImpl]

'dayOfWeek' @ [273:22] ==> public final val LocalDate.dayOfWeek: (DayOfWeek..DayOfWeek?)[MyPropertyDescriptor]

'SATURDAY' @ [273:45] ==> enum entry SATURDAY defined in java.time.DayOfWeek[FakeCallableDescriptorForObject]

'date' @ [274:17] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.isWorkingDay[ValueParameterDescriptorImpl]

'dayOfWeek' @ [274:22] ==> public final val LocalDate.dayOfWeek: (DayOfWeek..DayOfWeek?)[MyPropertyDescriptor]

'SUNDAY' @ [274:45] ==> enum entry SUNDAY defined in java.time.DayOfWeek[FakeCallableDescriptorForObject]

'holidayDates' @ [275:17] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[PropertyDescriptorImpl]

'contains' @ [275:30] ==> public abstract fun contains(element: LocalDate): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'date' @ [275:39] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.isWorkingDay[ValueParameterDescriptorImpl]

'dateRollConvention' @ [280:13] ==> value-parameter dateRollConvention: DateRollConvention defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'Actual' @ [280:54] ==> enum entry Actual defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'testDate' @ [280:69] ==> value-parameter testDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'dateRollConvention' @ [282:25] ==> value-parameter dateRollConvention: DateRollConvention defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'invoke' @ [282:44] ==> public abstract operator fun invoke(): DateRollDirection defined in kotlin.Function0[FunctionInvokeDescriptor]

'value' @ [282:56] ==> public final val value: Long defined in net.corda.finance.contracts.DateRollDirection[PropertyDescriptorImpl]

'testDate' @ [283:25] ==> value-parameter testDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'!' @ [284:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isWorkingDay' @ [284:17] ==> public open fun isWorkingDay(date: LocalDate): Boolean defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'trialDate' @ [284:30] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [285:13] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [285:25] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'plusDays' @ [285:35] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'direction' @ [285:44] ==> var direction: Long defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'dateRollConvention' @ [292:13] ==> value-parameter dateRollConvention: DateRollConvention defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'isModified' @ [292:32] ==> public final val isModified: Boolean defined in net.corda.finance.contracts.DateRollConvention[PropertyDescriptorImpl]

'testDate' @ [292:46] ==> value-parameter testDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'month' @ [292:55] ==> public final val LocalDate.month: (Month..Month?)[MyPropertyDescriptor]

'trialDate' @ [292:64] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'month' @ [292:74] ==> public final val LocalDate.month: (Month..Month?)[MyPropertyDescriptor]

'direction' @ [293:13] ==> var direction: Long defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'-' @ [293:25] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'direction' @ [293:26] ==> var direction: Long defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [294:13] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'testDate' @ [294:25] ==> value-parameter testDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[ValueParameterDescriptorImpl]

'!' @ [295:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isWorkingDay' @ [295:21] ==> public open fun isWorkingDay(date: LocalDate): Boolean defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'trialDate' @ [295:34] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [296:17] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [296:29] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'plusDays' @ [296:39] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'direction' @ [296:48] ==> var direction: Long defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'trialDate' @ [299:16] ==> var trialDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.applyRollConvention[LocalVariableDescriptor]

'require' @ [307:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'i' @ [307:17] ==> value-parameter i: Int defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'i' @ [308:13] ==> value-parameter i: Int defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'date' @ [308:28] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'date' @ [309:23] ==> value-parameter date: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'ctr' @ [311:16] ==> var ctr: Int defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'i' @ [311:22] ==> value-parameter i: Int defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'retDate' @ [312:13] ==> var retDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'retDate' @ [312:23] ==> var retDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'plusDays' @ [312:31] ==> public open fun plusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'direction' @ [312:40] ==> value-parameter direction: DateRollDirection defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[ValueParameterDescriptorImpl]

'value' @ [312:50] ==> public final val value: Long defined in net.corda.finance.contracts.DateRollDirection[PropertyDescriptorImpl]

'isWorkingDay' @ [313:17] ==> public open fun isWorkingDay(date: LocalDate): Boolean defined in net.corda.finance.contracts.BusinessCalendar[SimpleFunctionDescriptorImpl]

'retDate' @ [313:30] ==> var retDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'ctr' @ [313:40] ==> var ctr: Int defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'retDate' @ [315:16] ==> var retDate: LocalDate defined in net.corda.finance.contracts.BusinessCalendar.moveBusinessDays[LocalVariableDescriptor]

'when {
        dcbDay == DayCountBasisDay.DActual -> (endDate.toEpochDay() - startDate.toEpochDay()).toInt()
        dcbDay == DayCountBasisDay.D30 && dcbYear == DayCountBasisYear.Y360 -> ((endDate.year - startDate.year) * 360.0 + (endDate.monthValue - startDate.monthValue) * 30.0 + endDate.dayOfMonth - startDate.dayOfMonth).toInt()
        else -> TODO("Can't calculate days using convention $dcbDay / $dcbYear")
    }' @ [325:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'dcbDay' @ [326:9] ==> value-parameter dcbDay: DayCountBasisDay defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'DActual' @ [326:36] ==> enum entry DActual defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'endDate' @ [326:48] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'toEpochDay' @ [326:56] ==> public open fun toEpochDay(): Long defined in java.time.LocalDate[JavaMethodDescriptor]

'startDate' @ [326:71] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'toEpochDay' @ [326:81] ==> public open fun toEpochDay(): Long defined in java.time.LocalDate[JavaMethodDescriptor]

'toInt' @ [326:95] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'dcbDay' @ [327:9] ==> value-parameter dcbDay: DayCountBasisDay defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'D30' @ [327:36] ==> enum entry D30 defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'dcbYear' @ [327:43] ==> value-parameter dcbYear: DayCountBasisYear defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'Y360' @ [327:72] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'*' @ [327:81] ==> public final operator fun times(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'endDate' @ [327:82] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'year' @ [327:90] ==> public final val LocalDate.year: Int[MyPropertyDescriptor]

'startDate' @ [327:97] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'year' @ [327:107] ==> public final val LocalDate.year: Int[MyPropertyDescriptor]

'*' @ [327:123] ==> public final operator fun times(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'endDate' @ [327:124] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'monthValue' @ [327:132] ==> public final val LocalDate.monthValue: Int[MyPropertyDescriptor]

'startDate' @ [327:145] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'monthValue' @ [327:155] ==> public final val LocalDate.monthValue: Int[MyPropertyDescriptor]

'endDate' @ [327:176] ==> value-parameter endDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'dayOfMonth' @ [327:184] ==> public final val LocalDate.dayOfMonth: Int[MyPropertyDescriptor]

'startDate' @ [327:197] ==> value-parameter startDate: LocalDate defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'dayOfMonth' @ [327:207] ==> public final val LocalDate.dayOfMonth: Int[MyPropertyDescriptor]

'toInt' @ [327:219] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'TODO' @ [328:17] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dcbDay' @ [328:62] ==> value-parameter dcbDay: DayCountBasisDay defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'dcbYear' @ [328:72] ==> value-parameter dcbYear: DayCountBasisYear defined in net.corda.finance.contracts.calculateDaysBetween[ValueParameterDescriptorImpl]

'CordaSerializable' @ [342:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [370:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'ONE' @ [375:28] ==> public final val ONE: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'scaleByPowerOfTen' @ [375:32] ==> public open fun scaleByPowerOfTen(p0: Int): (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaMethodDescriptor]

'-' @ [375:50] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'defaultFractionDigits' @ [375:51] ==> public final val defaultFractionDigits: Int defined in net.corda.finance.contracts.Commodity[PropertyDescriptorImpl]

'mapOf' @ [378:32] ==> public fun <K, V> mapOf(pair: Pair<String, Commodity>): Map<String, Commodity> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Commodity

'Pair' @ [380:17] ==> public constructor Pair<out A, out B>(first: String, second: Commodity) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Commodity

'Commodity' @ [380:30] ==> public constructor Commodity(commodityCode: String, displayName: String, defaultFractionDigits: Int = ...) defined in net.corda.finance.contracts.Commodity[ClassConstructorDescriptorImpl]

'registry' @ [384:19] ==> private final val registry: Map<String, Commodity> defined in net.corda.finance.contracts.Commodity.Companion[PropertyDescriptorImpl]

'commodityCode' @ [384:28] ==> value-parameter commodityCode: String defined in net.corda.finance.contracts.Commodity.Companion.getInstance[ValueParameterDescriptorImpl]

