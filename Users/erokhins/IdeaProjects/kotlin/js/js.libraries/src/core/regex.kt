'' @ [26:16] ==> private constructor RegexOption(value: String) defined in kotlin.text.RegexOption[ClassConstructorDescriptorImpl]

'' @ [31:14] ==> private constructor RegexOption(value: String) defined in kotlin.text.RegexOption[ClassConstructorDescriptorImpl]

'pattern' @ [49:34] ==> value-parameter pattern: String defined in kotlin.text.Regex.<init>[ValueParameterDescriptorImpl]

'options' @ [51:44] ==> value-parameter options: Set<RegexOption> defined in kotlin.text.Regex.<init>[ValueParameterDescriptorImpl]

'toSet' @ [51:52] ==> public fun <T> Iterable<RegexOption>.toSet(): Set<RegexOption> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> RegexOption

'RegExp' @ [52:41] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'pattern' @ [52:48] ==> value-parameter pattern: String defined in kotlin.text.Regex.<init>[ValueParameterDescriptorImpl]

'options' @ [52:57] ==> value-parameter options: Set<RegexOption> defined in kotlin.text.Regex.<init>[ValueParameterDescriptorImpl]

'map' @ [52:65] ==> public inline fun <T, R> Iterable<RegexOption>.map(transform: (RegexOption) -> String): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> RegexOption
    <R> -> String

'it' @ [52:71] ==> value-parameter it: RegexOption defined in kotlin.text.Regex.nativePattern.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [52:74] ==> public final val value: String defined in kotlin.text.RegexOption[PropertyDescriptorImpl]

'joinToString' @ [52:82] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'nativePattern' @ [56:9] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'reset' @ [56:23] ==> public fun RegExp.reset(): Unit defined in kotlin.js in file regexp.kt[SimpleFunctionDescriptorImpl]

'nativePattern' @ [57:21] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'exec' @ [57:35] ==> public final fun exec(str: String): RegExpMatch? defined in kotlin.js.RegExp[SimpleFunctionDescriptorImpl]

'input' @ [57:40] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.matches[ValueParameterDescriptorImpl]

'toString' @ [57:46] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'match' @ [58:16] ==> val match: RegExpMatch? defined in kotlin.text.Regex.matches[LocalVariableDescriptor]

'match' @ [58:33] ==> val match: RegExpMatch? defined in kotlin.text.Regex.matches[LocalVariableDescriptor]

'index' @ [58:39] ==> public abstract val index: Int defined in kotlin.js.RegExpMatch[PropertyDescriptorImpl]

'nativePattern' @ [58:53] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'lastIndex' @ [58:67] ==> public final var lastIndex: Int defined in kotlin.js.RegExp[PropertyDescriptorImpl]

'input' @ [58:80] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.matches[ValueParameterDescriptorImpl]

'length' @ [58:86] ==> public abstract val length: Int defined in kotlin.CharSequence[PropertyDescriptorImpl]

'nativePattern' @ [63:9] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'reset' @ [63:23] ==> public fun RegExp.reset(): Unit defined in kotlin.js in file regexp.kt[SimpleFunctionDescriptorImpl]

'nativePattern' @ [64:16] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'test' @ [64:30] ==> public final fun test(str: String): Boolean defined in kotlin.js.RegExp[SimpleFunctionDescriptorImpl]

'input' @ [64:35] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.containsMatchIn[ValueParameterDescriptorImpl]

'toString' @ [64:41] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'nativePattern' @ [72:79] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'findNext' @ [72:93] ==> private fun RegExp.findNext(input: String, from: Int): MatchResult? defined in kotlin.text in file regex.kt[SimpleFunctionDescriptorImpl]

'input' @ [72:102] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.find[ValueParameterDescriptorImpl]

'toString' @ [72:108] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [72:120] ==> value-parameter startIndex: Int = ... defined in kotlin.text.Regex.find[ValueParameterDescriptorImpl]

'generateSequence' @ [76:91] ==> public fun <T : Any> generateSequence(seedFunction: () -> MatchResult?, nextFunction: (MatchResult) -> MatchResult?): Sequence<MatchResult> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MatchResult

'find' @ [76:110] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'input' @ [76:115] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.findAll[ValueParameterDescriptorImpl]

