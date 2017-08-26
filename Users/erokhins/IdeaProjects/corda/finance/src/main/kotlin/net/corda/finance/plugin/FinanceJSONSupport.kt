'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SimpleModule' @ [15:25] ==> public constructor SimpleModule(p0: (String..String?)) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaClassConstructorDescriptor]

'apply' @ [15:49] ==> @InlineOnly public inline fun <T> SimpleModule.apply(block: SimpleModule.() -> Unit): SimpleModule defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleModule

'addSerializer' @ [16:9] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (BusinessCalendar..BusinessCalendar?)>..Class<out (BusinessCalendar..BusinessCalendar?)>?), p1: (JsonSerializer<(BusinessCalendar..BusinessCalendar?)>..JsonSerializer<(BusinessCalendar..BusinessCalendar?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.finance.contracts.BusinessCalendar..net.corda.finance.contracts.BusinessCalendar?)

'BusinessCalendar' @ [16:23] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'java' @ [16:47] ==> public val <T> KClass<BusinessCalendar>.java: Class<BusinessCalendar> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BusinessCalendar

'CalendarSerializer' @ [16:53] ==> public object CalendarSerializer : JsonSerializer<BusinessCalendar> defined in net.corda.finance.plugin in file FinanceJSONSupport.kt[FakeCallableDescriptorForObject]

'addDeserializer' @ [17:9] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(BusinessCalendar..BusinessCalendar?)>..Class<(BusinessCalendar..BusinessCalendar?)>?), p1: (JsonDeserializer<out (BusinessCalendar..BusinessCalendar?)>..JsonDeserializer<out (BusinessCalendar..BusinessCalendar?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.finance.contracts.BusinessCalendar..net.corda.finance.contracts.BusinessCalendar?)

'BusinessCalendar' @ [17:25] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'java' @ [17:49] ==> public val <T> KClass<BusinessCalendar>.java: Class<BusinessCalendar> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BusinessCalendar

'CalendarDeserializer' @ [17:55] ==> public object CalendarDeserializer : JsonDeserializer<BusinessCalendar> defined in net.corda.finance.plugin in file FinanceJSONSupport.kt[FakeCallableDescriptorForObject]

'objectMapper' @ [19:5] ==> value-parameter objectMapper: ObjectMapper defined in net.corda.finance.plugin.registerFinanceJSONMappers[ValueParameterDescriptorImpl]

'registerModule' @ [19:18] ==> public open fun registerModule(p0: (Module..Module?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'financeModule' @ [19:33] ==> val financeModule: SimpleModule defined in net.corda.finance.plugin.registerFinanceJSONMappers[LocalVariableDescriptor]

'BusinessCalendar' @ [23:24] ==> public constructor BusinessCalendar(holidayDates: List<LocalDate>) defined in net.corda.finance.contracts.BusinessCalendar[ClassConstructorDescriptorImpl]

'holidayDates' @ [23:41] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.plugin.BusinessCalendarWrapper[PropertyDescriptorImpl]

'JsonSerializer<BusinessCalendar>' @ [26:29] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BusinessCalendar

'BusinessCalendar' @ [28:28] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'calendars' @ [28:45] ==> public final val calendars: List<String> defined in net.corda.finance.contracts.BusinessCalendar.Companion[PropertyDescriptorImpl]

'find' @ [28:55] ==> @InlineOnly public inline fun <T> Iterable<String>.find(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'BusinessCalendar' @ [28:62] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [28:79] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[SimpleFunctionDescriptorImpl]

'it' @ [28:91] ==> value-parameter it: String defined in net.corda.finance.plugin.CalendarSerializer.serialize.<anonymous>[ValueParameterDescriptorImpl]

'obj' @ [28:98] ==> value-parameter obj: BusinessCalendar defined in net.corda.finance.plugin.CalendarSerializer.serialize[ValueParameterDescriptorImpl]

'if (calendarName != null) {
            generator.writeString(calendarName)
        } else {
            generator.writeObject(BusinessCalendarWrapper(obj.holidayDates))
        }' @ [29:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'calendarName' @ [29:13] ==> val calendarName: String? defined in net.corda.finance.plugin.CalendarSerializer.serialize[LocalVariableDescriptor]

'generator' @ [30:13] ==> value-parameter generator: JsonGenerator defined in net.corda.finance.plugin.CalendarSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [30:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'calendarName' @ [30:35] ==> val calendarName: String? defined in net.corda.finance.plugin.CalendarSerializer.serialize[LocalVariableDescriptor]

'generator' @ [32:13] ==> value-parameter generator: JsonGenerator defined in net.corda.finance.plugin.CalendarSerializer.serialize[ValueParameterDescriptorImpl]

'writeObject' @ [32:23] ==> public abstract fun writeObject(p0: (Any..Any?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'BusinessCalendarWrapper' @ [32:35] ==> public constructor BusinessCalendarWrapper(holidayDates: List<LocalDate>) defined in net.corda.finance.plugin.BusinessCalendarWrapper[ClassConstructorDescriptorImpl]

'obj' @ [32:59] ==> value-parameter obj: BusinessCalendar defined in net.corda.finance.plugin.CalendarSerializer.serialize[ValueParameterDescriptorImpl]

'holidayDates' @ [32:63] ==> public final val holidayDates: List<LocalDate> defined in net.corda.finance.contracts.BusinessCalendar[PropertyDescriptorImpl]

'JsonDeserializer<BusinessCalendar>' @ [37:31] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BusinessCalendar

'instance' @ [41:53] ==> public final val instance: (StringArrayDeserializer..StringArrayDeserializer?) defined in com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer[JavaPropertyDescriptor]

'deserialize' @ [41:62] ==> public open fun deserialize(p0: (JsonParser..JsonParser?), p1: (DeserializationContext..DeserializationContext?)): (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer[JavaMethodDescriptor]

'parser' @ [41:74] ==> value-parameter parser: JsonParser defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[ValueParameterDescriptorImpl]

'context' @ [41:82] ==> value-parameter context: DeserializationContext defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[ValueParameterDescriptorImpl]

'BusinessCalendar' @ [42:17] ==> public companion object defined in net.corda.finance.contracts.BusinessCalendar[FakeCallableDescriptorForObject]

'getInstance' @ [42:34] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[SimpleFunctionDescriptorImpl]

'array' @ [42:47] ==> val array: (Array<(String..String?)>..Array<out (String..String?)>?) defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[LocalVariableDescriptor]

'parser' @ [44:17] ==> value-parameter parser: JsonParser defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[ValueParameterDescriptorImpl]

'readValueAs' @ [44:24] ==> public open fun <T : (Any..Any?)> readValueAs(p0: (Class<(BusinessCalendarWrapper..BusinessCalendarWrapper?)>..Class<(BusinessCalendarWrapper..BusinessCalendarWrapper?)>?)): (BusinessCalendarWrapper..BusinessCalendarWrapper?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.finance.plugin.BusinessCalendarWrapper..net.corda.finance.plugin.BusinessCalendarWrapper?)

'BusinessCalendarWrapper' @ [44:36] ==> public constructor BusinessCalendarWrapper(holidayDates: List<LocalDate>) defined in net.corda.finance.plugin.BusinessCalendarWrapper[ClassConstructorDescriptorImpl]

'java' @ [44:67] ==> public val <T> KClass<BusinessCalendarWrapper>.java: Class<BusinessCalendarWrapper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BusinessCalendarWrapper

'toCalendar' @ [44:73] ==> public final fun toCalendar(): BusinessCalendar defined in net.corda.finance.plugin.BusinessCalendarWrapper[SimpleFunctionDescriptorImpl]

'JsonParseException' @ [47:19] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [47:38] ==> value-parameter parser: JsonParser defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [47:69] ==> value-parameter parser: JsonParser defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [47:76] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e' @ [47:85] ==> val e: Exception /* = Exception */ defined in net.corda.finance.plugin.CalendarDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [47:87] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

