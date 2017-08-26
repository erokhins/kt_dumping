'content' @ [24:51] ==> value-parameter content: String defined in test.text.createString[ValueParameterDescriptorImpl]

'StringBuilder' @ [25:58] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'content' @ [25:73] ==> value-parameter content: String defined in test.text.createStringBuilder[ValueParameterDescriptorImpl]

'toString' @ [25:89] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'listOf' @ [28:28] ==> public fun <T> listOf(vararg elements: KFunction1<String, CharSequence>): List<KFunction1<String, CharSequence>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction1<String, CharSequence>

'charSequenceBuilders' @ [31:25] ==> public val charSequenceBuilders: List<KFunction1<String, CharSequence>> defined in test.text in file StringTest.kt[PropertyDescriptorImpl]

'invoke' @ [31:47] ==> public abstract operator fun invoke(p1: (String) -> CharSequence): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'arg1Builder' @ [31:49] ==> val arg1Builder: KFunction1<String, CharSequence> defined in test.text.withOneCharSequenceArg[LocalVariableDescriptor]

'withOneCharSequenceArg' @ [35:11] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [35:51] ==> public abstract operator fun invoke(p1: CharSequence): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [35:53] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'arg1' @ [35:65] ==> value-parameter arg1: String defined in test.text.withOneCharSequenceArg[ValueParameterDescriptorImpl]

'charSequenceBuilders' @ [38:25] ==> public val charSequenceBuilders: List<KFunction1<String, CharSequence>> defined in test.text in file StringTest.kt[PropertyDescriptorImpl]

'charSequenceBuilders' @ [39:29] ==> public val charSequenceBuilders: List<KFunction1<String, CharSequence>> defined in test.text in file StringTest.kt[PropertyDescriptorImpl]

'invoke' @ [40:13] ==> public abstract operator fun invoke(p1: (String) -> CharSequence, p2: (String) -> CharSequence): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'arg1Builder' @ [40:15] ==> val arg1Builder: KFunction1<String, CharSequence> defined in test.text.withTwoCharSequenceArgs[LocalVariableDescriptor]

'arg2Builder' @ [40:28] ==> val arg2Builder: KFunction1<String, CharSequence> defined in test.text.withTwoCharSequenceArgs[LocalVariableDescriptor]

'assertEquals' @ [44:5] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expected' @ [44:18] ==> value-parameter expected: String defined in test.text.assertContentEquals[ValueParameterDescriptorImpl]

'actual' @ [44:28] ==> value-parameter actual: CharSequence defined in test.text.assertContentEquals[ValueParameterDescriptorImpl]

'toString' @ [44:35] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'message' @ [44:47] ==> value-parameter message: String? = ... defined in test.text.assertContentEquals[ValueParameterDescriptorImpl]

'this' @ [48:27] ==> <this> defined in test.text.isAsciiDigit[ReceiverParameterDescriptorImpl]

'..' @ [48:35] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'this' @ [49:28] ==> <this> defined in test.text.isAsciiLetter[ReceiverParameterDescriptorImpl]

'..' @ [49:36] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'this' @ [49:48] ==> <this> defined in test.text.isAsciiLetter[ReceiverParameterDescriptorImpl]

'..' @ [49:56] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'this' @ [50:31] ==> <this> defined in test.text.isAsciiUpperCase[ReceiverParameterDescriptorImpl]

'..' @ [50:39] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'Test' @ [54:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [54:35] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [57:21] ==> public fun <T> listOf(vararg elements: Case): List<Case> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Case

'Case' @ [58:13] ==> public constructor Case(value: String?, isNull: Boolean = ..., isEmpty: Boolean = ..., isBlank: Boolean = ...) defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[ClassConstructorDescriptorImpl]

'Case' @ [59:13] ==> public constructor Case(value: String?, isNull: Boolean = ..., isEmpty: Boolean = ..., isBlank: Boolean = ...) defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[ClassConstructorDescriptorImpl]

'Case' @ [60:13] ==> public constructor Case(value: String?, isNull: Boolean = ..., isEmpty: Boolean = ..., isBlank: Boolean = ...) defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[ClassConstructorDescriptorImpl]

'Case' @ [61:13] ==> public constructor Case(value: String?, isNull: Boolean = ..., isEmpty: Boolean = ..., isBlank: Boolean = ...) defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[ClassConstructorDescriptorImpl]

'cases' @ [64:22] ==> val cases: List<Case> defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'case' @ [65:25] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'value' @ [65:30] ==> public final val value: String? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'let' @ [65:37] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> CharSequence): CharSequence defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> CharSequence