'startIndex' @ [76:122] ==> value-parameter startIndex: Int = ... defined in kotlin.text.Regex.findAll[ValueParameterDescriptorImpl]

'match' @ [76:148] ==> value-parameter match: MatchResult defined in kotlin.text.Regex.findAll.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [76:154] ==> public abstract fun next(): MatchResult? defined in kotlin.text.MatchResult[SimpleFunctionDescriptorImpl]

'if (pattern.startsWith('^') && pattern.endsWith('$'))
            return find(input)
        else
            return Regex("^${pattern.trimStart('^').trimEnd('$')}$", options).find(input)' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'pattern' @ [84:13] ==> public final val pattern: String defined in kotlin.text.Regex[PropertyDescriptorImpl]

'startsWith' @ [84:21] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'pattern' @ [84:40] ==> public final val pattern: String defined in kotlin.text.Regex[PropertyDescriptorImpl]

'endsWith' @ [84:48] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'find' @ [85:20] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'input' @ [85:25] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.matchEntire[ValueParameterDescriptorImpl]

'Regex' @ [87:20] ==> public constructor Regex(pattern: String, options: Set<RegexOption>) defined in kotlin.text.Regex[ClassConstructorDescriptorImpl]

'pattern' @ [87:30] ==> public final val pattern: String defined in kotlin.text.Regex[PropertyDescriptorImpl]

'trimStart' @ [87:38] ==> public fun String.trimStart(vararg chars: Char): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'trimEnd' @ [87:53] ==> public fun String.trimEnd(vararg chars: Char): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'options' @ [87:70] ==> public final val options: Set<RegexOption> defined in kotlin.text.Regex[PropertyDescriptorImpl]

'find' @ [87:79] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'input' @ [87:84] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.matchEntire[ValueParameterDescriptorImpl]

'input' @ [95:76] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'toString' @ [95:82] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'nativeReplace' @ [95:93] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'nativePattern' @ [95:107] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'replacement' @ [95:122] ==> value-parameter replacement: String defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'find' @ [103:21] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'input' @ [103:26] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'match' @ [104:13] ==> var match: MatchResult? defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'input' @ [104:35] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'toString' @ [104:41] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'input' @ [107:22] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'length' @ [107:28] ==> public abstract val length: Int defined in kotlin.CharSequence[PropertyDescriptorImpl]

'StringBuilder' @ [108:18] ==> public constructor StringBuilder(@Suppress capacity: Int) defined in kotlin.text.StringBuilder[ClassConstructorDescriptorImpl]

'length' @ [108:32] ==> val length: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'match' @ [110:30] ==> var match: MatchResult? defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'sb' @ [111:13] ==> val sb: StringBuilder defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'append' @ [111:16] ==> public open fun append(csq: CharSequence?, start: Int, end: Int): StringBuilder defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'input' @ [111:23] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'lastStart' @ [111:30] ==> var lastStart: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'foundMatch' @ [111:41] ==> val foundMatch: MatchResult defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'range' @ [111:52] ==> public abstract val range: IntRange defined in kotlin.text.MatchResult[PropertyDescriptorImpl]

'start' @ [111:58] ==> public open val start: Int defined in kotlin.ranges.IntRange[PropertyDescriptorImpl]

'sb' @ [112:13] ==> val sb: StringBuilder defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'append' @ [112:16] ==> public open fun append(csq: CharSequence?): StringBuilder defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'invoke' @ [112:23] ==> public abstract operator fun invoke(p1: MatchResult): CharSequence defined in kotlin.Function1[FunctionInvokeDescriptor]

'foundMatch' @ [112:33] ==> val foundMatch: MatchResult defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'lastStart' @ [113:13] ==> var lastStart: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'foundMatch' @ [113:25] ==> val foundMatch: MatchResult defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'range' @ [113:36] ==> public abstract val range: IntRange defined in kotlin.text.MatchResult[PropertyDescriptorImpl]

'endInclusive' @ [113:42] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[PropertyDescriptorImpl]

'match' @ [114:13] ==> var match: MatchResult? defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'foundMatch' @ [114:21] ==> val foundMatch: MatchResult defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'next' @ [114:32] ==> public abstract fun next(): MatchResult? defined in kotlin.text.MatchResult[SimpleFunctionDescriptorImpl]

