'IdentityHashMap' @ [43:15] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any
    <V : (Any..Any?)> -> Int

'ids' @ [44:41] ==> public final val ids: IdentityHashMap<Any, Int> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'getOrPut' @ [44:45] ==> public inline fun <K, V> MutableMap<(Any..Any?), (Int..Int?)>.getOrPut(key: (Any..Any?), defaultValue: () -> (Int..Int?)): (Int..Int?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.Any..kotlin.Any?)
    <V> -> (kotlin.Int..kotlin.Int?)

'o' @ [44:54] ==> value-parameter o: Any defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.objectId[ValueParameterDescriptorImpl]

'ids' @ [44:59] ==> public final val ids: IdentityHashMap<Any, Int> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'size' @ [44:63] ==> public open val size: Int defined in java.util.IdentityHashMap[JavaPropertyDescriptor]

'ArrayList' @ [51:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Record

'records' @ [55:9] ==> private final val records: ArrayList<LazyOperationsLog.Record> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'add' @ [55:17] ==> public open fun add(element: LazyOperationsLog.Record): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Record' @ [55:21] ==> public constructor Record(lambda: Any, data: LoggingStorageManager.CallData) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.Record[ClassConstructorDescriptorImpl]

'lambda' @ [55:28] ==> value-parameter lambda: Any defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.addRecordFunction.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [55:36] ==> value-parameter data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.addRecordFunction.<anonymous>[ValueParameterDescriptorImpl]

'records' @ [59:30] ==> private final val records: ArrayList<LazyOperationsLog.Record> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'groupByTo' @ [59:38] ==> public inline fun <T, K, M : MutableMap<in Any?, MutableList<LazyOperationsLog.Record>>> Iterable<LazyOperationsLog.Record>.groupByTo(destination: IdentityHashMap<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>, keySelector: (LazyOperationsLog.Record) -> Any?): IdentityHashMap<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Record
    <K> -> Any?
    <M : MutableMap<in K, MutableList<T>>> -> IdentityHashMap<Any?, (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)>

'IdentityHashMap' @ [59:48] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)

'it' @ [60:13] ==> value-parameter it: LazyOperationsLog.Record defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [60:16] ==> public final val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.Record[PropertyDescriptorImpl]

'fieldOwner' @ [60:21] ==> public final val fieldOwner: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'map' @ [61:11] ==> public inline fun <K, V, R> Map<out Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>.map(transform: (Map.Entry<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>) -> Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>): List<Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)
    <R> -> Pair<Any?, (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)>

