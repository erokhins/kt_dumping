'!=' @ [24:32] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getenv' @ [24:39] ==> public open fun getenv(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'AtomicLong' @ [26:29] ==> public constructor AtomicLong() defined in java.util.concurrent.atomic.AtomicLong[JavaClassConstructorDescriptor]

'when (c) {
            '\n' -> 'n'
            '\r' -> 'r'
            '\u0085' -> 'x' // next-line character
            '\u2028' -> 'l' // line-separator character
            '\u2029' -> 'p' // paragraph-separator character
            '|' -> '|'
            '\'' -> '\''
            '[' -> '['
            ']' -> ']'
            else -> 0.toChar()
        }' @ [30:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Char, entry1: Char, entry2: Char, entry3: Char, entry4: Char, entry5: Char, entry6: Char, entry7: Char, entry8: Char, entry9: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Char

'c' @ [30:22] ==> value-parameter c: Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escapedChar[ValueParameterDescriptorImpl]

'toChar' @ [40:23] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [45:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'text' @ [46:19] ==> value-parameter text: String defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[ValueParameterDescriptorImpl]

'toCharArray' @ [46:24] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'escapedChar' @ [47:27] ==> private final fun escapedChar(c: Char): Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'c' @ [47:39] ==> val c: Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'if (escChar == 0.toChar()) {
                escaped.append(c)
            }
            else {
                escaped.append('|').append(escChar)
            }' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'escChar' @ [48:17] ==> val escChar: Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'toChar' @ [48:30] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'escaped' @ [49:17] ==> val escaped: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'append' @ [49:25] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [49:32] ==> val c: Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'escaped' @ [52:17] ==> val escaped: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'append' @ [52:25] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [52:37] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'escChar' @ [52:44] ==> val escChar: Char defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'escaped' @ [56:16] ==> val escaped: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.escape[LocalVariableDescriptor]

'toString' @ [56:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnTeamcity' @ [60:14] ==> private final val isOnTeamcity: Boolean defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[PropertyDescriptorImpl]

'totalTime' @ [62:9] ==> private final val totalTime: AtomicLong defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[PropertyDescriptorImpl]

'addAndGet' @ [62:19] ==> public final fun addAndGet(p0: Long): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'timeToCompileNs' @ [62:29] ==> value-parameter timeToCompileNs: Long defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.registerStatistic[ValueParameterDescriptorImpl]

'printPerChunkStatistics' @ [63:9] ==> private final fun printPerChunkStatistics(moduleChunk: ModuleChunk, timeToCompileNs: Long): Unit defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'moduleChunk' @ [63:33] ==> value-parameter moduleChunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.registerStatistic[ValueParameterDescriptorImpl]

'timeToCompileNs' @ [63:46] ==> value-parameter timeToCompileNs: Long defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.registerStatistic[ValueParameterDescriptorImpl]

'printStatisticMessage' @ [67:9] ==> private final fun printStatisticMessage(key: String, value: String): Unit defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'KotlinBuilder' @ [68:20] ==> public companion object defined in org.jetbrains.kotlin.jps.build.KotlinBuilder[FakeCallableDescriptorForObject]

'KOTLIN_BUILDER_NAME' @ [68:34] ==> @JvmField public final val KOTLIN_BUILDER_NAME: String defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[PropertyDescriptorImpl]

'moduleChunk' @ [68:61] ==> value-parameter moduleChunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.printPerChunkStatistics[ValueParameterDescriptorImpl]

'presentableShortName' @ [68:73] ==> public final val ModuleChunk.presentableShortName: (String..String?)[MyPropertyDescriptor]

'timeToCompileNs' @ [69:17] ==> value-parameter timeToCompileNs: Long defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.printPerChunkStatistics[ValueParameterDescriptorImpl]

'nanosToMillis' @ [69:33] ==> private final fun Long.nanosToMillis(): Long defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'toString' @ [69:49] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnTeamcity' @ [74:14] ==> private final val isOnTeamcity: Boolean defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[PropertyDescriptorImpl]

'printStatisticMessage' @ [76:9] ==> private final fun printStatisticMessage(key: String, value: String): Unit defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'KotlinBuilder' @ [77:20] ==> public companion object defined in org.jetbrains.kotlin.jps.build.KotlinBuilder[FakeCallableDescriptorForObject]

'KOTLIN_BUILDER_NAME' @ [77:34] ==> @JvmField public final val KOTLIN_BUILDER_NAME: String defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[PropertyDescriptorImpl]

'totalTime' @ [78:17] ==> private final val totalTime: AtomicLong defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[PropertyDescriptorImpl]

'get' @ [78:27] ==> public final fun get(): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'nanosToMillis' @ [78:33] ==> private final fun Long.nanosToMillis(): Long defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'toString' @ [78:49] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'println' @ [84:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'escape' @ [84:56] ==> private final fun escape(text: String): String defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'key' @ [84:63] ==> value-parameter key: String defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.printStatisticMessage[ValueParameterDescriptorImpl]

'escape' @ [84:79] ==> private final fun escape(text: String): String defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger[SimpleFunctionDescriptorImpl]

'value' @ [84:86] ==> value-parameter value: String defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.printStatisticMessage[ValueParameterDescriptorImpl]

'toMillis' @ [87:61] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'this' @ [87:70] ==> <this> defined in org.jetbrains.kotlin.jps.build.TeamcityStatisticsLogger.nanosToMillis[ReceiverParameterDescriptorImpl]