'invoke' @ [65:43] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [65:48] ==> value-parameter it: String defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [66:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'case' @ [66:26] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isNull' @ [66:31] ==> public final val isNull: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'case' @ [66:41] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [66:46] ==> public final val isEmpty: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'value' @ [66:55] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isNullOrEmpty' @ [66:61] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [66:97] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [67:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'case' @ [67:26] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isNull' @ [67:31] ==> public final val isNull: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'case' @ [67:41] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isBlank' @ [67:46] ==> public final val isBlank: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'value' @ [67:55] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isNullOrBlank' @ [67:61] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [67:97] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'value' @ [68:17] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [70:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'case' @ [70:30] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [70:35] ==> public final val isEmpty: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'value' @ [70:44] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [70:50] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [70:80] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [71:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'case' @ [71:30] ==> val case: Case defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isBlank' @ [71:35] ==> public final val isBlank: Boolean defined in test.text.StringTest.isEmptyAndBlank.<anonymous>.Case[PropertyDescriptorImpl]

'value' @ [71:44] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'isBlank' @ [71:50] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'value' @ [71:80] ==> val value: CharSequence? defined in test.text.StringTest.isEmptyAndBlank.<anonymous>[LocalVariableDescriptor]

'Test' @ [76:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [80:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [80:29] ==> val s: String? defined in test.text.StringTest.orEmpty[LocalVariableDescriptor]

'orEmpty' @ [80:31] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'ns' @ [81:26] ==> val ns: String? defined in test.text.StringTest.orEmpty[LocalVariableDescriptor]

'orEmpty' @ [81:29] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [84:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [85:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [85:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [86:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [86:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [87:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [87:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [88:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [88:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [89:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [89:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [90:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [90:24] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [91:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [91:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [92:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [92:23] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [94:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [94:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [95:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [95:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [98:51] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [100:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [100:18] ==> <this> defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>.startsWithCs[ReceiverParameterDescriptorImpl]

'startsWith' @ [100:24] ==> public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [100:35] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'prefix' @ [100:40] ==> value-parameter prefix: String defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>.startsWithCs[ValueParameterDescriptorImpl]

'ignoreCase' @ [100:49] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>.startsWithCs[ValueParameterDescriptorImpl]

'assertTrue' @ [102:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [102:27] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [103:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [103:27] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [104:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [104:27] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [105:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [105:28] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [106:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [106:28] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [107:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [107:24] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [108:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [108:27] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [109:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [109:23] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [111:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [111:28] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [112:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWithCs' @ [112:27] ==> local final fun String.startsWithCs(prefix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [116:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [116:27] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [117:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [117:27] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [118:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [118:28] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [119:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [119:28] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [120:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [120:27] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [121:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [121:24] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [122:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [122:27] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [123:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [123:23] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [126:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [126:49] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [128:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [128:18] ==> <this> defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>.endsWithCs[ReceiverParameterDescriptorImpl]

'endsWith' @ [128:24] ==> public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [128:33] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'suffix' @ [128:38] ==> value-parameter suffix: String defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>.endsWithCs[ValueParameterDescriptorImpl]

'ignoreCase' @ [128:47] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>.endsWithCs[ValueParameterDescriptorImpl]

'assertTrue' @ [130:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [130:27] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [131:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [131:27] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [132:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [132:28] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [133:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [133:28] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [134:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [134:27] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [135:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [135:24] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [136:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [136:27] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [137:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWithCs' @ [137:23] ==> local final fun String.endsWithCs(suffix: String, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithStringForCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [140:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [140:34] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [142:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [142:18] ==> <this> defined in test.text.StringTest.startsWithChar.<anonymous>.startsWith[ReceiverParameterDescriptorImpl]

'startsWith' @ [142:24] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'char' @ [142:35] ==> value-parameter char: Char defined in test.text.StringTest.startsWithChar.<anonymous>.startsWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [142:41] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.startsWithChar.<anonymous>.startsWith[ValueParameterDescriptorImpl]

'assertTrue' @ [144:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [144:27] ==> local final fun String.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [145:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [145:28] ==> local final fun String.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [146:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [146:28] ==> local final fun String.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [147:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [147:27] ==> local final fun String.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [148:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [148:24] ==> local final fun String.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.startsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [151:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [151:32] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [153:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [153:18] ==> <this> defined in test.text.StringTest.endsWithChar.<anonymous>.endsWith[ReceiverParameterDescriptorImpl]

'endsWith' @ [153:24] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'char' @ [153:33] ==> value-parameter char: Char defined in test.text.StringTest.endsWithChar.<anonymous>.endsWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [153:39] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.endsWithChar.<anonymous>.endsWith[ValueParameterDescriptorImpl]

'assertTrue' @ [155:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [155:27] ==> local final fun String.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [156:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [156:28] ==> local final fun String.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [157:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [157:28] ==> local final fun String.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [158:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [158:27] ==> local final fun String.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [159:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [159:24] ==> local final fun String.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in test.text.StringTest.endsWithChar.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [162:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [162:32] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [164:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [164:18] ==> <this> defined in test.text.StringTest.commonPrefix.<anonymous>.commonPrefixWith[ReceiverParameterDescriptorImpl]

'commonPrefixWith' @ [164:24] ==> public fun CharSequence.commonPrefixWith(other: CharSequence, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [164:41] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'other' @ [164:46] ==> value-parameter other: String defined in test.text.StringTest.commonPrefix.<anonymous>.commonPrefixWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [164:54] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.commonPrefix.<anonymous>.commonPrefixWith[ValueParameterDescriptorImpl]

'assertEquals' @ [166:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [166:29] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [167:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [167:32] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [168:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [168:29] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [169:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [169:33] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [171:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [171:37] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [172:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [172:37] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [173:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonPrefixWith' @ [173:35] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [177:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'dth54' @ [177:26] ==> val dth54: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'commonPrefixWith' @ [177:32] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'dth55' @ [177:49] ==> val dth55: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [178:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'dth54' @ [178:22] ==> val dth54: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'dth54' @ [178:31] ==> val dth54: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'dth54' @ [178:37] ==> val dth54: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'commonPrefixWith' @ [178:44] ==> local final fun String.commonPrefixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonPrefix.<anonymous>[SimpleFunctionDescriptorImpl]

'dth54' @ [178:63] ==> val dth54: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'dth55' @ [178:69] ==> val dth55: String defined in test.text.StringTest.commonPrefix.<anonymous>[LocalVariableDescriptor]

'Test' @ [181:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [181:32] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [183:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [183:18] ==> <this> defined in test.text.StringTest.commonSuffix.<anonymous>.commonSuffixWith[ReceiverParameterDescriptorImpl]

'commonSuffixWith' @ [183:24] ==> public fun CharSequence.commonSuffixWith(other: CharSequence, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [183:41] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'other' @ [183:46] ==> value-parameter other: String defined in test.text.StringTest.commonSuffix.<anonymous>.commonSuffixWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [183:54] ==> value-parameter ignoreCase: Boolean = ... defined in test.text.StringTest.commonSuffix.<anonymous>.commonSuffixWith[ValueParameterDescriptorImpl]

'assertEquals' @ [185:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [185:29] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [186:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [186:32] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [187:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [187:29] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [188:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [188:33] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [190:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [190:37] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [191:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [191:37] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [192:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'commonSuffixWith' @ [192:35] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [196:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'dth54' @ [196:26] ==> val dth54: String defined in test.text.StringTest.commonSuffix.<anonymous>[LocalVariableDescriptor]

'commonSuffixWith' @ [196:32] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'kimono' @ [196:49] ==> val kimono: String defined in test.text.StringTest.commonSuffix.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [197:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'dth54' @ [197:24] ==> val dth54: String defined in test.text.StringTest.commonSuffix.<anonymous>[LocalVariableDescriptor]

'dth54' @ [197:35] ==> val dth54: String defined in test.text.StringTest.commonSuffix.<anonymous>[LocalVariableDescriptor]

'commonSuffixWith' @ [197:42] ==> local final fun String.commonSuffixWith(other: String, ignoreCase: Boolean = ...): String defined in test.text.StringTest.commonSuffix.<anonymous>[SimpleFunctionDescriptorImpl]

'dth54' @ [197:62] ==> val dth54: String defined in test.text.StringTest.commonSuffix.<anonymous>[LocalVariableDescriptor]

'Test' @ [200:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [201:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'capitalize' @ [201:31] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [202:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'capitalize' @ [202:31] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [203:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'capitalize' @ [203:37] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [204:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'capitalize' @ [204:37] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [207:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [208:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'decapitalize' @ [208:31] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [209:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'decapitalize' @ [209:31] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [210:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'decapitalize' @ [210:37] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [211:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'decapitalize' @ [211:37] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [212:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'decapitalize' @ [212:35] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [215:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [216:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [219:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'substring' @ [219:37] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [219:47] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [220:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'slice' @ [220:37] ==> @InlineOnly public inline fun String.slice(indices: Iterable<Int>): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'downTo' @ [220:43] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [221:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'slice' @ [221:38] ==> @InlineOnly public inline fun String.slice(indices: Iterable<Int>): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iter' @ [221:44] ==> val iter: List<Int> defined in test.text.StringTest.slice[LocalVariableDescriptor]

'Test' @ [224:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [224:37] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [225:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'invoke' @ [227:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [230:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [230:32] ==> val data: CharSequence defined in test.text.StringTest.sliceCharSequence.<anonymous>[LocalVariableDescriptor]

'slice' @ [230:37] ==> public fun CharSequence.slice(indices: IntRange): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [230:43] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toString' @ [230:49] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [231:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [231:29] ==> val data: CharSequence defined in test.text.StringTest.sliceCharSequence.<anonymous>[LocalVariableDescriptor]

'slice' @ [231:34] ==> public fun CharSequence.slice(indices: Iterable<Int>): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'downTo' @ [231:40] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toString' @ [231:52] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [232:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [232:30] ==> val data: CharSequence defined in test.text.StringTest.sliceCharSequence.<anonymous>[LocalVariableDescriptor]

'slice' @ [232:35] ==> public fun CharSequence.slice(indices: Iterable<Int>): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'iter' @ [232:41] ==> val iter: List<Int> defined in test.text.StringTest.sliceCharSequence.<anonymous>[LocalVariableDescriptor]

'toString' @ [232:47] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'Test' @ [235:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [236:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'reversed' @ [236:37] ==> @InlineOnly public inline fun String.reversed(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [237:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'reversed' @ [237:37] ==> @InlineOnly public inline fun String.reversed(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [238:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'reversed' @ [238:29] ==> @InlineOnly public inline fun String.reversed(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [241:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [241:39] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [242:49] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [242:54] ==> <this> defined in test.text.StringTest.reverseCharSequence.<anonymous>.reversedCs[ReceiverParameterDescriptorImpl]

'reversed' @ [242:60] ==> public fun CharSequence.reversed(): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [244:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'reversedCs' @ [244:44] ==> local final fun String.reversedCs(): CharSequence defined in test.text.StringTest.reverseCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [245:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'reversedCs' @ [245:44] ==> local final fun String.reversedCs(): CharSequence defined in test.text.StringTest.reverseCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [246:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'reversedCs' @ [246:36] ==> local final fun String.reversedCs(): CharSequence defined in test.text.StringTest.reverseCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [249:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [249:27] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [250:42] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [250:47] ==> <this> defined in test.text.StringTest.indices.<anonymous>.indices[ReceiverParameterDescriptorImpl]

'indices' @ [250:53] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'assertEquals' @ [252:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: IntRange, actual: IntRange, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IntRange

'..' @ [252:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'indices' @ [252:36] ==> local final fun String.indices(): IntRange defined in test.text.StringTest.indices.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [253:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: IntRange, actual: IntRange, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IntRange

'..' @ [253:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'indices' @ [253:32] ==> local final fun String.indices(): IntRange defined in test.text.StringTest.indices.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [254:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'indices' @ [254:23] ==> local final fun String.indices(): IntRange defined in test.text.StringTest.indices.<anonymous>[SimpleFunctionDescriptorImpl]

'isEmpty' @ [254:33] ==> public open fun isEmpty(): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'Test' @ [257:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [257:32] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [258:17] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [259:27] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertContentEquals' @ [261:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [261:43] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'replaceRange' @ [261:45] ==> public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replacement' @ [261:64] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [262:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [262:42] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'replaceRange' @ [262:44] ==> public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [262:57] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'replacement' @ [262:63] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'assertFails' @ [263:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

's' @ [264:13] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'replaceRange' @ [264:15] ==> public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [264:28] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'replacement' @ [264:34] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'assertFails' @ [266:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

's' @ [267:13] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'replaceRange' @ [267:15] ==> public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replacement' @ [267:34] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [271:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'replacement' @ [271:29] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'toString' @ [271:41] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

's' @ [271:53] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'replaceRange' @ [271:55] ==> public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [271:68] ==> val s: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'indices' @ [271:70] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'replacement' @ [271:79] ==> val replacement: CharSequence defined in test.text.StringTest.replaceRange.<anonymous>[LocalVariableDescriptor]

'Test' @ [274:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [274:31] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [275:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [275:41] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [275:43] ==> public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [276:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [276:40] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [276:42] ==> public fun CharSequence.removeRange(range: IntRange): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [276:54] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [278:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [278:29] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [278:31] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

's' @ [278:43] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [278:45] ==> public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [281:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [281:33] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [281:35] ==> public fun CharSequence.removeRange(range: IntRange): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [281:47] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'indices' @ [281:49] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'assertContentEquals' @ [284:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [284:29] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [284:31] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'replaceRange' @ [284:42] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [284:66] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [284:68] ==> public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [285:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [285:29] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [285:31] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'replaceRange' @ [285:42] ==> @InlineOnly public inline fun String.replaceRange(range: IntRange, replacement: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [285:55] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

's' @ [285:66] ==> value-parameter s: CharSequence defined in test.text.StringTest.removeRange.<anonymous>[ValueParameterDescriptorImpl]

'removeRange' @ [285:68] ==> public fun CharSequence.removeRange(range: IntRange): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [285:80] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [288:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [291:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [291:31] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfter' @ [291:33] ==> public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [292:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [292:28] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfterLast' @ [292:30] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [293:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [293:28] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBefore' @ [293:30] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [294:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [294:31] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBeforeLast' @ [294:33] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [297:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [297:31] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfter' @ [297:33] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [298:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [298:28] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfterLast' @ [298:30] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [299:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [299:28] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBefore' @ [299:30] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [300:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [300:31] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBeforeLast' @ [300:33] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [303:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [303:26] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfter' @ [303:28] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [304:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [304:26] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBefore' @ [304:28] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [305:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [305:22] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

's' @ [305:25] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBefore' @ [305:27] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [306:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [306:22] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

's' @ [306:25] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfter' @ [306:27] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [307:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [307:29] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringBefore' @ [307:31] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [308:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [308:29] ==> val s: String defined in test.text.StringTest.substringDelimited[LocalVariableDescriptor]

'substringAfter' @ [308:31] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [312:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [315:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [315:47] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfter' @ [315:49] ==> public fun String.replaceAfter(delimiter: Char, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [316:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [316:50] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfterLast' @ [316:52] ==> public fun String.replaceAfterLast(delimiter: Char, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [317:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [317:44] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBefore' @ [317:46] ==> public fun String.replaceBefore(delimiter: Char, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [318:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [318:50] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBeforeLast' @ [318:52] ==> public fun String.replaceBeforeLast(delimiter: Char, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [321:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [321:47] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfter' @ [321:49] ==> public fun String.replaceAfter(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [322:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [322:50] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfterLast' @ [322:52] ==> public fun String.replaceAfterLast(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [323:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [323:44] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBefore' @ [323:46] ==> public fun String.replaceBefore(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [324:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [324:50] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBeforeLast' @ [324:52] ==> public fun String.replaceBeforeLast(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [327:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [327:53] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfter' @ [327:55] ==> public fun String.replaceAfter(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [328:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [328:53] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceAfterLast' @ [328:55] ==> public fun String.replaceAfterLast(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [329:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [329:53] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBefore' @ [329:55] ==> public fun String.replaceBefore(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [330:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [330:53] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBeforeLast' @ [330:55] ==> public fun String.replaceBeforeLast(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [331:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [331:29] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBefore' @ [331:31] ==> public fun String.replaceBefore(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [332:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [332:29] ==> val s: String defined in test.text.StringTest.replaceDelimited[LocalVariableDescriptor]

'replaceBeforeLast' @ [332:31] ==> public fun String.replaceBeforeLast(delimiter: String, replacement: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [335:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [335:26] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [336:45] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [336:50] ==> <this> defined in test.text.StringTest.repeat.<anonymous>.repeat[ReceiverParameterDescriptorImpl]

'repeat' @ [336:56] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'n' @ [336:63] ==> value-parameter n: Int defined in test.text.StringTest.repeat.<anonymous>.repeat[ValueParameterDescriptorImpl]

'assertFails' @ [338:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'repeat' @ [338:29] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'-' @ [338:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [339:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [339:32] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [340:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [340:35] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [341:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [341:38] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [342:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [342:41] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'assertEquals' @ [344:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [344:29] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'Int' @ [344:36] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [344:40] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [345:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'repeat' @ [345:43] ==> local final fun String.repeat(n: Int): String defined in test.text.StringTest.repeat.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [348:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [348:34] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'data' @ [350:18] ==> value-parameter data: CharSequence defined in test.text.StringTest.stringIterator.<anonymous>[ValueParameterDescriptorImpl]

'sum' @ [351:13] ==> var sum: Int defined in test.text.StringTest.stringIterator.<anonymous>[LocalVariableDescriptor]

'c' @ [351:21] ==> val c: Char defined in test.text.StringTest.stringIterator.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [352:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sum' @ [352:20] ==> var sum: Int defined in test.text.StringTest.stringIterator.<anonymous>[LocalVariableDescriptor]

'Test' @ [355:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [355:29] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [356:50] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [356:55] ==> <this> defined in test.text.StringTest.trimStart.<anonymous>.trimStartCS[ReceiverParameterDescriptorImpl]

'trimStart' @ [356:61] ==> public fun CharSequence.trimStart(): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [357:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [357:36] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [358:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [358:38] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [359:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [359:39] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [360:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [360:40] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [361:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [361:44] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [362:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [362:44] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [363:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [363:46] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [364:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [364:46] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [366:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [366:40] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [367:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [367:42] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [368:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [368:40] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [369:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimStartCS' @ [369:40] ==> local final fun String.trimStartCS(): CharSequence defined in test.text.StringTest.trimStart.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [371:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [371:35] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'trimStart' @ [371:50] ==> public fun CharSequence.trimStart(vararg chars: Char): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [372:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [372:37] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'trimStart' @ [372:52] ==> public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [372:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [372:66] ==> value-parameter it: Char defined in test.text.StringTest.trimStart.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [372:69] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [375:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [375:27] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [376:48] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [376:53] ==> <this> defined in test.text.StringTest.trimEnd.<anonymous>.trimEndCS[ReceiverParameterDescriptorImpl]

'trimEnd' @ [376:59] ==> public fun CharSequence.trimEnd(): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [377:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [377:36] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [378:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [378:38] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [379:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [379:39] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [380:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [380:40] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [381:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [381:44] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [382:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [382:44] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [383:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [383:46] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [384:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [384:46] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [386:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [386:40] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [387:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [387:42] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [388:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [388:40] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [389:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'trimEndCS' @ [389:40] ==> local final fun String.trimEndCS(): CharSequence defined in test.text.StringTest.trimEnd.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [391:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [391:35] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'trimEnd' @ [391:50] ==> public fun CharSequence.trimEnd(vararg chars: Char): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [392:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [392:38] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'trimEnd' @ [392:53] ==> public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [392:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [392:64] ==> value-parameter it: Char defined in test.text.StringTest.trimEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [392:67] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [395:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [395:35] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'arrayOf' @ [396:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'component1' @ [407:15] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [407:23] ==> public final operator fun component2(): CharSequence defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'examples' @ [407:35] ==> val examples: Array<String> defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'map' @ [407:44] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> Pair<String, CharSequence>): List<Pair<String, CharSequence>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, CharSequence>

'it' @ [407:50] ==> value-parameter it: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [407:56] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [407:61] ==> value-parameter it: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertContentEquals' @ [408:13] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'source' @ [408:33] ==> val source: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimEnd' @ [408:40] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimStart' @ [408:50] ==> @InlineOnly public inline fun String.trimStart(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'example' @ [408:63] ==> val example: CharSequence defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trim' @ [408:71] ==> public fun CharSequence.trim(): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [409:13] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'source' @ [409:33] ==> val source: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimStart' @ [409:40] ==> @InlineOnly public inline fun String.trimStart(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimEnd' @ [409:52] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'example' @ [409:63] ==> val example: CharSequence defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trim' @ [409:71] ==> public fun CharSequence.trim(): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [412:36] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'charArrayOf' @ [416:25] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [417:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [417:44] ==> value-parameter it: Char defined in test.text.StringTest.trimStartAndEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [417:47] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'component1' @ [418:15] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [418:23] ==> public final operator fun component2(): CharSequence defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'examplesForPredicate' @ [418:35] ==> val examplesForPredicate: Array<String> defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'map' @ [418:56] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> Pair<String, CharSequence>): List<Pair<String, CharSequence>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, CharSequence>

'it' @ [418:62] ==> value-parameter it: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [418:68] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [418:73] ==> value-parameter it: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertContentEquals' @ [419:13] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'source' @ [419:33] ==> val source: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimStart' @ [419:40] ==> public fun String.trimStart(vararg chars: Char): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimChars' @ [419:51] ==> val trimChars: CharArray defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimEnd' @ [419:62] ==> public fun String.trimEnd(vararg chars: Char): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimChars' @ [419:71] ==> val trimChars: CharArray defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'example' @ [419:83] ==> val example: CharSequence defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trim' @ [419:91] ==> public fun CharSequence.trim(vararg chars: Char): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimChars' @ [419:97] ==> val trimChars: CharArray defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [420:13] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'source' @ [420:33] ==> val source: String defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimStart' @ [420:40] ==> public inline fun String.trimStart(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimPredicate' @ [420:50] ==> val trimPredicate: (Char) -> Boolean defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trimEnd' @ [420:65] ==> public inline fun String.trimEnd(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimPredicate' @ [420:73] ==> val trimPredicate: (Char) -> Boolean defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'example' @ [420:89] ==> val example: CharSequence defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'trim' @ [420:97] ==> public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimPredicate' @ [420:102] ==> val trimPredicate: (Char) -> Boolean defined in test.text.StringTest.trimStartAndEnd.<anonymous>[LocalVariableDescriptor]

'Test' @ [424:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [424:28] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [425:17] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertContentEquals' @ [426:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [426:34] ==> val s: CharSequence defined in test.text.StringTest.padStart.<anonymous>[LocalVariableDescriptor]

'padStart' @ [426:36] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [427:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [427:34] ==> val s: CharSequence defined in test.text.StringTest.padStart.<anonymous>[LocalVariableDescriptor]

'padStart' @ [427:36] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [428:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [428:36] ==> val s: CharSequence defined in test.text.StringTest.padStart.<anonymous>[LocalVariableDescriptor]

'padStart' @ [428:38] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [429:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [429:35] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'padStart' @ [429:44] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [430:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

's' @ [431:13] ==> val s: CharSequence defined in test.text.StringTest.padStart.<anonymous>[LocalVariableDescriptor]

'padStart' @ [431:15] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [431:24] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [435:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [435:26] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [436:17] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertContentEquals' @ [437:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [437:34] ==> val s: CharSequence defined in test.text.StringTest.padEnd.<anonymous>[LocalVariableDescriptor]

'padEnd' @ [437:36] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [438:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [438:34] ==> val s: CharSequence defined in test.text.StringTest.padEnd.<anonymous>[LocalVariableDescriptor]

'padEnd' @ [438:36] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [439:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

's' @ [439:36] ==> val s: CharSequence defined in test.text.StringTest.padEnd.<anonymous>[LocalVariableDescriptor]

'padEnd' @ [439:38] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [440:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [440:35] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'padEnd' @ [440:44] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [441:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

's' @ [442:13] ==> val s: CharSequence defined in test.text.StringTest.padEnd.<anonymous>[LocalVariableDescriptor]

'padEnd' @ [442:15] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [442:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [446:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [446:32] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [447:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removePrefix' @ [447:38] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [447:51] ==> value-parameter prefix: CharSequence defined in test.text.StringTest.removePrefix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [448:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removePrefix' @ [448:44] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [448:57] ==> value-parameter prefix: CharSequence defined in test.text.StringTest.removePrefix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [449:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removePrefix' @ [449:41] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [449:54] ==> value-parameter prefix: CharSequence defined in test.text.StringTest.removePrefix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [450:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removePrefix' @ [450:41] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [453:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [453:32] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [454:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSuffix' @ [454:38] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suffix' @ [454:51] ==> value-parameter suffix: CharSequence defined in test.text.StringTest.removeSuffix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [455:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSuffix' @ [455:44] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suffix' @ [455:57] ==> value-parameter suffix: CharSequence defined in test.text.StringTest.removeSuffix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [456:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSuffix' @ [456:41] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suffix' @ [456:54] ==> value-parameter suffix: CharSequence defined in test.text.StringTest.removeSuffix.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [457:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSuffix' @ [457:41] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [460:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [460:37] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [461:19] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [462:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [463:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [463:41] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pre' @ [463:59] ==> val pre: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'post' @ [463:64] ==> val post: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [464:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [464:45] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pre' @ [464:63] ==> val pre: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'post' @ [464:68] ==> val post: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [465:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [465:41] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pre' @ [465:59] ==> val pre: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'post' @ [465:64] ==> val post: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [466:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [466:41] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pre' @ [466:59] ==> val pre: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'post' @ [466:64] ==> val post: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [467:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [467:39] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pre' @ [467:57] ==> val pre: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'post' @ [467:62] ==> val post: CharSequence defined in test.text.StringTest.removeSurrounding.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [469:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'removeSurrounding' @ [469:35] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [469:53] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [469:65] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'Test' @ [472:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [472:44] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [473:51] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [473:56] ==> <this> defined in test.text.StringTest.removePrefixCharSequence.<anonymous>.removePrefix[ReceiverParameterDescriptorImpl]

'removePrefix' @ [473:62] ==> public fun CharSequence.removePrefix(prefix: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [473:75] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'prefix' @ [473:80] ==> value-parameter prefix: String defined in test.text.StringTest.removePrefixCharSequence.<anonymous>.removePrefix[ValueParameterDescriptorImpl]

'assertContentEquals' @ [476:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removePrefix' @ [476:45] ==> local final fun String.removePrefix(prefix: String): CharSequence defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'prefix' @ [476:58] ==> val prefix: String defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [477:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removePrefix' @ [477:51] ==> local final fun String.removePrefix(prefix: String): CharSequence defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'prefix' @ [477:64] ==> val prefix: String defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [478:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removePrefix' @ [478:48] ==> local final fun String.removePrefix(prefix: String): CharSequence defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'prefix' @ [478:61] ==> val prefix: String defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [479:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removePrefix' @ [479:48] ==> local final fun String.removePrefix(prefix: String): CharSequence defined in test.text.StringTest.removePrefixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [482:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [482:44] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [483:51] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [483:56] ==> <this> defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>.removeSuffix[ReceiverParameterDescriptorImpl]

'removeSuffix' @ [483:62] ==> public fun CharSequence.removeSuffix(suffix: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [483:75] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'suffix' @ [483:80] ==> value-parameter suffix: String defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>.removeSuffix[ValueParameterDescriptorImpl]

'assertContentEquals' @ [486:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSuffix' @ [486:45] ==> local final fun String.removeSuffix(suffix: String): CharSequence defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'suffix' @ [486:58] ==> val suffix: String defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [487:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSuffix' @ [487:51] ==> local final fun String.removeSuffix(suffix: String): CharSequence defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'suffix' @ [487:64] ==> val suffix: String defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [488:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSuffix' @ [488:48] ==> local final fun String.removeSuffix(suffix: String): CharSequence defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'suffix' @ [488:61] ==> val suffix: String defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[LocalVariableDescriptor]

'assertContentEquals' @ [489:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSuffix' @ [489:48] ==> local final fun String.removeSuffix(suffix: String): CharSequence defined in test.text.StringTest.removeSuffixCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [492:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [492:49] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [493:73] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [493:78] ==> <this> defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>.removeSurrounding[ReceiverParameterDescriptorImpl]

'removeSurrounding' @ [493:84] ==> public fun CharSequence.removeSurrounding(prefix: CharSequence, suffix: CharSequence): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [493:102] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'prefix' @ [493:107] ==> value-parameter prefix: String defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>.removeSurrounding[ValueParameterDescriptorImpl]

'invoke' @ [493:116] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'postfix' @ [493:121] ==> value-parameter postfix: String defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>.removeSurrounding[ValueParameterDescriptorImpl]

'assertContentEquals' @ [495:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [495:48] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [496:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [496:52] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [497:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [497:48] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [498:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [498:48] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [499:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [499:46] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [501:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'removeSurrounding' @ [501:42] ==> local final fun String.removeSurrounding(prefix: String, postfix: String): CharSequence defined in test.text.StringTest.removeSurroundingCharSequence.<anonymous>[SimpleFunctionDescriptorImpl]

'Test' @ [521:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [521:25] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [522:57] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [522:62] ==> <this> defined in test.text.StringTest.split.<anonymous>.unaryPlus[ReceiverParameterDescriptorImpl]

'assertEquals' @ [524:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [524:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [524:35] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [524:40] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [525:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [525:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [525:39] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [525:48] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [525:55] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [526:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [526:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [526:39] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [526:48] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [526:55] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [528:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [528:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [528:56] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [528:76] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [529:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [529:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [529:59] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [529:88] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [531:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [531:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [531:59] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [531:81] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [533:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [533:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [533:54] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [533:62] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [534:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [534:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [534:59] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [534:68] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [535:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [535:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [535:57] ==> local final operator fun String.unaryPlus(): CharSequence defined in test.text.StringTest.split.<anonymous>[SimpleFunctionDescriptorImpl]

'split' @ [535:66] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [538:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [538:32] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [539:22] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [540:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [540:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'string' @ [540:86] ==> val string: CharSequence defined in test.text.StringTest.splitToLines.<anonymous>[LocalVariableDescriptor]

'lines' @ [540:93] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [543:26] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [544:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [544:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'singleLine' @ [544:29] ==> val singleLine: CharSequence defined in test.text.StringTest.splitToLines.<anonymous>[LocalVariableDescriptor]

'toString' @ [544:40] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'singleLine' @ [544:53] ==> val singleLine: CharSequence defined in test.text.StringTest.splitToLines.<anonymous>[LocalVariableDescriptor]

'lines' @ [544:64] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [548:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [548:34] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'charArrayOf' @ [549:21] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [550:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [550:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [550:32] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [550:43] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [551:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [551:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [551:32] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [551:43] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [552:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [552:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [552:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [552:33] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [552:44] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [554:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [554:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [554:32] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [554:47] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [555:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [555:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [555:32] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [555:47] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [556:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [556:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [556:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [556:33] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [556:48] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [558:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [558:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [558:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [558:33] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [558:44] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'Test' @ [561:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [561:44] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'charArrayOf' @ [562:21] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [563:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [563:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [563:32] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [563:43] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [564:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [564:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [564:32] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [564:43] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [565:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [565:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [565:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [565:33] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [565:44] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [567:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [567:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [567:32] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [567:47] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [568:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [568:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [568:32] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [568:47] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [569:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [569:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [569:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [569:33] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'chars' @ [569:48] ==> val chars: CharArray defined in test.text.StringTest.indexOfAnyCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'Test' @ [572:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [572:36] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [573:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [574:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [574:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [574:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [574:43] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [575:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [575:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [575:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [575:43] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [576:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [576:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [576:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [576:43] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'reversed' @ [576:54] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [577:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [577:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [577:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [577:33] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [577:44] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [579:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [579:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [579:32] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [579:47] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [580:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [580:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [580:32] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [580:47] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [581:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [581:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [581:32] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [581:47] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'reversed' @ [581:58] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [582:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [582:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [582:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [582:33] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [582:48] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [584:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [584:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [584:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [584:43] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [585:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [585:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [585:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyString.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [585:33] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [585:44] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [588:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [588:46] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [589:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [591:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [591:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [591:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [591:43] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [592:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [592:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [592:32] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [592:43] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [593:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [593:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [593:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [593:33] ==> public fun CharSequence.indexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [593:44] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [595:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [595:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [595:32] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [595:47] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [596:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [596:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [596:32] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [596:47] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [597:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [597:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [597:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [597:33] ==> public fun CharSequence.lastIndexOfAny(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [597:48] ==> val substrings: List<String> defined in test.text.StringTest.indexOfAnyStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'Test' @ [600:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [600:36] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [601:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [602:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [602:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [602:34] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [602:41] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [602:51] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [603:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [603:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [603:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [603:40] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [603:50] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [604:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [604:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [604:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [604:40] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [604:50] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'reversed' @ [604:61] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [605:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'string' @ [605:28] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [605:35] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [605:45] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [607:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [607:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [607:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [607:40] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [607:54] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [608:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [608:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [608:34] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [608:41] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [608:55] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [609:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [609:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [609:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [609:40] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [609:54] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'reversed' @ [609:65] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [610:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'string' @ [610:28] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [610:35] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [610:49] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStrings.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [612:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [612:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'string' @ [612:31] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [612:38] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [612:48] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [613:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'string' @ [613:28] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStrings.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [613:35] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [613:45] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [616:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [616:46] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'listOf' @ [617:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [619:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [619:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'substrings' @ [619:27] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [619:42] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [619:49] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [619:59] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [620:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [620:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'substrings' @ [620:27] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [620:42] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [620:49] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [620:59] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [621:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'string' @ [621:28] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findAnyOf' @ [621:35] ==> public fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [621:45] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [623:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [623:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'substrings' @ [623:27] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [623:42] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [623:49] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [623:63] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [624:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'to' @ [624:22] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'substrings' @ [624:27] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [624:42] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [624:49] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [624:63] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [625:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<Int, String>?, actual: Pair<Int, String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<Int, String>?

'string' @ [625:28] ==> value-parameter string: CharSequence defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'findLastAnyOf' @ [625:35] ==> public fun CharSequence.findLastAnyOf(strings: Collection<String>, startIndex: Int = ..., ignoreCase: Boolean = ...): Pair<Int, String>? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substrings' @ [625:49] ==> val substrings: List<String> defined in test.text.StringTest.findAnyOfStringsIgnoreCase.<anonymous>[LocalVariableDescriptor]

'Test' @ [628:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [628:31] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [629:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [629:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [629:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [629:33] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [630:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [630:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [630:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [631:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [631:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [631:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [632:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [632:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [632:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [633:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [633:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [633:32] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [634:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [634:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [634:32] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [636:28] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [636:32] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [636:39] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'assertEquals' @ [637:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [637:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [637:33] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [637:44] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [637:62] ==> val startIndex: Int defined in test.text.StringTest.indexOfChar.<anonymous>[LocalVariableDescriptor]

'string' @ [637:75] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [637:82] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [637:95] ==> val startIndex: Int defined in test.text.StringTest.indexOfChar.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [638:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [638:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [638:33] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [638:48] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [638:66] ==> val startIndex: Int defined in test.text.StringTest.indexOfChar.<anonymous>[LocalVariableDescriptor]

'string' @ [638:79] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfChar.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [638:86] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [638:103] ==> val startIndex: Int defined in test.text.StringTest.indexOfChar.<anonymous>[LocalVariableDescriptor]

'Test' @ [643:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [643:41] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [644:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [644:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [644:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [644:33] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [645:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [645:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [645:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [646:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [646:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [646:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [647:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [647:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [647:32] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [648:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [648:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [648:32] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [649:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [649:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [649:32] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [652:28] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [652:32] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [652:39] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'assertEquals' @ [653:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [653:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOfAny' @ [653:33] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [653:44] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [653:62] ==> val startIndex: Int defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [653:94] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [653:101] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [653:114] ==> val startIndex: Int defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [654:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [654:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOfAny' @ [654:33] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charArrayOf' @ [654:48] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [654:66] ==> val startIndex: Int defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [654:98] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [654:105] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [654:122] ==> val startIndex: Int defined in test.text.StringTest.indexOfCharIgnoreCase.<anonymous>[LocalVariableDescriptor]

'Test' @ [658:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [658:33] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'string' @ [659:23] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfString.<anonymous>[ValueParameterDescriptorImpl]

'indices' @ [659:30] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'assertEquals' @ [660:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [660:26] ==> val index: Int defined in test.text.StringTest.indexOfString.<anonymous>[LocalVariableDescriptor]

'string' @ [660:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfString.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [660:40] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [660:52] ==> val index: Int defined in test.text.StringTest.indexOfString.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [661:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [661:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfString.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [661:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [662:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [662:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfString.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [662:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [663:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [663:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [663:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfString.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [663:33] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [666:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [666:43] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'string' @ [667:23] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indices' @ [667:30] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'assertEquals' @ [668:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [668:26] ==> val index: Int defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'string' @ [668:33] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [668:40] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [668:52] ==> val index: Int defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [669:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [669:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [669:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [670:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'string' @ [670:25] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [670:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [671:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [671:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'string' @ [671:26] ==> value-parameter string: CharSequence defined in test.text.StringTest.indexOfStringIgnoreCase.<anonymous>[ValueParameterDescriptorImpl]

'indexOf' @ [671:33] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [675:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTwoCharSequenceArgs' @ [675:28] ==> public fun withTwoCharSequenceArgs(f: ((String) -> CharSequence, (String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [676:64] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [676:69] ==> <this> defined in test.text.StringTest.contains.<anonymous>.contains[ReceiverParameterDescriptorImpl]

'contains' @ [676:75] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [676:84] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'other' @ [676:89] ==> value-parameter other: String defined in test.text.StringTest.contains.<anonymous>.contains[ValueParameterDescriptorImpl]

'invoke' @ [677:62] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [677:67] ==> <this> defined in test.text.StringTest.contains.<anonymous>.contains[ReceiverParameterDescriptorImpl]

'contains' @ [677:73] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'other' @ [677:82] ==> value-parameter other: Char defined in test.text.StringTest.contains.<anonymous>.contains[ValueParameterDescriptorImpl]

'assertTrue' @ [679:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [679:20] ==> local final operator fun String.contains(other: String): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [680:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [680:21] ==> local final operator fun String.contains(other: String): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [681:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [681:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'contains' @ [681:35] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [681:44] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertTrue' @ [683:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [683:20] ==> local final operator fun String.contains(other: String): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [684:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [684:20] ==> local final operator fun String.contains(other: String): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [686:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [686:20] ==> local final operator fun String.contains(other: Char): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertFalse' @ [687:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [687:21] ==> local final operator fun String.contains(other: Char): Boolean defined in test.text.StringTest.contains.<anonymous>[SimpleFunctionDescriptorImpl]

'assertTrue' @ [688:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [688:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'contains' @ [688:35] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [691:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFalse' @ [692:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [692:30] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [693:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [693:29] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [694:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [694:30] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [695:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [695:30] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [696:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [696:25] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [697:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [697:25] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [701:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [703:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [703:36] ==> val input: String defined in test.text.StringTest.replace[LocalVariableDescriptor]

'replace' @ [703:42] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [704:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [704:31] ==> val input: String defined in test.text.StringTest.replace[LocalVariableDescriptor]

'replace' @ [704:37] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [706:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [706:35] ==> val input: String defined in test.text.StringTest.replace[LocalVariableDescriptor]

'replace' @ [706:41] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [707:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [707:29] ==> val input: String defined in test.text.StringTest.replace[LocalVariableDescriptor]

'replace' @ [707:35] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [709:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [709:37] ==> val input: String defined in test.text.StringTest.replace[LocalVariableDescriptor]

'replace' @ [709:43] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [712:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [714:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [714:37] ==> val input: String defined in test.text.StringTest.replaceFirst[LocalVariableDescriptor]

'replaceFirst' @ [714:43] ==> public fun String.replaceFirst(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [715:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [715:37] ==> val input: String defined in test.text.StringTest.replaceFirst[LocalVariableDescriptor]

'replaceFirst' @ [715:43] ==> public fun String.replaceFirst(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [719:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [719:36] ==> val input: String defined in test.text.StringTest.replaceFirst[LocalVariableDescriptor]

'replaceFirst' @ [719:42] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [720:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'input' @ [720:36] ==> val input: String defined in test.text.StringTest.replaceFirst[LocalVariableDescriptor]

'replaceFirst' @ [720:42] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [722:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'replaceFirst' @ [722:38] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [725:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [725:25] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'text' @ [726:31] ==> value-parameter text: CharSequence defined in test.text.StringTest.count.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [726:36] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [726:44] ==> value-parameter it: Char defined in test.text.StringTest.count.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [726:47] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [727:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'whitespaceCount' @ [727:25] ==> val whitespaceCount: Int defined in test.text.StringTest.count.<anonymous>[LocalVariableDescriptor]

'Test' @ [730:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [730:35] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

's' @ [731:9] ==> value-parameter s: CharSequence defined in test.text.StringTest.testSplitByChar.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [731:11] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [731:22] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'assertEquals' @ [732:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [732:29] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [732:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [733:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [733:31] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [734:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [734:43] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

's' @ [736:9] ==> value-parameter s: CharSequence defined in test.text.StringTest.testSplitByChar.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [736:11] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [736:22] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'assertEquals' @ [737:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [737:29] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [737:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [738:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [738:32] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

's' @ [740:9] ==> value-parameter s: CharSequence defined in test.text.StringTest.testSplitByChar.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [740:11] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [740:22] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'assertEquals' @ [741:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [741:29] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [741:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [742:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [742:26] ==> value-parameter s: CharSequence defined in test.text.StringTest.testSplitByChar.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [742:28] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'list' @ [742:40] ==> value-parameter list: List<String> defined in test.text.StringTest.testSplitByChar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [746:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [746:27] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [748:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'data' @ [749:9] ==> value-parameter data: CharSequence defined in test.text.StringTest.forEach.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [749:14] ==> public inline fun CharSequence.forEach(action: (Char) -> Unit): Unit defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'count' @ [750:13] ==> var count: Int defined in test.text.StringTest.forEach.<anonymous>[LocalVariableDescriptor]

'sb' @ [751:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.forEach.<anonymous>[LocalVariableDescriptor]

'append' @ [751:16] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [751:23] ==> value-parameter it: Char defined in test.text.StringTest.forEach.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [753:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [753:22] ==> value-parameter data: CharSequence defined in test.text.StringTest.forEach.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [753:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'count' @ [753:35] ==> var count: Int defined in test.text.StringTest.forEach.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [754:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [754:22] ==> value-parameter data: CharSequence defined in test.text.StringTest.forEach.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [754:27] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'sb' @ [754:39] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.forEach.<anonymous>[LocalVariableDescriptor]

'toString' @ [754:42] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Test' @ [757:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [758:20] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [759:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'data' @ [760:23] ==> value-parameter data: CharSequence defined in test.text.StringTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'onEach' @ [760:28] ==> @SinceKotlin public inline fun <S : CharSequence> CharSequence.onEach(action: (Char) -> Unit): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S : CharSequence> -> CharSequence

'result' @ [760:37] ==> val result: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.onEach.<anonymous>[LocalVariableDescriptor]

'append' @ [760:44] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [760:51] ==> value-parameter it: Char defined in test.text.StringTest.onEach.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [761:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [761:30] ==> val result: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.onEach.<anonymous>[LocalVariableDescriptor]

'toString' @ [761:37] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertTrue' @ [762:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [762:20] ==> value-parameter data: CharSequence defined in test.text.StringTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'newData' @ [762:29] ==> val newData: CharSequence defined in test.text.StringTest.onEach.<anonymous>[LocalVariableDescriptor]

'assertStaticTypeIs' @ [765:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: String): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'onEach' @ [765:40] ==> @SinceKotlin public inline fun <S : CharSequence> String.onEach(action: (Char) -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S : CharSequence> -> String

'assertStaticTypeIs' @ [766:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: StringBuilder /* = StringBuilder */): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> StringBuilder

'result' @ [766:43] ==> val result: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.onEach.<anonymous>[LocalVariableDescriptor]

'onEach' @ [766:50] ==> @SinceKotlin public inline fun <S : CharSequence> StringBuilder /* = StringBuilder */.onEach(action: (Char) -> Unit): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S : CharSequence> -> StringBuilder

'Test' @ [770:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [771:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'filter' @ [771:43] ==> public inline fun String.filter(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [771:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [771:53] ==> value-parameter it: Char defined in test.text.StringTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [771:56] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [772:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'filter' @ [772:43] ==> public inline fun String.filter(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [772:52] ==> value-parameter it: Char defined in test.text.StringTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [772:55] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [775:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [775:38] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [776:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [776:38] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'filter' @ [776:54] ==> public inline fun CharSequence.filter(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [776:63] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [776:64] ==> value-parameter it: Char defined in test.text.StringTest.filterCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [776:67] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [777:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [777:37] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'filter' @ [777:54] ==> public inline fun CharSequence.filter(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [777:63] ==> value-parameter it: Char defined in test.text.StringTest.filterCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [777:66] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [780:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [781:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'filterNot' @ [781:43] ==> public inline fun String.filterNot(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [781:55] ==> value-parameter it: Char defined in test.text.StringTest.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [781:58] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [782:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'filterNot' @ [782:43] ==> public inline fun String.filterNot(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [782:55] ==> value-parameter it: Char defined in test.text.StringTest.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [782:58] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [785:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [785:41] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [786:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [786:38] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'filterNot' @ [786:54] ==> public inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [786:66] ==> value-parameter it: Char defined in test.text.StringTest.filterNotCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [786:69] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [787:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [787:37] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'filterNot' @ [787:54] ==> public inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [787:66] ==> value-parameter it: Char defined in test.text.StringTest.filterNotCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [787:69] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [790:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [792:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [792:30] ==> val data: String defined in test.text.StringTest.filterIndexed[LocalVariableDescriptor]

'filterIndexed' @ [792:35] ==> public inline fun String.filterIndexed(predicate: (index: Int, Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [792:63] ==> value-parameter c: Char defined in test.text.StringTest.filterIndexed.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [792:68] ==> public final operator fun plus(other: Int): Char defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'index' @ [792:74] ==> value-parameter index: Int defined in test.text.StringTest.filterIndexed.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [795:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [795:45] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [796:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [796:37] ==> value-parameter data: CharSequence defined in test.text.StringTest.filterIndexedCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'filterIndexed' @ [796:42] ==> public inline fun CharSequence.filterIndexed(predicate: (index: Int, Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [796:70] ==> value-parameter c: Char defined in test.text.StringTest.filterIndexedCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [796:75] ==> public final operator fun plus(other: Int): Char defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'index' @ [796:81] ==> value-parameter index: Int defined in test.text.StringTest.filterIndexedCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [799:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [799:23] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertTrue' @ [800:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [801:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.all.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [801:18] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [801:24] ==> value-parameter it: Char defined in test.text.StringTest.all.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [801:27] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertFalse' @ [803:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [804:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.all.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [804:18] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [804:24] ==> value-parameter it: Char defined in test.text.StringTest.all.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [804:27] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [808:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [808:23] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertTrue' @ [809:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [810:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.any.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [810:18] ==> public inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [810:26] ==> value-parameter it: Char defined in test.text.StringTest.any.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [810:29] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertFalse' @ [812:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [813:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.any.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [813:18] ==> public inline fun CharSequence.any(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [813:26] ==> value-parameter it: Char defined in test.text.StringTest.any.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [813:29] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [817:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [817:24] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [818:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'data' @ [818:27] ==> value-parameter data: CharSequence defined in test.text.StringTest.find.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [818:32] ==> public inline fun CharSequence.first(predicate: (Char) -> Boolean): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [818:40] ==> value-parameter it: Char defined in test.text.StringTest.find.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [818:43] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertNull' @ [819:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [819:20] ==> value-parameter data: CharSequence defined in test.text.StringTest.find.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [819:25] ==> public inline fun CharSequence.firstOrNull(predicate: (Char) -> Boolean): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [819:39] ==> value-parameter it: Char defined in test.text.StringTest.find.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [819:42] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'Test' @ [822:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [822:27] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [823:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char?, actual: Char?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char?

'data' @ [823:27] ==> value-parameter data: CharSequence defined in test.text.StringTest.findNot.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [823:32] ==> public inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [823:44] ==> value-parameter it: Char defined in test.text.StringTest.findNot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [823:47] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [823:64] ==> public fun CharSequence.firstOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertNull' @ [824:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [824:20] ==> value-parameter data: CharSequence defined in test.text.StringTest.findNot.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [824:25] ==> public inline fun CharSequence.filterNot(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [824:37] ==> value-parameter it: Char defined in test.text.StringTest.findNot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [824:40] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'it' @ [824:59] ==> value-parameter it: Char defined in test.text.StringTest.findNot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [824:62] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [824:79] ==> public fun CharSequence.firstOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [827:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [829:20] ==> val data: String defined in test.text.StringTest.partition[LocalVariableDescriptor]

'partition' @ [829:25] ==> public inline fun String.partition(predicate: (Char) -> Boolean): Pair<String, String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [829:37] ==> value-parameter it: Char defined in test.text.StringTest.partition.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [829:40] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [830:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'pair' @ [830:29] ==> val pair: Pair<String, String> defined in test.text.StringTest.partition[LocalVariableDescriptor]

'first' @ [830:34] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [831:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'pair' @ [831:29] ==> val pair: Pair<String, String> defined in test.text.StringTest.partition[LocalVariableDescriptor]

'second' @ [831:34] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Test' @ [834:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [834:41] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'data' @ [835:20] ==> value-parameter data: CharSequence defined in test.text.StringTest.partitionCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'partition' @ [835:25] ==> public inline fun CharSequence.partition(predicate: (Char) -> Boolean): Pair<CharSequence, CharSequence> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [835:37] ==> value-parameter it: Char defined in test.text.StringTest.partitionCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [835:40] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [836:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'pair' @ [836:36] ==> val pair: Pair<CharSequence, CharSequence> defined in test.text.StringTest.partitionCharSequence.<anonymous>[LocalVariableDescriptor]

'first' @ [836:41] ==> public final val first: CharSequence defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertContentEquals' @ [837:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'pair' @ [837:36] ==> val pair: Pair<CharSequence, CharSequence> defined in test.text.StringTest.partitionCharSequence.<anonymous>[LocalVariableDescriptor]

'second' @ [837:41] ==> public final val second: CharSequence defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Test' @ [840:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [840:23] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [841:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [841:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'invoke' @ [841:45] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [841:57] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Char): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Char

'it' @ [841:63] ==> value-parameter it: Char defined in test.text.StringTest.map.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [843:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Boolean>, actual: List<Boolean>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Boolean>

'listOf' @ [843:22] ==> public fun <T> listOf(vararg elements: Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'invoke' @ [843:49] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [843:61] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Boolean): List<Boolean> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'it' @ [843:67] ==> value-parameter it: Char defined in test.text.StringTest.map.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [843:70] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [845:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Boolean>, actual: List<Boolean>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Boolean>

'listOf' @ [845:22] ==> @InlineOnly public inline fun <T> listOf(): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'invoke' @ [845:41] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [845:50] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Boolean): List<Boolean> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'it' @ [845:56] ==> value-parameter it: Char defined in test.text.StringTest.map.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [845:59] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [847:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [847:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'invoke' @ [847:42] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [847:54] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Int): List<Int> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'it' @ [847:60] ==> value-parameter it: Char defined in test.text.StringTest.map.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [847:63] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'Test' @ [850:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [850:25] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'arrayListOf' @ [851:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Char> /* = ArrayList<Char> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'invoke' @ [852:23] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'mapTo' @ [852:35] ==> public inline fun <R, C : MutableCollection<in Char>> CharSequence.mapTo(destination: ArrayList<Char> /* = ArrayList<Char> */, transform: (Char) -> Char): ArrayList<Char> /* = ArrayList<Char> */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Char
    <C : MutableCollection<in R>> -> ArrayList<Char>

'result1' @ [852:41] ==> val result1: ArrayList<Char> /* = ArrayList<Char> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'it' @ [852:52] ==> value-parameter it: Char defined in test.text.StringTest.mapTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [853:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Char> /* = ArrayList<Char> */, actual: ArrayList<Char> /* = ArrayList<Char> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Char>

'result1' @ [853:22] ==> val result1: ArrayList<Char> /* = ArrayList<Char> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'return1' @ [853:31] ==> val return1: ArrayList<Char> /* = ArrayList<Char> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [854:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Char> /* = ArrayList<Char> */, actual: ArrayList<Char> /* = ArrayList<Char> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Char>

'arrayListOf' @ [854:22] ==> public fun <T> arrayListOf(vararg elements: Char): ArrayList<Char> /* = ArrayList<Char> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'result1' @ [854:50] ==> val result1: ArrayList<Char> /* = ArrayList<Char> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'arrayListOf' @ [856:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'invoke' @ [857:23] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'mapTo' @ [857:35] ==> public inline fun <R, C : MutableCollection<in Boolean>> CharSequence.mapTo(destination: ArrayList<Boolean> /* = ArrayList<Boolean> */, transform: (Char) -> Boolean): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean
    <C : MutableCollection<in R>> -> ArrayList<Boolean>

'result2' @ [857:41] ==> val result2: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'it' @ [857:52] ==> value-parameter it: Char defined in test.text.StringTest.mapTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [857:55] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [858:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Boolean> /* = ArrayList<Boolean> */, actual: ArrayList<Boolean> /* = ArrayList<Boolean> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Boolean>

'result2' @ [858:22] ==> val result2: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'return2' @ [858:31] ==> val return2: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [859:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Boolean> /* = ArrayList<Boolean> */, actual: ArrayList<Boolean> /* = ArrayList<Boolean> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Boolean>

'arrayListOf' @ [859:22] ==> public fun <T> arrayListOf(vararg elements: Boolean): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'result2' @ [859:54] ==> val result2: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'arrayListOf' @ [861:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'invoke' @ [862:23] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'mapTo' @ [862:32] ==> public inline fun <R, C : MutableCollection<in Boolean>> CharSequence.mapTo(destination: ArrayList<Boolean> /* = ArrayList<Boolean> */, transform: (Char) -> Boolean): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean
    <C : MutableCollection<in R>> -> ArrayList<Boolean>

'result3' @ [862:38] ==> val result3: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'it' @ [862:49] ==> value-parameter it: Char defined in test.text.StringTest.mapTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [862:52] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [863:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Boolean> /* = ArrayList<Boolean> */, actual: ArrayList<Boolean> /* = ArrayList<Boolean> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Boolean>

'result3' @ [863:22] ==> val result3: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'return3' @ [863:31] ==> val return3: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [864:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Boolean> /* = ArrayList<Boolean> */, actual: ArrayList<Boolean> /* = ArrayList<Boolean> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Boolean>

'arrayListOf' @ [864:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'result3' @ [864:46] ==> val result3: ArrayList<Boolean> /* = ArrayList<Boolean> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'arrayListOf' @ [866:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'invoke' @ [867:23] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'mapTo' @ [867:35] ==> public inline fun <R, C : MutableCollection<in Int>> CharSequence.mapTo(destination: ArrayList<Int> /* = ArrayList<Int> */, transform: (Char) -> Int): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int
    <C : MutableCollection<in R>> -> ArrayList<Int>

'result4' @ [867:41] ==> val result4: ArrayList<Int> /* = ArrayList<Int> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'it' @ [867:52] ==> value-parameter it: Char defined in test.text.StringTest.mapTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [867:55] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [868:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Int> /* = ArrayList<Int> */, actual: ArrayList<Int> /* = ArrayList<Int> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Int>

'result4' @ [868:22] ==> val result4: ArrayList<Int> /* = ArrayList<Int> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'return4' @ [868:31] ==> val return4: ArrayList<Int> /* = ArrayList<Int> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [869:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<Int> /* = ArrayList<Int> */, actual: ArrayList<Int> /* = ArrayList<Int> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<Int>

'arrayListOf' @ [869:22] ==> public fun <T> arrayListOf(vararg elements: Int): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'result4' @ [869:47] ==> val result4: ArrayList<Int> /* = ArrayList<Int> */ defined in test.text.StringTest.mapTo.<anonymous>[LocalVariableDescriptor]

'Test' @ [872:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [872:27] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'data' @ [873:22] ==> value-parameter data: CharSequence defined in test.text.StringTest.flatMap.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [873:27] ==> public inline fun <R> CharSequence.flatMap(transform: (Char) -> Iterable<Char>): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Char

'+' @ [873:37] ==> public operator fun <T> Iterable<Char>.plus(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'..' @ [873:38] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'it' @ [873:43] ==> value-parameter it: Char defined in test.text.StringTest.flatMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [874:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'toList' @ [874:39] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [874:49] ==> val result: List<Char> defined in test.text.StringTest.flatMap.<anonymous>[LocalVariableDescriptor]

'Test' @ [877:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [877:24] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [879:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'data' @ [880:22] ==> val data: CharSequence defined in test.text.StringTest.fold.<anonymous>[LocalVariableDescriptor]

'fold' @ [880:27] ==> public inline fun <R> CharSequence.fold(initial: Int, operation: (Int, Char) -> Int): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'if(c.isAsciiDigit()) digits + 1 else digits' @ [880:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'c' @ [880:53] ==> value-parameter c: Char defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [880:55] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'digits' @ [880:71] ==> value-parameter digits: Int defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'digits' @ [880:87] ==> value-parameter digits: Int defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [881:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'result' @ [881:25] ==> val result: Int defined in test.text.StringTest.fold.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [884:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'invoke' @ [884:28] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'fold' @ [884:41] ==> public inline fun <R> CharSequence.fold(initial: Boolean, operation: (Boolean, Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'r' @ [884:62] ==> value-parameter r: Boolean defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [884:67] ==> value-parameter c: Char defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [884:69] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [887:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [887:22] ==> val data: CharSequence defined in test.text.StringTest.fold.<anonymous>[LocalVariableDescriptor]

'toString' @ [887:27] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'data' @ [887:39] ==> val data: CharSequence defined in test.text.StringTest.fold.<anonymous>[LocalVariableDescriptor]

'fold' @ [887:44] ==> public inline fun <R> CharSequence.fold(initial: String, operation: (String, Char) -> String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

's' @ [887:63] ==> value-parameter s: String defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [887:67] ==> value-parameter c: Char defined in test.text.StringTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [890:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [890:29] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'invoke' @ [892:20] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'data' @ [893:22] ==> val data: CharSequence defined in test.text.StringTest.foldRight.<anonymous>[LocalVariableDescriptor]

'foldRight' @ [893:27] ==> public inline fun <R> CharSequence.foldRight(initial: Int, operation: (Char, Int) -> Int): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'if(c.isAsciiDigit()) digits + 1 else digits' @ [893:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'c' @ [893:58] ==> value-parameter c: Char defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiDigit' @ [893:60] ==> public fun Char.isAsciiDigit(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'digits' @ [893:76] ==> value-parameter digits: Int defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'digits' @ [893:92] ==> value-parameter digits: Int defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [894:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'result' @ [894:25] ==> val result: Int defined in test.text.StringTest.foldRight.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [897:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'invoke' @ [897:28] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'foldRight' @ [897:41] ==> public inline fun <R> CharSequence.foldRight(initial: Boolean, operation: (Char, Boolean) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'r' @ [897:67] ==> value-parameter r: Boolean defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [897:72] ==> value-parameter c: Char defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [897:74] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [900:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [900:22] ==> val data: CharSequence defined in test.text.StringTest.foldRight.<anonymous>[LocalVariableDescriptor]

'toString' @ [900:27] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'data' @ [900:39] ==> val data: CharSequence defined in test.text.StringTest.foldRight.<anonymous>[LocalVariableDescriptor]

'foldRight' @ [900:44] ==> public inline fun <R> CharSequence.foldRight(initial: String, operation: (Char, String) -> String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

'+' @ [900:68] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

's' @ [900:73] ==> value-parameter s: Char defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [900:77] ==> value-parameter c: String defined in test.text.StringTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [903:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [903:33] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [905:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'invoke' @ [905:27] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceIndexed' @ [905:41] ==> public inline fun CharSequence.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (index == 2) c else v' @ [905:72] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'index' @ [905:76] ==> value-parameter index: Int defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [905:88] ==> value-parameter c: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [905:95] ==> value-parameter v: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [907:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char, block: () -> Char): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'reduceIndexed' @ [908:18] ==> public inline fun CharSequence.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [909:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [909:33] ==> value-parameter index: Int defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [910:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'acc' @ [910:35] ==> value-parameter acc: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [911:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'e' @ [911:35] ==> value-parameter e: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [912:17] ==> value-parameter e: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [912:22] ==> value-parameter e: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [912:26] ==> value-parameter acc: Char defined in test.text.StringTest.reduceIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [916:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'invoke' @ [917:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceIndexed' @ [917:22] ==> public inline fun CharSequence.reduceIndexed(operation: (index: Int, acc: Char, Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [921:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [921:38] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [923:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'invoke' @ [923:27] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceRightIndexed' @ [923:41] ==> public inline fun CharSequence.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (index == 2) c else v' @ [923:77] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'index' @ [923:81] ==> value-parameter index: Int defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [923:93] ==> value-parameter c: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [923:100] ==> value-parameter v: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [925:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char, block: () -> Char): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'reduceRightIndexed' @ [926:18] ==> public inline fun CharSequence.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [927:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [927:33] ==> value-parameter index: Int defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [928:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'acc' @ [928:35] ==> value-parameter acc: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [929:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'e' @ [929:35] ==> value-parameter e: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [930:17] ==> value-parameter acc: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [930:24] ==> value-parameter acc: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [930:30] ==> value-parameter e: Char defined in test.text.StringTest.reduceRightIndexed.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [934:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'invoke' @ [935:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceRightIndexed' @ [935:22] ==> public inline fun CharSequence.reduceRightIndexed(operation: (index: Int, Char, acc: Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [939:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [939:26] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [941:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'invoke' @ [941:27] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduce' @ [941:41] ==> public inline fun CharSequence.reduce(operation: (acc: Char, Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (v > c) c else v' @ [941:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'v' @ [941:62] ==> value-parameter v: Char defined in test.text.StringTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [941:66] ==> value-parameter c: Char defined in test.text.StringTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [941:69] ==> value-parameter c: Char defined in test.text.StringTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [941:76] ==> value-parameter v: Char defined in test.text.StringTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [943:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'invoke' @ [944:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduce' @ [944:22] ==> public inline fun CharSequence.reduce(operation: (acc: Char, Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [948:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [948:31] ==> public fun withOneCharSequenceArg(f: ((String) -> CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [950:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'invoke' @ [950:27] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceRight' @ [950:41] ==> public inline fun CharSequence.reduceRight(operation: (Char, acc: Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (v > c) c else v' @ [950:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'v' @ [950:67] ==> value-parameter v: Char defined in test.text.StringTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [950:71] ==> value-parameter c: Char defined in test.text.StringTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [950:74] ==> value-parameter c: Char defined in test.text.StringTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [950:81] ==> value-parameter v: Char defined in test.text.StringTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [952:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'invoke' @ [953:13] ==> public abstract operator fun invoke(p1: String): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'reduceRight' @ [953:22] ==> public inline fun CharSequence.reduceRight(operation: (Char, acc: Char) -> Char): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [957:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [957:27] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'data' @ [959:22] ==> value-parameter data: CharSequence defined in test.text.StringTest.groupBy.<anonymous>[ValueParameterDescriptorImpl]

'groupBy' @ [959:27] ==> public inline fun <K> CharSequence.groupBy(keySelector: (Char) -> Boolean): Map<Boolean, List<Char>> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Boolean

'it' @ [959:37] ==> value-parameter it: Char defined in test.text.StringTest.groupBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiUpperCase' @ [959:40] ==> public fun Char.isAsciiUpperCase(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [960:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'result' @ [960:25] ==> val result: Map<Boolean, List<Char>> defined in test.text.StringTest.groupBy.<anonymous>[LocalVariableDescriptor]

'size' @ [960:32] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [961:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>?, actual: List<Char>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>?

'listOf' @ [961:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'result' @ [961:51] ==> val result: Map<Boolean, List<Char>> defined in test.text.StringTest.groupBy.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [962:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>?, actual: List<Char>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>?

'listOf' @ [962:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'result' @ [962:47] ==> val result: Map<Boolean, List<Char>> defined in test.text.StringTest.groupBy.<anonymous>[LocalVariableDescriptor]

'Test' @ [965:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'toList' @ [966:27] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [967:22] ==> val data: List<Char> defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'joinToString' @ [967:27] ==> public fun <T> Iterable<Char>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertEquals' @ [968:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [968:35] ==> val result: String defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'toList' @ [970:38] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data2' @ [971:23] ==> val data2: List<Char> defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'joinToString' @ [971:29] ==> public fun <T> Iterable<Char>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertEquals' @ [972:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result2' @ [972:54] ==> val result2: String defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'toList' @ [974:28] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data3' @ [975:23] ==> val data3: List<Char> defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'joinToString' @ [975:29] ==> public fun <T> Iterable<Char>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'it' @ [975:46] ==> value-parameter it: Char defined in test.text.StringTest.joinToString.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [975:49] ==> @InlineOnly public inline fun Char.toUpperCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toString' @ [975:63] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [976:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result3' @ [976:36] ==> val result3: String defined in test.text.StringTest.joinToString[LocalVariableDescriptor]

'Test' @ [979:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'toList' @ [980:29] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [981:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'data' @ [982:9] ==> val data: List<Char> defined in test.text.StringTest.joinTo[LocalVariableDescriptor]

'joinTo' @ [982:14] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<Char>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char
    <A : Appendable /* = Appendable */> -> StringBuilder

'sb' @ [982:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.joinTo[LocalVariableDescriptor]

'assertEquals' @ [983:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'sb' @ [983:39] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringTest.joinTo[LocalVariableDescriptor]

'toString' @ [983:42] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Test' @ [987:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [989:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [989:30] ==> val data: String defined in test.text.StringTest.dropWhile[LocalVariableDescriptor]

'dropWhile' @ [989:35] ==> public inline fun String.dropWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [989:47] ==> value-parameter it: Char defined in test.text.StringTest.dropWhile.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [989:50] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [990:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [990:26] ==> val data: String defined in test.text.StringTest.dropWhile[LocalVariableDescriptor]

'dropWhile' @ [990:31] ==> public inline fun String.dropWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [991:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [991:32] ==> val data: String defined in test.text.StringTest.dropWhile[LocalVariableDescriptor]

'dropWhile' @ [991:37] ==> public inline fun String.dropWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [994:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [994:41] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [995:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [995:37] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'dropWhile' @ [995:42] ==> public inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [995:54] ==> value-parameter it: Char defined in test.text.StringTest.dropWhileCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [995:57] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [996:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [996:33] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'dropWhile' @ [996:38] ==> public inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [997:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [997:39] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'dropWhile' @ [997:44] ==> public inline fun CharSequence.dropWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [1001:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1003:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1003:31] ==> val data: String defined in test.text.StringTest.drop[LocalVariableDescriptor]

'drop' @ [1003:36] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [1004:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [1005:13] ==> val data: String defined in test.text.StringTest.drop[LocalVariableDescriptor]

'drop' @ [1005:18] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [1005:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1007:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1007:26] ==> val data: String defined in test.text.StringTest.drop[LocalVariableDescriptor]

'drop' @ [1007:31] ==> public fun String.drop(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [1007:36] ==> val data: String defined in test.text.StringTest.drop[LocalVariableDescriptor]

'length' @ [1007:41] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [1010:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1010:36] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [1011:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1011:38] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'drop' @ [1011:43] ==> public fun CharSequence.drop(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [1012:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [1013:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'drop' @ [1013:18] ==> public fun CharSequence.drop(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [1013:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [1015:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1015:33] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'drop' @ [1015:38] ==> public fun CharSequence.drop(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [1015:43] ==> value-parameter data: CharSequence defined in test.text.StringTest.dropCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [1015:48] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'Test' @ [1018:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1020:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1020:28] ==> val data: String defined in test.text.StringTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [1020:33] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [1020:45] ==> value-parameter it: Char defined in test.text.StringTest.takeWhile.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [1020:48] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [1021:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1021:26] ==> val data: String defined in test.text.StringTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [1021:31] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1022:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1022:32] ==> val data: String defined in test.text.StringTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [1022:37] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [1025:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1025:41] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [1026:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1026:35] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [1026:40] ==> public inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [1026:52] ==> value-parameter it: Char defined in test.text.StringTest.takeWhileCharSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAsciiLetter' @ [1026:55] ==> public fun Char.isAsciiLetter(): Boolean defined in test.text[SimpleFunctionDescriptorImpl]

'assertContentEquals' @ [1027:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1027:33] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [1027:38] ==> public inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [1028:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1028:39] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeWhileCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [1028:44] ==> public inline fun CharSequence.takeWhile(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [1031:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1033:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1033:29] ==> val data: String defined in test.text.StringTest.take[LocalVariableDescriptor]

'take' @ [1033:34] ==> public fun String.take(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [1034:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [1035:13] ==> val data: String defined in test.text.StringTest.take[LocalVariableDescriptor]

'take' @ [1035:18] ==> public fun String.take(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [1035:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1037:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [1037:22] ==> val data: String defined in test.text.StringTest.take[LocalVariableDescriptor]

'data' @ [1037:28] ==> val data: String defined in test.text.StringTest.take[LocalVariableDescriptor]

'take' @ [1037:33] ==> public fun String.take(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [1037:38] ==> val data: String defined in test.text.StringTest.take[LocalVariableDescriptor]

'length' @ [1037:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [1040:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1040:36] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

'assertEquals' @ [1041:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: CharSequence, actual: CharSequence, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> CharSequence

'data' @ [1041:29] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [1041:34] ==> public fun CharSequence.take(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [1042:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [1043:13] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [1043:18] ==> public fun CharSequence.take(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [1043:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertContentEquals' @ [1045:9] ==> public fun assertContentEquals(expected: String, actual: CharSequence, message: String? = ...): Unit defined in test.text in file StringTest.kt[SimpleFunctionDescriptorImpl]

'data' @ [1045:29] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [1045:34] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'data' @ [1045:46] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [1045:51] ==> public fun CharSequence.take(n: Int): CharSequence defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [1045:56] ==> value-parameter data: CharSequence defined in test.text.StringTest.takeCharSequence.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [1045:61] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'Test' @ [1049:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1049:41] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

's' @ [1050:22] ==> value-parameter s: CharSequence defined in test.text.StringTest.testReplaceAllClosure.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [1050:24] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [1050:39] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [1051:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mr' @ [1051:19] ==> value-parameter mr: MatchResult defined in test.text.StringTest.testReplaceAllClosure.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [1051:22] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'assertEquals' @ [1053:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [1053:38] ==> val result: String defined in test.text.StringTest.testReplaceAllClosure.<anonymous>[LocalVariableDescriptor]

'Test' @ [1056:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1056:48] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

's' @ [1057:22] ==> value-parameter s: CharSequence defined in test.text.StringTest.testReplaceAllClosureAtStart.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [1057:24] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [1057:39] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [1058:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mr' @ [1058:19] ==> value-parameter mr: MatchResult defined in test.text.StringTest.testReplaceAllClosureAtStart.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [1058:22] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'assertEquals' @ [1060:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [1060:34] ==> val result: String defined in test.text.StringTest.testReplaceAllClosureAtStart.<anonymous>[LocalVariableDescriptor]

'Test' @ [1063:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1063:46] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

's' @ [1064:22] ==> value-parameter s: CharSequence defined in test.text.StringTest.testReplaceAllClosureAtEnd.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [1064:24] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [1064:39] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [1065:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mr' @ [1065:19] ==> value-parameter mr: MatchResult defined in test.text.StringTest.testReplaceAllClosureAtEnd.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [1065:22] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'assertEquals' @ [1067:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [1067:35] ==> val result: String defined in test.text.StringTest.testReplaceAllClosureAtEnd.<anonymous>[LocalVariableDescriptor]

'Test' @ [1070:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withOneCharSequenceArg' @ [1070:46] ==> public fun withOneCharSequenceArg(arg1: String, f: (CharSequence) -> Unit): Unit defined in test.text[SimpleFunctionDescriptorImpl]

's' @ [1071:22] ==> value-parameter s: CharSequence defined in test.text.StringTest.testReplaceAllClosureEmpty.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [1071:24] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [1071:39] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1074:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [1074:26] ==> val result: String defined in test.text.StringTest.testReplaceAllClosureEmpty.<anonymous>[LocalVariableDescriptor]

'Test' @ [1078:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1082:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1084:47] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1086:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'replaceIndentByMargin' @ [1088:47] ==> public fun String.replaceIndentByMargin(newIndent: String = ..., marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1090:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1092:47] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1094:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1096:57] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1098:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1098:29] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1100:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1101:33] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1103:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1104:34] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1106:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1108:33] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1110:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1112:13] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1114:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1115:23] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1117:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1118:13] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1120:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1120:45] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1122:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimMargin' @ [1122:54] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [1125:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1129:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimIndent' @ [1131:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1133:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimIndent' @ [1136:16] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1138:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimIndent' @ [1141:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1143:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'replaceIndent' @ [1146:13] ==> public fun String.replaceIndent(newIndent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1148:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimIndent' @ [1150:16] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1152:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'trimIndent' @ [1154:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [1180:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1182:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'deindented' @ [1182:26] ==> val deindented: String defined in test.text.StringTest.trimIndent[LocalVariableDescriptor]

'lines' @ [1182:37] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'size' @ [1182:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'deindented' @ [1183:23] ==> val deindented: String defined in test.text.StringTest.trimIndent[LocalVariableDescriptor]

'lines' @ [1183:34] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [1183:42] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'!!' @ [1183:48] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: MatchResult?): MatchResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> MatchResult

'toRegex' @ [1183:56] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'find' @ [1183:66] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'it' @ [1183:71] ==> value-parameter it: String defined in test.text.StringTest.trimIndent.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [1183:77] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'length' @ [1183:83] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [1184:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'indents' @ [1184:25] ==> val indents: List<Int> defined in test.text.StringTest.trimIndent[LocalVariableDescriptor]

'min' @ [1184:33] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'assertEquals' @ [1185:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'indents' @ [1185:26] ==> val indents: List<Int> defined in test.text.StringTest.trimIndent[LocalVariableDescriptor]

'max' @ [1185:34] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'assertEquals' @ [1186:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'deindented' @ [1186:25] ==> val deindented: String defined in test.text.StringTest.trimIndent[LocalVariableDescriptor]

'lines' @ [1186:36] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'count' @ [1186:44] ==> public inline fun <T> Iterable<String>.count(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [1186:52] ==> value-parameter it: String defined in test.text.StringTest.trimIndent.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [1186:55] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [1189:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [1190:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'prependIndent' @ [1190:49] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1191:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'prependIndent' @ [1191:55] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1192:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'prependIndent' @ [1192:56] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1193:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'prependIndent' @ [1193:59] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [1194:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'prependIndent' @ [1194:31] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

