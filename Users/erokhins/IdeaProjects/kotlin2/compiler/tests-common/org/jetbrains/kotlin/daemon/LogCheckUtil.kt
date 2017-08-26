'LinePattern' @ [23:83] ==> public constructor LinePattern(regex: Regex, matchCheck: (MatchResult) -> Boolean = ...) defined in org.jetbrains.kotlin.daemon.LinePattern[ClassConstructorDescriptorImpl]

'regex' @ [23:95] ==> value-parameter regex: String defined in org.jetbrains.kotlin.daemon.LinePattern[ValueParameterDescriptorImpl]

'toRegex' @ [23:101] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'matchCheck' @ [23:112] ==> value-parameter matchCheck: (MatchResult) -> Boolean = ... defined in org.jetbrains.kotlin.daemon.LinePattern[ValueParameterDescriptorImpl]

'EndBoundIteratorWithValue' @ [32:20] ==> public constructor EndBoundIteratorWithValue<T : Any, Iter : Iterator<LinePattern>>(base: Iterator<LinePattern>) defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> LinePattern
    <Iter : Iterator<T>> -> Iterator<LinePattern>

'it' @ [32:46] ==> value-parameter it: Iterator<LinePattern> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator.<init>[ValueParameterDescriptorImpl]

'iter' @ [35:49] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'traverseNext' @ [35:54] ==> public final fun traverseNext(): EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[SimpleFunctionDescriptorImpl]

'lastMatchedLineNo' @ [35:70] ==> public final var lastMatchedLineNo: Int defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'lineNo' @ [35:90] ==> public final var lineNo: Int defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'nextLine' @ [35:105] ==> public final fun nextLine(): Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[SimpleFunctionDescriptorImpl]

'lineNo' @ [36:39] ==> public final var lineNo: Int defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'this' @ [36:56] ==> <this> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[LazyClassReceiverParameterDescriptor]

'fold' @ [38:15] ==> public inline fun <T, R> Sequence<String>.fold(initial: Accumulator, operation: (Accumulator, String) -> Accumulator): Accumulator defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Accumulator

'Accumulator' @ [38:20] ==> public constructor Accumulator(it: Iterator<LinePattern>) defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[ClassConstructorDescriptorImpl]

'patternsIter' @ [38:32] ==> value-parameter patternsIter: Iterator<LinePattern> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[ValueParameterDescriptorImpl]

'when {
                           !acc.iter.isValid() -> return@fold acc
                           acc.iter.value.regex.find(line)?.let { acc.iter.value.matchCheck(it) } ?: false -> acc.nextLineAndPattern()
                           else -> acc.nextLine()
                       }' @ [40:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Accumulator, entry1: Accumulator, entry2: Accumulator): Accumulator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Accumulator

'!' @ [41:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'acc' @ [41:29] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'iter' @ [41:33] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'isValid' @ [41:38] ==> public final fun isValid(): Boolean defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[SimpleFunctionDescriptorImpl]

'acc' @ [41:63] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [42:28] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'iter' @ [42:32] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'value' @ [42:37] ==> public final val value: LinePattern defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'regex' @ [42:43] ==> public final val regex: Regex defined in org.jetbrains.kotlin.daemon.LinePattern[PropertyDescriptorImpl]

'find' @ [42:49] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'line' @ [42:54] ==> value-parameter line: String defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [42:61] ==> @InlineOnly public inline fun <T, R> MatchResult.let(block: (MatchResult) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> Boolean

'acc' @ [42:67] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'iter' @ [42:71] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'value' @ [42:76] ==> public final val value: LinePattern defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'invoke' @ [42:82] ==> public abstract operator fun invoke(p1: MatchResult): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [42:93] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [42:111] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'nextLineAndPattern' @ [42:115] ==> public final fun nextLineAndPattern(): Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[SimpleFunctionDescriptorImpl]

'acc' @ [43:36] ==> value-parameter acc: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'nextLine' @ [43:40] ==> public final fun nextLine(): Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[SimpleFunctionDescriptorImpl]

'res' @ [46:9] ==> val res: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[LocalVariableDescriptor]

'iter' @ [46:13] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'isValid' @ [46:18] ==> public final fun isValid(): Boolean defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[SimpleFunctionDescriptorImpl]

'invoke' @ [47:9] ==> public abstract operator fun invoke(p1: LinePattern, p2: Int): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'res' @ [47:14] ==> val res: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[LocalVariableDescriptor]

'iter' @ [47:18] ==> public final val iter: EndBoundIteratorWithValue<LinePattern, Iterator<LinePattern>> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'value' @ [47:23] ==> public final val value: LinePattern defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'res' @ [47:30] ==> val res: Accumulator defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[LocalVariableDescriptor]

'lastMatchedLineNo' @ [47:34] ==> public final var lastMatchedLineNo: Int defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence.Accumulator[PropertyDescriptorImpl]

'ifNotContainsSequence' @ [58:5] ==> public fun Sequence<String>.ifNotContainsSequence(patternsIter: Iterator<LinePattern>, body: (LinePattern, Int) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'patterns' @ [58:27] ==> value-parameter patterns: List<LinePattern> defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[ValueParameterDescriptorImpl]

'iterator' @ [58:36] ==> public abstract fun iterator(): Iterator<LinePattern> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'body' @ [58:48] ==> value-parameter body: (LinePattern, Int) -> Unit defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[ValueParameterDescriptorImpl]

'ifNotContainsSequence' @ [68:5] ==> public fun Sequence<String>.ifNotContainsSequence(patternsIter: Iterator<LinePattern>, body: (LinePattern, Int) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'patterns' @ [68:27] ==> value-parameter vararg patterns: LinePattern defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[ValueParameterDescriptorImpl]

'iterator' @ [68:36] ==> public final operator fun iterator(): Iterator<LinePattern> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'body' @ [68:48] ==> value-parameter body: (LinePattern, Int) -> Unit defined in org.jetbrains.kotlin.daemon.ifNotContainsSequence[ValueParameterDescriptorImpl]

'base' @ [76:30] ==> public final val base: Iter defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'nextOrNull' @ [76:35] ==> private fun <T : Any> Iterator<T>.nextOrNull(): T? defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'_value' @ [78:26] ==> private final var _value: T? defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'Exception' @ [78:42] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'_value' @ [80:30] ==> private final var _value: T? defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'_value' @ [83:9] ==> private final var _value: T? defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'base' @ [83:18] ==> public final val base: Iter defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[PropertyDescriptorImpl]

'nextOrNull' @ [83:23] ==> private fun <T : Any> Iterator<T>.nextOrNull(): T? defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'this' @ [84:16] ==> <this> defined in org.jetbrains.kotlin.daemon.EndBoundIteratorWithValue[LazyClassReceiverParameterDescriptor]

'if (hasNext()) next() else null' @ [88:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'hasNext' @ [88:56] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'next' @ [88:67] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

