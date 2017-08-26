'Suppress' @ [10:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'ScriptTemplateDefinition' @ [11:1] ==> public constructor ScriptTemplateDefinition(resolver: KClass<out ScriptDependenciesResolver> = ..., scriptFilePattern: String = ...) defined in kotlin.script.templates.ScriptTemplateDefinition[DeserializedClassConstructorDescriptor]

'ScriptTemplateWithBindings' @ [12:83] ==> public constructor ScriptTemplateWithBindings(bindings: Map<String, Any?>) defined in kotlin.script.templates.standard.ScriptTemplateWithBindings[DeserializedClassConstructorDescriptor]

'jsr223Bindings' @ [12:110] ==> value-parameter jsr223Bindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.<init>[ValueParameterDescriptorImpl]

'bindings' @ [14:49] ==> public final val bindings: Map<String, Any?> defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[DeserializedPropertyDescriptor]

'KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY' @ [14:58] ==> public const val KOTLIN_SCRIPT_ENGINE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'let' @ [14:94] ==> @InlineOnly public inline fun <T, R> Any.let(block: (Any) -> ScriptEngine?): ScriptEngine? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> ScriptEngine?

'it' @ [14:100] ==> value-parameter it: Any defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.<get-myEngine>.<anonymous>[ValueParameterDescriptorImpl]

'myEngine' @ [17:13] ==> private final val myEngine: ScriptEngine? defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[PropertyDescriptorImpl]

'let' @ [17:23] ==> @InlineOnly public inline fun <T, R> ScriptEngine.let(block: (ScriptEngine) -> T): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptEngine
    <R> -> T

'body' @ [17:27] ==> value-parameter body: (ScriptEngine) -> T defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.withMyEngine[ValueParameterDescriptorImpl]

'IllegalStateException' @ [17:42] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'withMyEngine' @ [20:13] ==> private final inline fun <T> withMyEngine(body: (ScriptEngine) -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'newBindings' @ [21:34] ==> value-parameter newBindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [21:46] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'takeIf' @ [21:81] ==> @InlineOnly @SinceKotlin public inline fun <T> Any.takeIf(predicate: (Any) -> Boolean): Any? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'it' @ [21:90] ==> value-parameter it: Any defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [21:97] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[LazyClassReceiverParameterDescriptor]

'jsr223Bindings' @ [21:102] ==> public final val jsr223Bindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[PropertyDescriptorImpl]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [21:117] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'apply' @ [21:154] ==> @InlineOnly public inline fun <T> Any.apply(block: (Any).() -> Unit): Any defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'newBindings' @ [22:21] ==> value-parameter newBindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [22:33] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'it' @ [24:27] ==> value-parameter it: ScriptEngine defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[ValueParameterDescriptorImpl]

'eval' @ [24:30] ==> public abstract fun eval(p0: (String..String?), p1: (Bindings..Bindings?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'script' @ [24:35] ==> value-parameter script: String defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'newBindings' @ [24:43] ==> value-parameter newBindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'savedState' @ [25:17] ==> val savedState: Any? defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'apply' @ [25:29] ==> @InlineOnly public inline fun <T> Any.apply(block: (Any).() -> Unit): Any defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'newBindings' @ [26:21] ==> value-parameter newBindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [26:33] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'savedState' @ [26:69] ==> val savedState: Any? defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'res' @ [28:17] ==> val res: (Any..Any?) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'withMyEngine' @ [32:13] ==> private final inline fun <T> withMyEngine(body: (ScriptEngine) -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'jsr223Bindings' @ [33:34] ==> public final val jsr223Bindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[PropertyDescriptorImpl]

'remove' @ [33:49] ==> public abstract fun remove(p0: (String..String?)): Any? defined in javax.script.Bindings[JavaMethodDescriptor]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [33:56] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'it' @ [34:27] ==> value-parameter it: ScriptEngine defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[ValueParameterDescriptorImpl]

'eval' @ [34:30] ==> public abstract fun eval(p0: (String..String?), p1: (Bindings..Bindings?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'script' @ [34:35] ==> value-parameter script: String defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval[ValueParameterDescriptorImpl]

'jsr223Bindings' @ [34:43] ==> public final val jsr223Bindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[PropertyDescriptorImpl]

'savedState' @ [35:17] ==> val savedState: Any? defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'apply' @ [35:29] ==> @InlineOnly public inline fun <T> Any.apply(block: (Any).() -> Unit): Any defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'jsr223Bindings' @ [36:21] ==> public final val jsr223Bindings: Bindings defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[PropertyDescriptorImpl]

'KOTLIN_SCRIPT_STATE_BINDINGS_KEY' @ [36:36] ==> public const val KOTLIN_SCRIPT_STATE_BINDINGS_KEY: String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'savedState' @ [36:72] ==> val savedState: Any? defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'res' @ [38:17] ==> val res: (Any..Any?) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.eval.<anonymous>[LocalVariableDescriptor]

'withMyEngine' @ [41:38] ==> private final inline fun <T> withMyEngine(body: (ScriptEngine) -> (Bindings..Bindings?)): (Bindings..Bindings?) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (javax.script.Bindings..javax.script.Bindings?)

'it' @ [41:53] ==> value-parameter it: ScriptEngine defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate.createBindings.<anonymous>[ValueParameterDescriptorImpl]

'createBindings' @ [41:56] ==> public abstract fun createBindings(): (Bindings..Bindings?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