'lastStart' @ [116:16] ==> var lastStart: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'length' @ [116:28] ==> val length: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'match' @ [116:38] ==> var match: MatchResult? defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'lastStart' @ [118:13] ==> var lastStart: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'length' @ [118:25] ==> val length: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'sb' @ [119:13] ==> val sb: StringBuilder defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'append' @ [119:16] ==> public open fun append(csq: CharSequence?, start: Int, end: Int): StringBuilder defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'input' @ [119:23] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replace[ValueParameterDescriptorImpl]

'lastStart' @ [119:30] ==> var lastStart: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'length' @ [119:41] ==> val length: Int defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'sb' @ [122:16] ==> val sb: StringBuilder defined in kotlin.text.Regex.replace[LocalVariableDescriptor]

'toString' @ [122:19] ==> public open fun toString(): String defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

'options' @ [131:32] ==> public final val options: Set<RegexOption> defined in kotlin.text.Regex[PropertyDescriptorImpl]

'map' @ [131:40] ==> public inline fun <T, R> Iterable<RegexOption>.map(transform: (RegexOption) -> String): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> RegexOption
    <R> -> String

'it' @ [131:46] ==> value-parameter it: RegexOption defined in kotlin.text.Regex.replaceFirst.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [131:49] ==> public final val value: String defined in kotlin.text.RegexOption[PropertyDescriptorImpl]

'joinToString' @ [131:57] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'input' @ [132:16] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.replaceFirst[ValueParameterDescriptorImpl]

'toString' @ [132:22] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'nativeReplace' @ [132:33] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'RegExp' @ [132:47] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'pattern' @ [132:54] ==> public final val pattern: String defined in kotlin.text.Regex[PropertyDescriptorImpl]

'nonGlobalOptions' @ [132:63] ==> val nonGlobalOptions: String defined in kotlin.text.Regex.replaceFirst[LocalVariableDescriptor]

'replacement' @ [132:82] ==> value-parameter replacement: String defined in kotlin.text.Regex.replaceFirst[ValueParameterDescriptorImpl]