'Pair' @ [61:17] ==> public constructor Pair<out A, out B>(first: Any?, second: (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Any?
    <out B> -> (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)

'it' @ [61:22] ==> value-parameter it: Map.Entry<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [61:25] ==> public abstract val key: Any? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [61:30] ==> value-parameter it: Map.Entry<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [61:33] ==> public abstract val value: (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'groupedByOwner' @ [63:16] ==> val groupedByOwner: List<Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText[LocalVariableDescriptor]

'map' @ [63:31] ==> public inline fun <T, R> Iterable<Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>>.map(transform: (Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Any?, (kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>..kotlin.collections.MutableList<org.jetbrains.kotlin.checkers.LazyOperationsLog.Record>?)>
    <R> -> String

'component1' @ [64:18] ==> public final operator fun component1(): Any? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [64:25] ==> public final operator fun component2(): (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [64:36] ==> value-parameter it: Pair<Any?, (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?)> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[ValueParameterDescriptorImpl]

'renderOwner' @ [65:13] ==> private final fun renderOwner(owner: Any?, records: List<LazyOperationsLog.Record>): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'owner' @ [65:25] ==> val owner: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[LocalVariableDescriptor]

'records' @ [65:32] ==> val records: (MutableList<LazyOperationsLog.Record>..MutableList<LazyOperationsLog.Record>?) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.getText.<anonymous>[LocalVariableDescriptor]

'sortedBy' @ [66:11] ==> public inline fun <T, R : Comparable<String>> Iterable<String>.sortedBy(crossinline selector: (String) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> String

'stringSanitizer' @ [66:20] ==> public final val stringSanitizer: (String) -> String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'joinToString' @ [66:37] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'renumberObjects' @ [66:56] ==> private final fun String.renumberObjects(): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'HashMap' @ [76:19] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> String

'ids' @ [78:20] ==> val ids: HashMap<String, String> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'getOrPut' @ [78:24] ==> public inline fun <K, V> MutableMap<String, String>.getOrPut(key: String, defaultValue: () -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'objectId' @ [78:33] ==> value-parameter objectId: String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects.newId[ValueParameterDescriptorImpl]

'+' @ [78:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ids' @ [78:51] ==> val ids: HashMap<String, String> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'size' @ [78:55] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'compile' @ [81:25] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'matcher' @ [81:42] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'this' @ [81:50] ==> <this> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[ReceiverParameterDescriptorImpl]

'StringBuffer' @ [82:18] ==> public constructor StringBuffer() defined in java.lang.StringBuffer[JavaClassConstructorDescriptor]

'm' @ [83:16] ==> val m: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'find' @ [83:18] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'm' @ [84:13] ==> val m: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'appendReplacement' @ [84:15] ==> public open fun appendReplacement(p0: (StringBuffer..StringBuffer?), p1: (String..String?)): (Matcher..Matcher?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'sb' @ [84:33] ==> val sb: StringBuffer defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'newId' @ [84:37] ==> local final fun newId(objectId: String): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[SimpleFunctionDescriptorImpl]

'm' @ [84:43] ==> val m: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'group' @ [84:45] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'm' @ [86:9] ==> val m: (Matcher..Matcher?) defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'appendTail' @ [86:11] ==> public open fun appendTail(p0: (StringBuffer..StringBuffer?)): (StringBuffer..StringBuffer?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'sb' @ [86:22] ==> val sb: StringBuffer defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'sb' @ [87:16] ==> val sb: StringBuffer defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renumberObjects[LocalVariableDescriptor]

'toString' @ [87:19] ==> public open fun toString(): String defined in java.lang.StringBuffer[JavaMethodDescriptor]

'StringBuilder' @ [91:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'with' @ [92:9] ==> @InlineOnly public inline fun <T, R> with(receiver: Printer, block: Printer.() -> Printer): Printer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Printer
    <R> -> Printer

'Printer' @ [92:15] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'sb' @ [92:23] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner[LocalVariableDescriptor]

'println' @ [93:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'render' @ [93:21] ==> private final fun render(o: Any?): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'owner' @ [93:28] ==> value-parameter owner: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner[ValueParameterDescriptorImpl]

'indent' @ [94:13] ==> private fun Printer.indent(body: Printer.() -> Unit): Printer defined in org.jetbrains.kotlin.checkers in file LazyOperationsLog.kt[SimpleFunctionDescriptorImpl]

'records' @ [95:17] ==> value-parameter records: List<LazyOperationsLog.Record> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner[ValueParameterDescriptorImpl]

'map' @ [95:25] ==> public inline fun <T, R> Iterable<LazyOperationsLog.Record>.map(transform: (LazyOperationsLog.Record) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Record
    <R> -> String

'renderRecord' @ [95:31] ==> private final fun renderRecord(record: LazyOperationsLog.Record): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'it' @ [95:44] ==> value-parameter it: LazyOperationsLog.Record defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sortedBy' @ [95:50] ==> public inline fun <T, R : Comparable<String>> Iterable<String>.sortedBy(crossinline selector: (String) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> String

'stringSanitizer' @ [95:59] ==> public final val stringSanitizer: (String) -> String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[PropertyDescriptorImpl]

'forEach' @ [95:76] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'println' @ [96:21] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'it' @ [96:29] ==> value-parameter it: String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [99:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'sb' @ [101:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderOwner[LocalVariableDescriptor]

'toString' @ [101:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'record' @ [105:20] ==> value-parameter record: LazyOperationsLog.Record defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[ValueParameterDescriptorImpl]

'data' @ [105:27] ==> public final val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.Record[PropertyDescriptorImpl]

'StringBuilder' @ [106:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [108:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'append' @ [108:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'data' @ [108:19] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'field' @ [108:24] ==> public final val field: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'name' @ [108:31] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'data' @ [108:45] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'lambdaCreatedIn' @ [108:50] ==> public final val lambdaCreatedIn: GenericDeclaration? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'getDeclarationName' @ [108:66] ==> private fun GenericDeclaration?.getDeclarationName(): String? defined in org.jetbrains.kotlin.checkers in file LazyOperationsLog.kt[SimpleFunctionDescriptorImpl]

'!' @ [110:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [110:14] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'arguments' @ [110:19] ==> public final val arguments: List<Any?> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'isEmpty' @ [110:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'data' @ [111:13] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'arguments' @ [111:18] ==> public final val arguments: List<Any?> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'joinTo' @ [111:28] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<Any?>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Any?) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <A : Appendable /* = Appendable */> -> StringBuilder

'sb' @ [111:35] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'render' @ [111:57] ==> private final fun render(o: Any?): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'it' @ [111:64] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord.<anonymous>[ValueParameterDescriptorImpl]

'sb' @ [114:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'append' @ [114:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'render' @ [114:25] ==> private final fun render(o: Any?): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'data' @ [114:32] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'result' @ [114:37] ==> public final val result: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'data' @ [116:13] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'fieldOwner' @ [116:18] ==> public final val fieldOwner: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'sb' @ [117:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'append' @ [117:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'render' @ [117:38] ==> private final fun render(o: Any?): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'data' @ [117:45] ==> val data: LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'fieldOwner' @ [117:50] ==> public final val fieldOwner: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[PropertyDescriptorImpl]

'sb' @ [120:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.renderRecord[LocalVariableDescriptor]

'toString' @ [120:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'o' @ [124:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'StringBuilder' @ [126:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'o' @ [127:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [127:28] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [127:41] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [127:56] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [127:71] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'sb' @ [128:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'append' @ [128:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'o' @ [128:26] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'objectId' @ [131:18] ==> private final fun objectId(o: Any): Int defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'o' @ [131:27] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [133:22] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'java' @ [133:31] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'sb' @ [134:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'append' @ [134:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (aClass.isAnonymousClass) aClass.name.substringAfterLast('.') else aClass.simpleName' @ [134:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'aClass' @ [134:23] ==> val aClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'isAnonymousClass' @ [134:30] ==> public final val <T : (Any..Any?)> Class<out Any>.isAnonymousClass: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'aClass' @ [134:48] ==> val aClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'name' @ [134:55] ==> public final val <T : (Any..Any?)> Class<out Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'substringAfterLast' @ [134:60] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'aClass' @ [134:89] ==> val aClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'simpleName' @ [134:96] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'append' @ [134:108] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'id' @ [134:118] ==> val id: Int defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'sb' @ [137:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'append' @ [137:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [137:29] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [137:36] ==> <this> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render.appendQuoted[ReceiverParameterDescriptorImpl]

'append' @ [137:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when {
            o is Named -> o.name.appendQuoted()
            o::class.java.simpleName == "LazyJavaClassifierType" -> {
                val javaType = o.field<JavaTypeImpl<*>>("javaType")
                javaType.psi.presentableText.appendQuoted()
            }
            o::class.java.simpleName == "LazyJavaClassTypeConstructor" -> {
                val javaClass = o.field<Any>("this\$0").field<JavaClassImpl>("jClass")
                javaClass.psi.name!!.appendQuoted()
            }
            o::class.java.simpleName == "DeserializedType" -> {
                val typeDeserializer = o.field<TypeDeserializer>("typeDeserializer")
                val context = typeDeserializer.field<DeserializationContext>("c")
                val typeProto = o.field<ProtoBuf.Type>("typeProto")
                val text = when {
                    typeProto.hasClassName() -> context.nameResolver.getClassId(typeProto.className).asSingleFqName().asString()
                    typeProto.hasTypeParameter() -> {
                        val classifier = (o as KotlinType).constructor.declarationDescriptor!!
                        "" + classifier.name + " in " + DescriptorUtils.getFqName(classifier.containingDeclaration)
                    }
                    else -> "???"
                }
                text.appendQuoted()
            }
            o is JavaNamedElement -> {
                o.name.appendQuoted()
            }
            o is JavaTypeImpl<*> -> {
                o.psi.presentableText.appendQuoted()
            }
            o is Collection<*> -> {
                if (o.isEmpty()) {
                    sb.append("[empty]")
                }
                else {
                    sb.append("[${o.size}] ")
                    o.joinTo(sb, ", ", prefix = "{", postfix = "}", limit = 3) { render(it) }
                }
            }
            o is KotlinType -> {
                StringBuilder().apply {
                    append(o.constructor)
                    if (!o.arguments.isEmpty()) {
                        append("<${o.arguments.size}>")
                    }
                }.appendQuoted()
            }
            o is ResolutionCandidate<*> -> DescriptorRenderer.COMPACT.render(o.descriptor).appendQuoted()
        }' @ [140:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?), entry3: (Any..Any?), entry4: (Any..Any?), entry5: (Any..Any?), entry6: (Any..Any?), entry7: (Any..Any?), entry8: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'o' @ [141:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [141:27] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'name' @ [141:29] ==> public final val Named.name: Name[MyPropertyDescriptor]

'appendQuoted' @ [141:34] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [142:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'java' @ [142:22] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'simpleName' @ [142:27] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'o' @ [143:32] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'field' @ [143:34] ==> private fun <T> Any.field(name: String): JavaTypeImpl<*> defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JavaTypeImpl<*>

'javaType' @ [144:17] ==> val javaType: JavaTypeImpl<*> defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'psi' @ [144:26] ==> public final val <Psi : (PsiType..PsiType?)> JavaTypeImpl<out (PsiType..PsiType?)>.psi: (PsiType..PsiType?)[MyPropertyDescriptor]
Inferred types:
    <Psi : (PsiType..PsiType?)> -> Captured(*)

'presentableText' @ [144:30] ==> public final val PsiType.presentableText: String[MyPropertyDescriptor]

'appendQuoted' @ [144:46] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [146:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'java' @ [146:22] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'simpleName' @ [146:27] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'o' @ [147:33] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'field' @ [147:35] ==> private fun <T> Any.field(name: String): Any defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any

'field' @ [147:57] ==> private fun <T> Any.field(name: String): JavaClassImpl defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JavaClassImpl

'javaClass' @ [148:17] ==> val javaClass: JavaClassImpl defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'psi' @ [148:27] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'name' @ [148:31] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'appendQuoted' @ [148:38] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [150:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'java' @ [150:22] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'simpleName' @ [150:27] ==> public final val <T : (Any..Any?)> Class<out Any>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'o' @ [151:40] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'field' @ [151:42] ==> private fun <T> Any.field(name: String): TypeDeserializer defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeDeserializer

'typeDeserializer' @ [152:31] ==> val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'field' @ [152:48] ==> private fun <T> Any.field(name: String): DeserializationContext defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DeserializationContext

'o' @ [153:33] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'field' @ [153:35] ==> private fun <T> Any.field(name: String): ProtoBuf.Type defined in org.jetbrains.kotlin.checkers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Type

'when {
                    typeProto.hasClassName() -> context.nameResolver.getClassId(typeProto.className).asSingleFqName().asString()
                    typeProto.hasTypeParameter() -> {
                        val classifier = (o as KotlinType).constructor.declarationDescriptor!!
                        "" + classifier.name + " in " + DescriptorUtils.getFqName(classifier.containingDeclaration)
                    }
                    else -> "???"
                }' @ [154:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'typeProto' @ [155:21] ==> val typeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'hasClassName' @ [155:31] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'context' @ [155:49] ==> val context: DeserializationContext defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'nameResolver' @ [155:57] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[DeserializedPropertyDescriptor]

'getClassId' @ [155:70] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'typeProto' @ [155:81] ==> val typeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'className' @ [155:91] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'asSingleFqName' @ [155:102] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [155:119] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'typeProto' @ [156:21] ==> val typeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'hasTypeParameter' @ [156:31] ==> public open fun hasTypeParameter(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'!!' @ [157:42] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: ClassifierDescriptor?): ClassifierDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> ClassifierDescriptor

'o' @ [157:43] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'constructor' @ [157:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [157:72] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'+' @ [158:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'classifier' @ [158:30] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'name' @ [158:41] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'getFqName' @ [158:73] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [158:83] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'containingDeclaration' @ [158:94] ==> public final val ClassifierDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'text' @ [162:17] ==> val text: String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'appendQuoted' @ [162:22] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [164:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [165:17] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'name' @ [165:19] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaNamedElement[DeserializedPropertyDescriptor]

'appendQuoted' @ [165:24] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [167:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'o' @ [168:17] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'psi' @ [168:19] ==> public final val <Psi : (PsiType..PsiType?)> JavaTypeImpl<out (PsiType..PsiType?)>.psi: (PsiType..PsiType?)[MyPropertyDescriptor]
Inferred types:
    <Psi : (PsiType..PsiType?)> -> Captured(*)

'presentableText' @ [168:23] ==> public final val PsiType.presentableText: String[MyPropertyDescriptor]

'appendQuoted' @ [168:39] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [170:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'if (o.isEmpty()) {
                    sb.append("[empty]")
                }
                else {
                    sb.append("[${o.size}] ")
                    o.joinTo(sb, ", ", prefix = "{", postfix = "}", limit = 3) { render(it) }
                }' @ [171:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'o' @ [171:21] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'isEmpty' @ [171:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'sb' @ [172:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'append' @ [172:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [175:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'append' @ [175:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'o' @ [175:35] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'size' @ [175:37] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'o' @ [176:21] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'joinTo' @ [176:23] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<Any?>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Any?) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <A : Appendable /* = Appendable */> -> StringBuilder

'sb' @ [176:30] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'render' @ [176:82] ==> private final fun render(o: Any?): String defined in org.jetbrains.kotlin.checkers.LazyOperationsLog[SimpleFunctionDescriptorImpl]

'it' @ [176:89] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render.<anonymous>[ValueParameterDescriptorImpl]

'o' @ [179:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'StringBuilder' @ [180:17] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'apply' @ [180:33] ==> @InlineOnly public inline fun <T> StringBuilder /* = StringBuilder */.apply(block: StringBuilder /* = StringBuilder */.() -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder

'append' @ [181:21] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'o' @ [181:28] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'constructor' @ [181:30] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [182:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'o' @ [182:26] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'arguments' @ [182:28] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [182:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'append' @ [183:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'o' @ [183:36] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'arguments' @ [183:38] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'size' @ [183:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'appendQuoted' @ [185:19] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'o' @ [187:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'COMPACT' @ [187:63] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [187:71] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'o' @ [187:78] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[ValueParameterDescriptorImpl]

'descriptor' @ [187:80] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolutionCandidate<out (CallableDescriptor..CallableDescriptor?)>.descriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'appendQuoted' @ [187:92] ==> local final fun Any.appendQuoted(): Unit defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[SimpleFunctionDescriptorImpl]

'sb' @ [189:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.checkers.LazyOperationsLog.render[LocalVariableDescriptor]

'toString' @ [189:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [194:17] ==> <this> defined in org.jetbrains.kotlin.checkers.field[ReceiverParameterDescriptorImpl]

'java' @ [194:29] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'getDeclaredField' @ [194:34] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'name' @ [194:51] ==> value-parameter name: String defined in org.jetbrains.kotlin.checkers.field[ValueParameterDescriptorImpl]

'field' @ [195:5] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.checkers.field[LocalVariableDescriptor]

'isAccessible' @ [195:11] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [196:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'field' @ [197:12] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.checkers.field[LocalVariableDescriptor]

'get' @ [197:18] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'this' @ [197:22] ==> <this> defined in org.jetbrains.kotlin.checkers.field[ReceiverParameterDescriptorImpl]

'pushIndent' @ [201:5] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'invoke' @ [202:5] ==> public abstract operator fun Printer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'popIndent' @ [203:5] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [204:12] ==> <this> defined in org.jetbrains.kotlin.checkers.indent[ReceiverParameterDescriptorImpl]

'when (this) {
        is Class<*> -> getName().substringAfterLast(".")
        is Method -> declaringClass.getDeclarationName() + "::" + name + "()"
        is Constructor<*> -> getDeclaringClass().getDeclarationName() + "::" + getName() + "()"
        else -> "<no name>"
    }' @ [208:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'this' @ [208:18] ==> <this> defined in org.jetbrains.kotlin.checkers.getDeclarationName[ReceiverParameterDescriptorImpl]

'getName' @ [209:24] ==> public open fun getName(): (String..String?) defined in java.lang.Class[JavaMethodDescriptor]

'substringAfterLast' @ [209:34] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'declaringClass' @ [210:22] ==> public final val Method.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'getDeclarationName' @ [210:37] ==> private fun GenericDeclaration?.getDeclarationName(): String? defined in org.jetbrains.kotlin.checkers in file LazyOperationsLog.kt[SimpleFunctionDescriptorImpl]

'name' @ [210:67] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'getDeclaringClass' @ [211:30] ==> public open fun getDeclaringClass(): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'getDeclarationName' @ [211:50] ==> private fun GenericDeclaration?.getDeclarationName(): String? defined in org.jetbrains.kotlin.checkers in file LazyOperationsLog.kt[SimpleFunctionDescriptorImpl]

'getName' @ [211:80] ==> public open fun getName(): (String..String?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

