'loggerNames' @ [18:22] ==> value-parameter vararg loggerNames: String defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'component1' @ [19:18] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [19:24] ==> public final operator fun component2(): (Level..Level?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (spec[0]) {
                '+' -> spec.substring(1) to Level.ALL
                '-' -> spec.substring(1) to Level.OFF
                else -> spec to Level.ALL
            }' @ [19:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<String, (Level..Level?)>, entry1: Pair<String, (Level..Level?)>, entry2: Pair<String, (Level..Level?)>): Pair<String, (Level..Level?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<String, (org.apache.logging.log4j.Level..org.apache.logging.log4j.Level?)>

'spec' @ [19:39] ==> val spec: String defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'spec' @ [20:24] ==> val spec: String defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'substring' @ [20:29] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ALL' @ [20:51] ==> public final val ALL: (Level..Level?) defined in org.apache.logging.log4j.Level[JavaPropertyDescriptor]

'spec' @ [21:24] ==> val spec: String defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'substring' @ [21:29] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'OFF' @ [21:51] ==> public final val OFF: (Level..Level?) defined in org.apache.logging.log4j.Level[JavaPropertyDescriptor]

'spec' @ [22:25] ==> val spec: String defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'ALL' @ [22:39] ==> public final val ALL: (Level..Level?) defined in org.apache.logging.log4j.Level[JavaPropertyDescriptor]

'setLevel' @ [24:13] ==> private final fun setLevel(name: String, level: Level): Unit defined in net.corda.testing.LogHelper[SimpleFunctionDescriptorImpl]

'name' @ [24:22] ==> val name: String defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'level' @ [24:28] ==> val level: (Level..Level?) defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'setLevel' @ [28:47] ==> public final fun setLevel(vararg loggerNames: String): Unit defined in net.corda.testing.LogHelper[SimpleFunctionDescriptorImpl]

'classes' @ [28:57] ==> value-parameter vararg classes: KClass<*> defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'map' @ [28:65] ==> public inline fun <T, R> Array<out KClass<*>>.map(transform: (KClass<*>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<*>
    <R> -> String

'+' @ [28:71] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [28:77] ==> value-parameter it: KClass<*> defined in net.corda.testing.LogHelper.setLevel.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [28:80] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'`package`' @ [28:85] ==> public final val <T : (Any..Any?)> Class<out Any>.`package`: (Package..Package?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'name' @ [28:95] ==> public final val Package.name: (String..String?)[MyPropertyDescriptor]

'toTypedArray' @ [28:102] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'getContext' @ [32:40] ==> public open fun getContext(p0: Boolean): (LoggerContext..LoggerContext?) defined in org.apache.logging.log4j.LogManager[JavaMethodDescriptor]

'loggerContext' @ [33:22] ==> val loggerContext: LoggerContext defined in net.corda.testing.LogHelper.reset[LocalVariableDescriptor]

'configuration' @ [33:36] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'names' @ [34:9] ==> value-parameter vararg names: String defined in net.corda.testing.LogHelper.reset[ValueParameterDescriptorImpl]

'forEach' @ [34:15] ==> public inline fun <T> Array<out String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'config' @ [34:25] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.reset[LocalVariableDescriptor]

'removeLogger' @ [34:32] ==> public abstract fun removeLogger(p0: (String..String?)): Unit defined in org.apache.logging.log4j.core.config.Configuration[JavaMethodDescriptor]

'it' @ [34:45] ==> value-parameter it: String defined in net.corda.testing.LogHelper.reset.<anonymous>[ValueParameterDescriptorImpl]

'loggerContext' @ [35:9] ==> val loggerContext: LoggerContext defined in net.corda.testing.LogHelper.reset[LocalVariableDescriptor]

'updateLoggers' @ [35:23] ==> public open fun updateLoggers(p0: (Configuration..Configuration?)): Unit defined in org.apache.logging.log4j.core.LoggerContext[JavaMethodDescriptor]

'config' @ [35:37] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.reset[LocalVariableDescriptor]

'reset' @ [38:44] ==> public final fun reset(vararg names: String): Unit defined in net.corda.testing.LogHelper[SimpleFunctionDescriptorImpl]

'classes' @ [38:51] ==> value-parameter vararg classes: KClass<*> defined in net.corda.testing.LogHelper.reset[ValueParameterDescriptorImpl]

'map' @ [38:59] ==> public inline fun <T, R> Array<out KClass<*>>.map(transform: (KClass<*>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<*>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [38:65] ==> value-parameter it: KClass<*> defined in net.corda.testing.LogHelper.reset.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [38:68] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'`package`' @ [38:73] ==> public final val <T : (Any..Any?)> Class<out Any>.`package`: (Package..Package?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'name' @ [38:83] ==> public final val Package.name: (String..String?)[MyPropertyDescriptor]

'toTypedArray' @ [38:90] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'getContext' @ [42:40] ==> public open fun getContext(p0: Boolean): (LoggerContext..LoggerContext?) defined in org.apache.logging.log4j.LogManager[JavaMethodDescriptor]

'loggerContext' @ [43:22] ==> val loggerContext: LoggerContext defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'configuration' @ [43:36] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'LoggerConfig' @ [44:28] ==> public constructor LoggerConfig(p0: (String..String?), p1: (Level..Level?), p2: Boolean) defined in org.apache.logging.log4j.core.config.LoggerConfig[JavaClassConstructorDescriptor]

'name' @ [44:41] ==> value-parameter name: String defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'level' @ [44:47] ==> value-parameter level: Level defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'loggerConfig' @ [45:9] ==> val loggerConfig: LoggerConfig defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'addAppender' @ [45:22] ==> public open fun addAppender(p0: (Appender..Appender?), p1: (Level..Level?), p2: (Filter..Filter?)): Unit defined in org.apache.logging.log4j.core.config.LoggerConfig[JavaMethodDescriptor]

'config' @ [45:34] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'appenders' @ [45:41] ==> public final val Configuration.appenders: (MutableMap<(String..String?), (Appender..Appender?)>..Map<(String..String?), (Appender..Appender?)>?)[MyPropertyDescriptor]

'config' @ [46:9] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'removeLogger' @ [46:16] ==> public abstract fun removeLogger(p0: (String..String?)): Unit defined in org.apache.logging.log4j.core.config.Configuration[JavaMethodDescriptor]

'name' @ [46:29] ==> value-parameter name: String defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'config' @ [47:9] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'addLogger' @ [47:16] ==> public abstract fun addLogger(p0: (String..String?), p1: (LoggerConfig..LoggerConfig?)): Unit defined in org.apache.logging.log4j.core.config.Configuration[JavaMethodDescriptor]

'name' @ [47:26] ==> value-parameter name: String defined in net.corda.testing.LogHelper.setLevel[ValueParameterDescriptorImpl]

'loggerConfig' @ [47:32] ==> val loggerConfig: LoggerConfig defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'loggerContext' @ [48:9] ==> val loggerContext: LoggerContext defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'updateLoggers' @ [48:23] ==> public open fun updateLoggers(p0: (Configuration..Configuration?)): Unit defined in org.apache.logging.log4j.core.LoggerContext[JavaMethodDescriptor]

'config' @ [48:37] ==> val config: (Configuration..Configuration?) defined in net.corda.testing.LogHelper.setLevel[LocalVariableDescriptor]

'run' @ [54:84] ==> @InlineOnly public inline fun <T, R> LogHelper.run(block: LogHelper.() -> T): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LogHelper
    <R> -> T

'valueOf' @ [55:27] ==> public open fun valueOf(p0: (String..String?)): (Level..Level?) defined in org.apache.logging.log4j.Level[JavaMethodDescriptor]

'levelName' @ [55:35] ==> value-parameter levelName: String defined in net.corda.testing.LogHelper.withLevel[ValueParameterDescriptorImpl]

'getLogger' @ [56:35] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.apache.logging.log4j.LogManager[JavaMethodDescriptor]

'logName' @ [56:45] ==> value-parameter logName: String defined in net.corda.testing.LogHelper.withLevel[ValueParameterDescriptorImpl]

'level' @ [56:54] ==> public final val Logger.level: (Level..Level?)[MyPropertyDescriptor]

'setLevel' @ [57:22] ==> public open fun setLevel(p0: (String..String?), p1: (Level..Level?)): Unit defined in org.apache.logging.log4j.core.config.Configurator[JavaMethodDescriptor]

'logName' @ [57:31] ==> value-parameter logName: String defined in net.corda.testing.LogHelper.withLevel[ValueParameterDescriptorImpl]

'level' @ [57:40] ==> val level: (Level..Level?) defined in net.corda.testing.LogHelper.withLevel.<anonymous>[LocalVariableDescriptor]

'invoke' @ [59:13] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'setLevel' @ [61:26] ==> public open fun setLevel(p0: (String..String?), p1: (Level..Level?)): Unit defined in org.apache.logging.log4j.core.config.Configurator[JavaMethodDescriptor]

'logName' @ [61:35] ==> value-parameter logName: String defined in net.corda.testing.LogHelper.withLevel[ValueParameterDescriptorImpl]

'oldLevel' @ [61:44] ==> val oldLevel: (Level..Level?) defined in net.corda.testing.LogHelper.withLevel.<anonymous>[LocalVariableDescriptor]