'require' @ [141:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'limit' @ [141:17] ==> value-parameter limit: Int = ... defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'limit' @ [141:69] ==> value-parameter limit: Int = ... defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'findAll' @ [142:23] ==> public final fun findAll(input: CharSequence, startIndex: Int = ...): Sequence<MatchResult> defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'input' @ [142:31] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'let' @ [142:38] ==> @InlineOnly public inline fun <T, R> Sequence<MatchResult>.let(block: (Sequence<MatchResult>) -> Sequence<MatchResult>): Sequence<MatchResult> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Sequence<MatchResult>
    <R> -> Sequence<MatchResult>

'if (limit == 0) it else it.take(limit - 1)' @ [142:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<MatchResult>, elseBranch: Sequence<MatchResult>): Sequence<MatchResult>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<MatchResult>

'limit' @ [142:48] ==> value-parameter limit: Int = ... defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'it' @ [142:60] ==> value-parameter it: Sequence<MatchResult> defined in kotlin.text.Regex.split.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [142:68] ==> value-parameter it: Sequence<MatchResult> defined in kotlin.text.Regex.split.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [142:71] ==> public fun <T> Sequence<MatchResult>.take(n: Int): Sequence<MatchResult> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MatchResult

'limit' @ [142:76] ==> value-parameter limit: Int = ... defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'mutableListOf' @ [143:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'matches' @ [146:23] ==> val matches: Sequence<MatchResult> defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'result' @ [147:13] ==> val result: MutableList<String> defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'add' @ [147:20] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'input' @ [147:24] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'subSequence' @ [147:30] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[SimpleFunctionDescriptorImpl]

'lastStart' @ [147:42] ==> var lastStart: Int defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'match' @ [147:53] ==> val match: MatchResult defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'range' @ [147:59] ==> public abstract val range: IntRange defined in kotlin.text.MatchResult[PropertyDescriptorImpl]

'start' @ [147:65] ==> public open val start: Int defined in kotlin.ranges.IntRange[PropertyDescriptorImpl]

'toString' @ [147:72] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'lastStart' @ [148:13] ==> var lastStart: Int defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'match' @ [148:25] ==> val match: MatchResult defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'range' @ [148:31] ==> public abstract val range: IntRange defined in kotlin.text.MatchResult[PropertyDescriptorImpl]

'endInclusive' @ [148:37] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[PropertyDescriptorImpl]

'result' @ [150:9] ==> val result: MutableList<String> defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'add' @ [150:16] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'input' @ [150:20] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'subSequence' @ [150:26] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[SimpleFunctionDescriptorImpl]

'lastStart' @ [150:38] ==> var lastStart: Int defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'input' @ [150:49] ==> value-parameter input: CharSequence defined in kotlin.text.Regex.split[ValueParameterDescriptorImpl]

'length' @ [150:55] ==> public abstract val length: Int defined in kotlin.CharSequence[PropertyDescriptorImpl]

'toString' @ [150:63] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'result' @ [151:16] ==> val result: MutableList<String> defined in kotlin.text.Regex.split[LocalVariableDescriptor]

'nativePattern' @ [155:46] ==> private final val nativePattern: RegExp defined in kotlin.text.Regex[PropertyDescriptorImpl]

'toString' @ [155:60] ==> public open fun toString(): String defined in kotlin.js.RegExp[SimpleFunctionDescriptorImpl]

'Regex' @ [159:58] ==> public fun Regex(pattern: String): Regex defined in kotlin.text in file regex.kt[SimpleFunctionDescriptorImpl]

'escape' @ [159:64] ==> public final fun escape(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'literal' @ [159:71] ==> value-parameter literal: String defined in kotlin.text.Regex.Companion.fromLiteral[ValueParameterDescriptorImpl]

'literal' @ [162:54] ==> value-parameter literal: String defined in kotlin.text.Regex.Companion.escape[ValueParameterDescriptorImpl]

'nativeReplace' @ [162:62] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'patternEscape' @ [162:76] ==> private final val patternEscape: RegExp defined in kotlin.text.Regex.Companion[PropertyDescriptorImpl]

'literal' @ [165:65] ==> value-parameter literal: String defined in kotlin.text.Regex.Companion.escapeReplacement[ValueParameterDescriptorImpl]

'nativeReplace' @ [165:73] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'replacementEscape' @ [165:87] ==> private final val replacementEscape: RegExp defined in kotlin.text.Regex.Companion[PropertyDescriptorImpl]

'RegExp' @ [167:37] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'RegExp' @ [168:41] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'Regex' @ [173:65] ==> public constructor Regex(pattern: String, options: Set<RegexOption>) defined in kotlin.text.Regex[ClassConstructorDescriptorImpl]

'pattern' @ [173:71] ==> value-parameter pattern: String defined in kotlin.text.Regex[ValueParameterDescriptorImpl]

'setOf' @ [173:80] ==> public fun <T> setOf(element: RegexOption): Set<RegexOption> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> RegexOption

'option' @ [173:86] ==> value-parameter option: RegexOption defined in kotlin.text.Regex[ValueParameterDescriptorImpl]

'Regex' @ [176:44] ==> public constructor Regex(pattern: String, options: Set<RegexOption>) defined in kotlin.text.Regex[ClassConstructorDescriptorImpl]

'pattern' @ [176:50] ==> value-parameter pattern: String defined in kotlin.text.Regex[ValueParameterDescriptorImpl]

'emptySet' @ [176:59] ==> public fun <T> emptySet(): Set<RegexOption> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> RegexOption

'this' @ [182:5] ==> <this> defined in kotlin.text.findNext[ReceiverParameterDescriptorImpl]

'lastIndex' @ [182:10] ==> public final var lastIndex: Int defined in kotlin.js.RegExp[PropertyDescriptorImpl]

'from' @ [182:22] ==> value-parameter from: Int defined in kotlin.text.findNext[ValueParameterDescriptorImpl]

'exec' @ [183:17] ==> public final fun exec(str: String): RegExpMatch? defined in kotlin.js.RegExp[SimpleFunctionDescriptorImpl]

'input' @ [183:22] ==> value-parameter input: String defined in kotlin.text.findNext[ValueParameterDescriptorImpl]

'match' @ [184:9] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'match' @ [185:17] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'index' @ [185:23] ==> public abstract val index: Int defined in kotlin.js.RegExpMatch[PropertyDescriptorImpl]

'lastIndex' @ [185:30] ==> public final var lastIndex: Int defined in kotlin.js.RegExp[PropertyDescriptorImpl]

'range' @ [188:40] ==> val range: IntRange defined in kotlin.text.findNext[LocalVariableDescriptor]

'match' @ [190:21] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'AbstractCollection<MatchGroup?>' @ [192:84] ==> protected constructor AbstractCollection<out E>() defined in kotlin.collections.AbstractCollection[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> MatchGroup?

'match' @ [193:44] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'length' @ [193:50] ==> public abstract val length: Int defined in kotlin.js.RegExpMatch[PropertyDescriptorImpl]

'indices' @ [194:62] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections in file Collections.kt[PropertyDescriptorImpl]

'asSequence' @ [194:70] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'map' @ [194:83] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> MatchGroup?): Sequence<MatchGroup?> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int
    <R> -> MatchGroup?

'this' @ [194:89] ==> <this> defined in kotlin.text.findNext.<no name provided>.groups.<no name provided>[LazyClassReceiverParameterDescriptor]

'it' @ [194:94] ==> value-parameter it: Int defined in kotlin.text.findNext.<no name provided>.groups.<no name provided>.iterator.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [194:100] ==> public abstract operator fun iterator(): Iterator<MatchGroup?> defined in kotlin.sequences.Sequence[SimpleFunctionDescriptorImpl]

'match' @ [195:57] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'index' @ [195:63] ==> value-parameter index: Int defined in kotlin.text.findNext.<no name provided>.groups.<no name provided>.get[ValueParameterDescriptorImpl]

'let' @ [195:71] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> MatchGroup): MatchGroup defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> MatchGroup

'MatchGroup' @ [195:77] ==> public constructor MatchGroup(value: String) defined in kotlin.text.MatchGroup[ClassConstructorDescriptorImpl]

'it' @ [195:88] ==> value-parameter it: String defined in kotlin.text.findNext.<no name provided>.groups.<no name provided>.get.<anonymous>[ValueParameterDescriptorImpl]

'groupValues_' @ [203:21] ==> private final var groupValues_: List<String>? defined in kotlin.text.findNext.<no name provided>[PropertyDescriptorImpl]

'groupValues_' @ [204:21] ==> private final var groupValues_: List<String>? defined in kotlin.text.findNext.<no name provided>[PropertyDescriptorImpl]

'AbstractList<String>' @ [204:45] ==> protected constructor AbstractList<out E>() defined in kotlin.collections.AbstractList[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> String

'match' @ [205:56] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'length' @ [205:62] ==> public abstract val length: Int defined in kotlin.js.RegExpMatch[PropertyDescriptorImpl]

'match' @ [206:64] ==> val match: RegExpMatch? defined in kotlin.text.findNext[LocalVariableDescriptor]

'index' @ [206:70] ==> value-parameter index: Int defined in kotlin.text.findNext.<no name provided>.<get-groupValues>.<no name provided>.get[ValueParameterDescriptorImpl]

'groupValues_' @ [209:24] ==> private final var groupValues_: List<String>? defined in kotlin.text.findNext.<no name provided>[PropertyDescriptorImpl]

'this@findNext' @ [212:45] ==> <this> defined in kotlin.text.findNext[ReceiverParameterDescriptorImpl]

'findNext' @ [212:59] ==> private fun RegExp.findNext(input: String, from: Int): MatchResult? defined in kotlin.text in file regex.kt[SimpleFunctionDescriptorImpl]

'input' @ [212:68] ==> value-parameter input: String defined in kotlin.text.findNext[ValueParameterDescriptorImpl]

'if (range.isEmpty()) range.start + 1 else range.endInclusive + 1' @ [212:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'range' @ [212:79] ==> val range: IntRange defined in kotlin.text.findNext[LocalVariableDescriptor]

'isEmpty' @ [212:85] ==> public open fun isEmpty(): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'range' @ [212:96] ==> val range: IntRange defined in kotlin.text.findNext[LocalVariableDescriptor]

'start' @ [212:102] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [212:117] ==> val range: IntRange defined in kotlin.text.findNext[LocalVariableDescriptor]

'endInclusive' @ [212:123] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

